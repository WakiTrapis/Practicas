package miRPG.Enemies;

import miRPG.Base.Statistics;
import miRPG.Skills_characters.AwkwardEmbrace;
import miRPG.Skills_characters.CringeBite;
import miRPG.Skills_characters.ExistentialDread;
import miRPG.Skills_characters.PlayingDead;
import miRPG.Base.GameCharacter;



public class TherianBeta extends GameCharacter {
        public TherianBeta() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Therian Beta", new Statistics(80, 18, 13, 9, 9, 24));
        this.getEquippedSkills()[0] = new PlayingDead();
        this.getEquippedSkills()[1] = new CringeBite();
        this.getEquippedSkills()[2] = new AwkwardEmbrace();
        this.getEquippedSkills()[3] = new ExistentialDread();
    }
}