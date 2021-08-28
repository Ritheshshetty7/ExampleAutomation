package reflection5;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.sgtesting.reflection5.Sample");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
