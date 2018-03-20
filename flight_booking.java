import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

class project2
{
 static void cities()
 {
  System.out.println("CITIES:");
  System.out.println("\t1.Bangalore\n\n\t2.Chennai\n\n\t3.Hyderabad\n\n\t4.Kolkata\n\n\t5.Delhi\n\n\t6.Mumbai\n\n\t7.Trivendrum\n\n\t8.Nagpur\n\n");
 }

 static void flighttimings(int h)
 {
  h=h%5;
  if(h==1)
  {
   System.out.println("S.No.  Flight.no.	Available flights       Departure	Arrival		 Duration	  Price");
   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("1.     1165S78		Spicejet                 09:30		 11:05		 1 h 35 m	  2506");
   System.out.println("2.     163A256		AirIndia                 13:25		 14:55		 1 h 30 m	  2369");
   System.out.println("3.     155I650		Indigo                   17:56		 19:16		 1 h 20 m	  2708");
   System.out.println("4.     16548J3	        Jetairways               19:45		 21:30		 1 h 45 m	  3256");
   System.out.println();
  }
  if(h==2)
  {
   System.out.println("S.No.  Flight.no.	Available flights       Departure	Arrival		 Duration	  Price");
   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("1.     1785S79		Spicejet                 09:30		 11:05		 2 h 00 m	  2570");
   System.out.println("2.     163A007		AirIndia                 13:25		 14:55		 2 h 10 m	  2680");
   System.out.println("3.     134I645		Indigo                   17:56		 19:16		 1 h 50 m	  2700");
   System.out.println("4.     10548J4	        Jetairways               19:45		 21:30		 2 h 05 m	  2400");
   System.out.println();
  }
  if(h==3)
  {
   System.out.println("S.No.  Flight.no.	Available flights       Departure	Arrival		 Duration	  Price");
   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("1.     1565S78		Spicejet                 08:45		 10:35		 1 h 50 m	  3100");
   System.out.println("2.     141A625		AirIndia                 14:30		 16:10		 1 h 40 m	  3165");
   System.out.println("3.     155I056		Indigo                   16:45		 19:05		 2 h 20 m	  2986");
   System.out.println("4.     15488J9	        Jetairways               23:45		 01:55		 2 h 10 m	  2875");
   System.out.println();  
  }
  if(h==4)
  {
   System.out.println("S.No.  Flight.no.	Available flights       Departure	Arrival		 Duration	  Price");
   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("1.     1235S76		Spicejet                 10:45		 12:10		 1 h 25 m	  2809");
   System.out.println("2.     174A255		AirIndia                 15:40		 17:10		 1 h 30 m	  2639");
   System.out.println("3.     137I657		Indigo                   16:10		 18:05		 1 h 55 m	  2807");
   System.out.println("4.     11448J5	        Jetairways               21:30		 23:20		 1 h 50 m	  2356");
   System.out.println();
  }
  if(h==0)
  {
   System.out.println("S.No.  Flight.no.	Available flights       Departure	Arrival		 Duration	  Price");
   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("1.     1145S38		Spicejet                 10:30		 12:30		 2 h 00 m	  2006");
   System.out.println("2.     143A756		AirIndia                 14:30		 16:25		 1 h 55 m	  2639");
   System.out.println("3.     135I691		Indigo                   16:10		 17:55		 1 h 45 m	  2750");
   System.out.println("4.     14548J4	        Jetairways               20:56		 22:46		 1 h 50 m	  2856");
   System.out.println();
  }
 }
  
 public static void main(String args[])
 {
  System.out.print("\033[H\033[2J");
  System.out.flush();
  Scanner s=new Scanner(System.in);
  String ch="y";
  String path="flights/",from="",to="",date="",arrival="",departure="",flightno="",duration="",price="",flightname="",choice1="",choice2="",temppath="";
  String dep,arr,dt;
  int num,flag=0;
  System.out.println("\t\t\t ___________________________________________________________________________________");
  System.out.println("\t\t\t|                                                                                   |");
  System.out.println("\t\t\t|                                                                                   |");
  System.out.println("\t\t\t|                    G O O G L E            F L I G H T S                           |");
  System.out.println("\t\t\t|                                                                                   |");
  System.out.println("\t\t\t|___________________________________________________________________________________|");
  System.out.println("\n\n");
  System.out.println("\t\t\t1.Book Ticket\n\n\t\t\t2.Cancel ticket\n\n\t\t\t3.Boarding pass\n\n");
  System.out.printf(" enter your choice : ");
  num=s.nextInt();
  while(num<1){
	System.out.print("invalid choice,try again : ");
  	num=s.nextInt();
  }
  System.out.print("\033[H\033[2J");
  System.out.flush();
  if(num==1)
  { 
   while(ch=="y")
   {
    project2.cities();
    System.out.printf("Select your city of departure : ");
    choice1=s.next();
    switch(choice1)
    {
     case "1":from="Bangalore";break;
     case "2":from="Chennai";break;
     case "3":from="Hyderabad";break;
     case "4":from="Kolkata";break;
     case "5":from="Delhi";break;
     case "6":from="Mumbai";break;
     case "7":from="Trivendrum";break;
     case "8":from="Nagpur";break;
    }
    int h=from.charAt(0);
    System.out.println();
    path=path+from+"-";

    project2.cities();
    System.out.printf("Enter the destination : ");
    choice2=choice1;
    while(choice2.equals(choice1)==true)
    {
     choice2=s.next();
     switch(choice2)
     {
      case "1":to="Bangalore";break;
      case "2":to="Chennai";break;
      case "3":to="Hyderabad";break;
      case "4":to="Kolkata";break;
      case "5":to="Delhi";break;
      case "6":to="Mumbai";break;
      case "7":to="Trivendrum";break;
      case "8":to="Nagpur";break;
     }
      if(choice2.equals(choice1))
         System.err.printf("\nDeparture and Arrival places cannot be same\nchoose the destination correctly : "); 
    }

    h=h+to.charAt(0);
    System.out.println();
    path=path+to+"/";
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Available Dates:");
    System.out.println();
    System.out.println("       November 2017\n  Mon Tue Wed Thu Fri Sat Sun\n                      25  26\n  27  28  29  30");
    System.out.println();
    System.out.println();
    System.out.println("       December 2017\n  Mon Tue Wed Thu Fri Sat Sun\n                  01  02  03\n  04  05  06  07  08  09  10");
    System.out.println("  11  12  13  14  15  16  17\n  18  19  20  21  22  23  24");
    System.out.println();
    System.out.println();
    System.out.printf("Enter the date of journey in dd-mm-yyyy format : ");
    boolean B=false;
    while(B==false)
    {
     date=s.next();
     temppath=path+date;
     File f2=new File(temppath);
     B=f2.isDirectory();
     if(B!=true)
       System.err.printf("choose a date from the available dates in (dd-mm-yyyy) format : ");
    }
    System.out.println();
    path=path+date+"/";
    System.out.print("\033[H\033[2J");
    System.out.flush();
    project2.flighttimings(h);
    System.out.printf("Select a flight : ");
    choice2=s.next();
    switch(choice2)
    {
     case "1":flightname="Spicejet";break;
     case "2":flightname="AirIndia";break;
     case "3":flightname="Indigo";break;
     case "4":flightname="Jetairways";break;
    }
    System.out.println();
    path=path+flightname+".txt";

    try
    {
     File f = new File(path);
 
     String oldContent = "",newContent="",temp="";

     BufferedReader reader = new BufferedReader(new FileReader(f));      /*    storing details of flights    */
     flightno = reader.readLine();
     oldContent = oldContent + flightno + System.lineSeparator();
     departure = reader.readLine();
     oldContent = oldContent + departure + System.lineSeparator();
     arrival = reader.readLine();
     oldContent = oldContent + arrival + System.lineSeparator();
     duration = reader.readLine();
     oldContent = oldContent + duration + System.lineSeparator();
     price = reader.readLine();
     oldContent = oldContent + price + System.lineSeparator();
     String line = reader.readLine();
     temp="";
     int j=0;
     System.out.println("SEAT MATRIX :");
     System.out.println();
     System.out.println(" ________________________________________________________");
     System.out.println("|                                                        |");
     while (j<7) 
     {
        System.out.println(line);
        oldContent = oldContent + line + System.lineSeparator();
        temp = temp + line + System.lineSeparator();
        line = reader.readLine();
        j++;
     }
     while(line!=null)
     {
        oldContent = oldContent + line + System.lineSeparator();
        line = reader.readLine();
     }
      
     int n,i;
     System.out.println();
     System.out.printf("Enter no. of tickets required : ");
     n=s.nextInt();
     System.out.println();
     while(n>5||n<1){
	 System.out.println("Invalid Number of tickets/(limit crossed(>5))");
	 System.out.print("Try Again : ");
	 n=s.nextInt();
     }
     String seat[]=new String[n];
     String pnr[]=new String[n];
     System.out.print("Enter the required seat number : ");
     
     boolean b=true;
     for(i=0;i<n;i++)
     {
      flag=0;
      while(flag==0)
      {
       seat[i]=s.next(); 
       System.out.println();
                 
       if(seat[i].equals("NA")!=true && seat[i].equals("NA ")!=true)
       {
        b = temp.indexOf(seat[i]) >= 0;
        if(b==true)
         {
          flag=1;
         }
        else
         {System.out.print("the selected seat is not available or not present choose another seat : ");}
       }
       else
         System.out.print("the selected seat is not available or not present choose another seat : ");       
     }
                                    
      pnr[i]=from.substring(0,1)+to.substring(0,1)+date.substring(0,5)+flightname.substring(0,1)+seat[i];
      oldContent = oldContent.replaceAll(seat[i],"NA ");
      temp = temp.replaceAll(seat[i],"NA ");
     }
     newContent=oldContent;
     String names[]=new String[n];
     System.out.println("Enter the names of passengers respectively");
     for(i=0;i<n;i++)
     {
      names[i]=s.next();
      newContent=newContent+pnr[i]+"-"+names[i]+System.lineSeparator();
     }
     
      FileWriter writer = new FileWriter(f);

     writer.write(newContent);
     
     reader.close();
     writer.close();
     ch="n";
     int am = Integer.parseInt(price);
     int amount=am*n;
     System.out.println("Total amount is Rs."+amount);
     System.out.println();
     /* payment */
     String ccn,username,/*password*/dcn,ccexp,dcexp,ccvv,dcvv,otp;
		int op;
		Scanner x= new Scanner(System.in);
		System.out.print("\033[H\033[2J");
  		System.out.flush();
		System.out.println("Payment options : ");
		System.out.printf("\t\t1.Credit Card\n\t\t2.Debit Card\n\t\t3.Net Banking\n\n");
		System.out.printf("Choose an option : ");
		op = x.nextInt();
		System.out.print("\033[H\033[2J");
  		System.out.flush();
		System.out.println();
		switch(op)
		{
			case 1: System.out.printf("Enter 16 digit card number : ");
					ccn=x.next();
					System.out.println();
					while(ccn.length()!=16)
					{
						System.out.printf("Invalid card number,Enter card number again : ");
						ccn=x.next();
						System.out.println();
					}
					System.out.printf("Enter expiry date(mm-yy) : ");
					ccexp=x.next();
					System.out.println();
					System.out.printf("Enter CVV : ");
					ccvv=x.next();
					System.out.println();
					while(ccvv.length()!=3)
					{
						System.out.printf("Invalid CVV,Enter CVV again : ");
						ccvv=x.next();
						System.out.println();
					}
					System.out.printf("Enter OTP : ");
					otp=x.next();
					System.out.println();
					
					System.out.print("\033[H\033[2J");
  					System.out.flush();
					System.out.println("Congratulations !! Booking successful ");
					System.out.println();
					
					break;

			case 2: System.out.printf("Enter 16 digit card number : ");
					ccn=x.next();
					System.out.println();
					while(ccn.length()!=16)
					{
						System.out.printf("Invalid card number,Enter card number again : ");
						ccn=x.next();
						System.out.println();
					}
					System.out.printf("Enter expiry date(mm-yy) : ");
					ccexp=x.next();
					System.out.println();
					System.out.printf("Enter CVV : ");
					ccvv=x.next();
					System.out.println();
					while(ccvv.length()!=3)
					{
						System.out.printf("Invalid CVV,Enter CVV again : ");
						ccvv=x.next();
						System.out.println();
					}
					
					System.out.printf("Enter OTP : ");
					otp=x.next();
					System.out.println();
					
					System.out.println("Congratulations !! Booking successful ");
					System.out.println();
					
					break;

			case 3: 
					System.out.printf("\t************* WELCOME   TO   SBI  ONLINE  BANKING **************\n");
					System.out.println();
					String uname = "ram20";
					String pwd = "sbibank";
					System.out.printf("Enter username : ");
					username=x.next();
					System.out.println();
					java.io.Console console = System.console();
					
					String password = new String(console.readPassword("Enter Password: "));
					System.out.println();
					System.out.println();
					int count=1;
		
					System.out.println();
					
					System.out.printf("Enter OTP : ");
					otp=x.next();
					System.out.println();
					
					System.out.println("Congratulations !! Booking successful ");
					System.out.println();
					
					break;
		}   /* end payment */ 
		
      
     /* print ticket */
		System.out.print("\033[H\033[2J");
  		System.out.flush();
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                                                                     ");
		System.out.println("                             A I R        T I C K E T                                ");
		System.out.println("                                                                                     ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                   "+flightname.toUpperCase()+"                                   ");
		System.out.println("                                                                                     ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                                                                     ");
		System.out.println("                                      "+date+"               ");
		System.out.println("                        "+String.format("%-9s",from.toUpperCase())+"    ----------->      "+to.toUpperCase()+"                       ");
		System.out.println("                        "+departure+"      "+duration+"        "+arrival+"                       ");
		System.out.println("                                                                                     ");
		System.out.println("                                                                                     ");
		System.out.println("     Pnr                         Passenger name                 Seat no.             ");
		System.out.println("    ---------------------------------------------------------------------            ");		
		for(i=0;i<n;i++)
                System.out.println("     "+pnr[i]+"                 "+String.format("%-31s",names[i])+seat[i]);
		System.out.println("                                                                                     ");
		System.out.println("  Baggage info :   Check-in: 25 KG, Cabin: 8 KG                                        ");
		System.out.println("                                                                                     ");
		System.out.println("  TIP: The air inside airplane is dry, so drink nonalcoholic beverages               ");
		System.out.println("       Note the PNR Id(s) for future reference                                       ");
		System.out.println("                                                                                     ");
		System.out.println("  Terms and Conditions :                                                             ");
		System.out.println("   1.Check-in counters at all Airports opens 2 hours before departure                ");
		System.out.println("   2.Your carry-on baggage shouldn't weigh more than 8kgs                            ");
		System.out.println("   3.Carry photo identiy, you will need it as proof of identity while checking-in	 ");
		System.out.println("   4.Cancellation charges apply according to date and time of cancellation           ");
		System.out.println("   5.Cancellation amount will be refunded to your bank account with in 3-5 days      ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("		                                                                         ");
		System.out.println("		            H A P P Y                 J O U R N E Y                      ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println();
		System.out.println();
      /* end print */
    }
    catch(IOException e)
    {
     System.out.println();
     System.out.println("enter the names without spelling mistakes");
     System.out.println();
     ch="y";
    }

  }
  }
  if(num==2)
  {
   String pnr1="",path1="flights/";
   System.out.printf("enter your PNR number : ");
   pnr1=s.next();
   System.out.println();
   if(pnr1.length()!=11)
   {
     System.out.println("PNR ID does not exist");
     System.exit(0);
   }
   String fromcity=pnr1.substring(0,1);
   String tocity=pnr1.substring(1,2);
   String date1=pnr1.substring(2,7);
   flightname=pnr1.substring(7,8);
   date1=date1+"-2017";
   String seatno=pnr1.substring(8,11);
   int result=-1;
   try{
	result = Integer.parseInt(seatno.substring(1,3));
   }
   catch(NumberFormatException e){
	System.out.println("PNR ID doesnot exist");
	System.exit(0);
   }
   switch(fromcity)
   {
    case "B":fromcity="Bangalore";break;
    case "C":fromcity="Chennai";break;
    case "M":fromcity="Mumbai";break;
    case "D":fromcity="Delhi";break;
    case "K":fromcity="Kolkata";break;
    case "T":fromcity="Trivendrum";break;
    case "H":fromcity="Hyderabad";break;
    case "N":fromcity="Nagpur";break;
   }
   switch(tocity)
   {
    case "B":tocity="Bangalore";break;
    case "C":tocity="Chennai";break;
    case "M":tocity="Mumbai";break;
    case "D":tocity="Delhi";break;
    case "K":tocity="Kolkata";break;
    case "T":tocity="Trivendrum";break;
    case "H":tocity="Hyderabad";break;
    case "N":tocity="Nagpur";break;
   }
   switch(flightname)
   {
    case "S":flightname="Spicejet";break;
    case "A":flightname="AirIndia";break;
    case "I":flightname="Indigo";break;
    case "J":flightname="Jetairways";break;
   }
   path1=path1+fromcity+"-"+tocity+"/"+date1+"/"+flightname+".txt";
   String newContent1="",oldContent1="";
   try
   {
    File f=new File(path1);
    if(f.isFile()==false){
	System.out.println("PNR Id doesnot exist");
	System.exit(0);
    }                                     /*removing the booked ticket---start*/
    BufferedReader reader = new BufferedReader(new FileReader(f));
    String line1="";
    for(int i=0;i<13;i++)
    {
     line1=reader.readLine();
     oldContent1=oldContent1 + line1 + System.lineSeparator();
    }
    while(line1!=null)
    {
       line1=reader.readLine();
       if(line1==null)
          break;
       if(line1.length()<11)
          continue;
       String sub=line1.substring(0,11);
       if(pnr1.equals(sub)!=true)
       {
        oldContent1=oldContent1 + line1 + System.lineSeparator();
       }
       else
        flag=1;
    }                                                             
     FileWriter writer = new FileWriter(f);
     newContent1=oldContent1;
     writer.write(newContent1);
     
     reader.close();
     writer.close();                   /*end*/
    if(flag==1)
    {                                             
     File f1=new File(path1);                                     /*replacing the ticket number back----start*/
     BufferedReader reader1 = new BufferedReader(new FileReader(f1));                                          
     oldContent1="";newContent1="";
     for(int i=0;i<5;i++)
     {
      line1=reader1.readLine();
      oldContent1=oldContent1 + line1 + System.lineSeparator();
     }
     if(seatno.substring(0,1).equals("R"))
     {
      line1=reader1.readLine();
      if(result>=1 && result<=10)
      {
       String line2=line1.substring(0,8)+line1.substring(8,8+5*(result-1))+seatno+line1.substring(8+5*(result-1)+3);
       oldContent1=oldContent1 + line2 + System.lineSeparator();
      }
      
      if(result>=11 && result<=20)
      {
       oldContent1=oldContent1 + line1 + System.lineSeparator();
       line1=reader1.readLine();
       result=result-10;
       String line2=line1.substring(0,8)+line1.substring(8,8+5*(result-1))+seatno+line1.substring(8+5*(result-1)+3);
       oldContent1=oldContent1 + line2 + System.lineSeparator();
      }
     }
     if(seatno.substring(0,1).equals("L"))
     {
        for(int i=0;i<3;i++)
        {
         line1=reader1.readLine();
         oldContent1=oldContent1 + line1 + System.lineSeparator();
        }
        line1=reader1.readLine();
        if(result>=1 && result<=10)
        {
         String line2=line1.substring(0,8)+line1.substring(8,8+5*(result-1))+seatno+line1.substring(8+5*(result-1)+3);
         oldContent1=oldContent1 + line2 + System.lineSeparator();
        }

        if(result>=11 && result<=20)
        {
         oldContent1=oldContent1 + line1 + System.lineSeparator();
         line1=reader1.readLine();
         result=result-10;
         String line2=line1.substring(0,8)+line1.substring(8,8+5*(result-1))+seatno+line1.substring(8+5*(result-1)+3);
         oldContent1=oldContent1 + line2 + System.lineSeparator();
        }
     }
      
     line1=reader1.readLine();
     while(line1!=null)
     {
      oldContent1=oldContent1 + line1 + System.lineSeparator();
      line1=reader1.readLine();
     }
     FileWriter writer1 = new FileWriter(f1);
     newContent1=oldContent1;
     writer1.write(newContent1);
     reader1.close();
     writer1.close();
     System.out.print("Your ticket has been cancelled\n\n");
     System.out.print("Your money will be credited to your account shortly\n\n"); 
    }                                              /*end*/
    else
      {System.out.println("PNR id does not exist");} 
   }
   catch(IOException e)
   {
    System.out.println(e);
   }
   catch(NullPointerException e)
   {
    System.out.println(e);
   }
  }
  if(num==3)
  {
   String pnr1="",path1="flights/";
   System.out.printf("enter your PNR number : ");
   pnr1=s.next();
   if(pnr1.length()!=11)
   {
     System.out.println("PNR ID does not exist");
     System.exit(0);
   }
   String fromcity=pnr1.substring(0,1);
   String tocity=pnr1.substring(1,2);
   String date1=pnr1.substring(2,7);
   flightname=pnr1.substring(7,8);
   date1=date1+"-2017";
   String seatno=pnr1.substring(8,11);
   int result=-1;
   try{
	result = Integer.parseInt(seatno.substring(1,3));
   }
   catch(NumberFormatException e){
	System.out.println("PNR ID doesnot exist");
        System.exit(0);
   }
   switch(fromcity)
   {
    case "B":fromcity="Bangalore";break;
    case "C":fromcity="Chennai";break;
    case "M":fromcity="Mumbai";break;
    case "D":fromcity="Delhi";break;
    case "K":fromcity="Kolkata";break;
    case "T":fromcity="Trivendrum";break;
    case "H":fromcity="Hyderabad";break;
    case "N":fromcity="Nagpur";break;
   }
   switch(tocity)
   {
    case "B":tocity="Bangalore";break;
    case "C":tocity="Chennai";break;
    case "M":tocity="Mumbai";break;
    case "D":tocity="Delhi";break;
    case "K":tocity="Kolkata";break;
    case "T":tocity="Trivendrum";break;
    case "H":tocity="Hyderabad";break;
    case "N":tocity="Nagpur";break;
   }
   switch(flightname)
   {
    case "S":flightname="Spicejet";break;
    case "A":flightname="AirIndia";break;
    case "I":flightname="Indigo";break;
    case "J":flightname="Jetairways";break;
   }
    path1=path1+fromcity+"-"+tocity+"/"+date1+"/"+flightname+".txt";
   String name="",oldContent1="";
   try
   {
    File f=new File(path1);
    if(f.isFile()==false){
	System.out.println("PNR Id doesnot exist");
	System.exit(0);
    }                                         /*removing the booked ticket---start*/
    BufferedReader reader = new BufferedReader(new FileReader(f));
    String line1="";
    flightno = reader.readLine();
     departure = reader.readLine();
 
     arrival = reader.readLine();

     duration = reader.readLine();
     
     price = reader.readLine();
    String lin1="";
    for(int i=0;i<8;i++)
    {
     line1=reader.readLine();
    }
    while(line1!=null)
    {
       line1=reader.readLine();
       if(line1==null)
          break;
       if(line1.length()<11)
          continue;
       String sub=line1.substring(0,11);
       if(pnr1.equals(sub)==true)
       {
        name=line1.substring(12);
        flag=1;
        break;
       }
    } 
  }
  catch(IOException e)
   {
    System.out.println(e);
   }
    if(flag==1)
    {   
      System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                                                                     ");
		System.out.println("                             B O A R D I N G      P A S S                                ");
		System.out.println("                                                                                     ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                   "+flightname.toUpperCase()+"                                   ");
		System.out.println("                                                                                     ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("                                                                                     ");
		System.out.println("                                      "+date1+"               ");
		System.out.println("                                                                                     ");
		System.out.println("                        "+String.format("%-9s",fromcity.toUpperCase())+"    ----------->      "+tocity.toUpperCase()+"                       ");
		System.out.println("                        "+departure+"      "+duration+"        "+arrival+"                       ");
		System.out.println("                                                                                     ");
		System.out.println("                                                                                     ");
		System.out.println("     Pnr                         Passenger name                 Seat no.             ");		
                System.out.println("     "+pnr1+"                 "+String.format("%-31s",name)+seatno);
		System.out.println("                                                                                     ");
		System.out.println("  Baggage info :    Check-in: 25 KG, Cabin: 8 KG                                        ");
		System.out.println("                                                                                     ");
		System.out.println("  TIP: The air inside airplane is dry, so drink nonalcoholic beverages               ");
		System.out.println("                                                                                     ");
		System.out.println("  Terms and Conditions :                                                             ");
		System.out.println("   1.Check-in counters at all Airports opens 2 hours before departure                ");
		System.out.println("   2.Your carry-on baggage shouldn't weigh more than 8kgs                            ");
		System.out.println("   3.Carry photo identiy, you will need it as proof of identity while checking-in	 ");
		System.out.println("   4.Cancellation charges apply according to date and time of cancellation           ");
		System.out.println("   5.Cancellation amount will be refunded to your bank account with in 3-5 days      ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println("		                                                                         ");
		System.out.println("		            H A P P Y                 J O U R N E Y                      ");
		System.out.println("  ___________________________________________________________________________________");
		System.out.println();
		System.out.println();   
    }
    else
      System.out.println("PNR ID does not exist");
  }  
 }
}

  
  
  
  
  
  

