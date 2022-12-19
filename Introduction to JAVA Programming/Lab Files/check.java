package LAB_FILE;

import java.util.Scanner;
class check
{
    public static void main(String[] A)
{
    System.out.println("\t\t\n \t\tLAB FILE - Section E\n****************************************************"
            + "\n\t\tName : SATYAM RAJ \n\t\tRollNo: 200102581 "
            + "\n\t\tSAP ID: 1000015607 \n\t\tSection: E \n****************************************************\n");
    Scanner S=new Scanner(System.in); char ch;
    System.out.println("Enter the character you want to check:"); ch=S.next().charAt(0);
    String C=(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' ||
            ch=='o' || ch=='u')?"vowel":"consonant";
    System.out.println("It is:"+C);
}
 }
