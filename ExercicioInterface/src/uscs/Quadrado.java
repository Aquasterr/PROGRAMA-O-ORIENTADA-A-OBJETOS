package uscs;


public class Quadrado implements FormaGeometrica {
    
    double lado;
    
    @Override
    public double Area() {
        return (this.lado * this.lado);
    }
    
    @Override
    public double Comprimento() {
        return this.lado * 4;
    }
}
