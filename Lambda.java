interface pieCalculator{
    double getPie();
}
class Lambda{
    public static void main(String[] args){
        pieCalculator obj=()->{
            return 3.14;
        };
        System.out.println("The value of the pie is"+obj.getPie());
    }
}