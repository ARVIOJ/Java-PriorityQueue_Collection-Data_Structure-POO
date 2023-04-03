package main;

import java.util.Comparator;

public class Pedido {

    private String Nombre;
    private String Comida;
    private String bebida;
    private String Postre;
    private int prioridad;

    public Pedido(String Nombre, String Comida, String bebida, String Postre) {

        this.Nombre = Nombre;
        this.Comida = Comida;
        this.bebida = bebida;
        this.Postre = Postre;

        if (Comida == "Tamales") {
            prioridad = 1;
        } else if (Comida == "Huevos") {
            prioridad = 2;
        } else if (Comida == "Arroz") {
            prioridad = 3;
        } else if (Comida == "Torta") {
            prioridad = 4;
        } else if (Comida == "Pozole") {
            prioridad = 5;
        } else if (Comida == "Pambazos") {
            prioridad = 6;
        } else {
            prioridad = 7;
        }

    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getComida() {
        return Comida;
    }
    
    
    
    @Override
    public String toString() {
        return Nombre+" ordeno "+Comida+" con una bebida de "+bebida+" y de postre "+Postre+"\n";
    } 

}

class comparaPrioridad implements Comparator<Pedido> {

    @Override
    public int compare(Pedido a, Pedido b) {
        return a.getPrioridad() - b.getPrioridad();
    }
}
