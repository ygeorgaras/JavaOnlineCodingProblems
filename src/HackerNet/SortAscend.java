package HackerNet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SortAscend {
    
    static int minSwaps = 0;
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i =0; i <arr.length;) {
            if (arr[i]-1!= i) {
                int k = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                count++;
                continue;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\output\\results.txt"));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //int[] arr = new int[n];

        // String[] arrItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int arrItem = Integer.parseInt(arrItems[i]);
        //     arr[i] = arrItem;
        // }

        int[] x = {1,3,5,2,4,6,7};
        int res = minimumSwaps(x);
        //System.out.println(res);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    }
