import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Non-repeated elements:");
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.println(num);
                set.add(num);
            }
        }
    }
}