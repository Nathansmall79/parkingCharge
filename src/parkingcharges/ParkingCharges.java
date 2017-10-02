package parkingcharges;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ParkingCharges {

        
    public static void main(String[] args) {
        //Declaration area:
        DecimalFormat df = new DecimalFormat("#.##");
        double hoursParked = 0;
        double total = 0;
        boolean run = true;
        Scanner input = new Scanner (System.in);
        
        //Give user instructions
        System.out.println("Please enter the amount of hours the current customer parked, if there are no more customers, enter '0'");
        
        //Loop to continue prompting the user for different customers
        while (run == true) {
            //Store current customer's parking hours
            System.out.println("Current customer's hours: ");
            hoursParked = input.nextDouble();
            
            if (hoursParked > 0 ) {
                //call the calculate method and add it to the current total
                total = total + calculateCharges(hoursParked);
                df.format(total);
                System.out.println("The current total is: $" + df.format(total));
                System.out.println("---------------------------");
            } else if (hoursParked == 0) {
                System.out.println("The final total is: $" + df.format(total));
                run = false;
            }
        }
    }
    
    
    public static double calculateCharges (double hours) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        double total2 = 0;
        if (hours <= 3) {
            total2 = 2;
        } else {
            hours = hours;
            total2 = (hours * 0.50) + .50;
        }
        System.out.println("The current customer's charge is: $" + df2.format(total2));
        return total2;
    }
}
