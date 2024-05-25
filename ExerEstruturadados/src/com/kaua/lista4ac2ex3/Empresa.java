package com.kaua.lista4ac2ex3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Empresa {
    private LinkedList<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new LinkedList<>();
    }
    public void inserirNoInicio(Funcionario funcionario) {
        funcionarios.addFirst(funcionario);
    }
    public void inserirNoFim(Funcionario funcionario) {
        funcionarios.addLast(funcionario);
    }
    public void removerPorNome(String nome) {
        ListIterator<Funcionario> iterator = funcionarios.listIterator();
        while (iterator.hasNext()) {
            Funcionario f = iterator.next();
            if (f.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Funcionário " + nome + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário " + nome + " não encontrado.");
    }
    public void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários na lista.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }
    public void atualizarSalario(String nome, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                f.setSalario(novoSalario);
                System.out.println("Salário do funcionário " + nome + " atualizado para " + novoSalario);
                return;
            }
        }
        System.out.println("Funcionário " + nome + " não encontrado.");
    }
    public boolean verificarFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
}