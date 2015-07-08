
public class Demo6 {
	
	public static void main(String[] args){
		
		//for(int i=1;i<=99;i++){
		//	if(i%5==0)
		//	{
		//		System.out.println(i);
		//		break;
		//	}
		//}
		
		//int num=0;
		//for(int i=1;i<=99;i++){
		//	if(i%5==0)
		//	{
		//		System.out.println(i);
		//		continue;
		//	}
		//	num++;
		//}
		//System.out.println("num"+num);
		int n = 0;
		for(int i= 1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j!=0)
				{
					n=n+1;
				}
			}
			
			if(n==(i-2))
			{
				System.out.println(i);
			}
			n=0;
		}
		
	}

}
