package kata;

public class FooBarQixUtils {
	
	
	public  static  int nbrZeroInString(String str)
	{
		int sum =0;
		for (int i=0; i< str.length(); i++)
		{
			if (str.charAt(i) == '0')
				sum ++;
		}
		return sum;
	}
	public  static String getStarusedNbrZero(int nbrZero)
	{
		String etoile="";
		
		for (int i= 0 ; i< nbrZero; i++)
			etoile += "*";
		
		return  etoile;
	}
	public static  String replaceZeroWithStar(int nbr)
	{
		String res =String.valueOf(nbr);
		
		return 	res.replaceAll("0","*");
	}
	
}
