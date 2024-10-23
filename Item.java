package construtor;

public class Item {
	
		private long id;
		private String nome;
		private String descricao;
		
		
	public Item(long id, String nome, String descricao) {
		this.id=id;
		this.nome=nome;
		this.descricao=descricao;
	}
	public long getid() {
		return id;
    }
	public void setid(long id) {
		this.id=id;
    }
	public String getnome() {
		return nome;
    }
	public void setnome(String nome) {
		this.nome=nome;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao=descricao; 
    }


}
