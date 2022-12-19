package LAB_FILE;

public class Fibonacci_series
{
    //Function to print N Fibonacci Number
    static void Fibonacci(int N){
        int num1=0,num2=1;
        int counter=0;
    //IteratetillcounterisN
        while(counter<N)
        {
            //Printthenumbe
    //Printthenumber
            System.out.print(num1+"" );
//Swap
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            counter=counter+1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_3 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");



    //GivenNumberN
        int N=10;
     //FunctionCall
        Fibonacci(N);

    }
}
