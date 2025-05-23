package CalculadoraGeometrica;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(String cor, double lado){
        super(cor); // Construtor da classe pai (forma geometrica)
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calculaPerimetro() {
        return this.lado * 4;
    }

    @Override
    public double calculaVolume() {
        return Math.pow(this.lado, 3); // lado^3
    }


}
