package clasificacion;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    public Nodo getRaiz() {
        return raiz;
    }
    public boolean agregarRaiz(Nodo raiz){
        if (raiz == null)
            return false;
        this.raiz = raiz;
        return true;
    }

    public String getAnimal(Animal buscado){
        Nodo aux = raiz;
        while (aux.getHijos().size() > 0){
            String pregunta = aux.getPregunta();
            try {
                Method m = buscado.getClass().getMethod("get" + pregunta);
                Object respuesta = m.invoke(buscado);
                aux = aux.buscarHijo(respuesta);
            } catch (Exception e){
                return "Error x_x";
            }
            if(aux == null)
                break;
        }
        return aux != null ?  aux.getPregunta() : "No registrado un animal con esas características";
    }

    public Nodo getNodoRecorrido(ArrayList<Object> recorrido){
        Nodo aux = raiz;
        for(Object o: recorrido){
            aux = aux.buscarHijo(o);
            if(aux == null)
                break;
        }
        return aux;
    }

    public boolean agregarHijoEnRecorrido(ArrayList<Object> recorrido, Nodo hijo){
        Nodo aux = getNodoRecorrido(recorrido);
        return aux != null? aux.agregarHijo(hijo):false;
    }
}
