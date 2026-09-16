public class Main {

    public static void main(String[] args) {

        int[] num = {80, 75, 90, 85, 70, 95, 60, 88};
        int n = num.length;

        int sumf = 0;

        System.out.println("Scores:");

        for (int i = 0; i < n; i++) {

            System.out.print(num[i] + " ");

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

        for (int i = 0; i < n; i++) {
            sumf += num[i];
        }

        double average = (double) sumf / n;

        System.out.printf("\nAverage: %.2f%n", average);

        int lowest = num[0];
        int highest = num[0];

        for (int i = 1; i < n; i++) {

            if (num[i] < lowest) {
                lowest = num[i];
            }

            if (num[i] > highest) {
                highest = num[i];
            }
        }

        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);

        System.out.println("\nScore  Deviation");

        double sumsd = 0;

        for (int i : num) {

            double deviation = i - average;

            System.out.printf("%d     %.2f%n", i, deviation);

            sumsd += deviation * deviation;
        }

        double SD = Math.sqrt(sumsd / n);

        System.out.printf("\nStandard Deviation: %.2f%n", SD);

        int count = 0;

        for (int i : num) {

            if (average - SD <= i && i <= average + SD) {
                count++;
            }
        }

        System.out.println("Scores within one standard deviation: " + count);
    }
}