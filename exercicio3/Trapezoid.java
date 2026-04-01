public class Trapezoid extends Quadrilateral
{
    public Trapezoid(Point A, Point B, Point C, Point D)
    {
        super(A,B,C,D);

	//  garante lados paralelos
	if (Math.abs(A.getY() - B.getY()) > 0.0001 || Math.abs(C.getY() - D.getY()) > 0.0001)
	{
		throw new IllegalArgumentException("As bases do trapézio precisam ser paralelas.");
	}
    }

    @Override
    public double getArea()
    {
        double baseMaior = getA().distanceTo(getB());
        double baseMenor = getC().distanceTo(getD());

	// A altura é a distancia vertical das duas bases
        double altura = Math.abs(getA().getY() - getD().getY());

	if (altura <= 0.0001)
	{
		throw new IllegalArgumentException("A altura do trapézio não pode ser zero.");
	}

        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
