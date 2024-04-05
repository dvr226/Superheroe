package SuperHeroe;

public class Persona {
	String name;
	int edad;
	String city;
	public Persona(String name, int edad, String city) {
		super();
		this.name = name;
		this.edad = edad;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
