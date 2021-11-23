import java.util.Scanner;
public class Q3 {public static void main(String[] args){
    Scanner sn = new Scanner(System.in);

    float qn;
    System.out.print("What about of  quantity have you bought:");
    qn=sn.nextFloat();
    if (qn>1000){
        float tc= (qn*100)*10/100;
        System.out.print("total cost after discount "+tc);
    }
    else{
        float tc=qn*100;
        System.out.print("total cost is "+tc);

    }

}
}
