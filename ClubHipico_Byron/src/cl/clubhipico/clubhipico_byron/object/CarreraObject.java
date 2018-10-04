package cl.clubhipico.clubhipico_byron.object;

public class CarreraObject {
	/*propiedades globales de la clase visibles en toda la clase
	 * para acceder se antepone this. */
	
	private String nombre;
	private int distancia;
	private PistaObject pista;
	private CaballoObject caballo1;
	private CaballoObject caballo2;
	private CaballoObject caballo3;
	private TipoApuestaObject tipoApuesta;
	private ApostadorObject apostador;
	
	//Permite definir un valor String a nombre
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	//retorna el valor de la propiedad nombre
	public String getNombre() {
	return this.nombre; //no es extrictamente necesario el this si no existe un propiedad local nombre, pero se recomienda para que el codigo este mas ordenado
	//-------------------------
	}
	
	public void setDistancia(int distancia) {
		this.distancia=distancia;
	}
	public int getDistancia() {
		return this.distancia;
		//-------------------------------------
	}
		
	
	public void setPista(PistaObject pista) {
		this.pista=pista;
	}
	public PistaObject getPista() {
		return this.pista;
		//-------------------------------------
	}
	public CaballoObject getCaballo1() {
		return caballo1;
	}
	public void setCaballo1(CaballoObject caballo1) {
		this.caballo1 = caballo1;
		//-------------------------------------
	}
	public CaballoObject getCaballo2() {
		return caballo2;
	}
	public void setCaballo2(CaballoObject caballo2) {
		this.caballo2 = caballo2;
		//--------------------------------------
	}
	public CaballoObject getCaballo3() {
		return caballo3;
	}
	public void setCaballo3(CaballoObject caballo3) {
		this.caballo3 = caballo3;
		//---------------------------------------
	}
	public TipoApuestaObject getTipoApuesta() {
		return tipoApuesta;
	}
	public void setTipoApuesta(TipoApuestaObject tipoApuesta) {
		this.tipoApuesta = tipoApuesta;
		//----------------------------------------
	}
	public ApostadorObject getApostador() {
		return apostador;
	}
	public void setApostador(ApostadorObject apostador) {
		this.apostador = apostador;
	}
	  //---------------------------------------
}
