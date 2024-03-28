public class EjercicioDos{
	public static void main(String args[]){
		/* 
		Declara 2 variables numéricas (con el valor que desees), 
		he indica cual es mayor de los dos. Si son iguales indicarlo también.
		Ves cambiando los valores para comprobar que funciona.
		*/
		int numeroUno = 9;
		int numeroDos = 9;
		if ( numeroUno> numeroDos){
			System.out.println(numeroUno + " es mayor que " + numeroDos);
		} else if (numeroDos> numeroUno){
			System.out.println(numeroDos + " es mayor que " + numeroUno);
		} else {
			System.out.println("Los dos numeros son iguales");
		}
	}
}