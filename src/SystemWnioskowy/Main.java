package SystemWnioskowy;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application model=retriveApplicationDataFromDatabase();
		ApplicationView view= new ApplicationView();
		ApplicationController controller= new ApplicationController(model,view);
		controller.updateView();
		
		controller.setNazwaW("KHB");
		
		controller.updateView();
		
	}
private static Application retriveApplicationDataFromDatabase() {
	Application application= new Application();
	application.setTypWniosku("KSB");
	application.setNumerWniosku(11111);
	application.setNazwaWniosku("Wniosek kredytu samochodowego");
	application.setIdKlienta(1);
	application.setNumerKontraktu(151551515);
	return application;
}
}
