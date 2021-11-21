
import java.util.Scanner;
public class Ans5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int physic,chem,bio,math,computer;
        float percentage , total;
        System.out.print("enter the marks of physic : ");
        physic= sc.nextInt();
        System.out.print("enter the marks of the chem : ");
        chem= sc.nextInt();
        System.out.print("enter the marks of the bio : ");
        bio= sc.nextInt();
        System.out.print("enter the marks of the maths : ");
        math= sc.nextInt();
        System.out.print("enter the marks of the computer : ");
        computer=sc.nextInt();
        total=physic + chem + bio + math + computer;
        percentage=(total/500)*100;
        System.out.println(" Total Marks =  " + total);
        System.out.println(" Marks Percentage =  " + percentage);
        if (percentage>=90)
            System.out.println("Grade A");
        else if (percentage>=80)
            System.out.println("Grade B");
        else if (percentage>=70)
            System.out.println("Grade C");
        else if (percentage>=60)
            System.out.println("Grade D");
        else if (percentage>=40)
            System.out.println("Grade E");
        else if (percentage<40)
            System.out.println("Grade F");
        else
            System.out.println("Wrong Number");
    }
}


