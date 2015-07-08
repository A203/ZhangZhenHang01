import java.util.Random;
import java.util.Scanner;


public class DuoWeiShuZu {
	
	public static void main(String[] args)
	{
	int[][] a = new int [20][5];
		
		for(int i=0;i<=19;i++)
		{
			for(int j=0;j<=4;j++)
			{
				int num = (int)(Math.random()*100)+1;
				a[i][j]=num;
			}
		}
		//输出数组
		/*for(int i=0;i<=19;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//学生总分
		int[] b=new int [20];
		int sum = 0;
		for(int i=0;i<=19;i++)
		{
			for(int j=0;j<=4;j++)
			{
				sum=sum+a[i][j];
			}
			b[i]=sum;
			sum=0;
		}
		
		//平均分
		int[] c=new int[5];
		int zong = 0;
		for(int j=0;j<=4;j++)
		{
			for(int i=0;i<=19;i++)
			{
				zong=zong+a[i][j];
			}
			zong=zong/a.length;
			c[j]=zong;
			zong=0;
		}
		System.out.println(c[0]);
		
		Scanner scanner=new Scanner(System.in);
		String lessonString=scanner.nextLine();
		int l=5;
		switch(lessonString.toLowerCase())
		{
		case"coreC++":l=0;break;
		case"coreJava":l=1;break;
		case"Servlet":l=2;break;
		case"JSP":l=3;break;
		case"EJB":l=4;break;
		
		default:l=5;
		
		}
		if(l==5)
		{
			System.out.println("无效输入");
		}
		else 
		{
			System.out.println(l);
			System.out.println(c[l]);
		}
		System.out.println(l);
		//System.out.println(c[0]);
	}
}
