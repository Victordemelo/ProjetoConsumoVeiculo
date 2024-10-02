package model;

public class Veiculo {

    private double distancia_perc;
    private double litros_combus;

    public Veiculo() {
        this(0, 0);
    }

    public Veiculo(double distancia_perc, double litros_combus) {
        this.distancia_perc = distancia_perc;
        this.litros_combus = litros_combus;
    }

    public double getDistancia_perc() {
        return distancia_perc;
    }

    public void setDistancia_perc(double distancia_perc) {
        this.distancia_perc = distancia_perc;
    }

    public double getLitros_combus() {
        return litros_combus;
    }

    public void setLitros_combus(double litros_combus) {
        this.litros_combus = litros_combus;
    }

    public double getConsumo() {
        return getDistancia_perc() / getLitros_combus();
    }
}
