package org.Timecompany;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class CurrentDatePM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of years to add: ");
        int yearsToAdd = scanner.nextInt();

                System.out.print("Enter the number of months to subtract: ");
        int monthsToSubtract = scanner.nextInt();

                LocalDate currentDate = LocalDate.now();


        LocalDate modifiedDate = currentDate.plusYears(yearsToAdd).minusMonths(monthsToSubtract);

                Month month = modifiedDate.getMonth();
        System.out.println("Month of the modified date: " + month.name());

        scanner.close();
    }
}

