package miRPG;

import java.util.Scanner;
// Aquí luego importaremos a tu personaje y enemigos

import miRPG.Base.MainCharacterBase;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainCharacterBase mainSelect = miRPG.System.SaveManager.load();

        // --- PANTALLA DE TÍTULO ---
        
        System.out.println("==================================================");
        System.out.println("           EL DESPERTAR DEL SCROLL             "); 
        System.out.println("==================================================\n");
        pausa(2000);

        // --- PRÓLOGO ---
            //ACTO 1
        if(mainSelect == null){
            System.out.println("Llevas meses atrapado en una rutina gris. Trabajar, dormir y ver la pantalla.");
            pausa(4000);
            System.out.println("A tu alrededor, el mundo se ha vuelto adicto a la dopamina barata. Tendencias absurdas, bailes de TikTok en medio de la calle, políticos corruptos...");
            pausa(4000);
            System.out.println("Todo el mundo está ciego. Y en el fondo, sabes que tú también.\n");
            pausa(4000);

            System.out.println("Pero anoche fue diferente.");
            pausa(3000);
            System.out.println(". . .");
            pausa(5000);

            pausa(3000);
            System.out.println("Te encuentras saliendo tarde del trabajo, todo parece normal, monotono, como todos los dias. ");
            pausa(4000);
            System.out.println("Pero de repente...");
            pausa(3000);
            System.out.println("Un vagabundo con una sudadera sucia de una vieja empresa tecnológica te agarra del brazo.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Yo escribí el código de esto... pero no le puse botón de apagado' - te susurró con los ojos inyectados en sangre.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Yo invente el scroll infinito!, ellos me obligaron...' - continuó, mientras te arrastraba hacia un callejón oscuro.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Solo fui una marionata para ellos, cuando quise ponerle el dichoso boton de apagado ya era tarde'\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Pero tú... tú eres diferente. Tienes el potencial.' - dijo, mientras se saca algo del bolsillo.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Este porro hara que puedas entenderme. Despierta'.\n");
            pausa(4000);
            // --- DECISIÓN DEL JUGADOR ---
            System.out.println("¿Que decides hacer?");
            System.out.println("1. Aceptar el porro.");
            System.out.println("2. Rechazarlo y seguir con tu vida normal.");
            int decision1 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            pausa(3000);
            //Final 1, el jugador rechaza el porro
            if (decision1 == 2) {
                System.out.println("\nDecides rechazar el porro. El vagabundo te mira con tristeza y se aleja, desapareciendo entre las sombras.");
                pausa(4000);
                System.out.println("Vuelves a casa, pero esa noche no puedes dormir. Sientes que has perdido una oportunidad única.");
                pausa(4000);
                System.out.println("Al día siguiente, te levantas con una sensación de vacío. El mundo sigue igual, pero tú sabes que algo ha cambiado para siempre.");
                pausa(4000);
                System.out.println("Nunca volverás a ser el mismo, y la rutina se siente más opresiva que nunca.\n");
                pausa(4000);
                System.out.println("FIN");
                scanner.close();
                return;
            }


            //pulsa numero no valido, continua con la historia
            if (decision1 != 1 && decision1 != 2) {
                System.out.println("\nOpción no válida. El vagabundo se enfurece y te lanza el porro a la cara antes de desaparecer en la oscuridad.");
                pausa(4000);
                System.out.println("Te quedas allí, aturdido, con el porro en la mano. No tienes otra opción que aceptarlo.");
                pausa(4000);
            }


            System.out.println("\nCoges el porro y el vagabundo se aleja, desapareciendo entre las sombras. Te quedas allí, aturdido, con el porro en la mano.");
            pausa(4000);
            System.out.println("Vuelves a casa, pero esa noche no puedes dormir. No sabes si hacerlo o no, hasta que te quedas dormido.\n");
            pausa(4000);

                //ACTO 2
            System.out.println("Al dia siguiente...\n");
            pausa(5000);

            System.out.println("Sigues pensando en lo que paso ayer pero tambien estas contento porque has quedado con tu amigo David para salir a dar una vuelta por el parque.");
            pausa(4000);
            System.out.println("Os encontrais en el parque, pero solo sabeis hablar de videos, memes y tonterias de internet.");
            pausa(4000);
            System.out.println("Empiezas a darte cuenta por lo sucedido con el vagabundo y a su vez prestas más atencion a lo que ocurre.");
            pausa(4000);
            System.out.println("De pronto...\n");
            pausa(5000);
            System.out.println("¡CRASH!\n");
            pausa(2500);
            System.out.println("Un coche acaba de estrellarse contra una farola a tres metros de vosotros.");
            pausa(4000);
            System.out.println("Tu amigo ni siquiera levanta la vista del móvil. - 'Bua, literal soy yo, tremendo meme' - murmura embobado.");
            pausa(4000);
            System.out.println("A su vez te das cuenta que a una mujer que estaba paseando por el parque le estan robando.");
            pausa(4000);
            System.out.println("Se lo dices a tu amigo y este levanta la mirada rapido, y empieza a teclear en el movil.\n");
            pausa(4000);
            System.out.println("[Tu]: (Pensando) 'Menos mal, david tiene todava algo de humanidad.' - piensas aliviado.\n");
            pausa(4000);
            System.out.println("[David]: 'Corre, ponte que lo estoy subiendo a Tick Tock' - dice tu amigo, mientras empieza a grabar con el movil.\n");
            pausa(4000);
            System.out.println("Sientes asco. Te levantas sin decir nada y te vas directo a casa.\n");
            pausa(5000);

            System.out.println("Al llegar a casa, te sientas en tu cama, mirando el porro en tu mano. Sabes que es tu oportunidad de despertar y cambiar tu vida para siempre.");
            pausa(4000);
            System.out.println("Rulas el porro.");
            pausa(2500);
            System.out.println("Lo enciendes.");
            pausa(2500);
            System.out.println("Le das la primera calada...\n");
            pausa(2000);

            System.out.println("... \n");
            pausa(4000);
            System.out.println("De repente, una luz cegadora lo inunda todo.");
            pausa(4000);
            System.out.println("Tu cuerpo empieza a desprender partículas de código y luz. El mareo inicial desaparece de golpe.");
            pausa(4000);

            System.out.println("Sientes una energía rebosante bombeando por tus venas. Sientes que podrías escupir fuego.");
            pausa(4000);
            System.out.println("El trance ha terminado. Has despertado.\n");
            pausa(3000);

    // --- CREACIÓN DEL PERSONAJE ---
            System.out.print("Introduce tu nombre para empezar tu nueva vida: ");
            String nombreJugador = scanner.nextLine();

            System.out.println("\n¿Qué actitud vas a tomar ante esta nueva realidad?\n");
            System.out.println("1. El 'Hater' (Lo odia todo y a todos. Pega durísimo con ataques de toxicidad pura, pero tiene la piel muy fina)\n");
            System.out.println("2. El 'Conformista' (Absorbe el daño y se adapta. Su sentido comun es superior porqué siempre encuentra la forma de conformarse con su situación.)\n");
            System.out.println("3. El 'Tryhard' (Se esfuerza demasiado en cada aspecto de su vida. Muy equilibrado, rapidísimo. Pero si algo sale mal, se tiltea a niveles insospechados).\n");
            System.out.print("Elige tu camino (1-3): ");
            
            int eleccionClase = scanner.nextInt();
            scanner.nextLine(); 

            // Creamos la variable vacía (usamos el molde madre) 
            
            switch(eleccionClase) {
                case 1:
                    System.out.println("\nHas elegido ser un Hater...");
                    mainSelect = new miRPG.Main_characters.Hater(nombreJugador); 
                    break;
                case 2:
                    System.out.println("\nHas elegido ser un Conformista...");
                    mainSelect = new miRPG.Main_characters.Conformist(nombreJugador);
                    break;
                case 3:
                default:
                    System.out.println("\nHas elegido ser un Tryhard...");
                    mainSelect = new miRPG.Main_characters.Tryhard(nombreJugador); 
                    break;
            }
            pausa(3000);

            System.out.println("\n[SISTEMA]: Iniciando estadísticas de RPG para " + mainSelect.getNameCharacter() + "...");
            pausa(3000);
            
            //guardado automático al crear el personaje
            mainSelect.setProgresoHistoria(1);
            miRPG.System.SaveManager.save(mainSelect);
            System.out.println("[ Partida guardada automáticamente ]");
        }

        // --- INTRODUCCIÓN AL MUNDO/ Capítulo 1 ---
        if (mainSelect.getProgresoHistoria() == 1) {
        System.out.println("\nAl momento empiezas a sentir un hambre voraz, no entiendes lo que acaba de pasar pero sabes que tu cuerpo necesita combustible para seguir funcionando.");
        pausa(4000);
        System.out.println("\nAbres la puerta de tu habitación. El humo del porro aún flota en el aire.");
        pausa(4000);
        System.out.println("Bajas las escaleras para salir a la calle a pillar algo de picar, pero al abrir el portal...");
        pausa(4000);
        System.out.println("\nVes a un chaval de tu barrio actuando de forma extraña.");
        pausa(4000);
        System.out.println("Está a cuatro patas cerca de los cubos de basura, rascándose la oreja con el pie.\n");
        pausa(4000);
        
        System.out.println("\n[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Me ha sentado fatal el verde. Estoy alucinando.'\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Yo he visto a esta peña en TikTok, pero no creía que la sociedad hubiera caído tan bajo en la vida real...'\n");
        pausa(4000);
        System.out.println("\nEl chaval se gira. Te clava la mirada. Pela los dientes y empieza a gruñir.\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Eh, colega, ¿estás bien? ¿Te has dejado las llaves ahí tirado o...'");
        pausa(4000);
        
        // --- INICIO DEL COMBATE ---
        System.out.println("\n¡EL CHAVAL SALTA HACIA TI A CUATRO PATAS!");
        pausa(4000);
        
        miRPG.Enemies.InitiatedTherian primerEnemigo = new miRPG.Enemies.InitiatedTherian();
        miRPG.System.Combat.startCombat(mainSelect, primerEnemigo);
        
        // --- POST-COMBATE (Resolución y revelación de la ruta) ---
        System.out.println("\nEl chaval gime como un perro apaleado y sale corriendo por la calle.");
        pausa(4000);
        System.out.println("Te sacudes el polvo de la ropa. Tu corazón va a mil por hora.\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Esto... esto no ha sido el porro. Ha sido real.'");
        pausa(5000);
        
        // Aquí viene el giro para los siguientes combates:
        System.out.println("\nTe asomas a la calle principal para ver a dónde ha ido...");
        pausa(4000);
        System.out.println("Y se te hiela la sangre.");
        pausa(4000);
        System.out.println("A lo largo de la avenida, ves a más chavales. Algunos subidos a los coches aullando, otros olisqueando farolas.\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Joder... tengo que llegar hasta el Mercadona, pero la calle está infestada.'\n2");
        pausa(4000);
        
        mainSelect.gainXp(50);// Experiencia de enemigo común

        //guardado automático al finalizar el primer combate
        mainSelect.setProgresoHistoria(2);
        miRPG.System.SaveManager.save(mainSelect);
        System.out.println("[ Partida guardada automáticamente ]");
        }

        if (mainSelect.getProgresoHistoria() == 3) {
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Pero ¿qué hago?':\n");
            pausa(4000);
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '1. Voy por la calle'\n");
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '2. Pillo un atajo.'\n");
            System.out.print("Elige tu camino (1-2): ");
            int decision2 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            pausa(3000);

            if (decision2 == 1) {
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '¿Que somos?¿Leones o huevones?, como se me acerque uno le pego un palizon'\n");
                pausa(4000);
                System.out.println("Decides seguir por la calle, pero despacio, sin llamar la atención\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Tampoco hace falta llevar un cascabel colgado, voy a ir con cuidado'\n");
                pausa(4000);
                System.out.println("Observando alrededor te das cuenta que algunos therian te miran indiferente.");
                pausa(4000);
                System.out.println("Otros te miran con odio, pero no se acercan a ti.\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Que barbaridad, la sociedad se va a la mierda'\n");
                pausa(4000);
                System.out.println("En ese momento sale de una tienda de animales una señora.");
                pausa(4000);
                System.out.println("Desaliñada, con el cabello enmarañado y balbuceando cosas sin sentido.\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Ostia la loca de los therian, jajaja.'\n");
                pausa(4000);
                System.out.println("Inmediatamente la señora saca de la bolsa comida para perros que acaba de comprar.");
                pausa(4000);
                System.out.println("La abre y empieza a esparcirla por el suelo, mientras le habla al chaval.\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'La loca de los therian a spawneado, jajaja.'\n");
                pausa(4000);
                System.out.println("[Mama Therian]: '¡Hola, pequeño! ¿Qué tal estás? ¿Tienes hambre?' \n");
                pausa(4000);
                System.out.println("El therian empieza a comer la comida de perro sin ningun problema.\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '!Hostia puta, que asco más grande!.' \n");
                pausa(4000);
                System.out.println("[Mama Therian]: 'Que bueno es mi chihuahua.' \n");
                pausa(4000);
                System.out.println("El chaval al oir esto empieza a gruñir a la señora\n");
                pausa(4000);
                System.out.println("[Mama Therian]: 'Perdón perdón, me he confundido, eres un mastin verdad?'\n");
                pausa(4000);
                System.out.println("El chaval empieza a dar saltos de felicidad como si esa raza le hubiese gustado como para identificarse con ella.\n");
                pausa(4000);
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '!Y se queda tan pancho, estan enfermos!.' \n");
                pausa(4000);
                System.out.println("[Mama Therian]: '¡¿Qúe te has creido niñatoo?!, te vas a enterar'\n");
                pausa(4000);
                
                System.out.println("\n¡Mama Therian the azuza a su 'Mastin' !");
                pausa(4000);
        
                miRPG.Enemies.MamaTherian segundoEnemigo = new miRPG.Enemies.MamaTherian();
                miRPG.System.Combat.startCombat(mainSelect, segundoEnemigo);
            }



























        }
}
    // --- MÉTODO AUXILIAR PARA HACER PAUSAS ---
    // Este método detiene el programa los milisegundos que le digas
    public static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("Error en la pausa.");
        }
    }
}