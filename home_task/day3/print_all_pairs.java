public class Main {

    public static void main(String[] args) {

        int n = 4;
        int[] arr = {10, 20, 30, 40};

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
}