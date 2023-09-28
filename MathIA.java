import java.util.*;
import java.lang.*;
import java.math.BigInteger;


class Math{
    public static void main(String[] args) {

        Random rnd = new Random();
        int upperbound = 10;
        String newPassword = new String();
        String store = new String();
        String refPassword = new String();
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        long startTime = System.currentTimeMillis();


        String[] arr = {"1","2","3","4","5","6","7","8","9","0"};
        String[] passwords = new String[100];
        BigInteger[] tries = new BigInteger[100];

        for(int p = 0; p < 1; p++){

            for(int i = 0; i < 9;i++){
                int int_random = rnd.nextInt(upperbound);
                store = arr[int_random];
                refPassword += store;
            }

            //System.out.println(refPassword);
            //System.out.println();

            for(;;){

                a = a.add(b);

                
                    
                for(int i = 0; i < 9;i++){
                    int int_random = rnd.nextInt(upperbound);
                    store = arr[int_random];
                    newPassword += store;
                }

                //System.out.println(newPassword);
               

                if(refPassword.equals(newPassword)){
                    long endTime = System.currentTimeMillis();
                    long totalTime = ((endTime - startTime));
                    double doubleTime = ((double) totalTime)/1000;
                    System.out.println("Right password guessed after " + a + " tries");
                    System.out.println("Time taken: " + doubleTime);
                    System.out.println("The reference password was " + refPassword);
                    passwords[p] = refPassword;
                    tries[p] = a;
                    break;
                }

                else{
    
                }

                newPassword = "";
                
            }
            refPassword = "";
            a = a.multiply(c);
        }

        /*

        for(int i = 0; i < passwords.length; i++){
            System.out.print(passwords[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i < tries.length; i++){
            System.out.print(tries[i] + ", ");
            
        }
        */
            
        
        
        
        
       
    }
}

