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

/* UC4_Calculate Employee Wages Using Switch Case



import java.util.Random;
import java.util.Scanner;


public class EmployeeWages{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Dhoni();
        }
        static void Dhoni(){
                Scanner in = new Scanner(System.in);
                int PartTimeHour = 4;
                int RatePerHour = 20;
                int FullDayHour = 8;
                int Day = 0 ;
                Random rn = new Random ();
                int rand =rn.nextInt(3);
                        switch(rand){
                                        case 1:
                                                System.out.println("IT's Full Time Wages: ");
                                                System.out.println("Enter NUmber Of Working Day's: ");
                                                Day = in.nextInt();
                                                int FullTimeWages = RatePerHour * (FullDayHour * Day);
                                                System.out.println("FullTimeWages for " + Day +" Days: " + "Rs." + FullTimeWages);
                                                break;
                        								
                                         case 2:
                                                System.out.println("IT's Part Time Wages: ");
                                                System.out.println("Enter Number Of Working Day's: ");
                                                Day = in.nextInt();
                                                int PartTimeWages = Day * PartTimeHour * FullDayHour;
                                                System.out.println("PartTimeWages for " + Day +" days: " + "Rs." + PartTimeWages);
                                                break;
                                        default:
                                                System.out.println("Employee is Absent..........!");
                                                break;
                                     }
                        in.close();
        }
        }


/*  UC5_Calculate Employee Wages for Month */



import java.util.Random;
import java.util.*;


public class EmployeeWages{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Dhoni();
        }

        	static void Dhoni(){
        				int TotalWorkingHour = 8 ;
					int TotalWorkingDay  = 20 ;
					int RatePerHour = 20 ;
					int IsPartTime = 2 ;			
					int IsFullTime = 1 ;				
					int RatePerhour = 4 ;	
					

					Random rn = new Random();
					int rand = rn.nextInt(3);
					if (rand == 0)
					{
						System.out.println("----------This is Full time Work in Month---------");
						int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour ;
						System.out.println("Total Employee Wages is: " + TotaEmployeeWage);										
					}
					else if (rand == 0)
					{
						System.out.println("-------This is Part Time Work in Month--------");
						int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerhour;
						System.out.println("Total Employee Wages is: "+ TotaEmployeeWage);
					}
					else 
					{
						System.out.println("----Employee is Absent------");
					}
					
		

			   }


}


/* UC6_Calculate Employee Wages Till Condition  */


import java.util.Random;
import java.util.*;


public class EmployeeWages{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Dhoni();
        }

        	static void Dhoni(){
        				int TotalWorkingHour = 8 ;
					int TotalWorkingDay  = 20 ;
					int RatePerHour = 20 ;
					int IsPartTime = 2 ;			
					int IsFullTime = 1 ;				
					int RatePerhour = 4 ;	
					

					Random rn = new Random();
					int rand = rn.nextInt(3);
					if (rand == 0)
					{
						System.out.println("----------This is Full time Work in Month---------");
						int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerHour ;
						System.out.println("Total Employee Wages is: " + TotaEmployeeWage);										
					}
					else if (rand == 0)
					{
						System.out.println("-------This is Part Time Work in Month--------");
						int TotaEmployeeWage = TotalWorkingHour * TotalWorkingDay * RatePerhour;
						System.out.println("Total Employee Wages is: "+ TotaEmployeeWage);
					}
					else 
					{
						System.out.println("----Employee is Absent------");
					}
					
		

			   }


}



 
