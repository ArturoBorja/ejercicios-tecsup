public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Laboratorio003");
		System.out.println("Seleccionar ejercicio: \n1\t2\t3\t4\n5\t6\t7\t8\n9\t10\t11\t12");
		int eje = Entrada.entero();
		switch(eje) {
		case 1 :
			Ejercicio01();
			break;
		case 2 :
			Ejercicio02();
			break;
		case 3 :
			Ejercicio03();
			break;
		case 4 :
			Ejercicio04();
			break;
		case 5 :
			Ejercicio05();
			break;
		case 6 :
			Ejercicio06();
			break;
		case 7 :
			Ejercicio07();
			break;
		case 8 :
			Ejercicio08();
			break;
		case 9 :
			Ejercicio09();
			break;
		default:
			
			break;
		}
	}
	public static void Ejercicio01() {
		System.out.println("Ingrese la nota final:");
		int x1=Entrada.entero();
		if (x1>10) {
			System.out.println("curso aprobado");
		}else {
			System.out.println("curso desaprobado");
		}
	}
	public static void Ejercicio02() {
		System.out.println("Ingrese la nota final:");
		int x1=Entrada.entero();
		if (x1>20||x1<0) {
			System.out.println("Error nota fuera de escala");
		}else if(x1>10){
			System.out.println("curso aprobado");
		}else {
			System.out.println("curso desaprobado");
		}
	}
	public static void Ejercicio03() {
		System.out.println("Ingrese un numero entero");
		int x1=Entrada.entero();
		if (x1>0) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negatio");
		}
	}
	public static void Ejercicio04() {
		System.out.println("Ingrese un numero");
		double x1=Entrada.real();
		if (x1>0) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negatio");
		}
	}
	public static void Ejercicio05() {
		System.out.println("Ingrese la nota final:");
		int x1=Entrada.entero();
		if (x1>20||x1<0) {
			System.out.println("Error nota fuera de escala");
		}else if(x1<6){
			System.out.println("Repite");
		}else if(x1<11){
			System.out.println("Desaprobado");
		}else if(x1<13){
			System.out.println("Aprobado");
		}else if(x1<15){
			System.out.println("Regular");
		}else if(x1<17){
			System.out.println("Bueno");
		}else if(x1<19){
			System.out.println("Destacado");
		}else {
			System.out.println("Excelente");
		}
	}
	public static void Ejercicio06() {
		System.out.println("Para la ecuacion ax2+bx+c=0");
		System.out.println("Ingresar a:");
		double a=Entrada.real();
		System.out.println("Ingresar b:");
		double b=Entrada.real();
		System.out.println("Ingresar c:");
		double c=Entrada.real();
		double xn=(0-b-Math.sqrt(b*b-4*a*c))/(2*a);
		double xp=(Math.sqrt(b*b-4*a*c)-b)/(2*a);
		System.out.println("Los valores de x son:\n("+xn+","+xp+")");
	}
	public static void Ejercicio07() {
		System.out.println("Ingrese un numero");
		int x1=Entrada.entero();
		if (x1%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es inpar");
		}
	}
	public static void Ejercicio08() {
		System.out.println("Ingrese primer numero");
		int x1=Entrada.entero();
		System.out.println("Ingrese primer numero");
		int x2=Entrada.entero();
		if (x1%x2==0) {
			System.out.println("El primer numero es multiplo del segundo");
		}else {
			System.out.println("El primer numero no es multiplo del segundo");
		}
	}
	public static void Ejercicio09() {
		System.out.println("Ingrese el año");
		int anio=Entrada.entero();
		if(anio%4==0 && anio%100!=0 || anio%400==0) {
			System.out.println(anio+" es un año bisiesto");
		}else {
			System.out.println(anio+" no es un año bisiesto");
		}
	}
}
	