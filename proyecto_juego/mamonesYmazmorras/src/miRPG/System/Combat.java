package miRPG.System;

import miRPG.Base.GameCharacter;
import java.util.Scanner;

public class Combat {
    public static boolean MODO_RAPIDO = true;

    public static void startCombat(GameCharacter player, GameCharacter enemy) {
        Scanner scanner = new Scanner(System.in);
        boolean victoria = false;

        // BUCLE DE REINTENTO: No sales de aquí hasta que ganes
        while (!victoria) {
            System.out.println("\n==================================================");
            System.out.println("💥 ¡ENFRENTAMIENTO INEVITABLE! 💥");
            System.out.println(player.getNameCharacter() + " VS " + enemy.getNameCharacter());
            System.out.println("==================================================");
            
            pausa(3000);

            int turn = 1;

            // BUCLE DE LA PELEA ACTUAL
            while(player.isAlive() && enemy.isAlive()) {
                System.out.println("\n--- TURNO " + turn + " ---");
                System.out.println("Tu Cordura: " + player.getCurrentHealth() + "/" + player.getStats().getMaxHealth() + 
                   " | Subidón: " + player.getStats().getLvlKi() + 
                   " || Cordura de " + enemy.getNameCharacter() + ": " + enemy.getCurrentHealth() + "/" + enemy.getStats().getMaxHealth());
                
                // Comparamos velocidades para ver quién pega primero
                if(player.getStats().getSpeed() >= enemy.getStats().getSpeed()) {
                    playerTurn(player, enemy, scanner);
                    if(enemy.isAlive()) {
                        enemyTurn(enemy, player);
                    }
                } else {
                    enemyTurn(enemy, player);
                    if(player.isAlive()) {
                        playerTurn(player, enemy, scanner);
                    }
                }
                turn++;
                pausa(1500);
            }

            // --- COMPROBACIÓN DEL RESULTADO ---
            if (!player.isAlive()) {
                System.out.println("\nTu cordura ha llegado a cero... Te dejas caer al suelo.");
                pausa(2000);
                System.out.println("Pero rendirse no es una opción en este mundo.");
                System.out.println("Te levantas de nuevo. ¡La batalla se reinicia!");
                pausa(3000);
                
                // Curamos al 100% a los dos para reiniciar el combate
                player.fullHeal();
                enemy.fullHeal();
                
            } else if (!enemy.isAlive()) {
                System.out.println("\n¡Has derrotado a " + enemy.getNameCharacter() + " y conservas tu cordura!");
                victoria = true; // ¡Rompemos el bucle y volvemos al Main!
            }
        }
    }

    // EL NUEVO MENÚ DEL JUGADOR
    private static void playerTurn(GameCharacter player, GameCharacter enemy, Scanner scanner) {
        System.out.println("\n¿Qué vas a hacer, " + player.getNameCharacter() + "?");
        
        // 1. Mostrar las habilidades reales equipadas
        miRPG.Base.Skill[] habilidades = player.getEquippedSkills();
        for (int i = 0; i < 4; i++) {
            if (habilidades[i] != null) {
                System.out.println((i + 1) + ". Usar [" + habilidades[i].getName() + "]");
            } else {
                System.out.println((i + 1) + ". [Hueco Vacío]");
            }
        }
        System.out.println("5. Usar Objeto (Mochila)");
        
        System.out.print("Elige una opción (1-5): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        // 2. Ejecutar la acción
        if (opcion >= 1 && opcion <= 4) {
            miRPG.Base.Skill habilidadElegida = habilidades[opcion - 1]; // -1 por el índice del array
            
            if (habilidadElegida != null) {
                // ¡Lanza la habilidad de verdad!
                habilidadElegida.use(player, enemy);
                pausa(2000);
            } else {
                System.out.println("No tienes ninguna habilidad en ese hueco. Pierdes el turno por despistado.");
                pausa(2000);
            }
        } else if (opcion == 5) {
            System.out.println("Abres tu mochila... (En construcción)");
        } else {
            System.out.println("Opción no válida. Pierdes el turno por dudar.");
        }
    }

    private static void enemyTurn(GameCharacter enemy, GameCharacter player) {
        System.out.println("\nEs el turno de " + enemy.getNameCharacter() + "...");
        pausa(1000);

        // 1. Sacamos las habilidades del enemigo
        miRPG.Base.Skill[] habilidades = enemy.getEquippedSkills();
        
        // 2. Comprobamos si tiene alguna habilidad equipada
        boolean tieneHabilidades = false;
        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i] != null) {
                tieneHabilidades = true;
                break; // En cuanto encontramos una, dejamos de buscar
            }
        }
        // 3. DECISIÓN DE LA IA:
        if (!tieneHabilidades) {
            // --> CASO A: El primer Therian (o cualquier enemigo sin habilidades)
            System.out.println(enemy.getNameCharacter() + " se abalanza a lo loco y te araña.");
            double basicPower = enemy.getStats().getPower();
            player.receiveDamage(basicPower, false); // Daño básico
            
        } else {
            // --> CASO B: Enemigos avanzados (con 1, 2, 3 o 4 habilidades)
            java.util.Random rand = new java.util.Random();
            miRPG.Base.Skill selectionSkill = null;
            
            // Este bucle elige un hueco al azar (0 a 3). Si ese hueco está vacío (null), 
            // vuelve a tirar el dado hasta que acierte en una habilidad que sí exista.
            while (selectionSkill == null) {
                int huecoAleatorio = rand.nextInt(4); 
                selectionSkill = habilidades[huecoAleatorio];
            }
            
            // (NOTA: Asegúrate de que tu clase Skill tenga métodos como getName() o getDamage())
            System.out.println(enemy.getNameCharacter() + " usa [" + selectionSkill.getName() + "]!");
            player.receiveDamage(selectionSkill.getPowerSkill(), );
            
        }

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) { }
    }
}           
            
            

