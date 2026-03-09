package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class Intensity extends Skill {
    
            public Intensity() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Inten-sismo", "onda de intensidad vital", 3.0,true); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        System.out.println("\n¡" + user.getNameCharacter() + " lanza una onda de intensidad vital contra " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
    }
}
