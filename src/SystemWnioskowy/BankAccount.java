package SystemWnioskowy;

import SystemWnioskowy.BankAccount.Builder;

public class BankAccount {
	public long accountNumber; //This is important, so we'll pass it to the constructor.
    public String owner;
    public String branch;
    public double balance;
    public double interestRate;

	public static class Builder {
       
		public long accountNumber; 
	    public String owner;
	    public String branch;
	    public double balance;
	    public double interestRate;

		public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;  
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
        	
            
            BankAccount account = new BankAccount(); 
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
        
        
    }

	public void ShowAccountData() {
		System.out.println("");
		System.out.println("Numer stworzeonego konta: "+accountNumber);
		System.out.println("W³aœciciel: "+owner);
		System.out.println("Oddzia³: "+branch);
		System.out.println("Saldo: "+balance);
		System.out.println("Oprocentowanie: "+interestRate);
		
	}
	
    
   
    //Gettery i settery pominiête ze wzglêdu na zwiêz³oœæ .
}


