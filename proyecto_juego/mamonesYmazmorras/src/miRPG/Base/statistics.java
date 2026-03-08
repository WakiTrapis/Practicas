package miRPG.Base;

import java.io.Serializable;

public class Statistics implements Serializable {

    //Atributos
    private double maxHealth; //Cordura
    private double power; //Fuerza bruta
    private double defense; //Defensa
    private double lvlKi; //Subidón
    private double specialDefense; //Sentido común
    private double speed; //Velocidad neuronal

    //Constructor
    public Statistics(double maxHealth, double power, double defense, double lvlKi, double specialDefense, double speed) {
        this.maxHealth = maxHealth;
        this.power = power;
        this.defense = defense;
        this.lvlKi = lvlKi;
        this.specialDefense = specialDefense;
        this.speed = speed;
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

    public double getSpecialDefense() {return specialDefense;}
    public void setSpecialDefense(double specialDefense) {this.specialDefense = specialDefense;}
}


