public class Parallelogram extends Quadrilateral
{
	public Parallelogram(Point A, Point B, Point C, Point D)
	{
		super(A,B,C,D);

		// lados opostos iguais
		double ladoAB = getA().distanceTo(getB());
		double ladoCD = getC().distanceTo(getD());

		if (Math.abs(ladoAB - ladoCD) > 0.0001)
		{
			throw new IllegalArgumentException("Lados opostos diferentes, não é paralelogramo.");
		}
	}

	@Override
	public double getArea()
	{
		double base = getA().distanceTo(getB());
		double altura = Math.abs(getA().getY() - getD().getY());

		return base * altura;
	}
}
