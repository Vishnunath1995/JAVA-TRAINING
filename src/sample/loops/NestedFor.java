package sample.loops;

public class NestedFor {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			System.out.println("Entery Loop " +i);
			for(int j=0;j<=i;j++)
				//System.out.println("\n");
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	

}
