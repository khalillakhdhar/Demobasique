package heritage;

public class Ordinateur {
private String marque,processeur;
private int ram,disque;
private double prix;
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getProcesseur() {
	return processeur;
}
public void setProcesseur(String processeur) {
	this.processeur = processeur;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getDisque() {
	return disque;
}
public void setDisque(int disque) {
	this.disque = disque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Ordinateur(String marque, String processeur, int ram, int disque, double prix) {
	
	this.marque = marque;
	this.processeur = processeur;
	this.ram = ram;
	this.disque = disque;
	this.prix = prix;
}
public Ordinateur() {
}
@Override
public String toString() {
	return "Ordinateur [marque=" + marque + ", processeur=" + processeur + ", ram=" + ram + ", disque=" + disque
			+ ", prix=" + prix + "]";
}



}
