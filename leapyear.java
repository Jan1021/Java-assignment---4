import java.util.LinkedList;
import java.util.Scanner;

class leapyear{
    int date;
    int month;
    int year;
    public leapyear(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
}
public class collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<leapyear> lp = new LinkedList<>();
        System.out.println("Enter the Date of Birth in DD/MM/YYYY");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        leapyear l1 = new leapyear(date, month, year);
        lp.add(l1);
        for (leapyear l: lp){
            if(year % 400 == 0){
                System.out.println("Your birth's Date is: " + l.date + " - " + l.month + " - " + l.year);
                System.out.println("It was a leap year");
            }
            else if (year % 100 == 0){
                System.out.println("Your birth's Date is: " + l.date + " - " + l.month + " - " + l.year);
                System.out.println("It wasn't a leap year");
            }
            else if (year % 4 == 0){
                System.out.println("Your birth's Date is: " + l.date + " - " + l.month + " - " + l.year);
                System.out.println("It was a leap year");
            }
            else {
                System.out.println("Your birth's Date is: " + l.date + " - " + l.month + " - " + l.year);
                System.out.println("It wasn't a leap year");
            }
                System.out.println("Your birth's Date is: " + l.date + " - " + l.month + " - " + l.year);
                System.out.println("It was a leap year");

        }
    }
}