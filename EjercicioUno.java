public class EjercicioUno{
	public static void main(String args[]){
		/* 
		 Declara dos variables numéricas (con el valor que desees),
		 muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
		*/
		int numeroUno = 10, numeroDos = 2;
		int sumaNumeros = 0, restaNumeros = 0, multiplicacionNumeros = 0;
		int divisionNumeros = 0;
		int moduloNumeros = 0;
		sumaNumeros = numeroUno + numeroDos; 
		restaNumeros = numeroUno - numeroDos;
		multiplicacionNumeros = numeroUno * numeroDos;
		divisionNumeros = numeroUno / numeroDos;
		moduloNumeros = numeroUno % numeroDos;
		System.out.println("La suma de los numeros es: " + sumaNumeros);
		System.out.println("La resta de los numeros es: " + restaNumeros);
		System.out.println("La multiplicacion de los numeros es: " + multiplicacionNumeros);
		System.out.println("La división de los numeros es: " + divisionNumeros);
		System.out.println("El modulo entre los dos numeros es: " + moduloNumeros);
	}
}