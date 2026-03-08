package miRPG.Main_characters;

import miRPG.Base.MainCharacterBase;
import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;

    public class Conformist extends MainCharacterBase {

    public Conformist(String nombreJugador) {
        // Vida: 150, Fuerza: 10, Defensa: 20, Subidón: 5, Velocidad: 5
        super(nombreJugador, new Statistics(150, 10, 20, 5, 5));
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("\n¡" + this.getNameCharacter() + " suspira con pereza y le da una bofetada sin ganas a " + target.getNameCharacter() + "!");
        double damage = 5.0 + this.getStats().getPower(); // Pega flojo
        target.receiveDamage(damage);
    }
}

