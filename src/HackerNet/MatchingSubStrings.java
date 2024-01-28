package HackerNet;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Setting the char in s1 to a HashSet
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        // Pass through the second array to check if any chars are duplicated
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) {
                return "YES";
            }
        }        

        return "NO";
        
        //first attempt I tried to use for loops, ended up not being as efficient as the online complier wanted.
        // for(int i = 0; i < s1.length(); i++){
        //     if(s2.contains(s1.substring(i, i + 1))){
        //         return "YES";
        //     }
        // }
    }

}

public class MatchingSubStrings {
    public static void main(String[] args) throws IOException {
        System.out.println("here");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\output\\results.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);
            System.out.println(result);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
