public class Rectangle extends Parallelogram
{
	public Rectangle(Point A, Point B, Point C, Point D)
	{
		super(A,B,C,D);

		// Calcula o comprimento das duas diagonais
		double diag1 = getA().distanceTo(getC());
		double diag2 = getB().distanceTo(getD());

		// verifica se as diagonais são diferentes
		if (Math.abs(diag1 - diag2) > 0.0001)
		{
			throw new IllegalArgumentException("Os pontos não formam um retângulo (ângulos não são de 90°).");
		}
	}

	@Override
	public double getArea()
	{
		double base = getA().distanceTo(getB());
		double altura = getB().distanceTo(getC());

		// Verifica se os lados são positivos
		if (base <= 0.0001 || altura <= 0.0001)
		{
			throw new IllegalArgumentException("Os pontos não formam um retângulo válido");
		}

		return base * altura;
	}
}
