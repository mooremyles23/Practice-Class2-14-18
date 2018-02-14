
public class numbers2 {
	public static void main (String[]args){
			
		int a=72,b=6,c=91;
		int a2=200, b2=1, c2=117;
			
		double d= addnumbers(a,b,c);
		System.out.println ("The average is" + d);
		
		
		double e= addnumbers(a2,b2,c2);
		System.out.println ("The average is" + e);
		
	}
public static double addnumbers (int num1,int num2,int num3){

	int sum= num1+num2+num3;
	return sum/3;
	
	
}}