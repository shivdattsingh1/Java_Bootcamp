public class BreakExample {
    public static void main(String[] args) {
        System.out.println(" for loop start ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at: " + i);
                break;  // Breaks the loop when i is 5
            }
            System.out.println(i);
        }
        System.out.println(" for loop end ");

        System.out.println(" loop start ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skips the rest of the loop when i is even
            }
            System.out.println(i);
        }
        System.out.println(" loop end ");

        int i = 1;

        System.out.println(" while loop start ");
        while (i <= 10) {
            if (i == 4 || i == 7) {
                i++;
                continue;  // Skips the rest of the loop when i is 4 or 7
            }
            System.out.println(i);
            i++;
        }
        System.out.println(" while loop end ");

        System.out.println(" loop start ");
        while (i <= 10) {
            if (i == 8) {
                System.out.println("Breaking at: " + i);
                break;  // Breaks the loop when i is 8
            }
            System.out.println(i);
            i++;
        }
        System.out.println(" loop end ");
    }
}
    
    
