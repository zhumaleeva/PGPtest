package PGPpackage;

//import javax.swing.*;

public class PGPs { // �������� ����� PGPs
	private String Ley = ""; // �����
	private int Probel = 0; // ���-�� ��������	
	public int Sum; // ����
	
	public PGPs (String Ley) 
	{
		//if (Ley.length() <= 0) //if (Ley == "" || Ley != "*" ) //|| Ley != "0")
		if (Ley == "")
		{
			//this.Ley = "*"; //System.out.println("Incorrect format error");		
			Sum = 0;
		} 		 
	   	else
	   	{
	   		this.Ley = Ley;	   		
	   		Calculate();	   		
	   	}	
		
}		 
	private void Calculate() // ����� ������� ���������� ��������
	{
		if(Ley.length() != 0){
	   		 for(int i=0;i<Ley.length();i++){ 	
	   			 Sum++; 
	   	 if (Ley.charAt(i) == '\n'){
	   	 	Probel++;
	   	 }
	   	 if (Ley.charAt(i) == ' '){
	    	 	Probel++;
	    	 }} }
	
		Sum=Ley.length()-Probel;
	}	
}
