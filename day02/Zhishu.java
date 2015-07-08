import java.util.Scanner;


public class Demo4 {
	//public enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	
	public static void main(String[] args){
		
		/*Scanner scanner=new Scanner(System.in);
		int day=scanner.nextInt();
		String monthString="";
		switch(day)
		{
		case 1:monthString="monday";break;
		case 2:monthString="tuesday";break;
		case 3:monthString="wednesday";break;
		case 4:monthString="thursday";break;
		case 5:monthString="friday";break;
		case 6:monthString="saturday";break;
		case 7:monthString="sunday";break;
		default:monthString="error day";
		}
		System.out.println(monthString);*/
		
		Scanner scanner=new Scanner(System.in);
		String dayString = scanner.nextLine();
		int day = 0;
		switch(dayString.toLowerCase()){
		case "monday":day=1;break;
		case "tuesday":day=2;break;
		case "wednesday":day=3;break;
		case "thursday":day=4;break;
		case "friday":day=5;break;
		case "saturday":day=6;break;
		case "sunday":day=7;break;
		
		default:day=0;
		
		}
		if(day==0)
		{
			System.out.println("Œﬁ–ß ‰»Î");
		}
		else
		{
			System.out.println(day);
		}
		
		
		/*int intDay=0;
		day day1=day.wednesday;
		switch(day1)
		{
		case monday: intDay = 1;break;
		case tuesday:intDay = 2;break;
		case wednesday:intDay = 3;break;
		case friday:intDay = 4;break;
		case saturday:intDay = 5;break;
		case sunday:intDay = 6;break;
		case thursday:intDay = 7;break;
		
		}
		System.out.println(intDay);*/
	}
}
