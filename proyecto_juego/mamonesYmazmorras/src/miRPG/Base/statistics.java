package miRPG.Base;

public class statistics {

    //Atributos
    private double maxHealth;
    private double power;
    private double defense;
    private double lvlKi;
    private double speed;
    private double lvlPoints;
    private int level;
    private double currentXp;
    private double xpToNextLevel;

    //Constructor
    public statistics(double maxHealth, double power, double defense, double lvlKi, double speed) {
        this.maxHealth = maxHealth;
        this.power = power;
        this.defense = defense;
        this.lvlKi = lvlKi;
        this.speed = speed;

    //valores por defecto al lvl 1
        this.lvlPoints = 0;
        this.level = 1;
        this.currentXp = 0;
        this.xpToNextLevel = 100;
    }

    //getters y setters
    public double getMaxHealth() {return maxHealth;}
    public void setMaxHealth(double maxHealth) {this.maxHealth = maxHealth;}

    public double getPower() {return power;}
    public void setPower(double power) {this.power = power;}

    public double getDefense() {return defense;}
    public void setDefense(double defense) {this.defense = defense;}

    public double getLvlKi() {return lvlKi;}
    public void setLvlKi(double lvlKi) {this.lvlKi = lvlKi;}

    public double getSpeed() {return speed;}
    public void setSpeed(double speed) {this.speed = speed;}

    public double getLvlPoints() {return lvlPoints;}
    public void setLvlPoints(double lvlPoints) {this.lvlPoints = lvlPoints;}

    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}

    public double getCurrentXp() {return currentXp;}
    public void setCurrentXp(double currentXp) {this.currentXp = currentXp;}

    public double getXpToNextLevel() {return xpToNextLevel;}
    public void setXpToNextLevel(double xpToNextLevel) {this.xpToNextLevel = xpToNextLevel;}
    
    //subida de lvl

    //sumar puntos de lvl
    public void gainXp(double newPoints) {
        this.currentXp += newPoints;
        System.out.println("Has ganado " + newPoints + " puntos de experiencia. Total de puntos de experiencia: " + this.currentXp);
        while (this.currentXp >= this.xpToNextLevel) {
            levelUp();
        }
    }
    //subir de nivel
    private void levelUp() {
        this.level++;
        this.currentXp -= this.xpToNextLevel;
        this.xpToNextLevel *= 1.5; // Incrementa el XP necesario para el siguiente nivel
        this.lvlPoints += 10; // Otorga puntos de nivel al subir de nivel
        System.out.println("¡Has subido al nivel " + this.level + "! Puntos de nivel restantes: " + this.lvlPoints);
    }
    

    //mejorar estadistica
    public void improveStat(int opcionStats, double points) {
        if (this.lvlPoints >= points) {
            String statUp="";
            switch (opcionStats) {
                case 1:
                    this.maxHealth += (points * 10);
                        statUp="vida máxima";
                    break;
                case 2:
                    this.power += points;
                    statUp="poder";
                    break;
                case 3:
                    this.defense += points;
                    statUp="defensa";
                    break;
                case 4:
                    this.lvlKi += points;
                    statUp="puntos de ki";
                    break;
                case 5:
                    this.speed += points;
                    statUp="velocidad";
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


