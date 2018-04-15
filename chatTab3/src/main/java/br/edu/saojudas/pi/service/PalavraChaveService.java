package br.edu.saojudas.pi.service;

import br.edu.saojudas.pi.dao.PalavraChaveDao;
import br.edu.saojudas.pi.pacote.PalavraChave;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 15/04/18.
 */
public class PalavraChaveService {

    private PalavraChaveDao dao = new PalavraChaveDao();

    public List<PalavraChave> encontraPalavrasChavesPorPergunta(String pergunta) {
        List<PalavraChave> palavraChaves = dao.buscaTodasPalavraChaves();
        List<PalavraChave> palavrasNaPergunta = new ArrayList<>();
        for (PalavraChave palavraChave : palavraChaves) {
            if (pergunta.contains(palavraChave.getPalavra())) {
                palavrasNaPergunta.add(palavraChave);
            }
        }
        return palavrasNaPergunta;
    }
}
