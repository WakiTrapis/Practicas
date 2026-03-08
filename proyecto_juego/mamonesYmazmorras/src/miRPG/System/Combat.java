package miRPG.Sistema;

import miRPG.Base.GameCharacter;
import java.util.Scanner;

public class Combat {

    public static void startCombat(GameCharacter player, GameCharacter enemy) {
        Scanner scanner = new Scanner(System.in);
        boolean victoria = false;

        // BUCLE DE REINTENTO: No sales de aquí hasta que ganes
        while (!victoria) {
            System.out.println("\n==================================================");
            System.out.println("💥 ¡ENFRENTAMIENTO INEVITABLE! 💥");
            System.out.println(player.getNameCharacter() + " VS " + enemy.getNameCharacter());
            System.out.println("==================================================");

            int turn = 1;

            // BUCLE DE LA PELEA ACTUAL
            while(player.isAlive() && enemy.isAlive()) {
                System.out.println("\n--- TURNO " + turn + " ---");
                System.out.println("Tu Cordura: " + player.getCurrentHealth() + " | Cordura de " + enemy.getNameCharacter() + ": " + enemy.getCurrentHealth());
                
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
                
                // Aquí en el futuro llamaremos a un método para curar al 100% a los dos
                // player.curarPorCompleto();
                // enemy.curarPorCompleto();
                
            } else if (!enemy.isAlive()) {
                System.out.println("\n¡Has derrotado a " + enemy.getNameCharacter() + " y conservas tu cordura!");
                victoria = true; // ¡Rompemos el bucle y volvemos al Main!
            }
        }
    }

    // EL NUEVO MENÚ DEL JUGADOR
    private static void playerTurn(GameCharacter player, GameCharacter enemy, Scanner scanner) {
        System.out.println("\n¿Qué vas a hacer, " + player.getNameCharacter() + "?");
        
        // De momento ponemos los textos a mano, luego leerán las habilidades reales de tu personaje
        System.out.println("1. [Usar Habilidad Equipada 1]");
        System.out.println("2. [Usar Habilidad Equipada 2]");
        System.out.println("3. [Usar Habilidad Equipada 3]");
        System.out.println("4. [Usar Habilidad Equipada 4]");
        System.out.println("5. Usar Objeto (Mochila)");
        
        System.out.print("Elige una opción (1-5): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
                // Aquí el jugador lanzará la habilidad correspondiente
                System.out.println("¡Usas tu habilidad y le haces daño!"); 
                // Placeholder para que la pelea funcione mientras tanto:
                enemy.receiveDamage(15); 
                break;
            case 5:
                System.out.println("Abres tu mochila... (En construcción)");
                break;
            default:
                System.out.println("Opción no válida. Pierdes el turno por dudar.");
                break;
        }
    }

    // EL NUEVO TURNO DEL ENEMIGO
    private static void enemyTurn(GameCharacter enemy, GameCharacter player) {
        System.out.println("\nEs el turno de " + enemy.getNameCharacter() + "...");
        pausa(1000);
        // Aquí en el futuro haremos que el enemigo elija un número aleatorio del 1 al 4
        System.out.println(enemy.getNameCharacter() + " usa una habilidad aleatoria.");
        player.receiveDamage(10); // Daño de prueba
    }

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) { }
    }
}           
            
            

