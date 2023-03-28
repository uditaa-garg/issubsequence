import java.util.*;
import java.util.Scanner;

public class subsequence {
    

    public static void main(String args[]){
        String s,t;
        int i,j=0,c=0;
        Scanner sc = new Scanner(System.in);
         s = sc.nextLine();
         t = sc.nextLine();
          
         s.toCharArray();
         t.toCharArray();
         
         for(i=0;i<s.length();i++){
           //for(j=0;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)){
           // c=c+1;
           j++;
            }
           }
         if(t.length()==0){
            System.out.println("subsequence");
         }
         if(j==t.length()){
            System.out.println("subsequence");
         }

         else{
            System.out.println("not");

         }
    }
}
