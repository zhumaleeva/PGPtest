package PGPpackage;
import java.io.IOException; // ������������� ����������
import java.util.Scanner;

public class PGPclass {  //�������� ����� PGPclass

	public static void main(String[] args) throws IOException, Exception 
	{ 	 
		Scanner sc = new Scanner(System.in); // ����� ��� ����� ����������
       	 String Ley = ""; //sc.nextLine(); 
      try
      {        	
    	  System.out.print("������� �����: "); 
  		Ley = sc.nextLine() ; 
      }
      
      catch(Exception e) // � ������ ����������
		{   
          System.out.println("Incorrect format!");
  		sc.close();      	
 		}
  		
  		
      // �������� ���������� ������ PGPs
      PGPs s = new PGPs(Ley);
		
		System.out.println("--------------------------------");
		System.out.println("���������� �������� � ������: " + s.Sum);

  	   sc.close(); // ������������ ��������
  		}
}
 
	 
	 
