package uscs;


public class Circulo implements FormaGeometrica {
    
    double raio;
    
    @Override
    public double Area() {
        return Math.PI * this.raio * this.raio;
    }
    
    @Override
    public double Comprimento() {
        return 2 * Math.PI * this.raio;
    }
    
}
