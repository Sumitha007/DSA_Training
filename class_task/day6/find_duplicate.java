import java.util.HashSet;

public class Main {

    public static boolean cDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {

            if (set.contains(i)) {
                return true;
            }

            set.add(i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(cDuplicate(arr));
    }
}