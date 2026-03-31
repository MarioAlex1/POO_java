public class Rectangle extends Parallelogram
{
    public Rectangle(Point A, Point B, Point C, Point D)
    {
        super(A,B,C,D);
    }

    @Override
    public double getArea()
    {
        double base = getA().distanceTo(getB());
        double altura = getB().distanceTo(getC());

        return base * altura;
    }
}
