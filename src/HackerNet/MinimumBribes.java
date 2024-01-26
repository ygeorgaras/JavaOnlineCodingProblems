package HackerNet;

import java.io.*;
import java.util.*;
class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int totalBribes = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            int bribes = q.get(i) - (i + 1);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    totalBribes++;
                }
            }
        }
        System.out.println(totalBribes);
    }
}
public class MinimumBribes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Result.minimumBribes(q);
        }
        bufferedReader.close();
    }
}



