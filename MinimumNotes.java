import java.util.Scanner;

public class MinimumNotes {

    public static int minNotes(int N) {
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int count = 0;
        
        for (int denom : denominations) {
            if (N >= denom) {
                int numNotes = N / denom;
                count += numNotes;
                N -= numNotes * denom;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int N = scanner.nextInt();
        
        // Get the minimum number of notes
        int result = minNotes(N);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
}



