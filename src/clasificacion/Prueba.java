package clasificacion;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        Animal an = new Animal(false, 4, false, "wow");
        Nodo raiz = new Nodo(null, "Acuatico");
        a.agregarRaiz(raiz);

        ArrayList<Object> recorrido = new ArrayList<>();
        Nodo aux = new Nodo(true, "Pez");
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo(false, "Patas");
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo(2, "Lenguaje");
        recorrido.add(false);
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo(4, "Sonido");
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo(8, "Araña");
        a.agregarHijoEnRecorrido(recorrido, aux);

        recorrido.add(2);

        aux = new Nodo(true, "Humano");
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo(false, "Kanguro");
        a.agregarHijoEnRecorrido(recorrido, aux);

        recorrido.remove(1);
        recorrido.add(4);

        aux = new Nodo("Wow", "Perro");
        a.agregarHijoEnRecorrido(recorrido, aux);

        aux = new Nodo("Miau", "Gato");
        a.agregarHijoEnRecorrido(recorrido, aux);

        System.out.println(a.getAnimal(an));
    }
}
