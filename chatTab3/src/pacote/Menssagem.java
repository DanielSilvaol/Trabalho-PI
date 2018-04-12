package pacote;

public class Menssagem {
	private int id;
	private String nome;
	private String menssagem;
	public Menssagem() {
				
	}
	public Menssagem(int id, String nome, String menssagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.menssagem = menssagem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String username) {
		this.nome = username;
	}
	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	
}
