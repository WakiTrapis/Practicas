package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class PlayingDead extends Skill {
    
            public PlayingDead() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Hacerse el Muerto", "Finge estar muerto para bajar la guardia del oponente y atacar por sorpresa", 6.0, 95, false);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
        System.out.println("\n[" + user.getNameCharacter() + "] - se cae al suelo, parece estar muerto.");
        pausa(3000);
        System.out.println("\n¡" + user.getNameCharacter() + " finge su muerte y araña a " + target.getNameCharacter() + " tendiéndole una trampa");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta hacerse el muerto pero " + target.getNameCharacter() + " no cae en la trampa.");
        }
    }
    // --- MÉTODO AUXILIAR PARA HACER PAUSAS ---
    // Este método detiene el programa los milisegundos que le digas
    public static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("Error en la pausa.");
        }
    }
}