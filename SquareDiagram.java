
public class SquareDiagram {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=10;j++)
			{
				
				if((i==1)||(i==5)||(j==1)||(j==10))
				{
					
				    System.out.print("*");
					
				}
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
			
		}
}


