package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class AwkwardEmbrace extends Skill {
    
        public AwkwardEmbrace() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Abrazo incomodo", "Te abraza con demasiada fuerza. Es incómodo y doloroso.",10.0, 85.0, false); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
            System.out.println("\n[\" + user.getNameCharacter() + \"]: '¡Si no has tenido figura paterna yo te voy a enseñar!'\n");
            pausa(4000);
            System.out.println("\n¡" + user.getNameCharacter() + " se lanza a abrar a  " + target.getNameCharacter() + "con los ojos llorosos!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
    } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta abrazar a " + target.getNameCharacter() + ", pero falla!");}
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
