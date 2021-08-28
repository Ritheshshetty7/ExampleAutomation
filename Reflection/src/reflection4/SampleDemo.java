package reflection4;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		
		try
		{
			Class strParam[]=new Class[1];
			strParam[0]=String.class;
			
			Method m1=obj.getClass().getMethod("displayFirstName", strParam);
			m1.invoke(obj, new String("Santosh"));
			
			Class intParam[]=new Class[1];
			intParam[0]=Integer.TYPE;
			Method m2=obj.getClass().getMethod("showAge", intParam);
			m2.invoke(obj, 17);
			
			
			Class strParams[]=new Class[2];
			strParams[0]=String.class;
			strParams[1]=String.class;
			Method m3=obj.getClass().getMethod("displayAddress", strParams);
			m3.invoke(obj, new String("Bangalore"),new String("Karnataka"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
