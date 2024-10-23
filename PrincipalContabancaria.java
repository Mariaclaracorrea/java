package construtor;

public class PrincipalContabancaria {
	
	public class Contabancaria {

		public static void main(String[] args) {
			
			Contabancaria conta = new Contabancaria();
			
			System.out.println(conta.getsaldo());
			
			conta.depositar(500);
			conta.depositar(1000);
			
			System.out.println(conta.getSaldo());
			
			conta.sacar(1500);
			
			System.out.println(conta.getSaldo());


}
	}
}