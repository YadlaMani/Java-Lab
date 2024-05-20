
import java.util.*;

public class WlidCard {
    public static void main(String[] args) {
        List<Integer>num=Arrays.asList(1,3,4,5);
        System.out.println("The sum of the list:"+sum(num));
    }
    private static double sum(List<? extends Number>list){
        double sum=0.0;
        for(Number n:list){
            sum+=n.doubleValue();
        }
        return sum;
    }

}
