package miRPG;

import java.util.Scanner;
import miRPG.Skills_characters.*;
import miRPG.System.GameMenu;
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
            System.out.println("Te encuentras saliendo tarde del trabajo, todo parece normal, monótono, como todos los días. ");
            pausa(4000);
            System.out.println("Pero de repente...");
            pausa(3000);
            System.out.println("Un vagabundo con una sudadera sucia de una vieja empresa tecnológica te agarra del brazo.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Yo escribí el código de esto... pero no le puse botón de apagado' - te susurró con los ojos inyectados en sangre.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Yo invente el scroll infinito!, ellos me obligaron...' - continuó, mientras te arrastraba hacia un callejón oscuro.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Solo fui una marioneta para ellos, cuando quise ponerle el dichoso botón de apagado ya era tarde'\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Pero tú... tú eres diferente. Tienes el potencial.' - dijo, mientras se saca algo del bolsillo.\n");
            pausa(4000);
            System.out.println("[Vagabundo]: 'Este porro hará que puedas entenderme. Despierta'.\n");
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

            System.out.println("Sigues pensando en lo que paso ayer pero también estas contento porque has quedado con tu amigo David para salir a dar una vuelta por el parque.");
            pausa(4000);
            System.out.println("Os encontráis en el parque, pero solo sabéis hablar de videos, memes y tonterías de internet.");
            pausa(4000);
            System.out.println("Empiezas a darte cuenta por lo sucedido con el vagabundo y a su vez prestas más atención a lo que ocurre.");
            pausa(4000);
            System.out.println("De pronto...\n");
            pausa(5000);
            System.out.println("¡CRASH!\n");
            pausa(2500);
            System.out.println("Un coche acaba de estrellarse contra una farola a tres metros de vosotros.");
            pausa(4000);
            System.out.println("Tu amigo ni siquiera levanta la vista del móvil. - 'Bua, literal soy yo, tremendo meme' - murmura embobado.");
            pausa(4000);
            System.out.println("A su vez te das cuenta que a una mujer que estaba paseando por el parque le están robando.");
            pausa(4000);
            System.out.println("Se lo dices a tu amigo y este levanta la mirada rápido, y empieza a teclear en el móvil.\n");
            pausa(4000);
            System.out.println("[Tu]: (Pensando) 'Menos mal, David tiene todavía algo de humanidad.' - piensas aliviado.\n");
            pausa(4000);
            System.out.println("[David]: 'Corre, ponte que lo estoy subiendo a TikTok' - dice tu amigo, mientras empieza a grabar con el móvil.\n");
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
            System.out.println("2. El 'Conformista' (Absorbe el daño y se adapta. Su sentido común es superior porqué siempre encuentra la forma de conformarse con su situación.)\n");
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
//Combate con el Therian Iniciado       
        miRPG.Enemies.InitiatedTherian primerEnemigo = new miRPG.Enemies.InitiatedTherian();
        miRPG.System.Combat.startCombat(mainSelect, primerEnemigo,false);
        
        // --- POST-COMBATE (Resolución y revelación de la ruta) ---
        System.out.println("\nEl chaval gime como un perro apaleado y sale corriendo por la calle.");
        pausa(4000);
        System.out.println("Te sacudes el polvo de la ropa. Tu corazón va a mil por hora.\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Esto... esto no ha sido el porro. Ha sido real.'");
        pausa(5000);
        System.out.println("\nTe asomas a la calle principal para ver a dónde ha ido...");
        pausa(4000);
        System.out.println("Y se te hiela la sangre.");
        pausa(4000);
        System.out.println("A lo largo de la avenida, ves a más chavales. Algunos subidos a los coches aullando, otros olisqueando farolas.\n");
        pausa(4000);
        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Joder... tengo que llegar hasta el Mercadona, pero la calle está infectada.'\n");
        pausa(4000);
        
        mainSelect.gainXp(50);// Experiencia de enemigo común

//Progreso historia 2/guardado 1
        mainSelect.setProgresoHistoria(2);
        miRPG.System.SaveManager.save(mainSelect);
        System.out.println("[ Partida guardada automáticamente ]");
        }

        if (mainSelect.getProgresoHistoria() == 2) {
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Pero ¿qué hago?':\n");
            pausa(4000);
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '1. Voy por la calle'\n");
            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '2. Pillo un atajo.'\n");
            System.out.print("Elige tu camino (1-2): ");
            int decision2 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            pausa(3000);
           
//Ruta 1/seguir por la calle
            if (mainSelect.getProgresoHistoria() == 2 && decision2 == 1) {
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '¿Que somos?¿Leones o huevones?, como se me acerque uno le pego un palizón'\n");
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
                System.out.println("[Mama Therian]: '¡Hola, pequeño! ¿Qué tal estás? ¿Tienes hambre?' \n");
                pausa(4000);
                System.out.println("El therian empieza a comer la comida de perro sin ningún problema.\n");
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
                System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '!Y se queda tan pancho, están enfermos!.' \n");
                pausa(4000);
                System.out.println("[Mama Therian]: '¡¿Qúe te has creído niñato?!, te vas a enterar'\n");
                pausa(4000);
                
                System.out.println("\n¡Mama Therian the azuza a su 'Mastin' !");
                pausa(4000);
 //Combate con Mama Therian/segundo guardado       
                miRPG.Enemies.MamaTherian segundoEnemigo = new miRPG.Enemies.MamaTherian();
                miRPG.System.Combat.startCombat(mainSelect, segundoEnemigo, false);

                mainSelect.gainXp(50);

//Progreso historia 3
                mainSelect.setProgresoHistoria(3);
                miRPG.System.SaveManager.save(mainSelect);
                System.out.println("[ Partida guardada automáticamente ]");
                }
                if (mainSelect.getProgresoHistoria() == 3 && decision2 == 1) {
                    System.out.println("La vieja al ser derrotada comienza a mirar para todos los lados.");
                    pausa(4000);
                    System.out.println("Los therian que había cerca comienzan a ponerse tensos y de pronto la vieja comienza a aullar.");
                    pausa(4000);
                    System.out.println("Los therian comienzan a aullar también, como si se hubieran sincronizado con la vieja.");
                    pausa(4000);
                    System.out.println("De repente, todos los therian de la calle comienzan a correr hacia ti, como si hubieran olido tu sangre.\n");
                    pausa(4000);
                    System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) '¡Joder, me han descubierto! ¡Mejor salgo por patas!'\n");
                    pausa(4000);
                    System.out.println("Empiezas a correr por la calle con todos los therian persiguiéndote.");
                    pausa(4000);
                    System.out.println("Pasas por delante de un contenedor. ¿que haces?.\n");
                    pausa(4000);
                    mainSelect.setProgresoHistoria(4);
                    miRPG.System.SaveManager.save(mainSelect);
                    System.out.println("1. Saltas dentro del contenedor para esconderte.");
                    System.out.println("2. Sigues corriendo.");
                    System.out.print("Elige tu camino (1-2): ");
                    int decision3 = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    pausa(4000);
                    
                    if (mainSelect.getProgresoHistoria() == 4 && decision3 == 1) {
                        System.out.println("Te metes dentro del contenedor y cierras la tapa justo a tiempo para que los therian no te vean.");
                        pausa(4000);
                        System.out.println("Dentro del contenedor, puedes oir a los therian correr por la calle, buscando por todas partes, pero no pueden encontrarte.\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Menos mal que he podido esconderme, esto se estaba poniendo feo.'\n");
                        pausa(4000);
                        System.out.println("Después de un rato, los therian se cansan de buscar y se van, dejando la calle en silencio.");
                        pausa(4000);
                        System.out.println("Con cuidado abres la tapa del contenedor y sales, asegurándote de que no hay ningún therian cerca.");
                        pausa(4000);
                        System.out.println("Antes de salir te das cuenta que hay algo en el fondo del contenedor.");
                        pausa(4000);
                        mainSelect.getInventory().add(new miRPG.UtilItem.Monster());
                        System.out.println("\n---> Has obtenido: [Lata de Monster] <---");
                        System.out.println("Se ha guardado en tu mochila (Opción 5 en combate).");
                        pausa(2000);

                        //Primera aparición del menú
                        GameMenu.menuIntermedio(mainSelect, scanner);

                        System.out.println("Ahora que has descansado un poco, solo te queda atravesar el parque para llegar al Mercadona.");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Pero como han dejado que lleguen a estos extremos'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) '¡Joder!, si tanto quieren ser animales que se vayan al campo'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: '¡a varear olivos los ponía yo, COJONES!'\n");
                        pausa(4000);
                        System.out.println("\nTe tapas la boca rápido.");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Se me ha ido la voz un poco, espero que no me hayan oído.'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) '...'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando mientras se frota la palma de la mano) 'Y si me han escuchado los mando a la perrera con chip incorporado'\n");
                        pausa(4000);
                        System.out.println("\nCruzas la calle y te adentras en el parque.");
                        pausa(4000);
                        System.out.println("Todo parece sumamente tranquilo, después del día que llevas.");
                        pausa(4000);
                        System.out.println("Los niños juegan normal en los columpios.");
                        pausa(4000);
                        System.out.println("Adultos haciendo deporte en las zonas verdes del recinto.");
                        pausa(4000);
                        System.out.println("Parece como si nada hubiera pasado.");
                        pausa(4000);
                        System.out.println("Pero aun asi no bajas la guardia.");
                        pausa(4000);
                        System.out.println("Continuas tu camino pero sientes una presencia.");
                        pausa(4000);
                        System.out.println("Como si alguien o algo te estuviese acechando.");
                        pausa(4000);
                        System.out.println("Caminas mas deprisa, cada vez mas inquieto y hambriento a la vez.");
                        pausa(4000);
                        System.out.println("De pronto unos aplausos se oyen de fondo.");
                        pausa(4000);
                        System.out.println("Conforme te acercas a los aplausos empiezas a distinguir unos gritos de ovación.");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Un momento,...'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Por esta zona del parque se llegaba a ...'\n");
                        pausa(4000);
                        System.out.println("\nCuando te quieres dar cuenta lo tienes de frente.");
                        pausa(4000);
                        System.out.println("\n[ Micrófono ]:  '¡Damas y caballeros acaban de presenciar el mejor tiempo en todo el concurso'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Espera, ¿que?'\n");
                        pausa(4000);
                        System.out.println("\n[ Micrófono ]:  'El campeón ha sido nada mas y nada menos que para Paula, la Border Collie.'\n");
                        pausa(4000);
                        System.out.println("[\" + mainSelect.getNameCharacter() + \"]: Venga ya, no me jodas, ¿Esto es real?.'\n");
                        pausa(4000);
                        System.out.println("La gente de alrededor comenzó a alejarse fascinada por lo que acababan de ver.");
                        pausa(4000);
                        System.out.println("Pero tu sigues con la mirada clavada en el podio de perros que se alzaba en la pista.");
                        pausa(4000);
                        System.out.println("Una chica con una cola cosida al pantalón, unas zarpas hechas con goma eva y piezas de lego en vez de uñas .");
                        pausa(4000);
                        System.out.println("En ese momento aparece otro descerebrado de ellos.");
                        pausa(4000);
                        System.out.println("Te resulta familiar y no recuerdas de que.");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Esta disfrazo igual pero como si le hubiesen atropellado.'\n");
                        pausa(4000);
                        System.out.println("Ves como este se va acercando hacia la chica del concurso y le dice algo al oído mientras mira y señala hacia ti.");
                        pausa(4000);
                        System.out.println("Pero cuando te acuerdas ya es tarde.");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando) '¡Mierda! Es el 'Mastin' de la vieja.'\n");
                        pausa(4000);
                        System.out.println("Comienzas a mirar alrededor buscando una salida o un escondite y solo ves una caseta del personal de mantenimiento del parque.\n");
                        pausa(4000);
                        mainSelect.setProgresoHistoria(5);
                        miRPG.System.SaveManager.save(mainSelect);
                        System.out.println("1. Corres hacia la caseta.");
                        System.out.println("2. Te quedas en el sitio desafiante.");
                        System.out.print("Elige tu camino (1-2): ");
                        int decision4 = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        pausa(4000);

                        if (mainSelect.getProgresoHistoria() == 5 && decision4 == 1) {
                            System.out.println("Corres hacia la caseta, mientras que los therian empiezan a correr.");
                            pausa(4000);
                            System.out.println("Entras en la caseta y cierras la puerta justo a tiempo.");
                            pausa(4000);
                            System.out.println("Mientras los otros apalean la puerta.\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'Por el bigote de una gamba.'\n");
                            pausa(4000);
                            System.out.println("La caseta esta oscura y estrecha pero logras palpar algo con tus manos.");
                            pausa(4000);
                            System.out.println("Al momento se ilumina y se mete en tu pecho.");
                            pausa(4000);
                            GameMenu.sortearHabilidad(mainSelect, new BlazingBuckle(), new EnlightenedReasoning());
                            GameMenu.menuIntermedio(mainSelect, scanner);
                            pausa(4000);
                            System.out.println("Abres la puerta y sin mas opciones te enfrentas al Therian Alpha.\n");
                            pausa(4000);
                            miRPG.Enemies.TherianBeta tercerEnemigo = new miRPG.Enemies.TherianBeta();
                             miRPG.System.Combat.startCombat(mainSelect, tercerEnemigo,false);

                             mainSelect.gainXp(50);// Experiencia de enemigo común
                            System.out.println("Salen corriendo balbuceando y aullando sin control .");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'La proxima vez que vuelvan.'\n");
                            pausa(4000);
                            System.out.println("Sales del parque y por fin llegas al bendito Mercadona.'\n");
                            pausa(4000);
                            miRPG.System.GameMenu.shopGame(mainSelect, scanner);
                            }
                        if (mainSelect.getProgresoHistoria() == 5 && decision4 == 2) {
                            System.out.println("Decides quedarte en el sitio desafiante, mirando fijamente al duo mientras este se acerca a ti.");
                            pausa(4000);
                            System.out.println("\n[Therian Beta]: 'Con que tu eres el que le ha dado una tunda a uno de mi manada'\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Eh Eh Eh, ¿Que coño hacéis hablando?'\n");
                            pausa(4000);
                            System.out.println("De pronto se frenan en seco los dos therian.\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: '¿No sois perros? pues menos hablar y mas ladrar'\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: 'que no sabéis ni lo que queréis, queréis ser perros pero dormir en una cama.'\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Comer comida de humanos, si llueve resguardados en casa.'\n");
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: '¿En que quedamos? Os voy a tener que enseñar a usar la lógica.'\n");
                            pausa(4000);
                            miRPG.Enemies.TherianBeta cuartoEnemigo = new miRPG.Enemies.TherianBeta();
                            miRPG.System.Combat.startCombat(mainSelect, cuartoEnemigo,false);

                            mainSelect.gainXp(50);// Experiencia de enemigo común

                            GameMenu.sortearHabilidad(mainSelect, new BlazingBuckle(), new EnlightenedReasoning());
                            GameMenu.menuIntermedio(mainSelect, scanner);
                            pausa(4000);
                            System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'La proxima vez que vuelvan.'\n");
                            pausa(4000);
                            System.out.println("Sales del parque y por fin llegas al bendito Mercadona.\n");
                            pausa(4000);
                            miRPG.System.GameMenu.shopGame(mainSelect, scanner);
                            } 
                    }
                    if(mainSelect.getProgresoHistoria() == 4 && decision3 == 2)  {
                        System.out.println("Pasas del contenedor y sigues corriendo.");
                        pausa(4000);
                        System.out.println("Los tienes pisándote los talones.");
                        pausa(4000);
                        System.out.println("Solo tienes que atravesar el parque para llegar al Mercadona.");
                        pausa(4000);
                        System.out.println("Pero cada vez te falta mas el aire, demasiada intensidad corriendo.");
                        pausa(4000);
                        System.out.println("Comienzas a buscar por todos lados algún escondite o algo para poder despistarlos.");
                        pausa(4000);
                        System.out.println("Observas una caseta de mantenimiento cerca de la salida del parque.");
                        pausa(4000);
                        System.out.println("A su vez ves una multitud aplaudiendo y elogiando algún tipo de espectáculo.");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: (Pensando) 'No es momento de parar.'\n");
                        pausa(4000);
                        System.out.println("Corres hacia la caseta, pero esta cerrada.");
                        pausa(4000);
                        System.out.println("No tienes escapatoria.");
                        pausa(4000);
                        System.out.println("Los tienes casi encima.");
                        pausa(4000);
                        System.out.println("En ese instante se abre y cierra la puerta dejándote caer dentro de la caseta.\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: '¿Que demonios pasa aquí?.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Lo siento, era cuestión de vida o muerte.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Estaba tan tranquilo en mi casa cuando...'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: 'No me cuentes más, solo tengo que ver el zoológico que hay ahi fuera montado.'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: 'Una cosa es que te gusten los animales.'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: 'A mi me gustan.'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: '¿A ti te gustan?.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Pues sí, pero esto ya pasa de castaño oscuro.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Desde que he salido de casa no han parado de perseguirme, estoy hasta los cojones.'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: 'Creo que tengo algo que te puede ser muy util.'\n");
                        pausa(4000);
                        System.out.println("[ JARDINERO ]: 'Toma.'\n");
                        pausa(4000);

                        GameMenu.sortearHabilidad(mainSelect, new BlazingBuckle(), new EnlightenedReasoning());

                        System.out.println("\n[ JARDINERO ]: 'Ahora sal ahi fuera y enséñales quien es su amo.'\n");
                        pausa(4000);
                        
                        GameMenu.menuIntermedio(mainSelect, scanner);

                        System.out.println("Haciendo caso al jardinero, abres la puerta y sales.\n");
                        pausa(4000);
                        System.out.println("En la puerta hay tres therians.\n");
                        pausa(4000);
                        System.out.println("Sonriendo desafiantes, en fila, como si quisieran esconder algo detrás de ellos.\n");
                        pausa(4000);
                        System.out.println("[ ??? ]: 'Aaaauuuuuu.'\n");
                        pausa(4000);
                        System.out.println("Algo se revuelve detrás de ellos.\n");
                        pausa(4000);
                        System.out.println("Al prestar mas atención te das cuenta de que es una chica que se esta poniendo el disfraz rápidamente.\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Joder tíos, JAJAJAJA, no podéis ser mas cutres.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Si tanto queréis pelea, pues la tendréis.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Luego no quiero gimoteo.'\n");
                        pausa(4000);

                        miRPG.Enemies.TherianBeta quintoEnemigo = new miRPG.Enemies.TherianBeta();
                        miRPG.System.Combat.startCombat(mainSelect, quintoEnemigo,false);

                        mainSelect.gainXp(50);// Experiencia de enemigo común

                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'La proxima vez que me hagáis correr por todo el barrio me encargare de que os metan a todos en una perrera psiquiátrica .'\n");
                        pausa(4000);
                        System.out.println("Dejas a los chavales destrozados, le das las gracias al jardinero y sales del parque.\n");
                        pausa(4000);
                        System.out.println("Al salir ves al otro lado de la calle el bendito Mercadona.\n");
                        pausa(4000);
                    }
                }
//Ruta 2/Atajo por callejón.
                if (mainSelect.getProgresoHistoria() == 3 && decision2 == 2) {
                    System.out.println("Prefieres no llamar la atención y te diriges hacia el callejón.");
                        pausa(4000);
                        System.out.println("Este esta lleno de basura, esta oscuro y el olor te eriza hasta los pelos de la nariz.");
                        pausa(4000);
                        System.out.println("no muy avanzado en el callejón observas que una de las puertas traseras de una tienda de informática se abre.");
                        pausa(4000);
                        System.out.println("Un empleado salia con unas grandes bolsas que deposito en el contenedor que había cerca.");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Vaya, estas tiendas siempre tiran cosas que funcionan todavía.'\n");
                        pausa(4000);

                        GameMenu.eventoContenedorTecnologico(mainSelect, new EnlightenedReasoning(), new BlazingBuckle(), scanner);

                        GameMenu.menuIntermedio(mainSelect, scanner);


                        System.out.println("El dependiente de la tienda escucha ruidos fuera y decide salir a comprobar.");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Muchacho, ¿qué haces aquí?'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: '¿No has visto la calle principal?.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Pues claro pero he oído que en los callejones del barrio se están formando grupos de Therians y no me hace ninguna gracia.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: '¿No seras tu unos de ellos?.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: '¿Me ves con cara de enfermo mental?.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Perdón, no quería ofenderte.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Pues piense las cosas antes de decirlas hombre, ¿Tan mala cara tengo?.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Pues no te pongas a caminar por los callejones, niñato.'\n");
                        pausa(4000);
                        System.out.println("[" + mainSelect.getNameCharacter() + "]: 'Escúchame bien clarito, yo camino por donde me da la gana, ¿Entendido?.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Pues atente a las consecuencias si después no puedes caminar más.'\n");
                        pausa(4000);

                        miRPG.Enemies.Employee sextoEnemigo = new miRPG.Enemies.Employee();
                        miRPG.System.Combat.startCombat(mainSelect, sextoEnemigo, true);

                        mainSelect.gainXp(50);// Experiencia de enemigo común

                        System.out.println("\n[ Dependiente ]: 'Tienes madera de cazador, eso hay que admitirlo.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Ven, deja que te muestre algo.'\n");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando) 'Que tipo más raro, no entiendo los cambios de humor.'\n");
                        pausa(4000);
                        System.out.println("1. Vas con el dependiente.");
                        System.out.println("2. Pasas y continuas por los callejones.");
                        System.out.print("Elige tu camino (1-2): ");
                        int decision4 = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        pausa(4000);
//sigues al dependiente.
                        if (decision4 == 1) {
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'esta bien te sigo.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Magnifica elección, no te arrepentirás.'\n");
                        pausa(4000);
                        System.out.println("[ Dependiente ]: 'Llevo mucho tiempo buscando a una persona que me ayude.'\n");
                        pausa(4000);
                        System.out.println("Sigues al dependiente dentro de la tienda.");
                        pausa(4000);
                        System.out.println("se acerca a una estantería de la trastienda.");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Lo que te voy a mostrar es alto secreto pero creo que eres el indicado y puedo confiar en ti.'\n");
                        pausa(4000);
                        System.out.println("El dependiente tira de uno de los lados de la estantería y esta se desliza por el suelo dejando ver una entrada oculta.");
                        pausa(4000);
                        System.out.println("Entráis y bajáis por una escalera.");
                        pausa(4000);
                        System.out.println("Conforme vas bajando comienzas a escuchar un murmullo cada vez mas nítidamente.");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'No te asustes con lo que veas.'\n");
                        pausa(4000);
                        System.out.println("Conforme vas bajando comienzas a escuchar un murmullo cada vez mas nítidamente.");
                        pausa(4000);
                        System.out.println("Llegas a la puerta,el dependiente la abre y...");
                        pausa(4000);
                        System.out.println("Te quedas de piedra, los ojos como platos y la boca rozando tus rodillas.");
                        pausa(4000);
                        System.out.println("No sabes que sientes en este momento.");
                        pausa(4000);
                        System.out.println("Jaulas por todos lados, llenas de...");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '¿Personas?.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'No, son enfermos.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Esto son therians, personas que se percibe como animales.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Creerás que esto que hago esta mal pero estos seres han llegado a olvidar su parte humana y se han descontrolado.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Yo me dedico a atraparlos.'\n");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '¿Como el gobierno a permitido esto?.'\n");
                        pausa(4000);
                        System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Quiero decir, como ha permitido en primer lugar que que adopten esta actitud y segundo perder la consciencia.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Yo tampoco lo se, pero hay algo que si se.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Tienes madera de cazador, creo que podrías llegar lejos si dejas que te ayude.'\n");
                        pausa(4000);
                        System.out.println("\n[ Dependiente ]: 'Necesitamos más gente que nunca después del descontrol que hay.'\n");
                        pausa(4000);
                        System.out.println("1. aceptas la propuesta.");
                        System.out.println("2. No quieres involucrarte en esto.");
                        System.out.print("Elige tu camino (1-2): ");
                        int decision5 = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        pausa(4000);
//aceptas la propuesta
                        if (decision5 == 1) {
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Como voy a negarme ante semejante propuesta.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Ademas esta gente me tienen desquiciado, si al menos no dieran por culo.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Pero no, tienen que estar intentando llamar la atención constantemente.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Ya es hora de acabar con esto .'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'A si se habla, sabia que no me equivocaba contigo.'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Por eso te voy a dar un regalo, toma.'\n");
                            pausa(4000);
                            mainSelect.setHasMask(true);
                            System.out.println("\n---> Has obtenido: [Mascara de Therian] <---");
                            System.out.println("Se ha guardado en tu mochila.");
                            pausa(2000);
                            System.out.println("\n[ Dependiente ]: 'Con esto podrás camuflarte y pasar desapercibido entre ellos.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Gracias, la usare bien .'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Ahora continua tu camino y acaba con esto de una vez por todas.'\n");
                            pausa(4000);
                            System.out.println("Subes de nuevo al callejón.");
                            pausa(4000);
                            System.out.println("Continuas pensativo.");
                            pausa(4000);
                            System.out.println("\n[ " + mainSelect.getNameCharacter() + " ]: (Pensando) '¿El dependiente sera el único cazador o sera una organización?.'\n");
                            pausa(4000);
                            System.out.println("\n[ " + mainSelect.getNameCharacter() + " ]: (Pensando) 'No lo se, lo único que se es que como no llegue ya al Mercadona voy a morir de inanición.'\n");
                            pausa(4000);
                            System.out.println("El callejón parece infinito pero consigues ver la salida a unos treinta metros.");
                            pausa(4000);
                            System.out.println("Justo antes de poder salir te cierran el paso dos personas.");
                            pausa(4000);
                            System.out.println("Por la oscuridad del callejón y la claridad de la salida no logras ver bien quienes son.");
                            pausa(4000);
                            System.out.println("Cuando consigues forzar la vista logras ver que uno esta apaleado, como si...");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Mierda, es el chaval de mi barrio.'\n");
                            pausa(4000);
                            System.out.println("\n[Therian Beta]: 'Con que tu eres el que le ha dado una tunda a uno de mi manada'\n");
                            pausa(4000);
                            System.out.println("\n[Therian Beta]: 'Eso ha sido un terrible error y lo vas a pagar.'\n");
                            pausa(4000);
                            miRPG.Enemies.TherianBeta septimoEnemigo = new miRPG.Enemies.TherianBeta();
                            miRPG.System.Combat.startCombat(mainSelect, septimoEnemigo,false);

                            mainSelect.gainXp(50);// Experiencia de enemigo común
                            
                            System.out.println("Los Therian salen corriendo pero dejan caer un objeto.");
                            pausa(4000);
                            mainSelect.getInventory().add(new miRPG.UtilItem.SolidBone());
                            System.out.println("\n---> Has obtenido: [Hueso Macizo] <---");
                            System.out.println("Se ha guardado en tu mochila (Opción 5 en combate).");
                            pausa(2000);
                            System.out.println("Consigues salir del callejón.");
                            pausa(4000);
                            System.out.println("Al otro lado de la calle esta el Mercadona.");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando)'Joder, menos mal.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: (Pensando)'Llego a saber lo que me va a pasar y no hubiese salido de casa.'\n");
                            pausa(4000);

                            GameMenu.minijuegoCruce(mainSelect);

                            System.out.println("Llegas al Mercadona por los pelos.");
                            pausa(4000);
                            miRPG.System.GameMenu.shopGame(mainSelect, scanner);   
                        }
//no quieres involucrarte
                        if (decision5 == 2) {
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Tu estas chalado compi.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Deja lo que estes tomando porque te estas quedando igual que ellos.'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Mala decisión chaval.'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Podrías haber cambiado el mundo y sin embargo apartas la mirada.'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Lastima que ya no pueda dejarte ir después de que hayas visto todo esto.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '¿A si? ¿y que vas hacer?.'\n");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Vas a comprobar en tus propias carnes lo que ocurre si liberas a estas criaturas.'\n");
                            pausa(4000);
                            System.out.println("De pronto se escucha un cerrojo al fondo de la sala.");
                            pausa(4000);
                            System.out.println("De la jaula comienza a salir lentamente...");
                            pausa(3000);
                            System.out.println("alguien.");
                            pausa(4000);
                            System.out.println("No se distingue bien intenta ser un perro, un gato o un conejo.");
                            pausa(4000);
                            System.out.println("La incertidumbre florece por la mezcla de adornos que por lo que se puede distinguir lleva una vieja.");
                            pausa(4000);
                            System.out.println("Pero no hay tiempo de observar, la criatura se abalanza sobre ti.");
                            pausa(4000);

                            miRPG.Enemies.MamaTherian segundoEnemigo = new miRPG.Enemies.MamaTherian();
                            miRPG.System.Combat.startCombat(mainSelect, segundoEnemigo, false);

                            mainSelect.gainXp(50);

                            System.out.println("Debido a la pelea, la vieja se confunde y ataca al dependiente.");
                            pausa(4000);
                            System.out.println("Aprovechas el momento para escapar.");
                            pausa(4000);
                            System.out.println("Al salir continuas tu camino.");
                            pausa(4000);
                            System.out.println("El callejón parece infinito pero consigues ver la salida a unos treinta metros.");
                            pausa(4000);
                            System.out.println("Justo antes de poder salir te cierran el paso dos personas.");
                            pausa(4000);
                            System.out.println("Por la oscuridad del callejón y la claridad de la salida no logras ver bien quienes son.");
                            pausa(4000);
                            System.out.println("De pronto, una lona cae sobre ti, te atrapa y comienzas a sentir que te elevas.");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: '¿Que hacéis? ¿Quienes sois?.'\n");
                            pausa(4000);
                            System.out.println("No contesta nadie, solo consigues escuchar un fuerte aleteo .");
                            pausa(4000);
                            System.out.println("\n[ Dependiente ]: 'Soltadme, yo no he hecho nada, os vais a arrepentir de esto.'\n");
                            pausa(4000);
                            System.out.println("Te sueltan de nuevo y te quitan la lona.");
                            pausa(4000);
                            System.out.println("Te encuentras en la azotea del edificio que había justo antes de salir, desde aquí se ve el Mercadona.");
                            pausa(4000);
                            System.out.println("Frente a ti se encuentras 2 Therians disfrazados de pájaros y una grúa.");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '¿Que cojones hacéis? .'\n");
                            pausa(4000);
                            System.out.println("\n[ Pájaro Therian ]: '¿Crees que no sabemos quien eres?, has salido del escondite del dependiente.'\n");
                            pausa(4000);
                            System.out.println("\n[ Pájaro Therian ]: 'Eres uno de ellos.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Me ha intentado reclutar pero lo he rechazado.'\n");
                            pausa(4000);
                            System.out.println("\n[ Pájaro Therian ]: 'Mientes.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'No miento, los que mentis sois vosotros.'\n");
                            pausa(4000);
                            System.out.println("\n[ Pájaro Therian ]: 'Es cierto que te hemos vist...'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '¡A CALLAR!.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Os mentis a vosotros mismo creyendo que sois animales.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: 'Si sois pájaros que coño hacéis hablando.'\n");
                            pausa(4000);
                            System.out.println("\n[\" + mainSelect.getNameCharacter() + \"]: '.'\n");
                            pausa(4000);
                            

                        }       
                        
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