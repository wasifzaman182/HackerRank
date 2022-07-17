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


class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    long sum=0;
    long max = 0;
    long min = 0;
    
    min=arr.get(0);
    max=arr.get(0);
    
    //to find min
    for(int i=1; i<arr.size(); i++) {
    	if(arr.get(i)<min) {
    		min=arr.get(i);
    	}
    }
    
    //to find max
    for(int j=1; j<arr.size(); j++) {
    	if(arr.get(j) > max) {
    		max=arr.get(j);
    	}
    }
    
    for(Integer integer :arr){
      
    	sum +=integer ; 
    	
    	max=Math.max(max, integer);
    	min=Math.min(min, integer);
    			
    }
    
    System.out.print((sum-max) + " " +( sum-min));
    
 
    }

    
}


 
public class Solution2 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        Result2.miniMaxSum(arr);

	        bufferedReader.close();
	    }
}
