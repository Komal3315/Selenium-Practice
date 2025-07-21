package String;
public class RepeatedCharacters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Komal Bhushan More";
		str = str.replaceAll(" ", ""); 
		//String[] s = str.split(" ");
		for(int i=0; i<=str.length()-1;i++)
		{
			char c = str.charAt(i);
			//System.out.print(c);
			
			for(int f= i+1 ; f<=str.length()-1; f++)
			{
				if(c == str.charAt(f))
				{
					System.out.println(c);
					break;
				}
			}
			
		}

		
	            
	}

}