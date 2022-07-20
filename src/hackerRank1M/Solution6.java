package hackerRank1M;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result6 {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
    long y=  Long.parseLong(Integer.toBinaryString(~(int)n),2);
     System.out.println(y);
    return y;

    }

}

public class Solution6 {
	  public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, q).forEach(qItr -> {
	            try {
	                long n = Long.parseLong(bufferedReader.readLine().trim());

	                long result = Result6.flippingBits(n);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
