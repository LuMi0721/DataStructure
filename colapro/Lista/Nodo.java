public class Nodo {

    int valor;

    Nodo enlaceNodo;

    public Object siguiente;


    public Nodo(int valor) {
        this.valor = valor;
        this.enlaceNodo = null;
    }


@Override
public String toString() {
    return "[Valor: " + valor + "]";
    
}
    
}