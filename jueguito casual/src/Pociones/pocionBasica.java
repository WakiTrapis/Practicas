package Pociones;

public class pocionBasica {

//atributos del enemigo
String nombre = "Poción básica de vida";
double curacion = 20;

//constructor de la pocion
public pocionBasica(String nombre, double curacion) {
    this.nombre = nombre;
    this.curacion = curacion;
}

//getters y setters de la pocion
public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public double getCuracion() {
    return curacion;
}


public void setCuracion(double curacion) {
    this.curacion = curacion;
}

//metodo de curacion de la pocion
public double curar(){
    System.out.println("Tomas la poción y recuperas "+ curacion + " de vida.");
    return curacion;
    }
}