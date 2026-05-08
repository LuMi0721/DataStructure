public class ListaEnlazada {
    private Nodo cabeza;
  

    public ListaEnlazada() {
        cabeza = null;

    
    }

public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = (Nodo) actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.siguiente == null && ((Nodo) cabeza).siguiente.equals(valor)) {
            cabeza = null;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (((Nodo) actual.siguiente).siguiente.equals(valor)) {
                actual.siguiente = ((Nodo) actual.siguiente).siguiente;
                return;
            }
            actual = (Nodo) actual.siguiente;
        }
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (((Nodo) actual).siguiente.equals(valor)) {
                return true;
            }
            actual = (Nodo) actual.siguiente;
        }
        return false;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(((Nodo) actual).siguiente);
            actual = (Nodo) actual.siguiente;
        }
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = (Nodo) actual.siguiente;
        }
        return contador;
    }
  
}