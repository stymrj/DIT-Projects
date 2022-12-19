package LAB_FILE;

import java.util.*;
class excep { String name;
    static String univ = "DIT UNIVERSITY";
    String course; void
    input()
    {
        Scanner sc = new Scanner(System.in); System.out.print("ENTER NAME : ");
        name = sc.next();
        while(true) {
            System.out.print("ENTER COURSE : "); course =
                    sc.next();
            if( !course.equalsIgnoreCase("Java") ) {
                System.out.println("Invalid course, Enter again");
            }
            else break;
        }
    }
    void display() {
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("University : " + univ);
    }
    public static void main(String[] args) {
        System.out.println("\n\n\t**************************************");
        System.out.println("\t     ::::: Practical_10 :::::::");
        System.out.println("\t\t\t Name: SATYAM RAJ ");
        System.out.println("\t\t\t SAP ID: 1000015607 ");
        System.out.println("\t\t\t Roll No: 200102581 ");
        System.out.println("\t**************************************\n\n");
        excep o1 = new excep();
        o1.input();
        o1.display();
    }
}
