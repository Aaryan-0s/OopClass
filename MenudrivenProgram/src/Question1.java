import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number from 1 to 4 according to your need:");
        int choice= sc.nextInt();

        switch (choice){
            case 1:
                System.out.print("enter the first number");
                int num1= sc.nextInt();
                System.out.print("enter the second number");
                int num2= sc.nextInt();
                int add=num1+num2;
                System.out.print("the added answer is :"+add);
                break;


            case 2:
                System.out.print("enter the principle");
                float p= sc.nextFloat();
                System.out.print("enter the rate");
                int r= sc.nextInt();
                System.out.print("enter the time");
                int t= sc.nextInt();
                float si=(p*t*r)/100;
                System.out.print("the si answer is :"+si);
                break;

            case 3:
                System.out.print("enter the number");
                int num= sc.nextInt();

                int quo=num/10;
                int rem=num%10;
                int pale=quo*quo+rem;
                if (num==pale){
                    System.out.print("palendrome");

                }
                else{
                    System.out.print("not palendrome");
                }
                break;

            case 4:
                System.out.print("enter the number");
                int check= sc.nextInt();
                if (check%2==0) {
                System.out.print("even");
            }
                else{
                    System.out.print("odd");

            }
                break;





        }
    }
}
