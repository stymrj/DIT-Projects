package LAB_FILE;
import java.util.Scanner;
class Decimal
{
    public static void main(String[] A)
    {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_3 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");

        Scanner s=new Scanner(System.in); double a,b;
    System.out.println("Enter two numbers:");
    a=s.nextDouble();
    b=s.nextDouble();
    a=(Math.round(a*10000));
        a=a/10000;
    b=(Math.round(b*10000));
    b=b/10000;
    if(a==b)
        System.out.println("Same");
    else
        System.out.println("Different");
}
 }
