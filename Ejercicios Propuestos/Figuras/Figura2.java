public class Figura2{

	public static void main (String args[]){

		int fi=6;
		fi=(fi*2)-1;

		for (int i=1; i<=fi; i+=2){

			for(int j=1; j<=fi-i ; j+=2){

				System.out.print(" ");

			}
				for(int k=1; k<=i; k++){
					System.out.print("*");
		}

        System.out.println();
		}
		for(int i=1; i<=1; i++){

			System.out.println("   *****");
		}

		for(int i=2; i<=2; i++){

			System.out.println("___*****___");
		}
	}
}