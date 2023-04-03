package main;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class ColasAsesoria2 {

    public static void main(String[] args) {
        
    PriorityQueue<Pedido> lista = new PriorityQueue<>(new comparaPrioridad());

        
        lista.add(new Pedido("Ariel", "Pambazos", "Horchata", "Arroz con leche"));
        lista.add(new Pedido("Lucia", "Pozole", "Jamaica", "Sin postre"));
        lista.add(new Pedido("Miguel", "Torta", "Limon", "Flan"));
        lista.add(new Pedido("Carlos", "Arroz", "Horchata", "Sin postre"));
        lista.add(new Pedido("Lizet", "Huevos", "Horchata", "Gelatina"));
        lista.add(new Pedido("Vicente", "Tamales", "Atole", "Flan"));
        lista.add(new Pedido("Christian", "Tacos", "Horchata", "Fresas con crema"));
        lista.add(new Pedido("Michelle", "Marquesita", "Cafe", "Merengue"));
        lista.add(new Pedido("Juan", "Empanadas", "Coca-Cola", "Sin postre"));
        lista.add(new Pedido("Brandon", "Pambazos", "Horchata", "Flan"));

        
        
        
//             // using spliterator() method
//        Spliterator<Pedido> spt = lista.spliterator();
//  
//        // print result from Spliterator
//        System.out.println("list of Strings:");
//  
//        // forEachRemaining method of Spliterator
//        spt.forEachRemaining((n) -> System.out.println(n));
//        
        
        
        
        
        if (!lista.isEmpty()) {
            System.out.println(lista);
        }

        
//        while(!lista.isEmpty()){
//        System.out.println(lista.remove());
//        }
       
         
         if (!lista.isEmpty()) {
            System.out.println(lista);
        }
        
        
        if (!lista.isEmpty()) {
            System.out.println("Ordenes en cola: " + lista.size() +"\n");
        }

        
        if (!lista.isEmpty()) {
            System.out.println("Que tenga buen provecho: " + lista.poll().getNombre()+"\n");
            System.out.println(lista);
            System.out.println("Ordenes en cola: " + lista.size());
        }

        if (!lista.isEmpty()) {
            System.out.println("Ordenes en cola: " + lista.size());
        }
        
        if (!lista.isEmpty()) {
            System.out.println("La siguiente orden para preparar es de: " + lista.peek().getNombre());
            System.out.println("Ordenes en cola: " + lista.size());
        }
        
        
       
     
        
        
        
        
                // ↓↓↓↓↓↓↓ busca una persona ↓↓↓↓↓↓↓   
        Pedido auxBuscar = new Pedido("Christian", "Tacos", "Horchata", "Fresas con crema");

        if (lista.contains(auxBuscar) == true) {
            System.out.println("DATOS DEL CLIENTE\n" + auxBuscar.toString());
        } else {
            System.out.println("Esta cliente no existe");
        }
        // ↑↑↑↑↑↑↑ busca una persona ↑↑↑↑↑↑↑ 
        
        

        // dudad con remove y contains
        
        
    }
}
