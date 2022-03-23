package Assignment1;

import java.io.*;
import java.util.*;
public class Options2
{
	public void Options2() {
		int flag=-1;
		do
		{
		 System.out.println("Welcome to File Operations");
	System.out.printf("\n1. Add File \n2. Search File \n3. Delete File  \n4. Exit \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter your option");
		flag = sc.nextInt();
		switch (flag) 
		{

	case 1:
	FileCreate();
	break;
	case 2:
	FileSearch();
	break;
	case 3:
	 FileDelete();
	break;
	
	default :
	           System.out.println("Thank You");
	}
	

}while(flag!=4);
}
	static void FileCreate()
	{
	System.out.println("Enter File Name ");
	Scanner sc = new Scanner(System.in);
	String filename=sc.nextLine().toLowerCase();
	File fa=new File(filename +".txt");

	if(fa!=null)
	{				//add file
		try
		{
		boolean r1=fa.createNewFile();
		System.out.println(r1);
		if(r1)
		{
		System.out.println("Created File Name is  " +fa.getName());
		System.out.println("Created file location is "+fa.getAbsolutePath());
		System.out.println("File is created Succesfully");
		}else
		{
		System.out.println("File already created");
		}
		}
		catch(Exception ex)
		{
		System.out.println("The exception" +ex.getClass());
		System.out.println("The exception occured" +ex.getMessage());
		}}
	}
	
	static void FileSearch()
	{
	System.out.println("Enter File to Search: ");
	Scanner sc=new Scanner(System.in);
	String na1 = sc.nextLine().toLowerCase();
	File filen2 = new File(na1+".txt");
	if(filen2.isFile())
	{
	System.out.println("Searched File Name is  " +filen2.getName());
	System.out.println("Searched file location is "+filen2.getAbsolutePath());
	}
	else
	{
	System.out.println("The file not found");
	}
	}
	
	static void FileDelete()
	{
	//delete file
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the File name:");
	String n1 = sc.nextLine().toLowerCase();
	File filen1 = new File(n1+".txt");
	if (filen1.delete())
	{
	System.out.println("The deleted file "+filen1.getAbsolutePath());
	System.out.println("File deleted successfully");
	} 
	else 
	{
	System.out.println("Failed to delete the File");
	}
	}
}
	
