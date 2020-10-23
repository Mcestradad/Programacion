public class Promedioprimos{

	public static boolean esPrimo(int y){
		int divisores=2, contador=2;

		while(contador<y){

			if(y%contador==0){
				divisores++;
				break;
			}
			contador++;
		}
		return(divisores==2);
	}


	public static void main (String args[]){

		 double a = 0, promedio = 0;
		for(int i=453; i<=553; i++){

			if(esPrimo(i))
				a = i + a;
        }
        promedio = a / 100;

				System.out.println(promedio);

	}

}