package construtor;

public class ItemTema {
	
	private long id;
	private String nome;
	private double valorAluguel;
	private String cor;
	
	public ItemTema(long id, String nome, double valorAluguel, String cor) {
		this.id=id;
		this.nome=nome;
		this.valorAluguel=valorAluguel;
		this.cor=cor;
	}
	
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome=nome;
	}
	public double getvalorAluguel() {
		return valorAluguel;
	}
	public void setvalorAluguel(double valorAluguel) {
		this.valorAluguel=valorAluguel;
	}
	public String getcor() {
		return cor;
	}



}
