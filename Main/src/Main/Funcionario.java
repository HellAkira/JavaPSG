package Main;
import java.util.Date;
public class Funcionario extends CamposDeData{

	 	private int FuncionarioID;
	    private long ChaveID;
	    private String Nome;
	    private String SobreNome;
	    private Date DataAdmissao;
	    private char Sexo;
	    private Date DataNascimento;
	    private String Email;
	    private String CTPS ;
	    private long CTPSNum;
	    private String CTPSSERIE;
	    private int paisID;
	    private Pais pais;
	    
	    public Funcionario(Pais pais) {
	    	this.pais = pais;
	    	
	    }
	    
	    
	    
		public int getFuncionarioID() {
			return FuncionarioID;
		}
		public void setFuncionarioID(int funcionarioID) {
			FuncionarioID = funcionarioID;
		}
		public long getChaveID() {
			return ChaveID;
		}
		public void setChaveID(long chaveID) {
			ChaveID = chaveID;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getSobreNome() {
			return SobreNome;
		}
		public void setSobreNome(String sobreNome) {
			SobreNome = sobreNome;
		}
		public Date getDataAdmissao() {
			return DataAdmissao;
		}
		public void setDataAdmissao(Date dataAdmissao) {
			DataAdmissao = dataAdmissao;
		}
		public char getSexo() {
			return Sexo;
		}
		public void setSexo(char sexo) {
			Sexo = sexo;
		}
		public Date getDataNascimento() {
			return DataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			DataNascimento = dataNascimento;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getCTPS() {
			return CTPS;
		}
		public void setCTPS(String cTPS) {
			CTPS = cTPS;
		}
		public long getCTPSNum() {
			return CTPSNum;
		}
		public void setCTPSNum(long cTPSNum) {
			CTPSNum = cTPSNum;
		}
		public String getCTPSSERIE() {
			return CTPSSERIE;
		}
		public void setCTPSSERIE(String cTPSSERIE) {
			CTPSSERIE = cTPSSERIE;
		}
		public int getPaisID() {
			return paisID;
		}
		public void setPaisID(int paisID) {
			this.paisID = paisID;
		}
		public Pais getPais() {
			return pais;
		}
		public void setPais(Pais pais) {
			this.pais = pais;
		}
	    
	    

}
