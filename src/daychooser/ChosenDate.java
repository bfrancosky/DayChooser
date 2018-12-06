/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daychooser;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.SUNDAY;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.image.Image;

/**
 *
 * @author Brian
 */
public class ChosenDate {
    
    LocalDate mydate;
    
    public ChosenDate() {
        this.mydate = LocalDate.now();
    }
    
    public ChosenDate(LocalDate somedate) {
        this.mydate = somedate;
    }
    
    public Integer showNextDay() {
        LocalDate nextday = mydate.plusDays(1);
        Integer nextstring;
        nextstring = nextday.getDayOfMonth();
        return nextstring;
        
    }
    
    public Integer showCurrentDay() {
        Integer currentstring;
        currentstring = mydate.getDayOfMonth();
        return currentstring;
        
    }    
    
    public Integer showPrevDay() {
        LocalDate prevday = mydate.plusDays(-1);
        Integer prevstring;
        prevstring = prevday.getDayOfMonth();
        return prevstring;
    }    
    
    public DayOfWeek showDayOfWeek() {
        return mydate.getDayOfWeek();
    }
    
    public Integer showShoppingDays() {
        LocalDate xmasday;
        xmasday = mydate.withMonth(12);
        xmasday = xmasday.withDayOfMonth(25);
        Integer daysleft = (xmasday.getDayOfYear() - mydate.getDayOfYear());

        int count = 0;
        for (int x = 0; x < daysleft; x++) {
            //DayOfWeek sunday = DayOfWeek.SUNDAY;
            if (mydate.plusDays(x).getDayOfWeek() == SUNDAY) {
                count++;  
            }
        }
        return (daysleft - count);
    }
        public ArrayList showZodiac() {
        
        ArrayList<LocalDate> zodiacdates = new ArrayList<>();
      
        LocalDate ariesstart = LocalDate.of((mydate.getYear()), 3, 21); zodiacdates.add(ariesstart);
        LocalDate taurusstart = LocalDate.of((mydate.getYear()), 4, 21); zodiacdates.add(taurusstart);
        LocalDate geministart = LocalDate.of((mydate.getYear()), 5, 21); zodiacdates.add(geministart);
        LocalDate cancerstart = LocalDate.of((mydate.getYear()), 6, 22); zodiacdates.add(cancerstart);
        LocalDate leostart = LocalDate.of((mydate.getYear()), 7, 23); zodiacdates.add(leostart);
        LocalDate virgostart = LocalDate.of((mydate.getYear()), 8, 24); zodiacdates.add(virgostart);
        LocalDate librastart = LocalDate.of((mydate.getYear()), 9, 23); zodiacdates.add(librastart);
        LocalDate scorpiostart = LocalDate.of((mydate.getYear()), 8, 24); zodiacdates.add(scorpiostart);
        LocalDate sagittariusstart = LocalDate.of((mydate.getYear()), 10, 23); zodiacdates.add(sagittariusstart);
        LocalDate capricornstart = LocalDate.of((mydate.getYear()), 12, 23); zodiacdates.add(capricornstart);
        LocalDate aquariusstart = LocalDate.of((mydate.getYear()), 1, 21); zodiacdates.add(aquariusstart);
        LocalDate piscesstart = LocalDate.of((mydate.getYear()), 2, 19); zodiacdates.add(piscesstart);
        System.out.println(zodiacdates);
        Iterator itr = zodiacdates.iterator();
        
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }   
        return zodiacdates;
    }
        
    public String getZodiac() {
        LocalDate ariesstart = LocalDate.of((mydate.getYear()), 3, 21); 
        LocalDate taurusstart = LocalDate.of((mydate.getYear()), 4, 21); 
        LocalDate geministart = LocalDate.of((mydate.getYear()), 5, 21); 
        LocalDate cancerstart = LocalDate.of((mydate.getYear()), 6, 22); 
        LocalDate leostart = LocalDate.of((mydate.getYear()), 7, 23); 
        LocalDate virgostart = LocalDate.of((mydate.getYear()), 8, 24); 
        LocalDate librastart = LocalDate.of((mydate.getYear()), 9, 23); 
        LocalDate scorpiostart = LocalDate.of((mydate.getYear()), 8, 24); 
        LocalDate sagittariusstart = LocalDate.of((mydate.getYear()), 10, 23); 
        LocalDate capricornstart = LocalDate.of((mydate.getYear()), 12, 23); 
        LocalDate aquariusstart = LocalDate.of((mydate.getYear()), 1, 21); 
        LocalDate piscesstart = LocalDate.of((mydate.getYear()), 2, 19); 
        
        if ((mydate.isAfter(capricornstart)) && ((mydate.isBefore(aquariusstart)))) {  
            return "Capricorn";
        } else if ((mydate.isAfter(aquariusstart)) && ((mydate.isBefore(piscesstart)))) {
            return "Aquarius";
        } else if ((mydate.isAfter(piscesstart)) && ((mydate.isBefore(ariesstart)))) {
            return "Pisces";
        } else if ((mydate.isAfter(ariesstart)) && ((mydate.isBefore(taurusstart)))) {
            return "Aries";
        } else if ((mydate.isAfter(taurusstart)) && ((mydate.isBefore(geministart)))) {
            return "Taurus";
        } else if ((mydate.isAfter(geministart)) && ((mydate.isBefore(cancerstart)))) {
            return "Gemini";
        } else if ((mydate.isAfter(cancerstart)) && ((mydate.isBefore(leostart)))) {
            return "Cancer";
        } else if ((mydate.isAfter(leostart)) && ((mydate.isBefore(virgostart)))) {
            return "Leo";
        } else if ((mydate.isAfter(virgostart)) && ((mydate.isBefore(librastart)))) {
            return "Virgo";
        } else if ((mydate.isAfter(librastart)) && ((mydate.isBefore(scorpiostart)))) {
            return "Libra";
        } else if ((mydate.isAfter(scorpiostart)) && ((mydate.isBefore(sagittariusstart)))) {
            return "Scorpio";
        } else if ((mydate.isAfter(sagittariusstart)) && ((mydate.isBefore(capricornstart)))) {
            return "Sagittarius";
        }
        
        return "Unknown";
    }   
    
    @Override
    public String toString() {
        return mydate.toString();
    }
    
    public Integer getDate() {
        return mydate.getDayOfMonth();
    }
    
    public Month getMonth() {
        return mydate.getMonth();
    }
    
}

