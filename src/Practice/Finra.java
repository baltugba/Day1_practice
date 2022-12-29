package Practice;

public class Finra {

    public static void Finra(){
        for(int i=1; i<=30; i++){
            if(i % 3==0 && i% 5==0){
                System.out.println("FINRA");
            }else if(i %3==0){
                System.out.println("Fin");
            }else if( i%5==0){
                System.out.println("RA");
            }else{
                System.out.println(i+" ");
            }
        }
    }







    }


/*
Create a class called FINRA, Write a function which prints out the number.
    but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5,
     print "RA" instead of the number.
     and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                output:
                      FIN
                number = 10
	            output:
	                RA
            	number = 15
	            output:
	                FINRA
 */


