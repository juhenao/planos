package punto;

/**
 * Esta clase representa un punto en 2D, en las coordenadas 'x' e 'y'
 * @author Juan Henao
 * @version 1.0
 */
public class P2 {
    // Atributos
    private int x;
    private int y;

    // Constructores
    /**
     * Crea una instancia del objeto P2
     */
    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x Coordenada 'x'
     * @param y Coordenada 'y'
     */
    public P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia del objeto P2
     * @param p2 Es un abjeto de 'punto' de 2 dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * Retorna el valor de 'x'
     * @return retorna el valor del parametro 'x'
     */
    public int getX(){
        return this.x;
    }

    /**
     * Asigna el valor de la coordenada 'x'
     * @param x Coordenada de 'x'
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Retorna el valor de la coordenada 'y'
     * @return Coordenada de 'y'
     */
    public int getY(){
        return this.y;
    }

    /**
     * Asigna el valor de la coordenada 'y'
     * @param y Coordenada 'y'
     */
    public void setY(int y){
        this.y = y;
    }

    // Metodos

    /**
     * Calcula la distancia entre dos puntos 'x' e 'y'
     * @param x Coordenada 'x' del otro punto
     * @param y Coordenada 'y' del otro punto
     * @return Retorna el valor de la distancia de las coordenadas 'x' e 'y'
     */
    public double calcularDistancia(int x, int y){
        double distancia;
        double diferenciaCuadradoX = Math.pow(this.x - x, 2);
        double diferenciaCuadradoY = Math.pow(this.y - y, 2);

        distancia = Math.sqrt(diferenciaCuadradoX + diferenciaCuadradoY);

        return distancia;
    }

    /**
     * Calcula la distancia de dos puntos de un objeto
     * @param p2 Objeto de tipo P2
     * @return Retorna la distancia
     */
    public double calcularDistancia(P2 p2){
        return this.calcularDistancia(p2.getX(), p2.getY());
    }

    /**
     * Imprime los valores de los parametros 'x' e 'y'
     * @return Retorna los valores de 'x' e 'y'
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("x: " ).append(this.x).append(" / y: ").append(this.y);

        return sb.toString();
    }
}
