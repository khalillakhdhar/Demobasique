package classes;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture v1=new Voiture();
		Voiture v2=new Voiture("teste", 10000, "red", "teste");
		v2.setPrix(9000);
		System.out.println(v2.getMarque());
		
	}

}
