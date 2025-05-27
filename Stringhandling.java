import java.util.Scanner;

public class Stringhandling {
    public static void main(String[] args) {
        String str1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str1 = sc.nextLine();
        String st = str1.trim();
        String strlower = st.toLowerCase();
        String temp="";
        System.out.println(strlower);
        for(int i=str1.length()-1;i>=0;i--){
            temp+=strlower.charAt(i);
        }
        if(temp.equals(strlower)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}
