package best_practices;

import java.util.Scanner;

import static java.lang.Math.floor;

/*
This class has a super bloated method that does too many things at once. Refactor the describeYear method and
separate out the responsibilities into other methods to improve readability and maintainability.
 */
public class YearDescriber {

    static Scanner fromUser = new Scanner(System.in);

    private YearDescriber() {
    }

    ; //static class

    private static int getYear() {
        System.out.println("What year would you like to learn about?");
        int year;

        while (true) {
            try {
                year = fromUser.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please just input a year in the format YYYY!");
            }
        }

        return year;
    }

    private static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return true;
        } else {
            return year % 4 == 0;
        }
    }

    // This method calculates the day the year started on
    // 0 - year started on Sunday
    // 1 - year started on Monday
    // ...
    private static int calcStartDay(int year) {
        int startDay = (
                29 -
                        (2 * (year / 100)) +
                        ((year % 100) - 1) +
                        (int) ((double) ((year % 100) - 1) / 4) +
                        (int) ((double) (year / 100) / 4)
        );

        startDay = (startDay % 7 + 7) % 7;
        return startDay;
    }

    public static void describeYear() {
        int year = getYear();

        String printMessage = year + " was ";

        if (isLeapYear(year)) {
            printMessage += "a leap year,";
        } else {
            printMessage += "not a leap year,";
        }

        printMessage += " and started on a ";

        int startDay = calcStartDay(year);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        printMessage += days[startDay] + "!";
        System.out.println(printMessage);
    }
}
