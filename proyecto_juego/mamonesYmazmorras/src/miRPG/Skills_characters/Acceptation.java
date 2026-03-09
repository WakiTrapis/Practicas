package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class Acceptation extends Skill {
    
        public Acceptation() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Aceptación", "Usa su fuerza para aceptar la situación", 3.0); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        System.out.println("\n¡" + user.getNameCharacter() + " acepta la locura de " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
    }
}
