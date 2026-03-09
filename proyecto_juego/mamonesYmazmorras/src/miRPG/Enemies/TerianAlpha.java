package miRPG.Enemies;

import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;
import miRPG.Skills_characters.TrolleyRam;
import miRPG.Skills_characters.InvoluntaryRescue;

public class TerianAlpha extends GameCharacter {
        public TerianAlpha() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Terian Alpha", new Statistics(100, 17, 10, 7, 6, 20));
        this.getEquippedSkills()[0] = new CringeBite();
        this.getEquippedSkills()[1] = new InvoluntaryRescue();
    }
}