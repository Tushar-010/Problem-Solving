import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int p = 0;
        int n = 0;
        int z = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) > 0) {
                p+=1;
            }
            if(arr.get(i) < 0) {
                n+=1;
            }
            if(arr.get(i) == 0) {
                z+=1;
            }
        }
        double d1 = (double)p/arr.size();
        double d2 = (double)n/arr.size();
        double d3 = (double)z/arr.size();
        System.out.printf("%.6f\n",d1);
        System.out.printf("%.6f\n",d2);
        System.out.printf("%.6f\n",d3);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}