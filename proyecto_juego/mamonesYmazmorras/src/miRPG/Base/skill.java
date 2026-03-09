package miRPG.Base;

import java.io.Serializable;

public abstract class Skill implements Serializable {

    //atributos
    private String name;
    private String description;
    private double powerSkill;

    private boolean isSpecial;

    //constructor
    public Skill(String name, String description, double powerSkill, boolean isSpecial) {
        this.name = name;
        this.description = description;
        this.powerSkill = powerSkill;
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

    //metodo abstracto para usar la habilidad
    public abstract void use(GameCharacter user, GameCharacter target);

}
