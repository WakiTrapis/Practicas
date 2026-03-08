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

    // EL NUEVO TURNO DEL ENEMIGO
    private static void enemyTurn(GameCharacter enemy, GameCharacter player) {
        System.out.println("\nEs el turno de " + enemy.getNameCharacter() + "...");
        pausa(2000);
        
        // Llama al ataque básico programado en la clase del enemigo.
        enemy.attack(player); 
        pausa(2000);
    }

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) { }
    }
}           
            
            

