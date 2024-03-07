
package org.Timecompany;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDateInSwedish {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SV"));


        String formattedDate = Character.toUpperCase(today.format(formatter).charAt(0)) + today.format(formatter).substring(1);

        System.out.println(formattedDate);

    }
}