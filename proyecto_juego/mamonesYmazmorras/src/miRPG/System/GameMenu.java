package miRPG.System;

import miRPG.Base.Item;
import java.util.List;
import java.util.Scanner;
import miRPG.Base.MainCharacterBase;
import miRPG.Base.Skill;

public class GameMenu {

    // Menú intermedio que aparece entre combates o eventos importantes
    public static void menuIntermedio(MainCharacterBase player, Scanner scanner) {
        boolean continuar = false;

        while (!continuar) {
            System.out.println("\n=== ZONA TRANQUILA ===");
            System.out.println("Tienes un momento de paz. ¿Qué quieres hacer, " + player.getNameCharacter() + "?");
            System.out.println("1. Modificar set de habilidades");
            System.out.println("2. Abrir la mochila");
            if (player.getProgresoHistoria() >= 3) {
                System.out.println("3. Ir al Mercadona (Minijuego de Loot)");
            } else {
                System.out.println("3. ??? (Bloqueado por la historia)");
            }
            System.out.println("4. Repartir puntos de nivel");
            System.out.println("5. Continuar la aventura (Restaurar Cordura)");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    manageSkills(player, scanner);
                    break;
                case 2:
                    openBag(player, scanner);
                    break;
                case 3:
                    if (player.getProgresoHistoria()>=4) {
                    System.out.println("\nTe acercas al Mercadona.");
                    shopGame(player, scanner);
                    } else {
                    System.out.println("\nEsa opción aún no está disponible.");
                    }
                    break;
                case 4:
                    manageLvlPoints((MainCharacterBase) player, scanner);
                    break;
                case 5:
                    player.fullHeal();
                    System.out.println("\nTe ajustas la ropa, respiras hondo y continúas tu camino...  (Has restablecido tu Cordura al máximo)");
                    continuar = true; // Rompe el bucle
                    break;
                default:
                    System.out.println("\nOpción no válida. Concéntrate, que estas amamonao.");
            }
        }
    }
    // Submenu de la mochila
    private static void openBag(MainCharacterBase player, Scanner scanner) {
        List<Item> mochila = player.getInventory();

        if (mochila.isEmpty()) {
            System.out.println("\n¡Solo hay pelusas! Tu mochila está vacía.");
            return;
        }

        System.out.println("\n--- MOCHILA ---");
        for (int i = 0; i < mochila.size(); i++) {
            System.out.println((i + 1) + ". " + mochila.get(i).getName());
        }
        System.out.println("0. Cerrar mochila");
        System.out.print("¿Qué quieres usar? ");

        int opcObjeto = scanner.nextInt();
        scanner.nextLine();

        if (opcObjeto > 0 && opcObjeto <= mochila.size()) {
            Item objetoElegido = mochila.get(opcObjeto - 1);
            boolean seHaGastado = objetoElegido.use(player);

            if (seHaGastado) {
                mochila.remove(opcObjeto - 1);
            }
        } else if (opcObjeto == 0) {
            System.out.println("Cierras la mochila.");
        } else {
            System.out.println("No encuentras ese objeto.");
        }
    }
    // Submenu de gestión de habilidades
    private static void manageSkills(MainCharacterBase player, java.util.Scanner scanner) {
        boolean saliendo = false;

        while (!saliendo) {
            System.out.println("\n--- TUS HABILIDADES EQUIPADAS ---");
            // Sacamos los 4 huecos del personaje
            miRPG.Base.Skill[] equipadas = player.getEquippedSkills(); 
            
            for (int i = 0; i < 4; i++) {
                if (equipadas[i] != null) {
                    System.out.println((i + 1) + ". " + equipadas[i].getName());
                } else {
                    System.out.println((i + 1) + ". [Hueco Vacío]");
                }
            }
            System.out.println("0. Volver a la Zona Tranquila");
            System.out.print("¿Qué hueco quieres modificar? (Elige 1-4, o 0 para salir): ");

            int hueco = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            if (hueco == 0) {
                saliendo = true; // Rompemos el bucle y volvemos al menú anterior
                System.out.println("Cierras tu lista de habilidades.");
            } else if (hueco >= 1 && hueco <= 4) {
                // Sacamos la lista de TODAS las habilidades aprendidas
                java.util.List<miRPG.Base.Skill> aprendidas = player.getSkills();

                if (aprendidas.isEmpty()) {
                    System.out.println("\nAún no has aprendido ninguna habilidad para equipar.");
                    // Un pequeño truco: usamos 'continue' para que el bucle vuelva a empezar arriba del todo
                    continue; 
                }

                System.out.println("\n--- HABILIDADES APRENDIDAS ---");
                for (int i = 0; i < aprendidas.size(); i++) {
                    System.out.println((i + 1) + ". " + aprendidas.get(i).getName());
                }
                System.out.println("0. Cancelar");
                System.out.print("Elige una habilidad para equipar en el HUECO " + hueco + ": ");
                
                int habElegida = scanner.nextInt();
                scanner.nextLine();

                if (habElegida == 0) {
                    System.out.println("Cancelando...");
                } else if (habElegida > 0 && habElegida <= aprendidas.size()) {
                    // ¡LA MAGIA! Metemos la habilidad elegida en el hueco del array
                    equipadas[hueco - 1] = aprendidas.get(habElegida - 1);
                    System.out.println("¡Habilidad [" + equipadas[hueco - 1].getName() + "] equipada con éxito en el hueco " + hueco + "!");
                } else {
                    System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Ese hueco no existe. Tienes 4 huecos (1-4).");
            }
        }
    }
    private static void manageLvlPoints(MainCharacterBase player, Scanner scanner) {
        boolean saliendo = false;

        while (!saliendo) {
            // Usamos la variable lvlPoints que tienes en tu clase MainCharacterBase
            int puntos = (int) player.getLvlPoints();

            System.out.println("\n--- MEJORA DE ATRIBUTOS ---");
            System.out.println("Puntos de nivel restantes: " + puntos);
            
            if (puntos <= 0) {
                System.out.println("No tienes puntos para gastar. Sube de nivel para conseguir más.");
                return; // Volvemos al menú principal
            }

            // Mostramos las opciones tal cual las tienes programadas en improveStat()
            System.out.println("1. Cordura máxima (Vida)");
            System.out.println("2. Fuerza bruta (Ataque)");
            System.out.println("3. Defensa");
            System.out.println("4. Subidón (Ki)");
            System.out.println("5. Sentido común (Def. Especial)");
            System.out.println("6. Velocidad neuronal (Velocidad)");
            System.out.println("0. Volver");
            System.out.print("¿Qué atributo quieres mejorar? (Cuesta 1 punto): ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                saliendo = true;
                System.out.println("Saliendo del reparto de puntos...");
            } else if (opcion >= 1 && opcion <= 6) {
                // ¡Llamamos a tu método improveStat!
                // Le pasamos la 'opcion' que ha elegido el jugador y le decimos que gaste 1 punto
                player.improveStat(opcion, 1); 
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
    public static void shopGame(MainCharacterBase player, java.util.Scanner scanner) {
        System.out.println("\n=== MERCADONA: SAQUEO A CIEGAS ===");
        System.out.println("Entras al supermercado esquivando cristales rotos. Todo está hecho un desastre.");
        System.out.println("Escuchas ruidos extraños al fondo... Solo tienes tiempo de mirar en UN pasillo rápido.");
        System.out.println("1. Pasillo de Panadería y Lácteos");
        System.out.println("2. Pasillo de Snacks y Bebidas energéticas");
        System.out.println("3. Sección de Perfumería y Botiquín");
        System.out.print("¿Por qué pasillo te la juegas? (1-3): ");

        int eleccion = scanner.nextInt();
        scanner.nextLine();

        // --- LA PROBABILIDAD ---
        // Math.random() genera un número entre 0.0 y 1.0. 
        // Si ponemos < 0.60, significa que hay un 60% de probabilidad de éxito (y 40% de fallar).
        boolean haySuerte = Math.random() < 0.50;

        if (haySuerte) {
            System.out.println("\n¡Tienes suerte! Rebuscas entre los escombros y encuentras algo que no se han llevado.");
            
            if (eleccion == 1) {
                System.out.println("Encuentras un paquete de napolitanas intacto. ¡Te da un Subidón de energía!");
                player.gainXp(50); // 50 de XP
            } else if (eleccion == 2) {
                System.out.println("¡Bingo! Un palé con latas frías.");
                player.getInventory().add(new miRPG.UtilItem.Monster());
                System.out.println("---> Has obtenido: [Lata de Monster] <---");
                player.getInventory().add(new miRPG.UtilItem.Monster());
            } else {
                System.out.println("Encuentras un bote de alcohol y vendas limpias. Te curas las heridas.");
                player.setCurrentHealth(player.getStats().getMaxHealth()); // Cura máxima
                System.out.println("¡Tu salud se ha restaurado al máximo!");
            }
        } else {
            System.out.println("\nRebuscas desesperadamente por las estanterías, pero... ¡están completamente vacías!");
            System.out.println("De repente, una estantería cae al suelo haciendo un ruido ensordecedor.");
            System.out.println("¡El dependiente te ha visto! Tienes que salir corriendo con las manos vacías.");
        }
         
        miRPG.System.SaveManager.save(player);
        System.out.println("[ Partida Guardada - Mercadona completado ]");
    }

    public static void sortearHabilidad(MainCharacterBase player, Skill opcionA, Skill opcionB) {
        // Tirada de moneda
        if (Math.random() < 0.5) {
        player.getSkills().add(opcionA);
        System.out.println("¡Has aprendido la habilidad: [" + opcionA.getName() + "]!");
        } else {
        player.getSkills().add(opcionB);
        System.out.println("¡Has aprendido la habilidad: [" + opcionB.getName() + "]!");
        }
    
    // Aprovechamos para guardar el progreso ya que el jugador ha ganado algo
        miRPG.System.SaveManager.save(player); 
    }
    public static void eventoContenedorTecnologico(MainCharacterBase player, Skill opcionA, Skill opcionB, Scanner scanner) {
        int intentosMaximos = 5;

        System.out.println("\nObservas a un empleado de una tienda tecnológica tirar varias cajas a un contenedor y marcharse...");
        System.out.println("1. Rebuscar en el contenedor");
        System.out.println("2. Seguir de largo");
        System.out.print("Elige una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (opcion == 1) {
            for (int i = 1; i <= intentosMaximos; i++) {
                System.out.println("\nRemueves cables pelados y piezas metálicas...");
                
                if (i < intentosMaximos) {
                    System.out.println("No encuentras nada interesante.");
                    System.out.println("1. Buscar con más detalle");
                    System.out.println("2. Rendirse y salir del callejón");
                    System.out.print("Elige una opción: ");
                    
                    int seguir = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    if (seguir != 1) {
                        System.out.println("Decides que no vale la pena llenarse de grasa por chatarra.");
                        return; 
                    }
                } else {
                    // Éxito final en el quinto intento
                    System.out.println("\n¡BINGO! Entre el fondo pegajoso del contenedor brilla una luz.");
                    System.out.println("Al tocarlo, la luz se integra en tu sistema.");
                    
                    // Usamos el método genérico que definimos antes
                    GameMenu.sortearHabilidad(player, opcionA, opcionB);
                }
            }
        } else {
            System.out.println("Sigues caminando. No eres un chatarrero... todavía.");
        }
}
}
