package SuperHeroe;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 Super 
		Persona tony_stark = new Persona("Tony Stark", 35, "New york");
		tony_stark.setEdad(35);
		System.out.println(tony_stark.name+" tiene "+tony_stark.edad + " años.");
		System.out.println(tony_stark.name+" vive en "+tony_stark.city);
		
		SuperHero iron_man = new SuperHero(tony_stark.name, tony_stark.edad, null, args, null);
		iron_man.heroName = "Iron Man";
		iron_man.poderes = new String[]{"Volar","Pelear"};
		iron_man.franquicia = "Marvel";
		System.out.println(iron_man.heroName + " de " + iron_man.franquicia);
		iron_man.mostarpoderes();
		
		
		//2 Super
		Persona mark_ruffalo = new Persona("Mark Ruffalo", 56, "Wisconsin");
		mark_ruffalo.setEdad(56);
		System.out.println("\n"+ mark_ruffalo.name+" tiene "+mark_ruffalo.edad + " años.");
		System.out.println(mark_ruffalo.name + " vive en " + mark_ruffalo.city);
		
		SuperHero hulk = new SuperHero(mark_ruffalo.name, mark_ruffalo.edad, null, args, null);
		hulk.heroName = "Hulk";
		hulk.poderes = new String[]{"Super fuerza","Resistencia"};
		hulk.franquicia = "Marvel";
		System.out.println(hulk.heroName + " de " +  hulk.franquicia);
		hulk.mostarpoderes();
		
		
		//1 Villano
		Persona elizabeth_olsen = new Persona("Elizabeth Olsen", 35, "California");
		elizabeth_olsen.setEdad(35);
		System.out.println("\n" + elizabeth_olsen.name+" tiene "+elizabeth_olsen.edad + " años.");
		System.out.println(elizabeth_olsen.name+" vive en "+elizabeth_olsen.city);
		
		Villain bruja_escarlata = new Villain(elizabeth_olsen.name, elizabeth_olsen.edad, null, null, args, null);
		bruja_escarlata.villainName = "Bruja Escarlata";
		bruja_escarlata.powers = new String[]{"Alteración y distorsión de la realidad","Hechicería."};
		bruja_escarlata.franquicia = "Marvel";
		System.out.println(bruja_escarlata.villainName + " de " + bruja_escarlata.franquicia);
		bruja_escarlata.mostarpoderes();
		
		//2 Villano
		Persona josh_brolin = new Persona("Josh Brolin", 56, "California");
		josh_brolin.setEdad(56);
		System.out.println("\n" + josh_brolin.name+" tiene "+josh_brolin.edad + " años.");
		System.out.println(josh_brolin.name+" vive en "+josh_brolin.city);
		
		Villain thanos = new Villain(josh_brolin.name, josh_brolin.edad, null, null, args, null);
		thanos.villainName = "Thanos";
		thanos.powers = new String[]{"Manipular energia cosmica","Rayos"};
		thanos.franquicia = "Marvel";
		System.out.println(thanos.villainName + " de " + thanos.franquicia);
		thanos.mostarpoderes();
		
	}

}
