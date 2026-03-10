package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class TrolleyRam extends Skill {
    
        public TrolleyRam() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Embestida de carrito", "Lanza un carrito de la compra a gran velocidad", 8.0, 95, false); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n¡" + user.getNameCharacter() + " lanza el carrito de la compra a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta lanzar el carrito de la compra a " + target.getNameCharacter() + ", pero falla!");
        }
    }
}