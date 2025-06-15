import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER maxSum
     * 2. INTEGER_ARRAY a
     * 3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return finalstack(0, 0, maxSum, a, b, 0, 0) - 1;
    }

    public static int finalstack(int i, int j, int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        // Base case: if the sum exceeds maxSum
        if (sum > maxSum) {
            return count; // Adjust count for the last invalid step
        }

        // If both lists are empty
        if (i >= a.size() && j >= b.size()) {
            return count;
        }

        int ans1 = 0;

        // Option 1: Take from stack 'a' if not empty
        if (i < a.size()) {
            ans1 = finalstack(i + 1, j, maxSum, a, b, sum + a.get(i), count + 1);
        }

        int ans2 = 0;
        // Option 2: Take from stack 'b' if not empty
        if (j < b.size()) {
            ans2 = finalstack(i, j + 1, maxSum, a, b, sum + b.get(j), count + 1);
        }

        return Math.max(ans1, ans2);
    }
}

public class GameofTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);
            int m = Integer.parseInt(firstMultipleInput[1]);
            int maxSum = Integer.parseInt(firstMultipleInput[2]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int bItem = Integer.parseInt(bTemp[i]);
                b.add(bItem);
            }

            int result = Result.twoStacks(maxSum, a, b);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
