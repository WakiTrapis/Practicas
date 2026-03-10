package miRPG.Skills_characters;

import miRPG.Base.Skill;
import miRPG.Base.GameCharacter;

public class ToxicComment extends Skill {

    public ToxicComment() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Comentario Tóxico", "Lanza una opinión destructiva. No cuesta energía, pero duele.", 3.0, 95, true); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " suelta un Comentario Tóxico que ofende profundamente a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta lanzar un Comentario Tóxico contra " + target.getNameCharacter() + ", pero falla!");}
    }
}
