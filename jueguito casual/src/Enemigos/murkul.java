package Enemigos;

public class murkul {

//atributos del enemigo
private String nombre = "Murkul, Segador de almas";
private double vidaMurkul = 100;
private double danoAtaqueMurkul = 10;

//constructor del enemigo
public murkul(String nombre, double vidaMurkul, double danoAtaqueMurkul) {
    this.nombre = nombre;
    this.vidaMurkul = vidaMurkul;
    this.danoAtaqueMurkul = danoAtaqueMurkul;
}

//getters y setters del enemigo
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getVidaMurkul() {
    return vidaMurkul;
}

public void setVidaMurkul(double vidaMurkul) {
    this.vidaMurkul = vidaMurkul;
}

public double getDanoAtaqueMurkul() {
    return danoAtaqueMurkul;
}

public void setDanoAtaqueMurkul(double danoAtaqueMurkul) {
    this.danoAtaqueMurkul = danoAtaqueMurkul;
}

//metodo de ataque del enemigo
public double atacar(){
    System.out.println("Murkul, Segador de almas ataca con tu guadaña y te inflinge "+ danoAtaqueMurkul + "de daño.");
    return danoAtaqueMurkul;
    }
}
