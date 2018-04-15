package br.edu.saojudas.pi.service;

import br.edu.saojudas.pi.dao.RespostaDao;
import br.edu.saojudas.pi.pacote.PalavraChave;
import br.edu.saojudas.pi.pacote.Resposta;

import java.util.*;

public class RespostaService {

    private RespostaDao dao = new RespostaDao();

    public Resposta buscaRespostaApropriada(List<PalavraChave> palavraChaves) {
        List<Integer> idsPalavras = this.getPalvrasIds(palavraChaves);

        List<Resposta> respostas = dao.buscaRespostaPorPalavrasChaves(idsPalavras);

        List<Resposta> respostasPontuadas = this.obtemRespostasPontuadasPorRepeticao(respostas);

        Collections.sort(respostasPontuadas);

        if (respostasPontuadas.size() > 0) {
            return respostasPontuadas.get(0);
        }
        return null;
    }

    private List<Integer> getPalvrasIds(List<PalavraChave> palavraChaves) {
        List<Integer> idsPalavras = new ArrayList<>();
        for (PalavraChave palavraChave : palavraChaves) {
            idsPalavras.add(palavraChave.getId());
        }
        return idsPalavras;
    }

    /**
     * Caso a resposta apareça mais de uma vez, ela terá uma pontuação maior, pois significa que ela estava associada
     * a mais palavras chaves que foram encontradas.
     * @param respostas as respostas a serem pontuadas
     */
    private List<Resposta> obtemRespostasPontuadasPorRepeticao(List<Resposta> respostas) {
        Map<Integer, List<Resposta>> respostaMapPorId = new HashMap<>();
        for (Resposta resposta : respostas) {
            Integer id = resposta.getId();
            if (respostaMapPorId.containsKey(id)) {
                List<Resposta> respostaDoId = respostaMapPorId.get(id);
                respostaDoId.add(resposta);
            } else {
                List<Resposta> respostaDoId = new ArrayList<>();
                respostaDoId.add(resposta);
                respostaMapPorId.put(id, respostaDoId);
            }
        }

        List<Resposta> repostasPontuadas = new ArrayList<>();
        for (Map.Entry<Integer, List<Resposta>> entry : respostaMapPorId.entrySet()) {
            List<Resposta> respotasDoId = entry.getValue();
            Resposta resposta = respotasDoId.get(0);
            resposta.setPontuacao(respotasDoId.size());
            repostasPontuadas.add(resposta);
        }
        return repostasPontuadas;
    }
}
