package service;
import Dao.ChatBDao;
import pacote.ChatB;
import pacote.Cliente;
import pacote.Atendente;
import pacote.Menssagem;

public class ChatService {
	ChatBDao dao = new ChatBDao();
	
	
	public int addMenssagem(Menssagem msg) {
		return dao.cadastroMenssagem(msg);
	}/*
	public void cadastroAtendimento(ChatB chat) {
		dao.cadastroAtendimento(chat);
	}
	public void atualizarCliente(ChatB chat) {
		 dao.atualizarCliente(chat);
	}

	public void excluirAtendente(int id) {
		 dao.excluirAtendente(id);
	}
*/
	public Cliente carregar(int id){
		return dao.carregarCliente(id);
	}/*

	public void carregarRespotas(int id) {
		 dao.carregarRespotas(id);
	}*/

	public int criarAtendente(Atendente at) {
		return dao.cadastroAtendente(at);
	}
	public int criarCliente(Cliente cli) {
		return dao.cadastroCliente(cli);
	
	}
}
