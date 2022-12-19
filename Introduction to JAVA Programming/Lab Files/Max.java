package LAB_FILE;

import java.util.Scanner; import
        java.util.Scanner;
class Max {
    public static void main(String[] A) {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_5 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");

        Scanner s = new Scanner(System.in);
        int a[] = new
                int[10];
        System.out.println("Enter elements:");
        int
                i, max = 0;
        for (i = 0; i < 10; i++) {
            System.out.print("Value:");
            a[i] = s.nextInt();
        }
        max = a[0];
        for (i = 0; i < 10; i++) {
            if (max < a[i])
                max = a[i];
        }
        System.out.println("\n\nMaximum:" + max);
    }
}
