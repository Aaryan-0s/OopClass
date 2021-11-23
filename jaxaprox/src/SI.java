import java.util.Scanner;
public class SI {
    public static void main(String[] args){
        float p,t,r,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle:");
        p=sc.nextFloat();
        System.out.print("enter the time:");
        t=sc.nextFloat();
        System.out.print("enter the rate:");
        r=sc.nextFloat();

        i=(p*t*r)/100;
        System.out.print("the simple intrest is :"+i);


}
}
