package miRPG.Base;

import java.util.ArrayList;
import java.util.List;

public abstract class character {

    //Atributos
    private String nameCharacter;
    private double currentHealth;
    private statistics stats;
    private List<item> inventory;
    private List<skill> skills;

    //Constructor
    public character(String nameCharacter, statistics stats) {
        this.nameCharacter = nameCharacter;
        this.currentHealth = stats.getMaxHealth();
        this.stats = stats;
        this.inventory = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    //getters y setters
    public String getNameCharacter() {return nameCharacter;}
    public void setNameCharacter(String nameCharacter) {this.nameCharacter = nameCharacter;}

    public double getCurrentHealth() {return currentHealth;}
    public void setCurrentHealth(double currentHealth) {this.currentHealth = currentHealth;}

    public statistics getStats() {return stats;}
    public void setStats(statistics stats) {this.stats = stats;}

    public List<item> getInventory() {return inventory;}
    public void setInventory(List<item> inventory) {this.inventory = inventory;}

    public List<skill> getSkills() {return skills;}
    public void setSkills(List<skill> skills) {this.skills = skills;}

    //metodos

    //gestion habilidades e items

    //aprender habilidad
    public void learnSkill(skill newSkill) {
        this.skills.add(newSkill);
        System.out.println(this.nameCharacter + " ha aprendido la habilidad: " + newSkill);
    }

    //guardar item
    public void addItem(item newItem) {
        this.inventory.add(newItem);
        System.out.println(this.nameCharacter + " ha añadido el item: " + newItem + " a su inventario.");
    }
    //borrar item que se haya usado
    public void removeItem(item emptyItem) {   
        this.inventory.remove(emptyItem);
        System.out.println(this.nameCharacter + " ha usado el item: " + emptyItem + " y lo ha eliminado de su inventario.");
    }
    
    //combate

        //ataque
    public abstract void attack(character target);

        //recibir daño
    public void receiveDamage(double damage){
        double effectiveDamage = damage - this.stats.getDefense();
        if (effectiveDamage < 1) {
            effectiveDamage = 1; // daño mínimo de 1
        }
        this.currentHealth -= effectiveDamage;

        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
        System.out.println(this.nameCharacter + " ha recibido " + effectiveDamage + " de daño. Vida actual: " + this.currentHealth);
    }

    //curar
    public void getHeal(double amount) {
        this.currentHealth += amount;
        // Asegurarse de que la vida no exceda el máximo
        if (this.currentHealth > this.stats.getMaxHealth()) {
            this.currentHealth = this.stats.getMaxHealth();
        }
        System.out.println(this.nameCharacter + " ha sido curado por " + amount + ". Vida actual: " + this.currentHealth);
    }

    //esta vivo
    public boolean isAlive() {
        return this.currentHealth > 0;
    }
}
