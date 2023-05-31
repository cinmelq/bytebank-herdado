package empresa;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente amanda = new Gerente("Amanda", "222.857.697-85", 2600, 1234);
		amanda.setSenha(1234);
		
		Administrador nelson = new Administrador("Nelson", "222.857.697-85", 2600);
		nelson.setSenha(5466);
		
		Cliente rosa = new Cliente();
		rosa.setSenha(4444);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(amanda);
		si.autentica(nelson);
		si.autentica(rosa);
	}
}
