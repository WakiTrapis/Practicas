package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class InvoluntaryRescue extends Skill {
    
            public InvoluntaryRescue() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Rescate Involuntario", "La obsesión por los animales atrapa al objetivo y le provoca daño psicologico", 6.0, 85, true);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n[" + user.getNameCharacter() + "] - Mira es un animalito, tengo que salvarlo, aunque no quiera...");
        System.out.println("\n¡" + user.getNameCharacter() + " atrapa a " + target.getNameCharacter() + " y le provoca daño psicológico!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta atrapar a " + target.getNameCharacter() + " para 'salvarlo', pero falla!");
        }
    }
}
