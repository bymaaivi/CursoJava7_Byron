package cl.clubhipico.clubhipico_byron.object;

public class AnimalObject {
	private String nombre;
	private int rut;
	private int peso;
	private boolean sexo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "CaballoObject [nombre=" + nombre + ", rut=" + rut + ", peso=" + peso + ", sexo=" + sexo + "]";
	}
}
