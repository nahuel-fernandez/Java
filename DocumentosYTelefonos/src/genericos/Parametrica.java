package genericos;

import java.util.Objects;

public class Parametrica <K, V> implements Comparable<Parametrica<K, V>>{
	K clave;
	V valor;
	
	
	
	
	public Parametrica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Parametrica(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}



	@Override
	public String toString() {
		return "[" + clave + ", " + valor + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(clave, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametrica<K, V> other = (Parametrica<K ,V>) obj;
		return Objects.equals(clave, other.clave) && Objects.equals(valor, other.valor);
	}
	
	@Override
	public int compareTo(Parametrica<K ,V> p) {
		if (this.clave instanceof Integer && p instanceof Parametrica) {
			Parametrica<K ,V> aux = (Parametrica<K ,V>) p;
			if (aux.clave instanceof Integer) {
				Integer aux1 = (Integer) this.clave;
				Integer aux2 = (Integer) aux.clave;

				return aux1 - aux2;
			}

		}
		return 0;
	}
	
	public K getClave() {
		return clave;
	}
	public void setClave(K clave) {
		this.clave = clave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	
	
	
}
