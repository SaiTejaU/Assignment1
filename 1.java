public class SavingAmount {
	int savings;
	void setter(int n){this.savings=n;}
	int getter(){return this.savings;}
	void increament(){this.savings+=1000;}
	void decreament(){this.savings-=100;}
	void checkSavings()
	{
		if(this.savings>=1000) 
		{
			System.out.println("Congratulations! You have saved a good amount");
		}
		else if(this.savings<1000 && this.savings>0)
		{
			System.out.println("Insufficient saving!");
		}
		else 
		{
			System.out.println("You are in debt");
		}
	}
	public static void main(String[] args) 
	{
		SavingAmount s=new SavingAmount();
		s.setter(-100);
		s.decreament();
		s.increament();
		s.checkSavings();
		System.out.println("Your current savings are Rs "+s.getter());
	}
}
