package EjercicioFiguras;

public class Rectangulo extends Figura {

    public double c1;
    public double c2;

    public Rectangulo (double c1, double c2)
    {
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public double area() {
        return this.c1*this.c2;
    }
}
