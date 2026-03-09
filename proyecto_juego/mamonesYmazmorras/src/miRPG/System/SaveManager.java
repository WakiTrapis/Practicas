package miRPG.System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import miRPG.Base.MainCharacterBase;

public class SaveManager {
    // El nombre del archivo que se creará en tu ordenador
    private static final String ARCHIVO_GUARDADO = "partida.sav";

    // --- MÉTODO PARA GUARDAR ---
    public static void save(MainCharacterBase jugador) {
        // Usamos un try-catch porque al trabajar con archivos puede haber errores (disco lleno, sin permisos, etc.)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_GUARDADO))) {
            
            oos.writeObject(jugador); // ¡Esta línea hace toda la magia de empaquetar!
            System.out.println("[SISTEMA]: Partida guardada correctamente.");
            
        } catch (IOException e) {
            System.out.println("[ERROR]: No se pudo guardar la partida. " + e.getMessage());
        }
    }

    // --- MÉTODO PARA CARGAR ---
    /**
     * @return
     */
    public static MainCharacterBase load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_GUARDADO))) {
            
            MainCharacterBase saveGameCharacter = (MainCharacterBase) ois.readObject(); // Desempaquetamos
            System.out.println("[SISTEMA]: Partida cargada con éxito. ¡Bienvenido de nuevo, " + saveGameCharacter.getNameCharacter() + "!");
            return saveGameCharacter; // Devolvemos el personaje intacto
            
        } catch (IOException | ClassNotFoundException e) {
            // Si no hay archivo guardado (es la primera vez que juega), no pasa nada
            return null; 
        }
    }
}
