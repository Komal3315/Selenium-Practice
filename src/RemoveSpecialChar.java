
public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bhus&@#@han";
		
		String newString = str.replaceAll("&@#@","");
		System.out.println(newString);


	}

}
