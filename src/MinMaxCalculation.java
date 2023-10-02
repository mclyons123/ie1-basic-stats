public class MinMaxCalculation {

    /**
     * Computes the minimum value from an array of doubles.
     * 
     * @param numbers Array of doubles.
     * @return Minimum double value from the array. Returns null if the array is empty.
     */
    public static Double computeMin(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    /**
     * Computes the maximum value from an array of doubles.
     * 
     * @param numbers Array of doubles.
     * @return Maximum double value from the array. Returns null if the array is empty.
     */
    public static Double computeMax(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("MinMaxCalculation!" );
    }
}