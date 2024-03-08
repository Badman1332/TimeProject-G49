package org.Timecompany;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters; // Import TemporalAdjusters

public class PrintWeek {

    public static void main(String[] args) {
                LocalDate today = LocalDate.now();

               LocalDate lastMonday = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));

                for (int i = 0; i < 7; i++) {
            LocalDate dateToPrint = lastMonday.plusDays(i);
            System.out.println(dateToPrint.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }
}


