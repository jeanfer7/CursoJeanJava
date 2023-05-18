import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {

	List <Cue>
	
	private int idCuenta;
	private double saldo;
	List<Movimiento> movimientos = new ArrayList<>(); //Conviene usar un arraylist?
	private String clienteNombre;
	
	
	public Cuenta(int idCuenta, double saldo, int movimientos, String clienteNombre) {
		super();
		this.idCuenta = idCuenta;
		this.saldo = saldo;
		this.movimientos = movimientos;
		this.clienteNombre = clienteNombre;
	}
	
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getMovimientos() {
		return movimientos;
	}
	public String getClienteNombre() {
		return clienteNombre;
	}
	
	public abstract void depositar();
	public abstract void extraer();
	
	
}
