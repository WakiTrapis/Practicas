package miRPG.Base;

import java.io.Serializable;

public abstract class Skill implements Serializable {

    //atributos
    private String name;
    private String description;
    private double powerSkill;
    private double accuracy;
    private boolean isSpecial;

    //constructor
    public Skill(String name, String description, double powerSkill, double accuracy, boolean isSpecial) {
        this.name = name;
        this.description = description;
        this.powerSkill = powerSkill;
        this.accuracy = accuracy;
        this.isSpecial = isSpecial;
    }

    //getters y setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getPowerSkill() {return powerSkill;}
    public void setPowerSkill(double powerSkill) {this.powerSkill = powerSkill;}

    public boolean isSpecial() {return isSpecial;}
    public void setSpecial(boolean isSpecial) {this.isSpecial = isSpecial;}

    public double getAccuracy() {return accuracy;}
    public void setAccuracy(double accuracy) {this.accuracy = accuracy;}

    //método abstracto para usar la habilidad
    public abstract void use(GameCharacter user, GameCharacter target);

    // En Skill.java
    public boolean checkHit(GameCharacter target) {
    // La precisión real baja si el enemigo es muy veloz
    double evasion = target.getStats().getSpeed() * 0.2; // Ejemplo: 10 de velocidad = 1% evasión
    double realAccuracy = this.accuracy - evasion;
    
    return (Math.random() * 100) <= realAccuracy;
    }
}
