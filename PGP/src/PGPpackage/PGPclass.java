package PGPpackage;
//import java.io.BufferedReader; 
import java.io.IOException; 
//import java.io.InputStreamReader; 

import javax.swing.*;
/*
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/
import java.util.InputMismatchException;
import java.util.Locale;
//import java.util.Locale;
import java.util.Scanner;

public class PGPclass {  //

	public static final Object Sum = null;

	public static void main(String[] args) throws  NumberFormatException,IOException { 
	/*
	// Создаём панель
	JPanel windowContent= new JPanel();
	 // Задаём менеджер отображения для этой панели
	FlowLayout fl = new FlowLayout();
	 windowContent.setLayout(fl);
	 // Создаём компоненты в памяти
	JLabel label = new JLabel("Текст:");
	 JTextArea area = new JTextArea(20, 50);
	 JButton go = new JButton("Подсчет символов");
	 JLabel otvet = new JLabel("");
	 go.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// otvet.setText("12345");
        	// При наличии в нашем классе приложения реализации ActionListener и перегрузки метода actionPerformed мы обрабатываем все события кнопки в пределах нашего апплета 
        	//	if (area.getText().trim().length()<>=0) 
        		//проверка текстовой области на наличие введенных символов 
        	//	{ 
        	// otvet.setText ("Количество символов: "+ area.getText().length()) ; 
        		//производится подсчет символов и количества слов введенных в текстовую область и выводит ее результаты в текстовое поле JTextField 
        	//	} 
        	//	else {tf. setText ("ОШИБКА: Вы не ввели текст!"); 
        		// в случае если не введены символы в текстовую область выводится сообщение: «ОШИБКА: Вы не ввели текст!» 
        	//	}
     
      */  	 
		Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
		 
        
        	// String str; 
        	 String Ley = ""; //sc.nextLine();
			//int Ley = 0;
        	 //int Probel = 0;
        	// int Y = 0;
        	 
        	 //int Sum = 0;       
   	 
        try
        {        	
		System.out.print("Vvedite text: ");
		Ley = sc.nextLine() ; //  nextInt();
        }
        
    	catch(InputMismatchException e)
		{
			//JOptionPane.showMessageDialog(null, "Введите текст","Предупреждение",JOptionPane.WARNING_MESSAGE);
			
    		//JOptionPane.getMessage ;
    		Ley = sc.nextLine() ;
    		
    		System.out.println("Invalid input. Please, try again.");
			sc.close();
		
		    return;
			 
		}    
	


      


        //PGPbl q = new PGPbl(Ley);
       // Sum = Ley.length();
 
   
   	
   	    PGPs s = new PGPs(Ley);
   	 
		System.out.println("--------------------------------");
		System.out.println("Kolichestvo simvolov: " + s.Sum);
		
		//+ String.format(new Locale("ru"), "%(.2f", q.Sum) + " rub.");
		//System.out.println("Error: " + String.format(new Locale("ru"), Sum));
		//System.out.println("Total amount: " + String.format(new Locale("ru"), "%(.2f", fc.TotalSum) + " rub.");
		
		sc.close();

    

  



      /*  
        	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        	 str = area.getText(); 
        	 if(str.length() != 0){
        	 for(int i=0;i<str.length();i++){ 	
        	 Ley++; 
        	 if (str.charAt(i) == '\n'){
        	 	Probel++;
        	 }
        	 if (str.charAt(i) == ' '){
         	 	Probel++;
         	 }} 
        	 Y=Ley-Probel;
        	 otvet.setText("В тексте "+Y+" символов"); 
        	 }
         }
     });
	*/
	
     /*
	 // Добавляем компоненты на панель
	windowContent.add(label);
	 windowContent.add(area);
	 windowContent.add(go);
	 windowContent.add(otvet);
	 // Создаём фрейм и задаём для него панель
	 JFrame frame = new JFrame("Подсчет символов");
	 frame.setContentPane(windowContent);
	 // задаём и размер и делаем фрейм видимым
	 frame.setSize(700, 600);
	 frame.setVisible(true);
	 
	 */
	 
}

}


/*
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.*;


public class PGPclass {

	public static void main(String[] args) throws IOException {
		String str;
		int b=0;
        int summChar = 0;
        int Summc=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово");  
            str = br.readLine();            
            for(int i=0; i < str.length(); i++){ 
            	summChar++;
            	if (str.charAt(i)== ' ') 
            	{
            	 Summc++;      		
				}
            }
     b = summChar-Summc;
     System.out.println("В тексте " + str+ " " +   b+" символа(ов)");
	}  
}
*/ 
	 
	 



