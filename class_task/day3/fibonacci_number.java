public class Main {
    public static void main(String[] args) {

        try {
            int n = 6;

            int x = 0;
            int y = 1;

            if (n == 1) {
                System.out.println(x);
            } 
            else {
                System.out.print(x + " " + y + " ");

                for (int i = 2; i < n; i++) {
                    int temp = x;
                    x = y;
                    y = temp + x;

                    System.out.print(y + " ");
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}

