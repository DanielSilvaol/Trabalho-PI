package pacote;

import java.util.ArrayList;
import service.PerguntaService;
import service.RespostaService;

public class PalavraChave {
	
	private int id;
	private String palavraChave;

	public PalavraChave() {
		
	}
	
	public PalavraChave(int id, String palavraChave) {
		this.id = id;
		this.palavraChave = palavraChave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	PerguntaService perg = new PerguntaService();
	RespostaService palavrasChave = new RespostaService();
	
	ArrayList<PalavraChave> palavraChaves = new PerguntaService.obterPalavraChave(perg);
	
	ArrayList <Resposta> respostasPossiveis = new RespostaService.obterRespostasPossiveis (palavrasChave);

	Resposta r = respostasPossiveis.get(0);

	
}
