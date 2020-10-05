package kata;
import static kata.FooBarQixUtils.*;
public class FooBarQix {
	
	public static  String getFooBarQix(int nbr)
	{
		String resultDivisible =divisibleByFooBarQix(nbr);
		String resultContains = containsFooBarQix(nbr);
		int nbrZero = nbrZeroInString(String.valueOf(nbr));
		if(resultDivisible.isBlank() && resultContains.isBlank())
		{
			return replaceZeroWithStar(nbr);
		}
		return resultDivisible.concat(getStarusedNbrZero(nbrZero)).concat(resultContains);
	}

	private static String divisibleByFooBarQix(int nbr)
	{
		String result="";
		
		if(nbr % 3 == 0)
		{
			result +="Foo";
		}
		if(nbr % 5 == 0)
		{
			result +="Bar";
		}
		if(nbr % 7 == 0)
		{
			result += "Qix";
		}
		return result;
	}
	private static String containsFooBarQix(int nbr)
	{
		String result="";
		String str = String.valueOf(nbr);
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i)== '3')
			{
				result+="Foo";
			}else if(str.charAt(i)== '5')
			{
				result+="Bar";
			}else if(str.charAt(i)== '7')
			{
				result+="Qix";
			}
		}
		return result;
	}
	
	
}
