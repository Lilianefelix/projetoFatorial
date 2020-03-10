public class fatorial {

	public static void main(String [] args){
	
	system.out.println(calcularfatorial (5));

	}

 
 	public static int calcularfatorial (int n) {
	    int resultado = 1;

	    for (int i = 2; i <=n; i++)
		resultado *=i;
		return resultado;

           }


}
