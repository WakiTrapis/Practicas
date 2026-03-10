package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class Intensity extends Skill {
    
            public Intensity() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Inten-sismo", "onda de intensidad vital", 3.0, 90, true); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " desprende una onda de intensidad vital contra " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta desprender una onda de intensidad vital contra " + target.getNameCharacter() + ", pero falla!");}
    }
}
