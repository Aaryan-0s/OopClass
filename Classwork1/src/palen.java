import java.util.Scanner;
public class palen {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("enter a number:");
       int num=sc.nextInt();


       int rem=num/10;
       int mod = num%10;
       int result= rem*10+mod;

        if (result==num){
            System.out.print("palendrome");
        }
        else{
            System.out.print("not palendrome");

        }
    }
}
