package miRPG.Sistema;

import miRPG.Base.character;
import java.util.Scanner;

public class combat {
    public void startCombat(character player, character enemy) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== ¡COMIENZA EL COMBATE! ===");
        System.out.println(player.getNameCharacter() + " VS " + enemy.getNameCharacter());
        boolean finishCombat = false;

        while (player.isAlive() && enemy.isAlive() && !finishCombat) {
            System.out.println("\n--- ESTADO ---");
            System.out.println(player.getNameCharacter() + " - Vida: " + player.getCurrentHealth());
            System.out.println(enemy.getNameCharacter() + " - Vida: " + enemy.getCurrentHealth());
            
            //comparamos velocidades para decidir quien ataca primero
            boolean playerFirst = player.getStats().getSpeed() >= enemy.getStats().getSpeed();

            if(playerFirst){
                finishCombat = playerTurn(player, enemy, scanner);
                if (enemy.isAlive() && !finishCombat) {
                    enemyTurn(enemy, player);
                }
            } else {
                enemyTurn(enemy, player);
                if (player.isAlive() && !finishCombat) {
                    playerTurn(player, enemy, scanner);
                }
            }

        }
        //final del combate
        if (player.isAlive()) {
            System.out.println("\n¡Has ganado el combate!");
                //ganar xp
            if (enemy instanceof miRPG.Enemies.goblin) {
                double xpGained = ((miRPG.Enemies.goblin) enemy).getXpLoot();
                player.getStats().gainXp(xpGained);
            }
        } else {
            System.out.println("\nHas sido derrotado...");
        }   

    }



    private boolean playerTurn(character player, character enemy, Scanner scanner) {
        System.out.println("\nEs tu turno. Elige una acción:");
        System.out.println("1. Atacar");
        System.out.println("2. Usar habilidad (no implementado)");
        System.out.println("3. Usar item (no implementado)");
        System.out.println("4. Huir (no implementado)");
        return false;
    }
    private void enemyTurn(character enemy, character player) {
        System.out.println("\nEs el turno de " + enemy.getNameCharacter());
        enemy.attack(player);
    }
}