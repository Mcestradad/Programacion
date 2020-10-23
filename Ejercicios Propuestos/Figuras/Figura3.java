public class Figura3{

    public static void main (String args[]){

        int i = 0;                 
        int n = 0, m = 0;           
        
        System.out.println("");
                
        for(i=0; i<=7; i++){

            if(i == 0 || i == 1 || i == 6 || i == 7){
                
                for(n=0;n<=7;n++){
                    System.out.print("*");
                }            
            }
            else
            {
                for(m=0; m<=7; m++)
                {
                    if(m==0 || m ==1 || m == 6 || m==7)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");                  
        }
    }
}