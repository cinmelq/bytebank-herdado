package empresa;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente leandro = new Gerente("Leandro", "666.666.666-66", 3000, 6666);
		System.out.println(leandro);
		System.out.println();

		System.out.println();

		EditorDeVideo nelson = new EditorDeVideo("Nelson", "789.987.789-98", 4000);
		System.out.println(nelson);

		System.out.println();

		Designer fernando = new Designer("Fernando", "55.444.888-33", 2500);
		System.out.println(fernando);

		System.out.println();

		Administrador priscila = new Administrador("Priscila", "111.111.111-11", 3000);
		System.out.println(priscila);

		System.out.println();

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(leandro);
		controle.registra(nelson);
		controle.registra(fernando);
		controle.registra(priscila);
		
		System.out.println();
		
		Autenticavel referencia = new Gerente("Julia", "555.555.555-55", 2000.5, 1234);

		Autenticavel referencia1= new Cliente();

		Autenticavel referencia2 = new Administrador("Leila", "444.444.444-44", 3000.5);

		System.out.println();

		System.out.println("Soma da bonificação dos funcionários: " + controle.getSoma());
	}
}