public class Main {

    public static void main(String[] args) {

        int n = 7;
        int x = 2;

        int[] arr = {1, 2, 3, 2, 5, 2, 6};

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println(first + " " + last);
    }
}