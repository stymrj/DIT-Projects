package LAB_FILE;

import java.util.Scanner;
class MethOver
{
    void Sum(float A,float B)
    {
        System.out.println("First Method!!");
        System.out.println("Sum of first two numbers:"+(A+B));
    }
    float Sum(float A,float B,float C)
    {
        System.out.println("Second Method!!"); return
            (A+B+C);
    }
    void Sum()
    {
        System.out.println("Third Method!!");
        Scanner input=new Scanner(System.in); System.out.println("Enter two numbers:");
        float a=input.nextFloat(); float b=input.nextFloat();
        System.out.println("Sum:"+(a+b));
    }
    public static void main(String[] A)
    {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_8 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers(decimal):"); float
            a=input.nextFloat(); float b=input.nextFloat();
        float c=input.nextFloat();
        MethOver A1=new MethOver();





        A1.Sum(a,b); float d=A1.Sum(a,b,c);
        System.out.println("Sum of Three numbers:"+d); A1.Sum();
    }
}
