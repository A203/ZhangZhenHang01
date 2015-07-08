import java.util.Scanner;


public class Sanjiao {
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞĞÊı");
		int num = input.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
