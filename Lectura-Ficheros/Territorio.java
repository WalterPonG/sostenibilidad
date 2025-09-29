public class Territorio implements Comparable<Territorio>{

    public String nombre;
    public String codigo;
    public int mediana;
    public Territorio(String nombre, String codigo, int mediana) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.mediana = mediana;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getMediana() {
        return mediana;
    }
    public void setMediana(int mediana) {
        this.mediana = mediana;
    }
    @Override
    public String toString() {
        return "Territorio: " + nombre + "\n codigo: " + codigo + "\n mediana: " + mediana;
    }
    
    public int compareTo(Territorio ejemplo) {
        return ejemplo.getMediana() - this.mediana;
    }
}


    


    


    

