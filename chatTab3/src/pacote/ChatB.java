package pacote;

public class ChatB {
	
	public ChatB() {
		
	}
	private int id;
	private String pergunta;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public ChatB(int id, String pergunta) {
		this.id = id;
		this.pergunta = pergunta;
	}
	@Override
	public String toString() {
		return "ChatB [id=" + id + ", pergunta=" + pergunta + "]";
	}
	
}
