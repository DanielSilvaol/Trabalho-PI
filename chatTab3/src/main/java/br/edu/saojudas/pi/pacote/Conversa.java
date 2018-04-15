package br.edu.saojudas.pi.pacote;

/**
 * Created by daniel on 14/04/18.
 */
public class Conversa {

    private String pergunta;

    private String resposta;

    public Conversa() {
    }

    public Conversa(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
