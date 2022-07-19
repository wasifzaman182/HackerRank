package hackerRank1M;

public class Test {

	public static String toBinary(int x) {
//		//return Integer.toBinaryString(x);
//		String ret=String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
//		Long.getLong(ret);
//		System.out.println("logs " + ret);
		
		   int pass =(int)x;
		   long val = 0;
		   
		   System.out.println("value of x " + x);
		   System.out.println("value after pass " + pass);
		   
		    String ret=String.format("%32s", Integer.toBinaryString(pass)).replaceAll(" ", "0");
		    System.out.println("value of ret after converting into 32 bits " + ret);
		        if(ret == null)
		        	System.out.println("no value found");
		        else {
		        	 val = Long.getLong(ret);
		        }
		    	   
		        
		        System.out.println("logs " + val);
		    
		return ret; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toBinary(0 ));
	}

}
