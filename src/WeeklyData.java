/**
 * The WeeklyData class stores and analyzes a week’s worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 */
public class WeeklyData {

    // -------------------------------------------------------------
    // Instance Variables
    // -------------------------------------------------------------
    // TODO: Declare a private array to store the week’s data
    //       Choose an appropriate type (double[] or int[])
    //       Create other instance variables as necessary
    double[] sleepHours;
    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Constructs a WeeklyData object by taking in an array of values
     * and making a deep copy (element-by-element) into the internal array.
     *
     * @param input an array representing 7 days of data
     */
    public WeeklyData(double[] input) {
        // TODO: (Optional) Check if input is null and handle appropriately
        try{
            // TODO: Create a new array with the same length as input
            sleepHours = new double[input.length];
            // TODO: Copy each value from input into the internal data array
            int index = 0;
            for(double inputNum : input){
                sleepHours[index] = inputNum;
                index++;
            }
            // NOTE: Do NOT do this.data = input; (that would create aliasing)
        }
        //catch error messages were written with the help of AI
        catch(NullPointerException e){
            System.out.println("An error occurred: the array was null.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An error occurred: array index is out of bounds (maybe empty?).");
        }
    }


    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        // TODO: Create a variable to store the running total
        double total = 0;
        // TODO: Use a loop to add each value in the array to the total
        for(double sleepHour : sleepHours){
            total += sleepHour;
        }
        // TODO: Return the total
        return total; // replace with your calculated total
    }


    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        double average;
        // TODO: If the array length is 0, return 0.0
        if(sleepHours.length == 0){
            return 0.0;
        }
        // TODO: Otherwise, divide the total by the number of elements
        average = getTotal() / sleepHours.length;
        // Hint: You may call getTotal()
        return average; // replace with your calculated average
    }


    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        // TODO: Assume the first value is the current maximum
        double max = sleepHours[0];
        // TODO: Loop through the rest of the array and update max as needed
        for(double sleepHour : sleepHours){
            if(sleepHour > max){
                max = sleepHour;
            }
        }
        // TODO: Return the maximum value found
        return max; // replace with the maximum value
    }


    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        // TODO: Assume the first value is the current minimum
        double min = sleepHours[0];
        // TODO: Loop through the rest of the array and update min as needed
        for(double sleepHour : sleepHours){
            if(sleepHour < min){
                min = sleepHour;
            }
        }
        // TODO: Return the minimum value found
        return min; // replace with the minimum value
    }


    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    /**
     * Returns a formatted, multi-line String showing each day’s data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week’s data
     */
    @Override
    public String toString() {
        // TODO: Create a StringBuilder
        String data = "";
        int day = 0;
        // TODO: Loop through the data array
        for(double sleepHour : sleepHours){
            // TODO: Append each value with a day label (Day 1, Day 2, etc.)
            day++;
            data += "Day " + day + ": " + sleepHour + "\n";
        }
        // TODO: Return the completed String
        return data; // replace with your formatted output
    }
}