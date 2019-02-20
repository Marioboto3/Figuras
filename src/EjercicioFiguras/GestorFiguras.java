package EjercicioFiguras;

public interface GestorFiguras {

    static double suma(Figura [] l) {
        double s = 0;
        for (Figura f: l) {
            s += f.area();
        }
        return s;
    }
}
