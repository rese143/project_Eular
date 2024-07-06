import java.util.*;

class pelindrom_prod{
    public static void main(String []k){
        int max= 0;
         
        for(int i=100; i<= 999; i++){
            for(int j=i; j<= 999; j++){
             int mul=i*j;
             String sum="";
             while (mul > 0) {
                sum+= String.valueOf(mul%10);
                mul/=10;
             } 
             mul= i*j;
             if(String.valueOf(mul).equals(sum) && max < mul){
                max= mul;
             }
             
            }
         }
         System.out.println(max);
    }
}
