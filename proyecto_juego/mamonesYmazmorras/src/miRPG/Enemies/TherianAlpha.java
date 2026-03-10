package miRPG.Enemies;

import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;
import miRPG.Skills_characters.TrolleyRam;
import miRPG.Skills_characters.InvoluntaryRescue;

public class TherianAlpha extends GameCharacter {
        public TherianAlpha() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Therian Alpha", new Statistics(80, 18, 13, 9, 9, 24));
        this.getEquippedSkills()[0] = new TrolleyRam();
        this.getEquippedSkills()[1] = new InvoluntaryRescue();
    }
}
