package miRPG.Base;

import java.io.Serializable;

public abstract class Skill implements Serializable {

    //atributos
    private String name;
    private String description;
    private double kiCost;
    private double powerSkill;

    //constructor
    public Skill(String name, String description, double kiCost, double powerSkill) {
        this.name = name;
        this.description = description;
        this.kiCost = kiCost;
        this.powerSkill = powerSkill;
    }

    //getters y setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getKiCost() {return kiCost;}
    public void setKiCost(double kiCost) {this.kiCost = kiCost;}

    public double getPowerSkill() {return powerSkill;}
    public void setPowerSkill(double powerSkill) {this.powerSkill = powerSkill;}

    //metodo abstracto para usar la habilidad
    public abstract void use(GameCharacter user, GameCharacter target);

}
