package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class BlazingBuckle extends Skill {
    
        public BlazingBuckle() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Hebilla Ígnea", "El usuario se quita el cinturón y golpea tan fuerte que saltan chispas",15.0, 95.0, false); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
            System.out.println("\n[\" + user.getNameCharacter() + \"]: '¡Si no has tenido figura paterna yo te voy a enseñar!'\n");
            pausa(4000);
            System.out.println("\n¡" + user.getNameCharacter() + " se quita el cinturón y golpea a " + target.getNameCharacter() + "!");
        
        // Calculamos el daño: Poder de la habilidad (3) + El Subidón (Ataque Especial) del atacante
        double totalDamage = this.getPowerSkill() + user.getStats().getPower();
        
        // Aplicamos el daño al objetivo diciéndole que es un ataque especial (true)
        target.receiveDamage(totalDamage, false);
    } else {
        System.out.println("\n¡" + user.getNameCharacter() + " intenta aceptar la locura de " + target.getNameCharacter() + ", pero falla!");}
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
