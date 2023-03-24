package service;

import model.Triangulo;

public class CalculadorService {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }


    public double calcularAreaDoQuadrado(double lado) {
        double area = lado * lado;
        return area;
    }

    public double calcularAreaDoTriangulo(double base, double altura) {

        double area = base * altura / 2;
        return area;
    }

//    public ??? calcularArea() {
//    }

    // Caso seja de area igual, retorna null

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double area1 = calcularAreaDoTriangulo(6, 5);
        double area2 = calcularAreaDoTriangulo(12, 7);

        if (area1 == area2) {
            return null;
        } if (area1 < area2) {
            return area1;
        }else {
            return area2;
        }
    }



}
//    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
//    }
//    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
//    }



