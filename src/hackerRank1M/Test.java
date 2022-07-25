package hackerRank1M;

import java.util.Scanner;


import java.util.ArrayList;

public class Test {

	static char flip(char c) {
	
		return (c== '0') ?'1':'0';
	}
	
	public static long toBinary(long n) {

		   int len = 0;
		   String ones="";
	long y=  Long.parseLong(Integer.toBinaryString(~(int)n),2);
	 System.out.println("new solution" +  y);

		    String ret=String.format(Long.toBinaryString(n));
		    String result = Long.toUnsignedString( Integer.toUnsignedLong((int) n) | 0x100000000L ).substring(1);

		    System.out.println("value of ret after converting into 32 bits " + result);
		    //System.out.println("logs " + ret);
		    
		    len = result.length();
		    for(int i=0;i<len;i++) {
		    	ones+=flip(result.charAt(i));
		    }
		    
		    int[] d = null;
		    for(int j=0; j<=ones.length();j++) {
		    	 d[j]=+ones.charAt(j)^j; 
		    }
		    
		    System.out.println("after powring " + d);
		    //int ne = Integer.parseInt(ones);
		    
		    long mask = (1L << 32)-1;
		   System.out.println("ones  " + ones);
		   // long l = Long.parseLong(ones);
		    
		  //  long f = (ones^mask);
		    
		    System.out.println( y);
		    //System.out.println("ones  " + ne);
		return 0; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(toBinary(1));
	}

}

