package nodo;

public abstract class Nodo<T> {


	private Nodo<?> Destra;

	private Nodo<?> Sinistra;

	private T contenuto;
	
	public Nodo(Nodo<?> aDestra, Nodo<?> aSinistra, T Contenuto) {
		super();
		this.Destra = aDestra;
		this.Sinistra = aSinistra;
		this.contenuto=Contenuto;
	}

	public Nodo(T Contenuto) {
		this.contenuto=Contenuto;
	}
	/**
	 * @return the Destra
	 */
	public Nodo<?> getDestra() {
		return Destra;
	}

	/**
	 * @param Destra
	 *            the aDestra to set
	 */
	public void setDestra(Nodo<?> aDestra) {
		this.Destra = aDestra;
	}

	/**
	 * @return the contenuto
	 */
	public T getContenuto() {
		return contenuto;
	}

	/**
	 * @param contenuto the contenuto to set
	 */
	public void setContenuto(T contenuto) {
		this.contenuto = contenuto;
	}

	/**
	 * @return the Sinistra
	 */
	public Nodo<?> getSinistra() {
		return Sinistra;
	}

	/**
	 * @param Sinistra
	 *            the aSinistra to set
	 */
	public void setSinistra(Nodo<?> aSinistra) {
		this.Sinistra = aSinistra;
	}

}
