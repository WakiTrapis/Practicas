import java.util.Scanner;
import Personajes_Principales.*;
import Enemigos.*;
import Pociones.*;

public class main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Personajes_Principales.caballero jugador = new Personajes_Principales.caballero();
        Enemigos.murkul enemigo = new Enemigos.murkul(nombre, vidaMurkul, danoAtaqueMurkul);

        System.out.println("Te despiertas en un oscuro bosque, sin recordar cómo llegaste allí.");
        System.out.println("De repente, escuchas un ruido detrás de ti. Al darte la vuelta, ves a Murkul, Segador de almas, acercándose lentamente hacia ti con su guadaña en mano.");

        while (caballero.vidaCaballero > 0 && murkul.vidaMurkul > 0) {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Curar");
            int accion = teclado.nextInt();

            if (accion == 1) {
                murkul.vidaMurkul -= jugador.atacar();
                System.out.println("La vida de Murkul es ahora: " + murkul.vidaMurkul);
            } else if (accion == 2) {
                jugador.vidaCaballero += pocionBasica.curar();
                System.out.println("Tu vida es ahora: " + jugador.vidaCaballero);
            } else {
                System.out.println("Acción no válida. Por favor, elige 'atacar' o 'curar'.");
            }

            if (enemigo.vidaMurkul > 0) {
                jugador.vidaCaballero -= enemigo.atacar();
                System.out.println("Tu vida es ahora: " + jugador.vidaCaballero);
            }
        }





    }
}
