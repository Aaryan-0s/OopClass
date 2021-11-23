import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter any character;");
        char c = sc.nextLine();
        if(Character.isUpperCase(c)){
            System.out.print("Its is uppercase");
        }
        else{
            System.out.print("it is not uppercase");
        }

    }

//

}
