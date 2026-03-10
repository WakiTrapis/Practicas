package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class CringeBite extends Skill {
    
        public CringeBite() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy)
        super("Mordisco cringe", "Muerde con fuerza, causando daño físico", 10.0, 95, false);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " muerde brutalmente a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta morder a " + target.getNameCharacter() + ", pero falla!");}
    }
}