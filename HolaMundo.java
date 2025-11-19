public class HolaMundo{
	public static void main(String args []){
		Persona pepito =new Persona("pepito",20,10); //instaciando la clase pepito
		pepito.dormir(15);
		Persona juanita = new Persona("juanita",40,50);
		juanita.dormir(50);	
		System.out.println(juanita.caminar());
	}
}