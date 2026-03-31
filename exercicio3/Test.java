public class Test
{
	public static void main( String[] args )
	{
		// Quadrado
		Point A = new Point(0.0,0.0);
		Point B = new Point(0.0,3.0);
		Point C = new Point(3.0,3.0);
		Point D = new Point(3.0,0.0);

		Square square = new Square(A,B,C,D);

		System.out.println("Quadrado: " + square);
		System.out.println("Área: " + square.getArea());
		System.out.println();

		// Retângulo
		Point E = new Point(0.0,0.0);
		Point F = new Point(0.0,2.0);
		Point G = new Point(4.0,2.0);
		Point H = new Point(4.0,0.0);

		Rectangle rectangle = new Rectangle(E,F,G,H);

		System.out.println("Retângulo: " + rectangle);
		System.out.println("Área: " + rectangle.getArea());
		System.out.println();

		// Paralelogramo
		Point I = new Point(0.0,0.0);
		Point J = new Point(4.0,0.0);
		Point K = new Point(5.0,3.0);
		Point L = new Point(1.0,3.0);

		Parallelogram parallelogram = new Parallelogram(I,J,K,L);

		System.out.println("Paralelogramo: " + parallelogram);
		System.out.println("Área: " + parallelogram.getArea());
		System.out.println();

		// Trapézio
		Point M = new Point(0.0,0.0);
		Point N = new Point(4.0,0.0);
		Point O = new Point(3.0,2.0);
		Point P = new Point(1.0,2.0);

		Trapezoid trapezoid = new Trapezoid(M,N,O,P);

		System.out.println("Trapézio: " + trapezoid);
		System.out.println("Área: " + trapezoid.getArea());
	}
}
