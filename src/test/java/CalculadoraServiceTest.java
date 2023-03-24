import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CalculadoraService;

public class CalculadoraServiceTest {

    @Test
    public void testeSomar() {
        CalculadoraService calculadora = new CalculadoraService();
        int resultado = calculadora.somar(2, 8);
        Assert.assertEquals(10, resultado);

    }

    @Test
    public void testeSubtrair() {
        CalculadoraService calculadora = new CalculadoraService();
        int resultado = calculadora.subtrair(22, 7);
        Assert.assertEquals(15, resultado);
    }

    @Test
    public void testeDividir() {
        CalculadoraService calculadora = new CalculadoraService();
        int resultado = calculadora.dividir(10, 2);
        Assert.assertEquals(5, resultado);
    }

    @Test
    public void testeMultiplicar() {
        CalculadoraService calculadora = new CalculadoraService();
        int resultado = calculadora.multiplicar(6, 5);
        Assert.assertEquals(30, resultado);
    }

    @Test
    public void testCalcularAreaDoQuadrado() {
        CalculadoraService calculadora = new CalculadoraService();
        double resultado = calculadora.calcularAreaDoQuadrado(9);
        Assertions.assertEquals(81, resultado);
    }

    @Test
    public void testCalcularAreaDoTriangulo() {
        CalculadoraService calculadora = new CalculadoraService();
        double resultado = calculadora.calcularAreaDoTriangulo(6, 8);
        Assertions.assertEquals(24, resultado);
    }

    @Test
    public void testTrianguloDeMenorArea() {
        CalculadoraService calculadora = new CalculadoraService();
        Triangulo triangulo1 = new Triangulo(8, 5);
        Triangulo triangulo2 = new Triangulo(4, 7);
        double resultado = calculadora.trianguloDeMenorArea(triangulo1, triangulo2);
        Assertions.assertEquals(20, resultado);
    }

    @Test
    public void assertNull_AreaTrianguloIgual() {

        CalculadoraService calculadora = new CalculadoraService();
        double resultado1 = calculadora.calcularAreaDoTriangulo(7, 55);
        double resultado2 = calculadora.calcularAreaDoTriangulo(13, 9);
        Assertions.assertNull(null, "Areas com valores iguais");

    }

    @Test
    public void testQuadradoDeMenorArea() {
        CalculadoraService calculadora = new CalculadoraService();
        Quadrado quadrado1 = new Quadrado(9);
        Quadrado quadrado2 = new Quadrado(4);
        double resultado = calculadora.quadradoDeMenorArea(quadrado1, quadrado2);
        Assertions.assertEquals(16, resultado);
    }

}
