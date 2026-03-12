package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class ShockRemote extends Skill {
    
            public ShockRemote() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Shock Remoto", "El usuario activa los collares eléctricos de sus mascotas para generar un campo eléctrico", 8.0, 90, true); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " provoca un shock eléctrico a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta provocar un shock eléctrico contra " + target.getNameCharacter() + ", pero el mando no funciona!");}
    }
}