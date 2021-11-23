import java.util.Scanner;

public class Q7 {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Do you have nay medical issues or not,prees Y if yes and N if NO:");
        String m= sc.nextLine();

        System.out.print("enter the classes joined");
        long c= sc.nextInt();

        System.out.print("enter the total classes ");
        long t= sc.nextInt();

        float per=(c/t)*100;

        if ((per>75) & (m.equals("Y"))){
            System.out.print("allowed in exam ");
        }
        else if ((per>75) & (m.equals("N"))){
            System.out.print("not allowed in exam ");
        }
        else{
            System.out.print("not allowed in exam ");
        }
}}
