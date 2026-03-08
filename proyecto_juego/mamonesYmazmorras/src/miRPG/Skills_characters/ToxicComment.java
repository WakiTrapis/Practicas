package miRPG.Skills_characters;

import miRPG.Base.Skill;
import miRPG.Base.GameCharacter;

public class ToxicComment extends Skill {

    public ToxicComment() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Comentario Tóxico", "Lanza una opinión destructiva. No cuesta energía, pero duele.", 20.0); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        System.out.println("\n¡" + user.getNameCharacter() + " suelta un Comentario Tóxico que ofende profundamente a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (20) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
    }
}
