import java.util.Scanner;
public class determinegroup {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("if male enter true else false ");
        boolean male= sc.nextBoolean();
        System.out.print("enter age ");
        int age= sc.nextInt();
        if(male) {
            if (age>=20){
                System.out.print("Man");

            }
            else{
                System.out.print("boy");
            }

        }
        else{
            if (age>=20){
                System.out.print("WoMan");

            }
            else{
                System.out.print("girl");
            }
        }


    }
}
