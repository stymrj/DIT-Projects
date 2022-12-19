package LAB_FILE;

import java.util.Scanner; class
Sort {
    public static void main(String[] A)
    {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_5 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");
        Scanner input = new Scanner(System.in);
        int i, j;
        String B;
        String S[] = new String[10];
        for (i = 0; i < 10; i++) {
            System.out.print("Value" + i + ":");
            S[i] = input.nextLine();
        }
        for (i = 0; i < S.length; i++)
            for (j = i + 1; j < S.length; j++) {
                if ((S[j].compareTo(S[i])) < 0) {
                    B = S[i];
                    S[i] = S[j];
                    S[j] = B;
                }
            }
        for (i = 0; i < 10; i++) {
            System.out.println("Value:" + S[i]);
        }

    }
}

