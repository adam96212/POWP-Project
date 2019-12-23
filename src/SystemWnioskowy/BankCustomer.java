package SystemWnioskowy;

import java.io.BufferedReader;  
import java.io.InputStreamReader;  

public class BankCustomer extends BankDetails implements CreditCard {  
	public void giveBankDetails(){  
		  try{  
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		      
		   System.out.print("Wpisz nazwê wlasciciela konta :");  
		   String customername=br.readLine();  
		   System.out.print("\n");  
		      
		   System.out.print("Wpisz numer konta:");  
		   long accno=Long.parseLong(br.readLine());  
		   System.out.print("\n");  
		      
		   System.out.print("Wpisz nazwe banku :");  
		   String bankname=br.readLine();  
		      
		   setAccHolderName(customername);  
		   setAccNumber(accno);  
		   setBankName(bankname);  
		   }catch(Exception e){  
		        e.printStackTrace();  
		   }  
		  }  
		  @Override  
		  public String getCreditCard() {  
		   long accno=getAccNumber();  
		   String accholdername=getAccHolderName();  
		   String bname=getBankName();  
		          
		   return ("Numer konta "+accno+" "+accholdername+" w banku: "+bname+ ",konto jest wa¿ne i autentyczne w celu wydania karty kredytowej. ");  
		  }  

}
