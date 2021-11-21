//Write a program to check weather a character is vowel or consonant
import java.util.Scanner;
public class Ans4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("eneter a character:");
        char  c= sc.next().charAt(0);
        if ((c=='a') || (c=='e')||(c=='i')||(c=='o')||(c=='u')){
            System.out.print("it is vowel");

        }
        else{
            System.out.print("it is a consonent");
        }

    }
}
