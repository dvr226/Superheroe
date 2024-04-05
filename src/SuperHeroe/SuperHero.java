package SuperHeroe;

public class SuperHero {
	String heroName;
	String[] poderes;
	String franquicia;
	public String mostrarpoderes;
	
	public SuperHero(String name, int edad, String heroName, String[]poderes, String franquicia) {
		super();
		this.heroName = heroName;
		this.poderes = poderes;
		this.franquicia = franquicia;
		// TODO Auto-generated constructor stub
	} 
	
	public void mostarpoderes() {
		System.out.println("Los poderes son:");
		for(int i = 0;i<poderes.length;i++) {
			System.out.println(poderes[i]);
		}
	}	
}
