package LAB_FILE;

import java.util.Scanner;
class Cal
{
    public static void main(String[] A)
    {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_9 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");
        Scanner input=new Scanner(System.in); int
            a,b; char c;
        System.out.println("Enter two numbers:");
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Enter the operation you want to perform:");
        c=input.next().charAt(0); switch(c)
    {
        case '+':System.out.println("Sum:"+(a+b)); break;
        case
                '-':if(a>b)
            System.out.println("Difference:"+(a-b));
        else
            System.out.println("Difference:"+(b-a)); break;
            case
                '*':System.out.println("Multiplication:"+(a*b)); break;
        case '/':System.out.println("Division:"+(a/b)); break; case
                '%':System.out.println("Remainder:"+(a%b)); break;
        default:System.out.println("Enter valid value!!");
    }
      }
}

