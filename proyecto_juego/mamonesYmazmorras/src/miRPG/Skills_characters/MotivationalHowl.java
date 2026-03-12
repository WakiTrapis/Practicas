package miRPG.Skills_characters;

import miRPG.Base.GameCharacter;
import miRPG.Base.Skill;

public class MotivationalHowl extends Skill {
    
        public MotivationalHowl() {
        // Nombre, Descripción, Daño base (powerSkill), Precisión (accuracy), Especial (isSpecial)
        super("Aullido Motivacional", "Suelta un aullido desentonado que le sube la defensa.",5.0, 100.0, true); 
    }

    @Override
    public void use(GameCharacter user, GameCharacter target) {
        if(this.checkHit(target)){
            System.out.println("\n¡El " + user.getNameCharacter() + " suelta un aullido motivador y algo desafinado que le sube la defensa!");
        
        
            double defensaActual = user.getStats().getDefense(); // Asumiendo que existe este getter
            user.getStats().setDefense(defensaActual + this.getPowerSkill());
            
            System.out.println("¡La confianza del " + user.getNameCharacter() + " aumenta su resistencia!");
            System.out.println("Defensa aumentada en: " + this.getPowerSkill());
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

