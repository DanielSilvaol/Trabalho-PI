package pacote;

public class Atendente {
	int id;
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private String telefone;
	private String status;
	private String senha;

	public Atendente() {
		
	}
	public Atendente(int id, String nome, String email, String cpf, String rg, String telefone, String status,
			String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.status = status;
		this.senha = senha;
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
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Atendente [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", rg=" + rg
				+ ", telefone=" + telefone + ", status=" + status + ", senha=" + senha + "]";
	}
	
}
