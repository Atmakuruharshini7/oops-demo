package oopsdemo2;

public class SavingsBank extends Account{
private int min_bal;
protected int balance; //can access within the cass
	public SavingsBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;
	}
	//child class of Account
	void display()
    {
            super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }

}