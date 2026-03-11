package miRPG.Enemies;

import miRPG.Base.Statistics;
import miRPG.Base.GameCharacter;
import miRPG.Skills_characters.TrolleyRam;
import miRPG.Skills_characters.InvoluntaryRescue;

public class Employee extends GameCharacter {
        public Employee() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Empleado Molesto", new Statistics(50, 10, 5, 4, 5, 15));
        this.getEquippedSkills()[0] = new TrolleyRam();
        this.getEquippedSkills()[1] = new InvoluntaryRescue();
    }
}
