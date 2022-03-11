import java.util.Scanner;

public class Main {
	public static String FirstlettlerCapital(String s)
	{
		String s1= (s.substring(0,1)).toUpperCase();
		int i ,n=-1;
		for(i=0;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
			{
				n=i;
			}
		}
		String s2=(s.substring(1,n)).toLowerCase();
		String s3=s.substring(n).toUpperCase();
		String s4= s1+ s2+ " " +s3;
		return s4;
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name :");
		String s=in.nextLine();
		System.out.print(FirstlettlerCapital(s));

	}


}