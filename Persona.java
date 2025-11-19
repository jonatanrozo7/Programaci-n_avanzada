public class Persona{
		String nombre;
		int edad;
		int energia;
		//metodo constructor
		Persona(String nombre, int edad, int ener){
				this.nombre=nombre;
				this.edad=edad;
				energia=ener;
		}
		//Duerme, respira, camina, etc etc.
		public void dormir(int tiempo){
			System.out.println("La persona "+nombre+" esta durmiendo");
			energia= energia+tiempo;
			System.out.println(energia);
		}
		//Los tipo de retorno pueden ser cualquier tipo de dato. String, int, boolean, void, etc.
		public int caminar(){
			System.out.println("La persona esta caminando");
			energia =energia-10;
			return energia;
	}
}