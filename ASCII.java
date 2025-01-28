
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        char character = sc.next().charAt(0);
        System.out.println("ASCII VALUE : " + (int)character);
        sc.close();

    }
    
}
