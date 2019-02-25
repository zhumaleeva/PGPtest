package PGPpackage;
import java.io.IOException; // импортируемые библиотеки
import java.util.Scanner;

public class PGPclass {  //открытый класс PGPclass

	public static void main(String[] args) throws IOException, Exception 
	{ 	 
		Scanner sc = new Scanner(System.in); // класс для ввода информации
       	 String Ley = ""; //sc.nextLine(); 
      try
      {        	
    	  System.out.print("Введите текст: "); 
  		Ley = sc.nextLine() ; 
      }
      
      catch(Exception e) // в случае исключения
		{   
          System.out.println("Incorrect format!");
  		sc.close();      	
 		}
  		
  		
      // создание экземпляра класса PGPs
      PGPs s = new PGPs(Ley);
		
		System.out.println("--------------------------------");
		System.out.println("Количество символов в тексте: " + s.Sum);

  	   sc.close(); // освобождение ресурсов
  		}
}
 
	 
	 
