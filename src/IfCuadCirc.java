import java.util.Scanner;

public class IfCuadCirc {
	public static void main(String[] argumentos){
		String cuad="cuadrado";
		String circ="circulo";
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que figura eliges, "+cuad+" o "+circ+"?. Recueda no usar acentos\n");
		String inline=scan.nextLine();
		//String figura = sc.next();
		System.out.println("Elegiste "+inline+"\n");
		//String inline=med;
		String fig=inline;
		////////
		String diago="diagonal";
		String peri="perimetro";
		String area="area";
		if(fig.equals("cuadrado")) {
			System.out.println("Quieres usar el lado que esta por default?. Escribe 1 si sí, y si no, escribe 0");
			Scanner sca= new Scanner(System.in);
			int bo =sca.nextInt();
			int resp=bo;
			System.out.println("¿Quieres calcular "+diago+" o "+peri+" o "+area+"?\n");
			Scanner operac = new Scanner(System.in);
			String op=operac.nextLine();
			String ope=op;
				if(ope.equals("diagonal")) {
					System.out.println("Elegiste calcular "+ope);
					if(resp==1) {
						Ejcuadrado df= new Ejcuadrado();
						//double l;
						//l=160808;
						df.calcDiago();
						System.out.println("Diagonal es "+df.calcDiago());
				}
				else {
					if(resp==0);
					System.out.println("Ahora, ingresa lado\n");
					int lado=scan.nextInt();
					int l=lado;
					double c=l;
					System.out.println("El lado de tu cuadrado es "+c+"\n");
					double diag;
					diag= Math.sqrt(Math.pow(c, 2)+ Math.pow(c, 2));
					System.out.println("La diagonal del cuadrado es "+diag);
						//double diag;
						//diag= Math.sqrt(Math.pow(c, 2)+ Math.pow(c, 2));
						//System.out.println("La diagonal del cuadrado es "+diag);
				}
				}
				if(ope.equals("perimetro")) {
					System.out.println("elegiste calcular "+ope);
					if(resp==1) {
						Ejcuadrado df= new Ejcuadrado();
						//double l;
						//l=160808;
						df.calcPeri();
						System.out.println("Perimetro es "+df.calcPeri());
					}	
					else {
						if(resp==0);
						System.out.println("Ahora, ingresa lado\n");
						int lado=scan.nextInt();
						int l=lado;
						double c=l;
						System.out.println("El lado de tu cuadrado es "+c+"\n");
						double per;
						per= c*4;
						System.out.println("El perimetro del cuadrado es "+per);
					}
				}
				if(ope.equals("area")) {
					System.out.println("elegiste calcular "+ope);
					if(resp==1) {
						Ejcuadrado df= new Ejcuadrado();
						//double l;
						//l=160808;
						df.calcArea();
						System.out.println("Perimetro es "+df.calcArea());
					}	
					else {
						if(resp==0);
						System.out.println("Ahora, ingresa lado\n");
						int lado=scan.nextInt();
						int l=lado;
						double c=l;
						System.out.println("El lado de tu cuadrado es "+c+"\n");
						double ar;
						ar= c*c;
						System.out.println("El area del cuadrado es "+ar);
					}
					}
				
		}
		else {
			if(fig.equals("circulo"));
			System.out.println("Quieres usar el lado que esta por default?. Escribe 1 si sí, y si no, escribe 0");
			Scanner sca= new Scanner(System.in);
			int bo =sca.nextInt();
			int resp=bo;
			System.out.println("¿Quieres calcular "+peri+" o "+area+"?\n");
			Scanner operac = new Scanner(System.in);
			String op=operac.nextLine();
			String ope=op;
				if(ope.equals("perimetro")) {
					System.out.println("elegiste calcular "+ope);
						if(resp==1) {
							ElCirculo df= new ElCirculo();
							df.calcCirc();
							System.out.println("Perimetro es "+df.calcCirc());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa radio\n");
							int radio=scan.nextInt();
							int r=radio;
							double c=r;
							System.out.println("El radio de tu circulo es "+c+"\n");
							double per;
							per= c*2*3.1416;
							System.out.println("El perimetro del círculo es "+per);
						}
				}
				if(ope.equals("area")) {
					System.out.println("elegiste calcular "+ope);
						if(resp==1) {
							ElCirculo df= new ElCirculo();
							df.calcAreac();
							System.out.println("Area es "+df.calcAreac());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa radio\n");
							int radio=scan.nextInt();
							int r=radio;
							double c=r;
							System.out.println("El radio de tu circulo es "+c+"\n");
							double are;
							are= c*c*3.1416;
							System.out.println("El perimetro del circulo es "+are);
						}
				}
		}
}
}
//}

