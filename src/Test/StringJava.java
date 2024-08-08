package Test;

public class StringJava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "it is my life";
			
		 // below method split() will split the above sting in seprate form and if we added that word "my" will skip 
		  String[]  splittedString = s.split("my");
			System.out.println(splittedString[0]);
			System.out.println(splittedString[1]);
			// trim means that white space before life  will remove or it we want to remove any character we can remove 
			System.out.println(splittedString[1].trim());
			//for(int i=0; i<s.length(); i++)
			{ 
				//System.out.println(s.charAt(i));
			}
			
			for(int i = s.length()-1; i>=0; i-- )
			{
				System.out.println(s.charAt(i));
			}
	}

}
