package LAB_FILE;
import java.util.Scanner;
public class simple_intrest
{
    public static void main(String args[])
    {
        System.out.println("\t\t\n \t\tLAB FILE - Section E\n****************************************************"
                + "\n\t\tName : SATYAM RAJ \n\t\tRollNo: 200102581 "
                + "\n\t\tSAP ID: 1000015607 \n\t\tSection: E \n****************************************************\n");
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : "); p
            = scan.nextFloat();
        System.out.print("Enter the Rate of interest : "); r
            = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}