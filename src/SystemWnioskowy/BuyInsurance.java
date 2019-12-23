package SystemWnioskowy;

public class BuyInsurance implements Command {
	
	private GroupInsurance groupinsurance;
	
	public BuyInsurance(GroupInsurance groupinsurance) {
		this.groupinsurance=groupinsurance;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		groupinsurance.buy();
	}

}
