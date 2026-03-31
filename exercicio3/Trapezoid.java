public class Trapezoid extends Quadrilateral
{
    public Trapezoid(Point A, Point B, Point C, Point D)
    {
        super(A,B,C,D);
    }

    @Override
    public double getArea()
    {
        double baseMaior = getA().distanceTo(getB());
        double baseMenor = getC().distanceTo(getD());
        double altura = Math.abs(getA().getY() - getD().getY());

        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
