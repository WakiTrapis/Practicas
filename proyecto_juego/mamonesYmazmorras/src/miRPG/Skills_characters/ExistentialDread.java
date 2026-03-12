package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class ExistentialDread extends Skill {
    
        public ExistentialDread() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy)
        super("Crisis Existencial", "El usuario entra en pánico y lanza multiples mordiscos a los tobillos", 17.0, 80, false);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " entra en pánico y muerde los tobillos de " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta morder a " + target.getNameCharacter() + ", pero falla!");}
    }
}
