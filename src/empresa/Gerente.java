package empresa;

//gerente é um funcionario ou gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	private RuntimeException e;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		return 300;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}