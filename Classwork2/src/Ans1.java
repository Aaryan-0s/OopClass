import java.util.Scanner;
public class Ans1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary");
       int salary=sc.nextInt();
       if (salary<=10000){
           double hra=(20/100)*salary;
           double da=0.8*salary;
           double grosssalary= salary+hra+da;
           System.out.print("the gross salary is: "+grosssalary);
       }
       else if ((salary>10000) && (salary<=20000)){
           double hra=(25/100)*salary;
           double da=0.9*salary;
           double grosssalary= salary+hra+da;
           System.out.print("the gross salary is: "+grosssalary);
       }
       else if  (salary<=20000){
           double hra=(30/100)*salary;
           double da=0.95*salary;
           double grosssalary= salary+hra+da;
           System.out.print("the gross salary is: "+grosssalary);
       }

    }
}
