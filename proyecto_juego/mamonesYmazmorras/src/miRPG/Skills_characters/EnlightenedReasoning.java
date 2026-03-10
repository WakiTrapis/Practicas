package miRPG.Skills_characters;

import miRPG.Base.Skill;
import miRPG.Base.GameCharacter;

public class EnlightenedReasoning extends Skill {

    public EnlightenedReasoning() {
        // Nombre, Descripción, Daño base (powerSkill)
        super("Raciocinio Ilustrado", "El usuario genera una explosión de verdad absoluta.", 15.0, 80, true);
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
            System.out.println("\n[\" + user.getNameCharacter() + \"]: '¡Si Franco levantara la cabeza...!'\n");
            pausa(4000);
            System.out.println("\n¡" + user.getNameCharacter() + " hace añicos a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getLvlKi();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, true);
        } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta lanzar un Comentario Tóxico contra " + target.getNameCharacter() + ", pero falla!");}
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
