//Write a program to check weather a year is a leap or not.
import java.util.Scanner;
public class Ans3 {
    public static void main(String[] args){
        System.out.print("give a year:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a%4==0) {
            System.out.print("it is  leap yaer");
        }
        else{
            System.out.print("it is not  aleap yaer");
        }
    }
}
