

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("=== EJERCICIO 1 - LISTA ENLAZADA ===");

        System.out.println("Insertando elementos: 10, 20, 30, 40, 50");

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.insertar(50);
        lista.mostrar();


    System.out.println("\n Tamaño de la lista: " + lista.tamaño());

    System.out.println("\n Buscando el valor 30: " + lista.buscar(30));
    System.out.println("\n Buscando el valor 99: " + lista.buscar(99));


    System.out.println("\n Eliminando el valor 30");
    lista.eliminar(30);
    lista.mostrar();

    System.out.println("\n Eliminando el valor 10");
    lista.eliminar(10);
    lista.mostrar();
       

    System.out.println("\n== ANATOMIA DE UN NODO ==");
    Nodo n1 = new Nodo(100);
    Nodo n2 = new Nodo(200);
    Nodo n3 = new Nodo(300);

    n1.enlaceNodo = n2;
    n2.enlaceNodo = n3;

    System.out.println("n1.valor: =" + n1.valor);
    System.out.println("n1.enlaceNodo.valor: =" + n1.enlaceNodo);
    System.out.println("n1.enlace.enlace: " + n1.enlaceNodo.enlaceNodo);
    System.out.println("cadena: " + n1.valor + " -> " + n1.enlaceNodo.valor + " -> " + n1.enlaceNodo.enlaceNodo.valor);
    }
}