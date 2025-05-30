package CalculadoraGeometrica;

public abstract class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    public FormaGeometrica() {

    }

    public abstract double calculaPerimetro();

    public abstract double calculaArea();

    public abstract double calculaVolume();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
