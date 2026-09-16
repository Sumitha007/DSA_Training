import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {

            String num = sc.nextLine();

            int length = 0;
            int count = 0;

            for (int j = 0; j < num.length(); j++) {

                char ch = num.charAt(j);

                if (ch != ' ') {
                    length++;

                    if (ch == '0') {
                        count++;
                    }
                }
            }

            if (count > 0) {
                System.out.println(count + " student absent");
                System.out.println(count + " student absent out of " 
                        + length + " student Att: " 
                        + ((length - count) * 100.0 / length) + "%");
            } 
            else {
                System.out.println("No absentees Att : 100%");
            }
        }

        sc.close();
    }
}

