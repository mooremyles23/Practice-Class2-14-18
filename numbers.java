
public class numbers {
	public static void main (String[]args){
	int a=82,b=64;
	int a2=2, b2= 221;
	int a3=13, b3=34;
	
	int c= comparenumbers(a,b);
	System.out.println("The smaller number is" + c);
	
	
	int d=comparenumbers(a2,b2);
	System.out.println("The smaller number is" + d);
	
	int e=comparenumbers(a3,b3);
	System.out.println("The smaller number is" + e);
	}
	
	

	public static int comparenumbers (int num1,int num2){

		if(num1>num2){
			return num2;
		}else{
			return num1;
		}
		
			
	
	
	
	}}

	