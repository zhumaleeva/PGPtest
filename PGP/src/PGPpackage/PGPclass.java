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
	// ������ ������
	JPanel windowContent= new JPanel();
	 // ����� �������� ����������� ��� ���� ������
	FlowLayout fl = new FlowLayout();
	 windowContent.setLayout(fl);
	 // ������ ���������� � ������
	JLabel label = new JLabel("�����:");
	 JTextArea area = new JTextArea(20, 50);
	 JButton go = new JButton("������� ��������");
	 JLabel otvet = new JLabel("");
	 go.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// otvet.setText("12345");
        	// ��� ������� � ����� ������ ���������� ���������� ActionListener � ���������� ������ actionPerformed �� ������������ ��� ������� ������ � �������� ������ ������� 
        	//	if (area.getText().trim().length()<>=0) 
        		//�������� ��������� ������� �� ������� ��������� �������� 
        	//	{ 
        	// otvet.setText ("���������� ��������: "+ area.getText().length()) ; 
        		//������������ ������� �������� � ���������� ���� ��������� � ��������� ������� � ������� �� ���������� � ��������� ���� JTextField 
        	//	} 
        	//	else {tf. setText ("������: �� �� ����� �����!"); 
        		// � ������ ���� �� ������� ������� � ��������� ������� ��������� ���������: �������: �� �� ����� �����!� 
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
			//JOptionPane.showMessageDialog(null, "������� �����","��������������",JOptionPane.WARNING_MESSAGE);
			
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
        	 otvet.setText("� ������ "+Y+" ��������"); 
        	 }
         }
     });
	*/
	
     /*
	 // ��������� ���������� �� ������
	windowContent.add(label);
	 windowContent.add(area);
	 windowContent.add(go);
	 windowContent.add(otvet);
	 // ������ ����� � ����� ��� ���� ������
	 JFrame frame = new JFrame("������� ��������");
	 frame.setContentPane(windowContent);
	 // ����� � ������ � ������ ����� �������
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
        System.out.println("������� �����");  
            str = br.readLine();            
            for(int i=0; i < str.length(); i++){ 
            	summChar++;
            	if (str.charAt(i)== ' ') 
            	{
            	 Summc++;      		
				}
            }
     b = summChar-Summc;
     System.out.println("� ������ " + str+ " " +   b+" �������(��)");
	}  
}
*/ 
	 
	 



