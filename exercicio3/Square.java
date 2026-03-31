public class Square extends Rectangle
{
    public Square(Point A, Point B, Point C, Point D)
    {
        super(A,B,C,D);
    }

    @Override
    public double getArea()
    {
        return Math.pow(getA().distanceTo(getB()), 2.0);
    }
}

