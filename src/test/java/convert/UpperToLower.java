package convert;


/**
 * 
 * @author Ruba
 *
 */
public class UpperToLower{


	/** 
	 * The first way is to use "toLowerCase" function which is already existing in java
	 */
	public static String way1()
	{
		String str="RUBa";
		String str2;
		StringBuffer strLower =new StringBuffer(str);        
		for(int i = 0; i < str.length(); i++) {              
			if(Character.isUpperCase(str.charAt(i))) {    
				strLower.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
			}    
		}    
		str2 = strLower.toString();
		return str2;    
	}


	/** 
	 * The second way is to add 32 to the char to be lower 
	 */
	public static String way2()
	{
		String str1="RUBaWAel";
		String str2;
		int temp;
		char strLower[]= new char[8];
		for(int i = 0; i < str1.length(); i++) {              
			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z') {
				temp = (int) str1.charAt(i);
				temp = temp + 32;
				strLower[i] = (char)temp;
			}
			else {  
				strLower[i] = str1.charAt(i); 
			}    
		}
		str2 = String.valueOf(strLower);
		return str2;
	}
}
