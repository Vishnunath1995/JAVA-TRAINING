package sample.loops;

public class Samplewhile {
	
	public static void main(String args[])
	{
		String name ="vishnunath";
		int i=0;
		
		int namelength = name.length();
		
		System.out.println("length of the name " + namelength);
		
		for( i=0;i<namelength-1;i++)
		{
			System.out.println(name.charAt(i));
			
			
				
				boolean contains = name.equals("vishnunh");
				System.out.println(contains);
				
			
			}
		//	int temp=i;
			
			while(name.endsWith("nath"))
			{
				System.out.println(name.lastIndexOf("h"));
				break;
			}
			
			
			
			
		}
		
	}




