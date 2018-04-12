package service;
import pacote.PalavraChave;
import pacote.Resposta;

import java.util.ArrayList;
import java.util.List;

import Dao.ChatBDao;

public class PerguntaService {
	PalavraChave pl =new PalavraChave();
	
	ChatBDao dao = new ChatBDao();
	
	
 	public PalavraChave obterPalavraChave(PalavraChave frase) {

 		pl = frase.split(" ");
 		ArrayList<PalavraChave> palavraChave = new ArrayList<PalavraChave>();
 		ArrayList <RespostaService> respostasPossiveis = RespostaService.obterRespostasPossiveis (palavraChave);
 		while(frase.split(" ") != null)
 		palavraChave.add(frase);
 		
 		return dao.chamarPalavra(frase);
 	}

}
