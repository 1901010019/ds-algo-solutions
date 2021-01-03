import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String sillyGame(int n) {
        int tmp = 0;
        boolean[] arr = new boolean[n+1];
        for (int x = 2; x <= n; x++){
            if (arr[x] == false){ 
                tmp++;
                for (int i = x; i <= n; i += x){
                    arr[i] = true;
                    }
                }
            }
        if(tmp % 2 == 0) 
            return "Bob";
        else        
            return "Alice";
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String result = sillyGame(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
