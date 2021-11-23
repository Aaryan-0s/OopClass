import java.util.Scanner;
public class Q5 {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first age:");
        int first=sc.nextInt();
        System.out.print("enter the second age:");
       int second=sc.nextInt();
        System.out.print("enter the third age:");
        int third =sc.nextInt();

        if ((first>second) & (first>third)){
            System.out.print("first is greater");

        }
        else if ((second>first) & (second>third)){
            System.out.print("second is greater");

        }
        else{
            System.out.print("thrid is greater");
        }


}
}
