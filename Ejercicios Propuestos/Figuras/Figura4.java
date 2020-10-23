public class Figura4{
    

	public static void main (String args[]){

		System.out.println("");

        int i = 0;
        int n = 0;
        String piram = "";
        char[] posic = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
      
        for(i=8,n=8; n>0; i++, n--)
        {
            char guion = '_';
            char barra = '|';

            if(i==8)            
            {
                posic[i] = guion;
                posic[n] = guion;
                piram = new String(posic);
            
                System.out.println(piram);
        
            }
            else if(i%2 != 0)
            {
                posic[i] = barra;
                posic[i+1] = guion;
                posic[n] = barra;
                posic[n-1] = guion;

                piram = new String(posic);
            
                 System.out.println(piram);
            }
            else
            {
                posic[i] = ' ';
                posic[n] = ' ';
                piram = new String(posic);
            
            } 
            posic[i] = ' ';
            posic[n] = ' ';
        } 
    }
}