package Personajes_Principales;

public class caballero {

//atributos del jugador
private String nombre;
private double vidaCaballero;
private double danoAtaqueCaballero;


//constructor
public caballero(String nombre, double vidaCaballero, double danoAtaqueCaballero) {
    this.nombre = nombre;
    this.vidaCaballero = vidaCaballero;
    this.danoAtaqueCaballero = danoAtaqueCaballero;
}

//getters y setters
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getVidaCaballero() {
    return vidaCaballero;
}

public void setVidaCaballero(double vidaCaballero) {
    this.vidaCaballero = vidaCaballero;
}

public double getDanoAtaqueCaballero() {
    return danoAtaqueCaballero;
}

public void setDanoAtaqueCaballero(double danoAtaqueCaballero) {
    this.danoAtaqueCaballero = danoAtaqueCaballero;
}


//metodo de ataque
public double atacar(){
    System.out.println("golpeas y le quitas "+ danoAtaqueCaballero + "de daño.");
    return danoAtaqueCaballero;
    }



}