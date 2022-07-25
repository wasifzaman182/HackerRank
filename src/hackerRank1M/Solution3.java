package hackerRank1M;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    	 // Write your code here
        SimpleDateFormat formate = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat output = new SimpleDateFormat("HH:mm:ss");
        String result=null;
        
        try{
           Date date=formate.parse(s);    
           result = output.format(date);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return result;
       }

    }

public class Solution3 {
	 public static void main(String[] args) throws IOException {
 	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
 	        String s = bufferedReader.readLine();
 
 	        String result = Result3.timeConversion(s);
 
 	        bufferedWriter.write(result);
 	        bufferedWriter.newLine();
 
 	        bufferedReader.close();
 	        bufferedWriter.close();
		 
		
	    }
}
