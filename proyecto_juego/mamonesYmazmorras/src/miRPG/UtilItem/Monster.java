package miRPG.UtilItem;

import miRPG.Base.GameCharacter;
import miRPG.Base.Item;

public class Monster extends Item {
    public Monster() {
        super("Lata de Monster", "Bebida energética. Te altera el pulso pero te cura 50 PV.");
    }

    // Aquí le decimos qué pasa cuando alguien usa este objeto
    @Override
        public boolean use(GameCharacter target) {
            // Obtenemos la vida actual y la vida máxima 
            double vidaActual = target.getCurrentHealth();
            double vidaMaxima = target.getStats().getMaxHealth();

            // 1. Comprobamos si ya estás a tope de vida
            if (vidaActual >= vidaMaxima) {
                System.out.println("\n¡" + target.getNameCharacter() + ", ya estás a tope de energía! Mejor guarda el Monster para luego.");
                // Devolvemos false para avisar al combate de que NO se ha gastado el objeto
                return false; 
            }

            // 2. Si llegamos aquí, es que nos falta vida.
            double cantidadCura = 50;
            double nuevaVida = vidaActual + cantidadCura;

            // 3. Nos aseguramos de que la curación no se pase de la vida máxima
            if (nuevaVida > vidaMaxima) {
                nuevaVida = vidaMaxima;
            }

            // 4. Aplicamos la nueva vida
            target.setCurrentHealth(nuevaVida);
            
            System.out.println("\n¡" + target.getNameCharacter() + " abre un Monster y se lo bebe de un trago!");
            System.out.println("¡El corazón se le pone a mil y recupera " + cantidadCura + " PV! (Cordura: " + nuevaVida + "/" + vidaMaxima + ")");
            // Devolvemos true porque la lata se ha consumido con éxito
            return true; 
        }
}
