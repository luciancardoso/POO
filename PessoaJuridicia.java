/*	Programação Orientada a Objeto - Prova AP2
 * 	Prof. Orlewilson B. Maia
 * 	Alunos: 	
 *	Data: 30/11/2028		 
 
 	Descrição:	- Criar a classe PessoaJuridica que também estende da 
 				  classe Pessoa.
 				- Criar os atributos cnpj, inscrição estadual, nome fantasia 
 				  e razão social. Criar os métodos de acesso.
 				- Desenvolver o método imprimir(), que exibirá os dados 
 				  na tela.
 				- Criar para a classe PessoaJuridica um construtor vazio e 
 				  um segundo construtor que receba os parâmetros da 
 				  classe e o parâmetro da superclasse. Inicializar os 
 				  atributos da classe e chamar o comando super com o 
 				  parâmetro da superclasse
 */
public class PessoaJuridicia {
	
	// Atributos
	private String cnpj;
	private String incricaoEstadual;
	private String nomeFantasia;
	private String razaoSocial;
	
	// Bloco Contrutor
	public PessoaJuridicia(){
		this.cnpj = "";
		this.incricaoEstadual = "";
		this.nomeFantasia = "";
		this.razaoSocial = "";
	}
	
	// Método de Acesso
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setIncricaoEstadual(String incricaoEstadual){
		this.incricaoEstadual = incricaoEstadual;
	}
	
	public String getIncricaoEstadual(){
		return this.incricaoEstadual;
	}
	
	public void setNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getNomeFantasia(){
		return this.nomeFantasia;
	}
	
	public void setRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
	}
	
	public String getRazaoSocial(){
		return this.razaoSocial;
	}
	
	
	// Método Imprimir
	public void imprimir(){
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("INSCRIÇÃO ESTADUAL: " + getIncricaoEstadual());
		System.out.println("NOME FANTASIA: " + getNomeFantasia());
		System.out.print("RAZÃO SOCIAL: " + getRazaoSocial());
	}
	
}
