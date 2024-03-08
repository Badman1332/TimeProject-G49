package org.Timecompany;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseStringDate {

    public static void main(String[] args) {
                java.lang.String isoDateString = "2024-03-08";
        LocalDate parsedDate = LocalDate.parse(isoDateString);
              String customDateString = "03/08/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate parsedDateWithFormat = LocalDate.parse(customDateString, formatter);

        System.out.println("ISO Date: " + parsedDate);

    }
}




