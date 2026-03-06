package miRPG.Enemies;

import miRPG.Base.character;
import miRPG.Base.statistics;

public class goblin extends character {
    
    private double xpLoot;

    public goblin(String nameCharacter) {
        super(nameCharacter, new statistics(50, 10, 5, 0, 15));
        this.xpLoot = 20;
        System.out.println("Un nuevo goblin ha aparecido: " + nameCharacter);
    }

    @Override
    public void attack(character target) {
        double fisicDamage = this.getStats().getPower();
        target.receiveDamage(fisicDamage);
        System.out.println(this.getNameCharacter() + "apuñala con su daga oxidada a " + target.getNameCharacter() + " causando " + fisicDamage + " de daño.");
    }

    public double getXpLoot() {return xpLoot;}
}
