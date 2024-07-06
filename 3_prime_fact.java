import java.util.*;
public class prime_fact {
    public static void main(String []k){
      long num= 600851475143l;
       for(long i = num/2; i>1; i-- ){
         if(prime(i)){
            System.out.println(i);
            break;
         }
         }
        }
       
    
    public static boolean prime(long num){
           if (num <=1){
            return false;
           }
           if(num <= 3){
            return true;
           }
           if(num % 2== 0 || num %3==0){
           return true;
           }
           int i=5;
           while(i*i <= num){
            if(num%i == 0 || num %(i+2)==0){
             return false;
            } 
            i+=6;
           }
      return true;
    }
}
