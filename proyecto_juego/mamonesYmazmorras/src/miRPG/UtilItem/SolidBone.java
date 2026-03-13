package miRPG.UtilItem;

import miRPG.Base.GameCharacter;
import miRPG.Base.Item;

public class SolidBone extends Item {
    public SolidBone() {
        super("Hueso Macizo", "hueso duro y robusto que eleva la defensa del portador permanentemente.");
    }

    // Aquí le decimos qué pasa cuando alguien usa este objeto
    @Override
        public boolean use(GameCharacter target) {
            // Obtenemos la vida actual y la vida máxima 
            double defActual = target.getStats().getDefense();


            // 2. Si llegamos aquí, es que nos falta vida.
            double cantidadSubida = 5;
            double nuevaDefensa = defActual + cantidadSubida;


            // 4. Aplicamos la nueva vida
            target.setCurrentHealth(nuevaDefensa);
            
            System.out.println("\n¡" + target.getNameCharacter() + " mordisquea el hueso con vergüenza y asco!");
            System.out.println("¡Mientras que aguantas no potar le sube " + cantidadSubida + " Puntos de defensa! (Defensa actual: " + nuevaDefensa);
            // Devolvemos true porque la lata se ha consumido con éxito
            return true; 
        }
}