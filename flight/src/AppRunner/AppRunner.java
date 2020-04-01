package AppRunner;
import java.util.*;

import exceptionPackage.DaoException;
import exceptionPackage.ServiceException;
import service.Service;
import service.ServiceImpl;
public class AppRunner {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Service service=new ServiceImpl();
		int flightId=0;
		double ticketCost=0;
		String flightName="";
		int personId=0;
		String personName="";
		double accountBal=0;
		System.out.println("WELCOME TO FLIGHT BOOKING SYSTEM");
		boolean flag=true;
		do
		{
			System.out.println("choose the option \n 1. insert flight \n 2. insert person details \n 3. assign flight to a person \n 4. display all flight \n 5. show person \n 6.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the flight id");
				sc.nextLine();
				flightId=sc.nextInt();
				System.out.println("enter the flight name");
				sc.nextLine();
				flightName=sc.nextLine();
				System.out.println("enter the cost");
				ticketCost=sc.nextDouble();
				try
				{
					service.addToFlight(flightId,flightName,ticketCost);
				}catch(ServiceException e)
				{
					System.out.println(e.getMessage());
					
				}
				break;
			case 2:
				System.out.println("enter person id");
				sc.nextLine();
				personId=sc.nextInt();
				System.out.println("enter the person name");
				sc.nextLine();
				personName=sc.nextLine();
				System.out.println("enter the account balance");
				accountBal=sc.nextDouble();
				try
				{
					service.addToPerson(personId,personName,accountBal);
				}catch(DaoException|ServiceException e)
				{
					System.out.println(e.getMessage());
					
				}
				break;
			case 3:
				System.out.println("enter the flight name");
				sc.nextLine();
				flightName=sc.nextLine();
				System.out.println("enter the person name");
				personName=sc.nextLine();
				try
				{
					service.assignFlight(flightName,personName);
				}catch(ServiceException e1)
				{
					System.out.println(e1.getMessage());
				}
				break;
			case 4:
				try
				{
					service.flightDetails();
				}catch(ServiceException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try
				{
					service.showPerson();
					
				}catch(ServiceException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				flag=false;
				break;
			}
			
		}while(flag);

	}

}
