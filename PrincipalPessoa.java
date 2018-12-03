/*	Programação Orientada a Objeto - Prova AP2
 * 	Prof. Orlewilson B. Maia
 * 	Alunos: 	
 *	Data: 30/11/2028		 
 
 	Descrição: 	Criar um método main() conforme o padrão da linguagem Java. 
 				Nesse método, criar dois objetos do tipo da classe 
 				PessoaFisica e PessoaJuridica.
 				
				Para cada atributo do objeto, atribuir um valor coerente. 
				
				Executar o método imprimir() para cada objeto. 
				 
				OBS: ao fim da atividade, compactar os projetos e enviar para
				prof.orlewilson@gmail.com da seguinte forma
				
					Assunto: Questões Ap2 - POO
					Corpo do e-mail: nome do aluno e matrícula
				
				Critérios de avaliação: organização do código, comentários, 
										fazer o que se pede.
 */
public class PrincipalPessoa {
	
	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		PessoaFisica maycon = new PessoaFisica();
		PessoaJuridicia dell = new PessoaJuridicia();
		
		// Estanciamento da classe Pessoa
		joao.setNome("João da Silva");
		joao.SetSexo("Masculino");
		joao.setIdade(22);
		
		// Estanciamento da Classe Pessoa Fisica
		
		maycon.setNome("Maycon Bezerra");
		maycon.SetCpf("004.458.045-45");
		maycon.setDataNascimento("12/05/1990");
		
		// Estanciamento da Classe Pessoa Juridica
		
		dell.setCnpj("Maycon Bezerra");
		dell.setIncricaoEstadual("00400445");
		dell.setNomeFantasia("dell");
		dell.setRazaoSocial("Dell Inc.");
		
		// Método Imprimir tudo na tela
		joao.imprimir();
		maycon.imprimir();
		dell.imprimir();
		
	
	}
}
