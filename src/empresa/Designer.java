package empresa;

//gerente é um funcionario ou gerente herda da classe funcionario
public class Designer extends Funcionario {

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		return 200;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}