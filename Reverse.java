import java.util.*;
interface calculate{
    boolean  check(String str);
}
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        calculate obj=(str1)->{
            for(int i=0;i<str1.length()/2;i++){
                if(str1.charAt(i)!=str1.charAt(str1.length()-1-i)){
                    return false;                }
            }
            return true;

        };
        if(obj.check(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
