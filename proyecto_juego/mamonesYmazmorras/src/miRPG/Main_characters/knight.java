package miRPG.Main_characters;

import miRPG.Base.character;
import miRPG.Base.statistics;

public class knight extends character {
    
    public knight(String nameCharacter) {
        super(nameCharacter, new statistics(100, 20, 10, 5, 10));
        System.out.println("Un nuevo caballero ha nacido: " + nameCharacter);
    }

    @Override
    public void attack(character target) {
        System.out.println(this.getNameCharacter() + " ataca a " + target.getNameCharacter() + " con su espada.");
        double fisicDamage = this.getStats().getPower();
        target.receiveDamage(fisicDamage);
    }

    
}
