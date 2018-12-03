/*	Programação Orientada a Objeto - Prova AP2
 * 	Prof. Orlewilson B. Maia
 * 	Alunos: 	
 *	Data: 30/11/2028		 
 
 	Descrição:	- Criar a classe Pessoa como abstrata. Adicine o atributo nome 
 				  e gararanta seue encapsulamento. 
 				- Criar o método imprimir() para mostrar o conteúdo do(s) 
 				  atributo(s). 
 				- Criar um construtor parar inicializar o(s) atributo(s) 
 				  da classe.
 */
public class Pessoa {
	
	// Atributo
	private String nome;
	private String sexo;
	private int idade;
	
	//Contrutor
	public Pessoa(){
		
		this.nome = "";
		this.sexo = "";
		this.idade = 0;
		
	}
	
	//Método
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void SetSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	// Método Imprimir
	
	public void imprimir(){
		
		System.out.println("Nome: " + getNome());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Idade: " + getIdade());
		
	}
	
}
