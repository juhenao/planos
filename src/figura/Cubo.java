package figura;
import punto.P3;

/**
 * Clase que dibuja un cubo en 3D
 * @author Juan Henao
 * @version 1.0
 */
public class Cubo {
    // Atributos
    private String colorFondo;
    private String colorArtista;

    // Instancia y creación de vector
    private P3[] vertices = new P3[8];

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorArtista() {
        return colorArtista;
    }

    public void setColorArtista(String colorArtista) {
        this.colorArtista = colorArtista;
    }

    public P3[] getVertices() {
        return vertices;
    }

    public void setVertices(P3[] vertices) {
        this.vertices = vertices;
    }

    public void dibujar(){
        System.out.println("Dibujando un cubo...");
    }
}
