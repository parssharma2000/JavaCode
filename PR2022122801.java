
public class PR2022122801 {

	public static void main(String[] args) {
		
		int minVal = Integer.MIN_VALUE;
		int maxVal = Integer.MAX_VALUE;
		
		//minVal=minVal-2;
		
		//maxVal=maxVal+2;
		
		long longInt = 2147483648L;
		short myShortValue=128;
		
		short myNewShortValue=(short)(myShortValue/2);
		
		byte firstByte=127;
		short firstShort=256;
		int firstInt=50000;
		long firstLong=(50000L+10L*(firstByte+firstShort+firstInt));
		
System.out.println("firstByte :"+firstByte+", firstShort :"+firstShort+"firstInt:"+firstInt+"firstLong"+firstLong);
		
		System.out.println("Min value :"+minVal+", Max value :"+maxVal);
		System.out.println("Byte Min value :"+Byte.MIN_VALUE+", Max value :"+Byte.MAX_VALUE);
		System.out.println("Short value :"+Short.MIN_VALUE+", Max value :"+Short.MAX_VALUE);
		System.out.println("Long Min value"+Long.MIN_VALUE+", Max value :"+Long.MAX_VALUE);
		
		System.out.println("myShortValue:"+myNewShortValue);
		
		// There are two types for Decimal format in Java - Float and Double
		// Double is more precise and default data type of Java
		
		System.out.println("Float Min value :"+Float.MIN_VALUE+", Max value :"+Float.MAX_VALUE);
		System.out.println("Double Min value :"+Double.MIN_VALUE+", Max value :"+Double.MAX_VALUE);
		
		// 1.24E-2 = E-2 means 1/100=.01 , E2 means 1*100
		
		float myFloatValue = (float)25.5; // if we do this without explicit type cast , we will get issue
		// as for compiler double is default value other way is to use 25.5f
		System.out.println("myFloatValue : "+myFloatValue)	;	
		
		double myDoubleValue = 12345678912.123456789123;
		System.out.println("myDoubleValue: " + myDoubleValue);
		}

}
