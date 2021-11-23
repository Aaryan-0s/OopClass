import java.util.Scanner;
public class q4 { public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter your marks :");
    float j=sc.nextFloat();
    if (j<25) {
        System.out.print("the grade is f");}
    else if ( (j>=25) & (j<45) ) {
            System.out.print("gradde is e");
        }
    else if ((j>=45) & (j<50)) {
        System.out.print("gradde is d");
    }

    else if ((j>=50) & (j<60)) {
        System.out.print("gradde is c");
    }

    else if ((j>=60) & (j<80)) {
        System.out.print("gradde is b");
    }
    else if (j>=80)  {
        System.out.print("gradde is a");
    }






}
}
