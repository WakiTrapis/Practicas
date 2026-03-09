package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class CringeBite extends Skill {
    
        public CringeBite() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Mordisco cringe", "Muerde con fuerza, causando daño físico", 10.0, false);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        System.out.println("\n¡" + user.getNameCharacter() + " se levanta la mascara para morder a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
    }
}