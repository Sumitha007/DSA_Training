import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Count:");
        for (int num : frequencyMap.keySet()) {
            System.out.println(num + ": " + frequencyMap.get(num));
        }
    }
}