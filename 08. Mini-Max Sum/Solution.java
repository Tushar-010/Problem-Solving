import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int mi = Collections.min(arr);
        int ma = Collections.max(arr);
        long mis = 0;
        long mas = 0;
        if(mi==ma) {
            for(int i=0;i<arr.size()-1;i++) {
                mis+=arr.get(i);
                mas+=arr.get(i);
            }
        }else{
            for(int i=0;i<arr.size();i++) {
                if(arr.get(i) != mi) {
                    mas+=arr.get(i);
                }
                if(arr.get(i) != ma) {
                mis+=arr.get(i);
                }
            }
        }
        
        System.out.print(mis+" "+mas);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}