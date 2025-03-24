package br.com.petshop;

public class Animal {
	private String nome;
	private int idade;
	private int tamanho;
	public Animal(String nome, int idade, int tamanho) {
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	public int getTamanho () {
		return tamanho;
	}
	
	public void exibirInfo () {
		System.out.println("Nome: " + nome );
		System.out.println("Idade:"  + idade);
		System.out.println("tamanho:"  + tamanho);
	}

}
 
