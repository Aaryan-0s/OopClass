import java.util.Scanner;
public class Squareorn {
    public static void main(String[] args){
        float l,b;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the length:");
        l=sc.nextFloat();

        System.out.print("enter the breadth:");
        b=sc.nextFloat();

        if (l==b){
            System.out.print("it is a square");
        }
        else{
            System.out.print("it is not a suqare");
        }


    }

}
