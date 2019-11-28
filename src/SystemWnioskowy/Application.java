package SystemWnioskowy;

public class Application {
private String TypWniosku;
private String NazwaWniosku;
private int IdKlienta;
private int NumerWniosku;
private int NumerKontraktu;

public int getNumerWniosku() {
	return NumerWniosku;
	
}
public void setNumerWniosku(int NumerWniosku) {
	this.NumerWniosku=NumerWniosku;

}
public String getTypWniosku() {
	return TypWniosku;
}
public void setTypWniosku(String TypWniosku) {
this.TypWniosku=TypWniosku;
}
public String getNazwaWniosku() {
	return NazwaWniosku;
}
public void setNazwaWniosku(String NazwaWniosku) {
	this.NazwaWniosku=NazwaWniosku;
}
public int getIdKlienta() {
	return IdKlienta;
}
public void setIdKlienta(int IdKlienta) {
	this.IdKlienta=IdKlienta;
}
public int getNumerKontraktu() {
	return NumerKontraktu;
}
public void setNumerKontraktu(int NumerKontraktu) {
	this.NumerKontraktu=NumerKontraktu;
}
}



