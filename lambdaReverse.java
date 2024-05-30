// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
interface reverseString{
    String reverse(String str);
}
class Main{
    public static void main(String args[]){
        reverseString str=(stri)->{
            int n=stri.length();
            String ans="";
            for(int i=n-1;i>=0;i--){
                ans+=stri.charAt(i);
            }
            return ans;
        };
        System.out.println(str.reverse("Mani"));
    }
}
