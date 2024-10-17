package time;
import java.time.LocalDateTime;  // For getting current date and time
import java.util.Scanner;

class DateTime {
    // Attributes for year, month, day, hour, minute, second
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    // Default constructor (sets current date and time)
    public DateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.year = currentDateTime.getYear();
        this.month = currentDateTime.getMonthValue();
        this.day = currentDateTime.getDayOfMonth();
        this.hour = currentDateTime.getHour();
        this.minute = currentDateTime.getMinute();
        this.second = currentDateTime.getSecond();
    }

    // Overloaded constructor for year, month, and day only
    public DateTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        // Setting time to 00:00:00 by default
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Overloaded constructor for year, month, day, hour, minute, and second
    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Set methods for each field
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Get methods for each field
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Method to display date and time
    public void displayDateTime() {
        System.out.println("Date: " + year + "/" + month + "/" + day);
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
    }
}

public class Time {
    public static void main(String[] args) {
        // Create an object using the default constructor
        DateTime currentDateTime = new DateTime();
        System.out.println("Default Constructor (Current Date and Time):");
        currentDateTime.displayDateTime();

        // Create an object using the overloaded constructor for year, month, and day
        DateTime specificDate = new DateTime(2022, 12, 31);
        System.out.println("\nOverloaded Constructor (Year, Month, Day):");
        specificDate.displayDateTime();

        // Create an object using the overloaded constructor for full date and time
        DateTime specificDateTime = new DateTime(2022, 12, 31, 14, 30, 45);
        System.out.println("\nOverloaded Constructor (Year, Month, Day, Hour, Minute, Second):");
        specificDateTime.displayDateTime();

        // Example of using set and get methods
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter new year, month, and day:");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        // Setting new values using set methods
        specificDateTime.setYear(year);
        specificDateTime.setMonth(month);
        specificDateTime.setDay(day);

        // Display the updated values
        System.out.println("\nUpdated Date:");
        specificDateTime.displayDateTime();
    }
}
