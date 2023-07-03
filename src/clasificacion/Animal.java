package clasificacion;

public class Animal {
    private boolean acuatico;
    private int patas;
    private boolean lenguaje;
    private String sonido;

    public Animal(boolean acuatico, int patas, boolean lenguaje, String sonido) {
        this.acuatico = acuatico;
        this.patas = patas;
        this.lenguaje = lenguaje;
        this.sonido = sonido;
    }

    public boolean getAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(boolean lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
