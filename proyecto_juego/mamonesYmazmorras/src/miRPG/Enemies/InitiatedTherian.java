package miRPG.Enemies;

import miRPG.Base.GameCharacter;
import miRPG.Base.Statistics;
import miRPG.Skills_characters.ImagineBlow;

public class InitiatedTherian extends GameCharacter {

    public InitiatedTherian() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Therian iniciado", new Statistics(30, 8, 2, 2, 0, 10));
        this.getEquippedSkills()[0] = new ImagineBlow();
    }
}
