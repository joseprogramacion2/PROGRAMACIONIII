//Paquete lista
package lista;

//Clase Nodo
public class Nodo {
// Variable en la cual se va a guardar el valor.
private int valor;
// Variable para enlazar los nodos.
private Nodo siguiente;
/**
13. * Constructor que inicializamos el valor de las variables.
14. */
public void Nodo(){
this.valor = 0;
this.siguiente = null;
}
// Métodos get y set para los atributos.
public int getValor() {
return valor;
}
public void setValor(int valor) {
this.valor = valor;
}
public Nodo getSiguiente() {
return siguiente;
}
public void setSiguiente(Nodo siguiente) {
this.siguiente = siguiente;
}}
