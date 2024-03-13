package org.Timecompany;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class BirthDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

              if (!isValidDate(birthMonth, birthDay)) {
            System.out.println("Invalid birth date. Please enter a valid month (1-12) and day (1-31).");
            scanner.close();
            return;
        }

        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);

                DayOfWeek dayOfWeek = birthday.getDayOfWeek();

        System.out.println("This is your day of birth : " + dayOfWeek);

        scanner.close();
    }
        private static boolean isValidDate(int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
               return day >= 1 && day <= 31;
    }
}



