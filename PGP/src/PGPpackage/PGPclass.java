package PGPpackage;
import java.io.IOException; // импортируемые библиотеки
//import java.io.*;

//import java.io.InputStreamReader; 
//import javax.swing.*;
//import java.util.InputMismatchException;
//import java.util.Locale;
//import java.util.Locale;
import java.util.Scanner;

public class PGPclass {  //открытый класс PGPclass
	 
	//public static final Object Sum = null;
	// метод main Ц точка начала выполнени€ программы
	public static void main(String[] args) throws IOException, Exception 
	{ 
 
		Scanner sc = new Scanner(System.in); // класс дл€ ввода информации
       // sc.useLocale(Locale.ENGLISH); // ввод точки вместо зап€той дл€ вещественных чисел
		
        String Ley = ""; //sc.nextLine();
    
		
        try // проверка выполнени€ кода
        {        	
		System.out.print("¬ведите текст: ");
		// while (sc.hasNext("[A-F]")) {
		 
		Ley = sc.nextLine() ; //  nextInt();
        }
        
        catch(Exception e) // в случае исключени€
		{   
    		//if (Ley == "*") {
           //     throw new Exception("„исло х должно быть меньше 30");
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
 
     // создание экземпл€ра класса PGPs
        PGPs s = new PGPs(Ley);
		
		System.out.println("--------------------------------");
		System.out.println(" оличество символов в тексте: " + s.Sum);

    	sc.close(); // освобождение ресурсов
}
}
 
	 



