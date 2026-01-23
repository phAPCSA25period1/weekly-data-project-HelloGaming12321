import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner systemInput = new Scanner(System.in);
        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("This program will help you analyze your sleep patterns over a week.");
        System.out.println("How many hours of sleep do you aim for each night?");
        double sleepGoal = systemInput.nextDouble();
        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7]; // you can create an int/double array where all the data appends to the int/double array then call the array onto your object
        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for(int i = 1; i <= 7; i++){
            System.out.println("Enter the amount of hours you slept for day " + i + ": ");
            weekData[i - 1] = systemInput.nextDouble();
        }
        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData data = new WeeklyData(weekData); // should be WeeklyData weekData = new WeeklyData(int/double array)
        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println("Total: " + data.getTotal());
        System.out.println("Average: " + data.getAverage());
        System.out.println("Minimum: " + data.getMin());
        System.out.println("Maximum: " + data.getMax());
        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.print(data);
        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        System.out.println("Your sleep goal was " + sleepGoal + " hours per night.");
        if(data.getAverage() < sleepGoal){
            System.out.println("You need to get more sleep next week!");
        }
        else{
            System.out.println("Great job meeting your sleep goals this week!");
        }
    }
}
