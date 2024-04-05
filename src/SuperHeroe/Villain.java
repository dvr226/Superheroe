package SuperHeroe;

public class Villain extends Persona{
	String villainName;
	String[] powers;
	String franquicia;

	public Villain(String name, int edad, String city, String villainName, String[]powers, String franquicia) {
		super(name, edad, city);
		this.villainName = villainName;
		this.powers = powers;
		this.franquicia = franquicia;
		// TODO Auto-generated constructor stub
	}
		public void mostarpoderes() {
			System.out.println("Los poderes son:");
			for(int i = 0;i<powers.length;i++) {
				System.out.println(powers[i]);
			}
	}  
}
