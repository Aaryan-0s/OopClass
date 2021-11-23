import java.util.Scanner;
public class Q6 {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("enter the classes joined");
        long c= sc.nextInt();

        System.out.print("enter the total classes ");
        long t= sc.nextInt();

        float per=(c/t)*100;

        if (per>75){
            System.out.print("allowed in exam ");
        }
        else{
            System.out.print("not allowed in exam ");
        }



    }

}
