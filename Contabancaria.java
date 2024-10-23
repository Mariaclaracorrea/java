package construtor;

public class Contabancaria {
	private double Saldo;
	
	public Contabancaria (double Saldoinicial, double Saldo) {
		if (Saldoinicial >= 0 ) {
			this.Saldo = Saldo;
			
		}else{
			this.Saldo=0;
		}
	}
	
	public double getSaldo() {
		return Saldo;
	}
	public  void depositar (double valor) {
		if (valor >=0) {
			Saldo += valor;
		}else {
			System.out.println("Valor de deposito inválido");
		}
	}
	public void sacar(double valor) {
		if (valor > 0 && valor <= Saldo) {
			Saldo -= valor;
		}else {
			System.out.println("Saque inválido, verifique o valor");
		}
	}
	
	

}
