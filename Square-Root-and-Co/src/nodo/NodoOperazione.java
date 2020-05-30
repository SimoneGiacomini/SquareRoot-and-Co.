package nodo;

public class NodoOperazione extends Nodo<Character>{

	public NodoOperazione(Nodo<?> aDestra, Nodo<?> aSinistra, Character operazione) {
		super(aDestra, aSinistra, operazione);
	}
	public NodoOperazione(Character operazione) {
		super(operazione);
	}

}
