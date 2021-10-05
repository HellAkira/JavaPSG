package Main;
import java.util.Date;
public class Funcionario extends CamposDeData{

	 	private int funcionarioID;
	    private long chaveID;
	    private String nome;
	    private String sobreNome;
	    private Date dataAdmissao;
	    private char sexo;
	    private Date dataNascimento;
	    private String email;
	    private String ctps;
	    private long ctpsNum;
	    private String ctpsSerie;
	    private int paisID;
	    private Pais pais;
	    
	    public Funcionario(Pais pais) {
	    	this.pais = pais;
			this.paisID = this.pais.getPaisID();
	    }
	    
	    
	    
		public int getFuncionarioID() {
			return funcionarioID;
		}
		public void setFuncionarioID(int funcionarioID) {
			this.funcionarioID = funcionarioID;
		}
		public long getChaveID() {
			return chaveID;
		}
		public void setChaveID(long chaveID) {
			this.chaveID = chaveID;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobreNome() {
			return this.sobreNome;
		}
		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}
		public Date getDataAdmissao() {
			return this.dataAdmissao;
		}
		public void setDataAdmissao(Date dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}
		public char getSexo() {
			return this.sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public Date getDataNascimento() {
			return this.dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCTPS() {
			return ctps;
		}
		public void setCTPS(String cTPS) {
			this.ctps = cTPS;
		}
		public long getCTPSNum() {
			return ctpsNum;
		}
		public void setCTPSNum(long ctpsNum) {
			this.ctpsNum = ctpsNum;
		}
		public String getCtpsSerie() {
			return ctpsSerie;
		}
		public void setCtpsSerie(String ctpsSerie) {
			this.ctpsSerie = ctpsSerie;
		}
		public int getPaisID() {
			return paisID;
		}
		public Pais getPais() {
			return pais;
		}
		public void setPais(Pais meuPais) {
			this.pais = meuPais;
			this.paisID = this.pais.getPaisID();
		}
	    
	    

}
