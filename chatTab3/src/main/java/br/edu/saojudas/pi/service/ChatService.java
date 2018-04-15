package br.edu.saojudas.pi.service;

import br.edu.saojudas.pi.pacote.PalavraChave;
import br.edu.saojudas.pi.pacote.Resposta;

import java.util.List;

public class ChatService {

	private PalavraChaveService palavraChaveService = new PalavraChaveService();

	private RespostaService respostaService = new RespostaService();

	public Resposta buscaResposta(String pergunta) {

		List<PalavraChave> palavraChaves = palavraChaveService.encontraPalavrasChavesPorPergunta(pergunta);

		return respostaService.buscaRespostaApropriada(palavraChaves);
	}
}
