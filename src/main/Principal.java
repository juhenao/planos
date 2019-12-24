package main;
import punto.*;
import figura.*;

public class Principal {
    public static void main(String[] args){
        // TODO: Puntos de 2 dimensiones
        P2 punto1 = new P2();
        P2 punto2 = new P2(1,2);
        P2 punto3 = new P2(punto2);

        System.out.println(punto1.calcularDistancia(1,1));
        System.out.println(punto1.calcularDistancia(punto2));

        // TODO: Punto de 3 dimensiones
        P3 punto4 = new P3();
        P3 punto5 = new P3(2,4, 6);
        P3 punto6 = new P3(punto2, 3);
        P3 punto7 = new P3(punto6);

        System.out.println("\n" + punto4);
        System.out.println(punto7 + "\n");

        // TODO: Crear un triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.setPunto1(punto1);
        triangulo.setPunto2(punto2);
        triangulo.setPunto3(punto3);

        // TODO: Crear un cubo
        Cubo cubo = new Cubo();
        cubo.getVertices()[0] = new P3(3,5,7);
        cubo.getVertices()[1] = new P3(2,6,5);
        cubo.getVertices()[2] = punto5;
        cubo.getVertices()[3] = new P3(9,11,12);

        P3[] dCubo = cubo.getVertices();
        for(P3 i : dCubo){
            System.out.println(i);
        }

        // TODO: Probando el principio LISKOV
        P2 pruebaLiskov = new P3();
    }
}