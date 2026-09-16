import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] arr = {101, 102, 103, 104, 105};

        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for (int i : arr) {

            if (set.contains(i)) {
                duplicate = true;
                break;
            }

            set.add(i);
        }

        if (duplicate) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}