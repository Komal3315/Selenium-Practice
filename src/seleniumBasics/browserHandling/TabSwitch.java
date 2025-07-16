package seleniumBasics.browserHandling;

public class TabSwitch {


	// Input - Komal Bhushan More 
	// Output - More Bhushan Komal
	
	String name ="Komal Bhushan More";
	String name2 = "";
	
	public static void main(String[] args) {
		
		String name ="Komal Bhushan More";
		String name2 = "";
		
		String[] newname=  name.split(" ");
		
		for (int i=newname.length-1 ; i>=0;i--) {
			System.out.print(newname[i]+" ");
			
		}
		
		
		
	}
}
