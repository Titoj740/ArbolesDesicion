package clasificacion;

import java.util.ArrayList;
import java.util.SortedSet;

public class Nodo {
    private Object respuesta;
    private String pregunta;
    private ArrayList<Nodo> hijos;
    public Nodo(Object respuesta, String pregunta) {
        this.respuesta = respuesta;
        this.pregunta = pregunta;
        this.hijos = new ArrayList<>();
    }
    public Object getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(Object respuesta) {
        this.respuesta = respuesta;
    }
    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }
    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
    public boolean agregarHijo(Nodo hijo){
        for(Nodo n: hijos){
            if (n.getRespuesta().equals(hijo.respuesta)){
                return false;
            }
        }
        hijos.add(hijo);
        return true;
    }
    public Nodo buscarHijo(Object buscado){
        for (Nodo n: hijos){
            if (buscado.equals(n.respuesta))
                return n;
        }
        return null;
    }
}
