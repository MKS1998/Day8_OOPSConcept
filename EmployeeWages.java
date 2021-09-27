import java.util.*;
import java.util.Random;


public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		Attendance();
}		
public static void Attendance()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 



/* UC2_Calculate Employee Daily Wages  */



import java.util.Random;
import java.util.*;
public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int FullDayHour = 8;
	int TotalWages = 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * FullDayHour;
		System.out.println("Daily Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

}


/*  Calculate Employee Part Time Wages  */



import java.util.Random;
import java.util.*;


public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int PartTimeHour = 4;
	int FullDayHour = 8;
	int TotalWages = 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * PartTimeHour;
		System.out.println("Daily PartTime Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 
