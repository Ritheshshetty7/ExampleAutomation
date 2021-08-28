package reflection3;

public class StringDemo1 {

		
	public static void strLength()
	{
		String s="Program";
		int val=s.length();
		System.out.println("# of Chars :"+val);
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void verifyEmpty()
	{
		String s=new String();
		boolean val=s.isEmpty();
		System.out.println("The given String is Empty/blank :"+val);
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void charAtStr()
	{
		String s="PROGRAM";
		char ch=s.charAt(2);
		System.out.println("The Char is :"+ch);
		System.out.println("+++++++++++++++++++++++++++");
	}

	public static void lowerStr()
	{
		String s="PROGRAM";
		System.out.println("Result :"+s.toLowerCase());
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void upperStr()
	{
		String s="program";
		System.out.println("Result :"+s.toUpperCase());
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void compareStr1()
	{
		String s1="JavaScript";
		String s2="javascript";
		System.out.println("s1 and s2 are Equal :"+(s1.equals(s2)));
		System.out.println("s1 and s2 are Equal :"+(s1.equalsIgnoreCase(s2)));
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void compareStr2()
	{
		String s1="JavaScript";
		String s2="javascript";
		System.out.println("s1 and s2 are Equal :"+(s1.compareTo(s2)));
		System.out.println("s1 and s2 are Equal :"+(s1.compareToIgnoreCase(s2)));
		System.out.println("+++++++++++++++++++++++++++");
	} 
	
	public static void existanceOfString()
	{
		String s="Mango is a king of Fruits";
		System.out.println("Wether String starts with 'Mango' :"+s.startsWith("Mango"));
		System.out.println("Wether String contains 'king' :"+s.contains("king"));
		System.out.println("Wether String ends with 'Fruits' :"+s.endsWith("Fruits"));
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void replaceStr()
	{
		String s="Mango is a king of Fruits";
		System.out.println("Replaced Result :"+s.replace("is", "was"));
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void splitStr()
	{
		String s="Apple,Mango,Banana,Orange";
		String s1[]=s.split(",");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void findPosition()
	{
		String s="xxaxxaxxaXXAXXA";
		System.out.println("Position 1:"+s.indexOf('A'));
		System.out.println("Position New :"+s.indexOf('A', 12));
		System.out.println("Position 2:"+s.lastIndexOf('A'));
		System.out.println("+++++++++++++++++++++++++++");
		
	}
	
	public static void convertToString()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);
		
		boolean val=true;
		String s2=String.valueOf(val);
		System.out.println(s2);
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void getCharArray()
	{
		String s="Programming";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public static void trimStr()
	{
		String s="   Java    ";
		System.out.println("Before trim, # of Chars :"+s.length());
		System.out.println("After trim, # of Chars :"+s.trim().length());
		System.out.println("+++++++++++++++++++++++++++");
	}
}
