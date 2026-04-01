public class Square extends Rectangle
{
	public Square(Point A, Point B, Point C, Point D)
	{
		super(A,B,C,D); // ja faz a validação de diagonais

		double lado1 = getA().distanceTo(getB());
		double lado2 = getB().distanceTo(getC());

		if (Math.abs(lado1 - lado2) > 0.0001)
		{
			throw new IllegalArgumentException("Lados adjacentes diferentes, não é um quadrado.");
		}
	}

	// Sobrescreve o método getArea da classe Rectangle
	@Override
	public double getArea()
	{
		// base * altura do retangulo funciona no quadrado
		return super.getArea();
	}
}
