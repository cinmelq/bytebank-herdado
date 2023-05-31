package empresa;

//gerente é um funcionario ou gerente herda da classe funcionario
public class EditorDeVideo extends Funcionario {

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		return 100;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}