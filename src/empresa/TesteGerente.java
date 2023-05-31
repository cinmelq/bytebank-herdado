package empresa;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente alzira = new Gerente("Alzira", "222.857.697-85", 2600, 1234);
		boolean autenticouA = alzira.autentica(1234);
		System.out.println(alzira);
		System.out.println(alzira.autentica(5555));
		System.out.println(alzira.getBonificacao());
		System.out.println(autenticouA);
		
		System.out.println();
		Gerente bruno = new Gerente("Bruno", "222.222.222.22", 8000.00, 5698);
		boolean autenticouB = bruno.autentica(2222);
		System.out.println(bruno);
		System.out.println(bruno.autentica(5698));
		System.out.println(bruno.getBonificacao());
		System.out.println(autenticouB);
	}
}
