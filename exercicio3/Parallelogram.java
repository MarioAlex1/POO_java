public class Parallelogram extends Quadrilateral
{
    public Parallelogram(Point A, Point B, Point C, Point D)
    {
        super(A,B,C,D);
    }

    @Override
    public double getArea()
    {
        double base = getA().distanceTo(getB());
        double altura = Math.abs(getA().getY() - getD().getY());

        return base * altura;
    }
}
