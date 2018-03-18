package Marital;

public class MaritalState {
	
	public String Stat = null;
	
	MaritalState(String s)
	{
		this.Stat = s;
	}
	
	public void changeState(String s)
	{
		if(this.Stat == s)
			System.out.println("The old state was the same");
		else if(this.Stat == "single" && s=="married")
		{
			this.Stat =s;
		}
		else if (this.Stat == "married" && (s=="divorced" || s=="widow"))
		{
			this.Stat =s;
		}
		else if ((this.Stat == "divorced" || this.Stat == "widow") && s=="married")
		{
			this.Stat =s;
		}
		else
			System.out.println("Status change request invalid: " + this.Stat+"-->"+s+"!");
	}
	
	public String getState()
	{
		return this.Stat;
	}

}
