public class Colores{
    

	public static void main (String args[]){


		char bandera [][];
		bandera = new char [8][12];

		for(char j=0; j<bandera.length; j++){
			bandera [0][j]= 'r';
		}

		for(char j=0; j< bandera.length; j++){
			bandera [1][j]= 'o';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [2][j]= 'n';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [3][j]= 'a';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [4][j]= 'v';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [5][j]= 'c';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [6][j]= 'z';
		}
		for(char j=0; j<bandera.length; j++){
			bandera [7][j]= 'm';
		}


		for(int i=0; i< bandera.length; i++){

			for(int j=0; j< bandera.length; i++){

				if(bandera[i][j]=='r')
					System.out.Println( ConsoleColors.PINK_BACKGROUND+"   ");
				if(bandera[i][j]=='o')
					System.out.Println( ConsoleColors.RED_BACKGROUND+"   ");
				if(bandera[i][j]=='n')
					System.out.Println( ConsoleColors.ORANGE_BACKGROUND+"   ");
				if(bandera[i][j]=='a')
					System.out.Println( ConsoleColors.YELLOW_BACKGROUND+"   ");
				if(bandera[i][j]=='v')
					System.out.Println( ConsoleColors.GREEN_BACKGROUND+"   ");
				if(bandera[i][j]=='c')
					System.out.Println( ConsoleColors.CYAN_BACKGROUND+"   ");
				if(bandera[i][j]=='z')
					System.out.Println( ConsoleColors.BLUE_BACKGROUND+"   ");
				if(bandera[i][j]=='m')
					System.out.Println( ConsoleColors.MAGENTA_BACKGROUND+"   ");
			}
		}

		System.out.Print(bandera[i][j]);
		

	}

}