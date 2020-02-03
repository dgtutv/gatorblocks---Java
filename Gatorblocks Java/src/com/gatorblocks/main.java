package com.gatorblocks;
import java.time.*;
import java.time.DayOfWeek;
public class main
{
    public static String index(a, b)    //Get the index of a given value in a given list
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == b)
                return i;

        return i;
    }
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);       //Gets the current day of year
        DayOfWeek week
                = DayOfWeek.from(localDate);        //Gets the current day of the week
        int[] day1={0,1,2,3};
        int[] day2={4,5,6,7};
        int[] day3={2,3,0,1};
        int[] day4={6,7,4,5};
        int[] day5={1,0,3,2};           //These are my block rotations
        int[] day6={5,4,7,6};
        int[] day7={3,2,1,0};
        int[] day8={7,6,5,4};
        int[][] masterlist={day1,day2,day3,day4,day5,day6,day7,day8};   //This array is used to cycle through the block rotations
        String[] weekday={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};        //Pretty self explanatory :)
        int w=0;        //counter for iterating through days off array
        int counter=0;      //counter for number of days running through the main for loop
        if(day_of_year<Final-1)     //Final is a dev inputted number indicating the last day of school
        {
            day_of_year+=365;
        }
        day_of_year-=begin;
        for(int i=0; i<dayOff.length; i++)      //from list of days off in day of year format, converts to day of school year, based of the first day
        {
            if(dayOff[w] <Final-1)
            {
                dayOff[w]+=365;     //This is similar to the code above, it just applies to an array
            }
            dayOff[w]-=begin;
            w++;
        }
        rotation=index(weekday, FirstDay)-1;     //numeric value of the first day of school
        System.out.println(weekday[week]);  //print the day of the week
        System.out.println();
        for(int day=0;day<=365;day++) //iterates through every day from the start of school until today, this is because we want to use modulo to tell which block rotation should be used
            //even if not a school day we still want to display day of week
        {
            rotation++;
            if(rotation ==-1)
            {
                continue;

            }
            if(rotation ==5)        //This code skips weekends
            {
                rotation=-2;
                continue;
            }
            if(contains(dayOff,day))
            {
                continue;           //skips dev entered days off school
            }
            int dayz = (counter%8);     //When the code reaches to todays date, it will use modulo to tell which rotation is appropiate and then will cycle through the afformentioned lists to display today's classes
            counter++;
            x=masterlist[dayz];
            if day==day_of_year
            {
                for (int i = 0; i < 4; i++) {
                    String y = x[i];
                    String p -classes[y];
                    System.out.println(p);
                }
            }
        }
    }
}
