package bbc.api.application.service.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class Formatted {
    // Get currentDate
    public LocalDate getCurrentDate(){
        return LocalDate.now();
    }
    // Get currentTimeFormatted
    public String getCurrentTimeFormatted(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SS");
        var localTime = LocalTime.now();
        return localTime.format(formatter);
    }
    // Show date Formatted in DTO
    public String formattedDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
    // Analyse the Date is Past, Future or Present
    @Deprecated
    public boolean error(LocalDate initialDate, LocalDate finishDate){
        var currentDate = LocalDate.now();
        return initialDate.isAfter(currentDate) || !initialDate.equals(currentDate);
    }
}
