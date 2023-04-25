package uscs;



public class Teste {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        
        
        circulo.raio = 10;
        
        quadrado.lado = 6;
        
        System.out.println("CIRCULO:");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Area: " + circulo.Area());
        System.out.println("Comprimento: " + circulo.Comprimento());
        
        System.out.println("QUADRADO:");
        System.out.println("Lado: " + quadrado.lado);
        System.out.println("Area: " + quadrado.Area());
        System.out.println("Perimetro: " + quadrado.Comprimento());
        
    }
    
}
