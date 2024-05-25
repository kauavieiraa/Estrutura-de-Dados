package com.kaua.estruturadedados;

public class ListaTeste2 {
	  public static void main(String[] args) {
	        ListaEncadeada3<Integer> lista = new ListaEncadeada3<>();
	        
	        lista.adiciona(10);
	        lista.adiciona(20);
	        lista.adiciona(30);
	        lista.adiciona(40);
	        lista.adiciona(50);

	        System.out.println("Lista inicial: " + lista);

	        int posicao20 = lista.busca(20);
	        lista.adiciona(posicao20 + 1, 53);
	        System.out.println("inserir 53: " + lista);

	        int posicao40 = lista.busca(40);
	        lista.remove(posicao40);
	        System.out.println("remover 40: " + lista);

	        lista.adicionaInicio(5);
	        System.out.println("adicionar 5 no início: " + lista);

	        lista.removeFinal();
	        System.out.println("remover o último elemento: " + lista);

	        System.out.println("Números da lista: " + lista);
	  }
}