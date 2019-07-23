
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Laboratorio 02");
		Ejercicio10();
	}
	public static void Ejercicio01 () {
		int n=Entrada.entero();
		System.out.println("La mitad de "+n+" es "+n/2);				
	}
	public static void Ejercicio02 () {
		int base=Entrada.entero();
		int altura=Entrada.entero();
		System.out.println("Base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Area: "+base*altura);
	}
	public static void Ejercicio03 () {
		int ca=Entrada.entero();
		int cb=Entrada.entero();
		int hip=0;
		hip=(int)Math.sqrt(ca*ca+cb*cb);
		System.out.println("El cateto a es: "+ca);
		System.out.println("El cateto b es: "+cb);
		System.out.println("La hipotenusa es: "+hip);
	}
	public static void Ejercicio04 () {
		float n1=(float)Entrada.real();
		int n2=(int)n1;
		System.out.println("El valor ingresado es: "+n2);				
	}
	public static void Ejercicio05 () {
		int n1=Entrada.entero();
		int n2=Entrada.entero();
		System.out.println("Primer numero: "+n1+"\nSegundo numero: "+n2);				
		int n3=n2;
		n2=n1;
		n1=n3;
		System.out.println("Primer numero: "+n1+"\nSegundo numero: "+n2);
	}
	public static void Ejercicio06 () {
		System.out.println("Introducir base");		
		int l=Entrada.entero();
		System.out.println("Introducir alto");
		int h=Entrada.entero();
		for(int eh=0;eh<h;eh++) {
			for(int el=0;el<l;el++) {
				if(eh==0||eh==h-1) {
					System.out.print("* ");
				}else if(el==0||el==l-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("El area es: "+l*h);
	}
	public static void Ejercicio07 () {
		System.out.println("Introducir radio");		
		int r=Entrada.entero();
		System.out.println("El perimetro es: "+2*Math.PI*r);
		System.out.println("El area es: "+Math.PI*r*r);
	}
	public static void Ejercicio08 () {
		System.out.println("Para ax2+bx+c=0");
		System.out.println("Introducir a: ");		
		int a=Entrada.entero();
		System.out.println("Introducir b: ");		
		int b=Entrada.entero();
		System.out.println("Introducir c: ");		
		int c=Entrada.entero();
		double xp=0;
		double xn=0;
		xp=(Math.sqrt(b*b-4*a*c)-b)/(2*c);
		xn=(-Math.sqrt(b*b-4*a*c)-b)/(2*c);
		System.out.println("Los valores de X son: ("+xn+" , "+xp+")");				
	}
	public static void Ejercicio09 () {
		System.out.println("Introducir monto a retirar");
		int m=Entrada.entero();
		if (m%10!=0) {
			System.out.println("El monto no se puede entregar");
			System.exit(0);
		}
		int b100=0;
		if(m%100>=50||m%100==20||m%100==40) {
			b100=m/100;
			m=m%100;
		}else {
			b100=m/100-1;
			m=m%100+100;
		}
		int b50=0;
		if(m%50==20||m%50==40) {
			b50=m/50;
			m=m%50;
		}else {
			b50=m/50-1;
			m=m-b50*50;
		}
		int b20=m/20;
		System.out.println("Se entregara:\n"+b100+"\tBilletes de 100\n"+b50+"\tBilletes de 50\n"+b20+"\tBilletes de 20");
	}
	public static void Ejercicio10 () {
		double x=0;
		double vf=0;
		double vo=0;
		double t=0;
		double a=0;
		do {
			System.out.println("Que desea ayar: Vf=Vo+a*t\n(Vf)Velocidad final\n(Vo)Velocidad inicial\n(a)Aceleracion\n(t)Tiempo");		
			String str=Entrada.cadena();
			switch(str) {
			case "Vf":
				//System.out.println("Introducir Vf (m/seg):");
				//vf=Entrada.real();
				System.out.println("Introducir Vo (m/seg):");
				vo=Entrada.real();
				System.out.println("Introducir a (m/seg2):");
				a=Entrada.real();
				System.out.println("Introducir t (seg):");
				t=Entrada.real();
				x=vo+a*t;
			break;
			case "Vo":
				System.out.println("Introducir Vf (m/seg):");
				vf=Entrada.real();
				//System.out.println("Introducir Vo (m/seg):");
				//vo=Entrada.real();
				System.out.println("Introducir a (m/seg2):");
				a=Entrada.real();
				System.out.println("Introducir t (seg):");
				t=Entrada.real();
				x=vf-a*t;
			break;
			case "a":
				System.out.println("Introducir Vf (m/seg):");
				vf=Entrada.real();
				System.out.println("Introducir Vo (m/seg):");
				vo=Entrada.real();
				//System.out.println("Introducir a (m/seg2):");
				//a=Entrada.real();
				System.out.println("Introducir t (seg):");
				t=Entrada.real();
				x=(vf-vo)/t;
			break;
			case "t":
				System.out.println("Introducir Vf (m/seg):");
				vf=Entrada.real();
				System.out.println("Introducir Vo (m/seg):");
				vo=Entrada.real();
				System.out.println("Introducir a (m/seg2):");
				a=Entrada.real();
				//System.out.println("Introducir t (seg):");
				//t=Entrada.real();
				x=(vf-vo)/a;
			break;
			default:
				System.out.println("Error");
			}
			System.out.println(str+" = "+x);
		}while(x==0);
		
	}	
}
