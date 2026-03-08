package miRPG.Base;

public abstract class MainCharacterBase extends GameCharacter {
    
    // Variables de experiencia exclusivas de los protagonistas
    private int level;
    private double currentXp;
    private double xpToNextLevel;
    private double lvlPoints;

    public MainCharacterBase(String name, Statistics stats) {
        super(name, stats);
        // Valores por defecto al lvl 1
        this.level = 1;
        this.currentXp = 0;
        this.xpToNextLevel = 100;
        this.lvlPoints = 0;
    }

    // Getters y Setters de nivel
    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}

    public double getCurrentXp() {return currentXp;}
    public void setCurrentXp(double currentXp) {this.currentXp = currentXp;}

    public double getXpToNextLevel() {return xpToNextLevel;}
    public void setXpToNextLevel(double xpToNextLevel) {this.xpToNextLevel = xpToNextLevel;}

    public double getLvlPoints() {return lvlPoints;}
    public void setLvlPoints(double lvlPoints) {this.lvlPoints = lvlPoints;}
    
    // --- SISTEMA DE EXPERIENCIA Y SUBIDA DE NIVEL ---

    // Sumar puntos de lvl
    public void gainXp(double newPoints) {
        this.currentXp += newPoints;
        System.out.println("Has ganado " + newPoints + " puntos de experiencia. Total de puntos de experiencia: " + this.currentXp);
        while (this.currentXp >= this.xpToNextLevel) {
            levelUp();
        }
    }

    // Subir de nivel
    private void levelUp() {
        this.level++;
        this.currentXp -= this.xpToNextLevel;
        this.xpToNextLevel *= 1.5; // Incrementa el XP necesario para el siguiente nivel
        this.lvlPoints += 10; // Otorga puntos de nivel al subir de nivel
        System.out.println("¡Has subido al nivel " + this.level + "! Puntos de nivel restantes: " + this.lvlPoints);
    }
    
    // Mejorar estadística
    public void improveStat(int opcionStats, double points) {
        if (this.lvlPoints >= points) {
            String statUp = "";
            Statistics misStats = this.getStats(); // Cogemos las estadísticas de GameCharacter

            switch (opcionStats) {
                case 1:
                    misStats.setMaxHealth(misStats.getMaxHealth() + (points * 10));
                    // Extra: Subimos la salud actual también para no quedarnos "heridos" de repente
                    this.setCurrentHealth(this.getCurrentHealth() + (points * 10)); 
                    statUp = "Cordura máxima";
                    break;
                case 2:
                    misStats.setPower(misStats.getPower() + points);
                    statUp = "Fuerza bruta";
                    break;
                case 3:
                    misStats.setDefense(misStats.getDefense() + points);
                    statUp = "Defensa";
                    break;
                case 4:
                    misStats.setLvlKi(misStats.getLvlKi() + points);
                    statUp = "Subidón";
                    break;
                case 5:
                    misStats.setSpecialDefense(misStats.getSpecialDefense() + points);
                    statUp = "Sentido común";
                    break;
                case 6:
                    misStats.setSpeed(misStats.getSpeed() + points);
                    statUp = "Velocidad neuronal";
                    break;
                default:
                    System.out.println("Estadística no válida.");
                    return;
            }
            this.lvlPoints -= points;
            System.out.println("Has mejorado " + statUp + " en " + points + " puntos. Puntos de nivel restantes: " + this.lvlPoints);
        } else {
            System.out.println("No tienes suficientes puntos de nivel para mejorar esta estadística.");
        }
    }
}
