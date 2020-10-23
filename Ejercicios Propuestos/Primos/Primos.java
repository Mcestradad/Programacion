public class Primos{

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

		for(int i=453; i<=3500; i++){

			if(esPrimo(i))
				System.out.println(i);
			

		}

	}

}