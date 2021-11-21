import java.util.Scanner;
public class Ans2 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        long first= sc.nextLong();
        System.out.print("Enter the second number:");
        long second= sc.nextLong();
        System.out.print("Enter the third number:");
        long third= sc.nextLong();

        if ((first>second) && (first>second)){
            System.out.print("first is greater");
        }
        else if ((third>second) && (third>first)){
            System.out.print("second is greater");
        }

    }
}
