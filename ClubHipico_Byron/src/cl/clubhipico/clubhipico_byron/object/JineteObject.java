package cl.clubhipico.clubhipico_byron.object;

public class JineteObject extends PersonaObject {

	private CaballoObject caballo;

	public CaballoObject getCaballo() {
		return caballo;
	}

	public void setCaballo(CaballoObject caballo) {
		this.caballo = caballo;
		
		
	}

	@Override
	public String toString() {
		return "JineteObject [caballo=" + caballo + "]";
	}

}
