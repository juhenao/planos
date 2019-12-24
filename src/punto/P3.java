package punto;

/**
 * Esta clase representa un punto en 3D, en las coordenadas 'x', 'y' y 'z'
 * @author Juan Henao
 * @version 1.0
 */
public class P3 extends P2{
    // Atributos
    private int z;

    // Constructores

    /**
     * Crea un objeto de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * Crea un objeto de tipo P3
     * @param x Coordenada en 'x'
     * @param y Coordenada en 'y'
     * @param z Coordenada en 'z'
     */
    public P3(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    /**
     * Crea un objeto de tipo P3
     * @param p2 Llama un constructor de tipo P2
     * @param z Coordenada en 'z'
     */
    public P3(P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * Retorna el valor de 'z'
     * @return Retorna el valor del parametro 'z'
     */
    public int getZ(){
        return this.z;
    }

    /**
     * Crea un objeto de tipo P3 y utiliza un constructor de tipo P3
     * @param p3 Retorna un objeto de 3 coordenadas
     */
    public P3(P3 p3){
        this(p3.getX(), p3.getY(), p3.getZ());
    }

    /**
     * Asigna un valor a la coordenada 'z'
     * @param z
     */
    public void setZ(int z){
        this.z = z;
    }

    /**
     * Calcula la distancia entre 2 puntos 'x', 'y' y 'z' en 3 dimensiones
     * @param x Coordenada 'x' del otro punto
     * @param y Coordenada 'y' del otro punto
     * @param z Coordenada 'z' del otro punto
     * @return
     */
    public double calcularDistancia(int x, int y, int z){
        double distancia;
        double diferenciaCuadradoX = Math.pow(getX() - x, 2);
        double diferenciaCuadradoY = Math.pow(getY() - y, 2);
        double diferenciaCuadradoZ = Math.pow(this.z - z, 2);

        distancia = Math.sqrt(diferenciaCuadradoX
                + diferenciaCuadradoY
                + diferenciaCuadradoZ);

        return distancia;
    }

    /**
     * Calcula la distancia entre dos punto en 3D
     * @param p2 Objeto de tipo P2
     * @param z Coordenada en 'z'
     * @return Retorna la distancia entre los puntos
     */
    public double calcularDistancia(P2 p2, int z){
        return calcularDistancia(p2.getX(), p2.getY(), z);
    }

    /**
     * Calcula la distancia entre dos puntos en 3D
     * @param p3 Objeto de tipo P3
     * @return Retorna la distancia entre los puntos
     */
    public double calcularDistancia(P3 p3){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }

    /**
     * Imprime los valores de los parametros 'x', 'y' e 'z'
     * @return Retorna los valores de 'x', 'y' e 'z'
     */
    public String toString(){
        return super.toString() + " / z: " + this.z;
    }
}
