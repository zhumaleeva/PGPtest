package PGPpackage;
import java.io.IOException; // ������������� ����������
//import java.io.*;

//import java.io.InputStreamReader; 
//import javax.swing.*;
//import java.util.InputMismatchException;
//import java.util.Locale;
//import java.util.Locale;
import java.util.Scanner;

public class PGPclass {  //�������� ����� PGPclass
	 
	//public static final Object Sum = null;
	// ����� main � ����� ������ ���������� ���������
	public static void main(String[] args) throws IOException, Exception 
	{ 
 
		Scanner sc = new Scanner(System.in); // ����� ��� ����� ����������
       // sc.useLocale(Locale.ENGLISH); // ���� ����� ������ ������� ��� ������������ �����
		
        String Ley = ""; //sc.nextLine();
    
		
        try // �������� ���������� ����
        {        	
		System.out.print("������� �����: ");
		// while (sc.hasNext("[A-F]")) {
		 
		Ley = sc.nextLine() ; //  nextInt();
        }
        
        catch(Exception e) // � ������ ����������
		{   
    		//if (Ley == "*") {
           //     throw new Exception("����� � ������ ���� ������ 30");
    		//}
    		
        	//System.out.print(e.getMessage());
   			System.out.println("Incorrect format!");
    		sc.close();
   			//return ;	
        	
   		}
    		
    	/*	//Ley = sc.nextLine() ;
    		Ley = sc.hasNext('*') ;
    		System.out.println("Invalid input. Please, try again.");
			sc.close();
		
		    return ;
		    */  
	  

        //PGPbl q = new PGPbl(Ley);
       // Sum = Ley.length();
 
     // �������� ���������� ������ PGPs
        PGPs s = new PGPs(Ley);
		
		System.out.println("--------------------------------");
		System.out.println("���������� �������� � ������: " + s.Sum);

    	sc.close(); // ������������ ��������
}
}
 
	 



