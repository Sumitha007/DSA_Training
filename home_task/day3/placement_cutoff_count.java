public class Main {

    public static void main(String[] args) {

        int[] scores = {65, 78, 90, 45, 82, 55, 95};
        int c = 70;

        int count = 0;

        for (int i : scores) {

            if (i >= c) {
                count++;
            }
        }

        System.out.println(count);
    }
}