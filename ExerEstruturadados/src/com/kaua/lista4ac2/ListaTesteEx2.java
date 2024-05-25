package com.kaua.lista4ac2;

public class ListaTesteEx2<T> {
	public static void main(String[] args) {
		ListaInvertida<String> lista = new ListaInvertida<>();

        lista.adiciona("palavra 1");
        lista.adiciona("palavra 2");
        lista.adiciona("palavra 3");
        lista.adiciona("palavra 4");
        lista.adiciona("palavra 5");
        lista.adiciona("palavra 6");
        lista.adiciona("palavra 7");
        lista.adiciona("palavra 8");
        lista.adiciona("palavra 9");
        lista.adiciona("palavra 10");

        System.out.println("Lista original: " + lista);

        lista.inverter();

        System.out.println("Lista invertida: " + lista);
    }
}