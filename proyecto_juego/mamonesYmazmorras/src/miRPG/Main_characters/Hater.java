package miRPG.Main_characters;

import miRPG.Base.MainCharacterBase;
import miRPG.Base.Statistics;
import miRPG.Skills_characters.ToxicComment;

public class Hater extends MainCharacterBase {
    
public Hater(String nombreJugador) {
        // Cordura: 80, Fuerza bruta: 14, Defensa: 8, Subidón: 5, Sentido común: 5, Velocidad: 15
        super(nombreJugador, new Statistics(80, 14, 8, 5,5, 15));
        this.getEquippedSkills()[0] = new ToxicComment();
    }   
}
