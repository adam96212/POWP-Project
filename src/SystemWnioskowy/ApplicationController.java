package SystemWnioskowy;

public class ApplicationController {
	private Application model;
	private ApplicationView view;	

	public ApplicationController(Application model, ApplicationView view) {
		this.model=model;
		this.view=view;	
	}
	
	public void setNazwaW(String NazwaWniosku) {
		model.setNazwaWniosku(NazwaWniosku);
	}
	
	public String getNazwaW() {
		return model.getNazwaWniosku();
	}
	
	public void setTypW(String TypWniosku) {
		model.setTypWniosku(TypWniosku);
	}
	
	public String getTypW() {
		return model.getTypWniosku();
	}
	
	public void setNumerW(int NumerWniosku) {
		model.setNumerWniosku(NumerWniosku);
	}
	
	public int getNumerW() {
		return model.getNumerWniosku();
	}
	
	public void setNumerK(int IdKlienta) {
		model.setIdKlienta(IdKlienta);
	}
	
	public int getNumerK() {
		return model.getIdKlienta();
	}
	
	public void setNumerKon(int NumerKontraktu) {
		model.setIdKlienta(NumerKontraktu);
	}
	
	public int getNumerKon() {
		return model.getNumerKontraktu();
	}
	
	 public void updateView(){				
	      view.ApplicationDetail(model.getTypWniosku(), model.getNazwaWniosku(),model.getIdKlienta(),model.getNumerWniosku(),model.getNumerKontraktu());
	  }	
}
