package miRPG.Base;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public abstract class GameCharacter implements Serializable {

    //Atributos
    private String nameCharacter;
    private double currentHealth;
    private Statistics stats;
    private List<Item> inventory;
    // Lista con TODAS las habilidades aprendidas
    private List<Skill> skills; 
    // Los 4 huecos para las habilidades que vas a usar en combate
    private Skill[] equippedSkills;

    //Constructor
    public GameCharacter(String nameCharacter, Statistics stats) {
        this.nameCharacter = nameCharacter;
        this.currentHealth = stats.getMaxHealth();
        this.stats = stats;
        this.inventory = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.equippedSkills = new Skill[4];
    }

    //getters y setters
    public String getNameCharacter() {return nameCharacter;}
    public void setNameCharacter(String nameCharacter) {this.nameCharacter = nameCharacter;}

    public double getCurrentHealth() {return currentHealth;}
    public void setCurrentHealth(double currentHealth) {this.currentHealth = currentHealth;}

    public Statistics getStats() {return stats;}
    public void setStats(Statistics stats) {this.stats = stats;}

    public List<Item> getInventory() {return inventory;}
    public void setInventory(List<Item> inventory) {this.inventory = inventory;}

    public List<Skill> getskill() {return skills;}
    public void setSkill(List<Skill> skills) {this.skills = skills;}

    public Skill[] getEquippedSkills() {return equippedSkills;}
    public void setEquippedSkills(Skill[] equippedSkills) {this.equippedSkills = equippedSkills;}

    //metodos

    //gestion habilidades e items

    //aprender habilidad se añade a la lista de habilidades aprendidas.
    public void learnSkill(Skill newSkill) {
        this.skills.add(newSkill);
        System.out.println(this.nameCharacter + " ha aprendido la habilidad: " + newSkill);
    }
    // Equipar una habilidad en uno de los 4 huecos (slot debe ser 1, 2, 3 o 4)
    public void equipSkill(Skill skillToEquip, int slot) {
        if (slot >= 1 && slot <= 4) {
            // Le restamos 1 porque los arrays en Java empiezan en 0
            this.equippedSkills[slot - 1] = skillToEquip;
            System.out.println(this.nameCharacter + " ha equipado [" + skillToEquip.getName() + "] en el hueco " + slot + ".");
        } else {
            System.out.println("Error: El hueco debe ser entre 1 y 4.");
        }
    }
    // Mostrar las habilidades equipadas actualmente
    public void showEquippedSkills() {
        System.out.println("\n--- Habilidades equipadas de " + this.nameCharacter + " ---");
        for (int i = 0; i < equippedSkills.length; i++) {
            if (equippedSkills[i] != null) {
                System.out.println((i + 1) + ". " + equippedSkills[i].getName());
            } else {
                System.out.println((i + 1) + ". [Hueco Vacío]");
            }
        }
    }

    //guardar item
    public void addItem(Item newItem) {
        this.inventory.add(newItem);
        System.out.println(this.nameCharacter + " ha añadido el item: " + newItem + " a su inventario.");
    }
    //borrar item que se haya usado
    public void removeItem(Item emptyItem) {   
        this.inventory.remove(emptyItem);
        System.out.println(this.nameCharacter + " ha usado el item: " + emptyItem + " y lo ha eliminado de su inventario.");
    }
    
    //combate

        //recibir daño
    public void receiveDamage(double damage, boolean isSpecial){
        double effectiveDamage;
        
        if (isSpecial) {
            // Si es ataque de Subidón, resta la Defensa Especial
            effectiveDamage = damage - this.stats.getSpecialDefense();
            System.out.println("  -> " + this.nameCharacter + " usa su Sentido común para mitigar el impacto.");
        } else {
            // Si es ataque físico, resta la Defensa Normal
            effectiveDamage = damage - this.stats.getDefense();
            System.out.println("  -> " + this.nameCharacter + " usa su Defensa Física para mitigar el golpe.");
        }

        if (effectiveDamage < 1) {
            effectiveDamage = 1; // daño mínimo de 1
        }
        
        this.setCurrentHealth(this.getCurrentHealth() - effectiveDamage);

        if (this.getCurrentHealth() < 0) {
            this.setCurrentHealth(0);
        }
        System.out.println(this.nameCharacter + " ha recibido " + effectiveDamage + " de daño. Cordura actual: " + this.getCurrentHealth() + "\n");
    }

    //curar
    public void getHeal(double amount) {
        this.currentHealth += amount;
        // Asegurarse de que la vida no exceda el máximo
        if (this.currentHealth > this.stats.getMaxHealth()) {
            this.currentHealth = this.stats.getMaxHealth();
        }
        System.out.println(this.nameCharacter + " ha sido curado por " + amount + ". Cordura actual: " + this.currentHealth);
    }

    //esta vivo
    public boolean isAlive() {
        return this.currentHealth > 0;
    }
    // Curación completa (para cuando reinicies el combate al morir)
    public void fullHeal() {
        this.currentHealth = this.stats.getMaxHealth();
    }
}
