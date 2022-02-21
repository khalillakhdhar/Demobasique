package heritage;

public class Laptop extends Ordinateur {
private int autonomie;

public int getAutonomie() {
	return autonomie;
}

public void setAutonomie(int autonomie) {
	this.autonomie = autonomie;
}

public Laptop(String marque, String processeur, int ram, int disque, double prix, int autonomie) {
	super(marque, processeur, ram, disque, prix);
	this.autonomie = autonomie;
}
}