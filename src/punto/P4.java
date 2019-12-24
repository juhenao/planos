package punto;

/**
 * Esta clase representa un punto en 4D, en las coordenadas 'x', 'y', 'z' y 'w'
 * @author Juan Henao
 * @version 1.0
 */
public class P4 extends P3{
    // Se agregan los atributos de la clase
    private int w;

    // Se crean los constructores
    /**
     * Se crea el constructor de tipo P4
     */
    public P4(){
        super();
        this.w = 0;
    }

    /**
     * Objeto de tipo P4
     * @param x Coordenada en 'x'
     * @param y Coordenada en 'y'
     * @param z Coordenada en 'z'
     * @param w Coordenada en 'w'
     */
    public P4(int x, int y, int z, int w){
        super(x, y, z);
        this.w = w;
    }

    /**
     * Objeto de tipo P4
     * @param p3 Se llama al constructor de tipo P3
     * @param w Coordenada en 'w'
     */
    public P4(P3 p3, int w){
        super(p3);
        this.w = w;
    }

    /**
     * Retorna el valor de 'w'
     * @return Retorna el valor de parametro para 'w'
     */
    public int getW() {
        return this.w;
    }

    /**
     * Asigna un valor para la coordenada 'w'
     * @param w
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * Crea un obejto de tipo P4 y utiliza un constructor de tipo P3
     * @param p4 REtirna un objeto de 4 coordenadas
     */
    public P4(P4 p4){
        this(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    /**
     * Calcula la distancia entre 2 puntos 'x', 'y', 'z' y 'w' en 4D
     * @param x Coordenada 'x' del otro punto
     * @param y Coordenada 'y' del otro punto
     * @param z Coordenada 'z' del otro punto
     * @param w Coordenada 'w' del otro punto
     * @return
     */
    public double calcularDistancia(int x, int y, int z, int w){
        double distancia;
        double diferenciaCuadradoX = Math.pow(getX() - x, 2);
        double diferenciaCuadradoY = Math.pow(getY() - y, 2);
        double diferenciaCuadradoZ = Math.pow(getZ() - z, 2);
        double diferenciaCuadradoW = Math.pow(this.w - w, 2);

        distancia = Math.sqrt(diferenciaCuadradoX
                + diferenciaCuadradoY
                + diferenciaCuadradoZ
                + diferenciaCuadradoW);

        return distancia;
    }

    /**
     * Calcula la distancia entre dos puntos en 4D
     * @param p3 Objeto de tipo P3
     * @param w Coordenada en 'w'
     * @return Retorna la distancia entre los puntos 'x', 'y', 'z' y 'w'
     */
    public double calcularDistancia(P3 p3, int w){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ(), w);
    }

    /**
     * Calcula la distancia entre dos puntos en 4D
     * @param p4 Objeto de tipo P4
     * @return retorna la distancia entre los puntos 'x', 'y', 'z' y 'w'
     */
    public double calcularDistancia(P4 p4){
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }

    /**
     * Imprime los valores para los parametros 'x', 'y', 'z' y 'w'
     * @return Retorna los valores para 'x', 'y', 'z' y 'w'
     */
    public String toString(){
        return super.toString() + " / w: " + this.w;
    }
}