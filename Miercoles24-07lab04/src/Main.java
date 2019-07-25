
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Laboratorio004");
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
		default:
			
			break;
		}
	}
	public static void Ejercicio01() {
		System.out.println("Dia de la semana");
		System.out.println("ingrese entero");
		int d=Entrada.entero();
		String t = "";
		switch (d) {
		case 1:
			t="Lunes";
			break;
		case 2:
			t="Martes";
			break;
		case 3:
			t="Miercoles";
			break;
		case 4:
			t="Jueves";
			break;
		case 5:
			t="Viernes";
			break;
		case 6:
			t="Sabado";
			break;
		case 7:
			t="Domingo";
			break;
		default :
			t="ERROR";
			break;
		}
	}
	public static void Ejercicio02() {
		System.out.println("Mes del año");
		System.out.println("ingrese entero");
		int d=Entrada.entero();
		String t = "";
		switch (d) {
		case 1:
			t="Enero";
			break;
		case 2:
			t="Febrero";
			break;
		case 3:
			t="Marzo";
			break;
		case 4:
			t="Abril";
			break;
		case 5:
			t="Mayo";
			break;
		case 6:
			t="Junio";
			break;
		case 7:
			t="Julio";
			break;
		case 8:
			t="Agosto";
			break;
		case 9:
			t="Setiembre";
			break;
		case 10:
			t="Octubre";
			break;
		case 11:
			t="Noviembre";
			break;
		case 12:
			t="Diciembre";
			break;
		default :
			t="ERROR";
			break;
		}
	}
	public static void Ejercicio03() {
		System.out.println("Operaciones aritmeticas");
		System.out.println("ingrese primer entero");
		int x1=Entrada.entero();
		System.out.println("ingrese segundo entero");
		int x2=Entrada.entero();
		System.out.println("ingrese operacion \n1=suma\t2=resta\t3=multiplicacion\n4=divicion\t5=residuo");
		int d=Entrada.entero();
		double t = 0;
		switch (d) {
		case 1:
			t=x1+x2;
			break;
		case 2:
			t=x1-x2;
			break;
		case 3:
			t=x1*x2;
			break;
		case 4:
			t=x1/x2;
			break;
		case 5:
			t=x1%x2;
			break;
		default :
			System.out.println("ERROR");
			break;
		}
		System.out.println("El resultado es: "+t);
	}
	public static void Ejercicio04() {
		System.out.println("alumnos por siclo");
		System.out.println("ingrese especialidad (2,3,4,6)");
		int x1=Entrada.entero();
		x1=x1*10;
		System.out.println("ingrese el siclo (1,3,5)");
		int x2=Entrada.entero();
		x2=x2+x1;
		int t = 0;
		switch (x2) {
		case 21:
			t=45;
			break;
		case 23:
			t=40;
			break;
		case 25:
			t=36;
			break;
		case 31:
			t=43;
			break;
		case 33:
			t=38;
			break;
		case 35:
			t=35;
			break;
		case 41:
			t=44;
			break;
		case 43:
			t=37;
			break;
		case 45:
			t=30;
			break;
		case 61:
			t=40;
			break;
		case 63:
			t=34;
			break;
		case 65:
			t=28;
			break;
		default :
			System.out.println("ERROR");
			break;
		}
		System.out.println("El numero de alumnos es: "+t);
	}
	public static void Ejercicio05() {
		System.out.println("Dias en el mes");
		System.out.println("ingrese el mes");
		int x1=Entrada.entero();
		System.out.println("ingrese el año");
		int anio=Entrada.entero();
		
		
		int t = 0;
		switch (x1) {
		case 1:
			t=31;
			break;
		case 2:
			if(anio%4==0 && anio%100!=0 || anio%400==0) {
				//System.out.println(anio+" es un año bisiesto");
				t=29;
			}else {
				//System.out.println(anio+" no es un año bisiesto");
				t=28;
			}
			break;
		case 3:
			t=31;
			break;
		case 4:
			t=30;
			break;
		case 5:
			t=31;
			break;
		case 6:
			t=30;
			break;
		case 7:
			t=31;
			break;
		case 8:
			t=31;
			break;
		case 9:
			t=30;
			break;
		case 10:
			t=31;
			break;
		case 11:
			t=30;
			break;
		case 12:
			t=31;
			break;
		default :
			System.out.println("ERROR");
			break;
		}
		System.out.println("Los dias en el mes"+x1+" son: "+t);
	}
}
