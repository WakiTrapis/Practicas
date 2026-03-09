package miRPG.Main_characters;

import miRPG.Base.MainCharacterBase;
import miRPG.Base.Statistics;
import miRPG.Skills_characters.Intensity;
import miRPG.Base.GameCharacter;

public class Tryhard extends MainCharacterBase {

    public Tryhard(String nombreJugador) {
        // Vida: 100, Fuerza bruta: 15, Defensa: 10, Subidón: 10, Sentido común: 15, Velocidad: 25
        super(nombreJugador, new Statistics(100, 8, 10, 8,12, 25));
        this.getEquippedSkills()[0] = new Intensity();
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("\n¡" + this.getNameCharacter() + " se toma esto demasiado en serio, hace tres volteretas innecesarias y golpea a " + target.getNameCharacter() + "!");
        
        // Daño intermedio (ni tan fuerte como el Hater, ni tan flojo como el Conformista)
        double damage = 10.0 + this.getStats().getPower(); 
        target.receiveDamage(damage,false);
    }
}
