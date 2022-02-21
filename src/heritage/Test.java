package heritage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordinateur o1=new Ordinateur("toshiba", "I7", 16, 1024, 2000);
		System.out.println(o1.toString());
		Laptop l1=new Laptop("DELL", "I7", 32, 512, 1700,120);
		System.out.println(l1.toString());
		System.out.println("autonomie "+l1.getAutonomie());
	}

}
