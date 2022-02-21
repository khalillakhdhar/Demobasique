package classes;

public class Voiture {
String marque;
double prix;
String couleur,carburant;
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

