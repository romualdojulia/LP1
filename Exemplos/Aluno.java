	public class Aluno {
	
		private String nome;
		private RG identidade;
		private String prontuario;
		
		public Aluno() {
			this.nome = nome;
		}
		public Aluno(RG identidade, String prontuario) {
			this.identidade = identidade;
			this.prontuario = prontuario;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public RG getIdade() {
			return identidade;
		}
		public void setIdade(RG identidade) {
			this.identidade = identidade;
		}
		public String getProntuario() {
			return prontuario;
		}
		public void setProntuario(String prontuario) {
			this.prontuario = prontuario;
		}
		
		
	}
