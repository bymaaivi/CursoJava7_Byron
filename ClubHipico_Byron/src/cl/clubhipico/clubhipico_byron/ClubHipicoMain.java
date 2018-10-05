package cl.clubhipico.clubhipico_byron;

import cl.clubhipico.clubhipico_byron.object.CaballoObject;
import cl.clubhipico.clubhipico_byron.object.CarreraObject;
import cl.clubhipico.clubhipico_byron.object.JineteObject;
import cl.clubhipico.clubhipico_byron.object.PersonaObject;

public class ClubHipicoMain {

	// metodo main, desde donde se inicia el programa*/
	public static void main(String[] args) {

		// declarando y inicializando carrera object
		CarreraObject carrera = new CarreraObject();

		// imprimiendo por pantalla el abierto carrera object
		// imprime mensaje con informacion de memoria
		// carrera objectcl.clubhipico.clubhipico_byron.object.CarreraObject@70dea4e
		System.out.println("carrera object: " + carrera);

		CaballoObject caballo = new CaballoObject();
		System.out.println("Caballo Object:" + caballo);
		CaballoObject caballo2 = new CaballoObject();
		caballo2.setNombre("caballo juanito perez");
		caballo2.setPeso(1000);
		caballo2.setRut(12345678);
		caballo2.setSexo(false);

		System.out.println("Caballo2 Object:" + caballo2);
		
		JineteObject jinete = new JineteObject();
		jinete.setNombre("YULIAM RODRIGUEZ");
		jinete.setCaballo(caballo2);
		System.out.println("jinete Object:" + jinete);
		
		//polimorfismo		
		PersonaObject persona = jinete;
		PersonaObject persona2 = new JineteObject();
		//jineteObject jinete8 = new PersonaObject(); //ERROR por jerarquia herencia.
		

	}

}
