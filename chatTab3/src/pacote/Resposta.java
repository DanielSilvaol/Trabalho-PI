package pacote;

class Resposta implements Comparable <Resposta>{
	private int pontuacao;

	public int compare (Resposta r){
		if (this.pontuacao < r.pontuacao)
			return -1;
		else if (this.pontuacao == r.pontuacao)
			return 0;
		else
			return -1;
	}

	@Override
	public int compareTo(Resposta o) {
		// TODO Auto-generated method stub
		return 0;
	}	
}