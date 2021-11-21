import java.util.Scanner;
public class Ans1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        long first= sc.nextLong();
        System.out.print("Enter the first number:");
        long second= sc.nextLong();

        if (first>second){
            System.out.print("first is greater");
        }
        else{
            System.out.print("second is greater");
        }



    }

}
