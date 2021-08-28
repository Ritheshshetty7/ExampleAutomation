package reflection1;

import java.lang.reflect.Method;

public class SampleDemo {
	public static void main(String[] args) {
		
		try
		{
			Sample obj=new Sample();
			
			Method method[]=obj.getClass().getMethods();
			
			for(int i=0;i<method.length;i++)
			{
				String name=method[i].getName();
				System.out.println(name);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
