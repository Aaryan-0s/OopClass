import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        int first,second,result;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        first=sc.nextInt();

        System.out.print("enter the second number:");
        second=sc.nextInt();

        result=first+second;

        System.out.print(result);


    }
}
