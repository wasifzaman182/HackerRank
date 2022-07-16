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



class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int  pcount=0,    ncount=0 ,    zcount=0  , size=0;
              
        double  presult,  nresult,  zresult;
        size= arr.size();
        System.out.println("size of array " + size);
        
       for(int i=0; i<size; i++ ) {
            
            if(arr.get(i)  >0)  {
                pcount+=1;
               
            }
            if(arr.get(i)<0){
                ncount+=1;
   
            }
            if(arr.get(i)==0){
                zcount+=1;

            }
            
        }
       
         System.out.println("count is positive  " + pcount);
         System.out.println("count is Negative   " + ncount);
         System.out.println("count is zero  " + zcount);
       
       
         DecimalFormat df = new DecimalFormat("#.######");
         DecimalFormat df1 = new DecimalFormat("0.000000");
       
       
         presult=(double)pcount/size;                //cast the int value into double  from net
         String value1  = df1.format(presult);       //net 
         System.out.println( value1);
        
        
        
         nresult=(double)ncount/size;                   //cast the int value into double
         String value2 = df1.format(nresult);
         System.out.println(value2);
       
        
         zresult=(double)zcount/size;                 //cast the int value into double
         String value3 = df1.format(zresult);
         System.out.println(value3);
 
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
