package SystemWnioskowy;

public class ResignationGroupInsurance implements Command{
	private GroupInsurance groupinsurance;
	
	public  ResignationGroupInsurance(GroupInsurance groupInsurance) {
		// TODO Auto-generated constructor stub
		this.groupinsurance=groupInsurance;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		groupinsurance.resignation();
	}

}
