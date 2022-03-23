package Assignment1;
import java.io.*;
import java.util.*;


public class Menu4
{
	public void Menu4()
	{
		 int flag=-1;
		 do 
		 {
			 System.out.println("\n Menu");
			 System.out.printf("\n1. retrive files  \n2. file menu  \n3. Exit \n");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("\nEnter option");
			 flag = sc.nextInt();
			 switch(flag)
			 {
			 case 1:
			 System.out.println("\nEnter name of Directory");
			 String direc=sc.nextLine();
			 direc.toLowerCase();
			 ListFiles(direc);

			 break;
			 case 2:
			 Options2 lf=new Options2();
			 lf.Options2();
			 break;
			 default:

			  System.out.println("Thank You");
		 }
	}while (flag!=3);
	}
		 static void ListFiles(String direc)
		 {
		 File dir = new File(direc);
		         File[] files = dir.listFiles();

		  if (files != null && files.length > 0) 
		  {
		      for (File file : files) 
		      {
		       // Check if the file is a directory
		         if (file.isDirectory()) 
		         {
		            System.out.println(file.getAbsolutePath());
		         } else 
		         {
		           // We can use .length() to get the file size
		           System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
		         }
		       }
		 }
		 else
		 {
		 System.out.println("The Directory is not found");
		 }
		 }

}
