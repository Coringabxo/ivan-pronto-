package br.com.petshop;

public class Furão extends Animal {
    private String corRaca;

    public Furão(String nome, int idade, int tamanho, String corRaca) {
        super(nome, idade, tamanho);
        this.corRaca = corRaca;
    }

    public void rugindo() {
        System.out.println(getNome() + " está rugindo: harrr");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor da raça: " + corRaca);
    }
}

