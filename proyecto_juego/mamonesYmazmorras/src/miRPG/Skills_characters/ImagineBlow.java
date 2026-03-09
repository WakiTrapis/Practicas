package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class ImagineBlow extends Skill {
            public ImagineBlow() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Zarpazo Imaginario", "lanza manotazos gruñendo sin control", 3.0, false); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        System.out.println("\n¡" + user.getNameCharacter() + " lanza un zarpazo imaginario!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
    }


}
