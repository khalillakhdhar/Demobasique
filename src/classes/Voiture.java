package classes;

public class Voiture {
private String marque;
//private = accessible seulement dans la classe
private double prix;
private String entreprise="protech";
private String couleur,carburant;



public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getEntreprise() {
	return entreprise;
}
public void setEntreprise(String entreprise) {
	this.entreprise = entreprise;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public String getCarburant() {
	return carburant;
}
public void setCarburant(String carburant) {
	this.carburant = carburant;
}
public Voiture(String marque, double prix, String couleur, String carburant) {
	
	this.marque = marque;
	this.prix = prix;
	this.couleur = couleur;
	this.carburant = carburant;
}
public Voiture() {
	// TODO Auto-generated constructor stub
	System.out.println("ici c'est le constructeur sans paramétres");
}
@Override
public String toString() {
	return "Voiture [marque=" + marque + ", prix=" + prix + ", couleur=" + couleur + ", carburant=" + carburant + "]";
}






}

