package EjercicioFiguras;

public class Circulo extends Figura {

public double r;
    public Circulo(double r1)
    {
        this.r=r1;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
