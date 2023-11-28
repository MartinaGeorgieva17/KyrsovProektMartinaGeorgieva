package HomeworkFour;
public class ARRAY {
        public static void main(String[] args) {
            // Create an array with 20 elements
            int[] array = new int[20];

            // Initialize each element with a value equal to the index multiplied by 5
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 5;
            }

            // Display the elements of the array to the console
            System.out.println("Elements of the array:");

            for (int i = 0; i < array.length; i++) {
                System.out.println("Index " + i + ": " + array[i]);
            }

            // Calculate the average of all numbers in the array
            double average = calculateAverage(array);

            // Display the average to the console
            System.out.println("Average of all numbers in the array: " + average);
        }

        private static double calculateAverage(int[] array) {
            int sum = 0;

            // Calculate the sum of all elements in the array
            for (int value : array) {
                sum += value;
            }

            // Calculate the average
            return (double) sum / array.length;
        }
    }
