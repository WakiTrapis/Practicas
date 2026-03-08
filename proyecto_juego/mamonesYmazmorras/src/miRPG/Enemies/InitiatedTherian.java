package miRPG.Enemies;

import miRPG.Base.GameCharacter;
import miRPG.Base.Statistics;

public class InitiatedTherian extends GameCharacter {

    public InitiatedTherian() {
        // Stats de Enemigo.
        // Vida: 30, Fuerza: 8, Def Física: 2, Def Especial: 2, Subidón: 0, Velocidad: 10
        super("Therian iniciado", new Statistics(30, 8, 2, 2, 0, 10));
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("\n¡" + this.getNameCharacter() + " te gruñe, se lanza a tus rodillas y te muerde el tobillo!");
        
        // Daño físico basado en su Fuerza
        double damage = this.getStats().getPower();
        target.receiveDamage(damage, false); 
    }
}
