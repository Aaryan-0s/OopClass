import java.text.DecimalFormat;
public class Decimalformattext {
    public static void main(String[] args){
        String pattern= "0,00,00.00";
        DecimalFormat decimalFormat= new DecimalFormat(pattern);
        System.out.print(decimalFormat.format(12.23434));

    }
}
