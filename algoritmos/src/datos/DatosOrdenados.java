
package datos;

public class DatosOrdenados {
    private int[] valores;

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }

    public int getNdatos(){
        return valores.length;
    }
    
    @Override
    public String toString(){
        String cad = "DATOS ORDENADOS: ";
        for(int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
}
