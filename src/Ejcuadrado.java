
public class Ejcuadrado {
	public double l;
	public Ejcuadrado() {
		l=160808;
		//double c;
	}
	public double calcDiago()
	{
		return Math.sqrt(Math.pow(l, 2)+ Math.pow(l, 2));
	}
	public double calcArea()
	{
		return Math.pow(l, 2);
	}
	public double calcPeri()
	{
		return l*4;
	}
	public void ladoDife(double d) {
		l = d;
	}
}
