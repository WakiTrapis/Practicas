package miRPG.Main_characters;

import miRPG.Base.MainCharacterBase;
import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;

public class Hater extends MainCharacterBase {
    
public Hater(String nombreJugador) {
        // Vida: 80, Fuerza: 25, Defensa: 5, Subidón: 10, Velocidad: 15
        super(nombreJugador, new Statistics(80, 25, 5, 10, 15));
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("\n¡" + this.getNameCharacter() + " suelta un comentario tóxico súper destructivo contra " + target.getNameCharacter() + "!");
        double damage = 15.0 + this.getStats().getPower(); // Pega fuerte
        target.receiveDamage(damage);
    }
    
}
