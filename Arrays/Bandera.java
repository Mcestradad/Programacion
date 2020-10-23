public class Bandera{
    

	public static void main (String args[]){

		
		char bandera [][];
		bandera = new char [7][12];

		for(int i=0; i<1; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'r';
			}
		}

		for(int i=1; i<2; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'o';
			}
		}

		for(int i=2; i<3; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'n';
			}
		}

		for(int i=3; i<4; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'y';
			}
		}

		for(int i=4; i<5; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'g';
			}
		}

		for(int i=5; i<6; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'b';
			}
		}

		for(int i=6; i<7; i++){
		
			for(int j=0; j<12; j++){
				bandera [i][j] = 'm';
			}
		}
        // Dar color por filas a  la bandera.

        for (int i=0; i<7 ;i++ ) {

		 	for (int j=0; j<12 ;j++ ) {

				if(bandera [i][j] == 'r'){
					System.out.print(ConsoleColors.RED_BACKGROUND_BRIGHT + "   ");
				}

				if(bandera [i][j] == 'o'){
					System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
				}

				if(bandera [i][j] == 'n'){
					System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
				}

				if(bandera [i][j] == 'y'){
					System.out.print(ConsoleColors.YELLOW_BACKGROUND_BRIGHT + "   ");
				}

				if(bandera [i][j] == 'g'){
					System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
				}

				if(bandera [i][j] == 'b'){
					System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
				}

				if(bandera [i][j] == 'm'){
					System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
				}
		        //Imprime las filas con el color.
          		System.out.print(ConsoleColors.RESET);
			}

			System.out.println();
		}

	}

}
