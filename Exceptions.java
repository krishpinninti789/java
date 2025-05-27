public class Exceptions {
    public static void main(String[] args) {
        int m = 10;
        int n=2;
        try {
            int res = m/n;
            System.out.println("Result is"+res);

        }
        catch(ArithmeticException e){
            System.out.println("Divison by zero"+e);

        }
        finally{
            System.out.println("Program flow continues");
        }
            
        
    }
}
