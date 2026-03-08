package miRPG.Main_characters;

import miRPG.Base.MainCharacterBase;
import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;
import miRPG.Skills_characters.ToxicComment;

public class Hater extends MainCharacterBase {
    
public Hater(String nombreJugador) {
        // Cordura: 80, Fuerza bruta: 25, Defensa: 5, Subidón: 10, Sentido común: 15, Velocidad: 15
        super(nombreJugador, new Statistics(80, 15, 5, 5,15, 15));
        this.getEquippedSkills()[0] = new ToxicComment();
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("\n¡" + this.getNameCharacter() + " suelta un comentario tóxico súper destructivo contra " + target.getNameCharacter() + "!");
        double damage = 15.0 + this.getStats().getPower(); // Pega fuerte
        target.receiveDamage(damage,false);
    }
    
}
