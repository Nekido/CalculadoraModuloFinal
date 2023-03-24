package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {
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
    public double trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double area1 = calcularAreaDoTriangulo(8,5);
        double area2 = calcularAreaDoTriangulo(12, 7);

        if (area1 < area2) {
            return area1;
        } if (area1 > area2) {
            return area2;
        }else {
            return Double.parseDouble(null);
        }
    }
    public double quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {

        double area1 = calcularAreaDoQuadrado(9);
        double area2 = calcularAreaDoQuadrado(4);

        if ( area1 < area2){
            return area1;

        } else if (area1 > area2){
            return area2;
        }else{
            return Double.parseDouble(null);
        }

    }
}



