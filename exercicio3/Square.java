public class Square extends Rectangle
{
	public Square(Point A, Point B, Point C, Point D)
	{
		super(A,B,C,D);
	}

	// Sobrescreve o método getArea da classe Rectangle
	@Override
	public double getArea()
	{
		double lado1 = getA().distanceTo(getB());
		double lado2 = getB().distanceTo(getC());

		if (lado1 != lado2)
		{
			throw new IllegalArgumentException("Os pontos não formam um quadrado");
		}

		// fórmula: lado * lado
		return Math.pow(getA().distanceTo(getB()), 2.0);
	}
}
