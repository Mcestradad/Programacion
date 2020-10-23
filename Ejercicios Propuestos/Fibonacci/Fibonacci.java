public class Fibonacci{

	public static void main (String args[]){

		 double a = 0, promedio = 0;
        for (int i = 0; i <= 200; i++) {
            a = fibonacci(i) + a;
        }
        promedio = a / 200;
        System.out.println("promedio: " + promedio);
		}

	public static int fibonacci(int i){

		if(i>=2){

			return fibonacci(i-1)+fibonacci(i-2);
		}

		else if(i==1){

			return 1;
		}

		else if(i==0){

			return 0;
		}
	return 0;
	}
}