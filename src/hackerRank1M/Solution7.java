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

class Result7 {
 
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int countRowWise=0;
    int sumLTR=0;
    int sumRTL=0;
    
    for(int i=0; i<arr.size(); i++){
       sumLTR += arr.get(i).get(countRowWise);    
        countRowWise++;
    }
    
    countRowWise=0;
    for(int i=arr.size()- 1; i>=0; i--){       
        sumRTL +=arr.get(i).get(countRowWise);
        countRowWise++;
    }
    
    int result = Math.abs(sumLTR - sumRTL);
    return result;
    }
 
}

public class Solution7 {

	public static void main(String[] args) throws IOException{
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, n).forEach(i -> {
	            try { 
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                        
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = Result7.diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

	}

