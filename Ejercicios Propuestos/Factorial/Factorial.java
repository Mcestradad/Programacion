public class Factorial{

	public static void main (String args[]){

		int a= 1, b= 1, c=10;

		do{
			a = a*b;
			b++;
		} while (b<=c);
		System.out.println(a);
	}
}


