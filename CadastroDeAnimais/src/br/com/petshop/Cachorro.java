package br.com.petshop;

public class Cachorro extends Animal{
	private String raca;
	
	
	public Cachorro(String nome, int idade, int tamanho,String raca) {
		super(nome, idade,tamanho);
		this.raca = raca;
		
	}
	
	
	
	public void latir() {
		System.out.println(getNome() + "está latindo: Au! Au!");
	}
	
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Raça: " + raca);
		
	}
}
