package NivelIntermediario.NivelIntermediario11;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e tem ref de memoria.
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinamicas e tamanho aumenta e diminui conforme precisa.
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatóriamente o primeiro a sair.
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki"); // Push é o correto a ser usado, mas também pode usar o ADD.
                                                 // Pop tira o ultimo elemento da lista.
                                                 // Peek verifica qual o próximo elemento da pilha.
                                                 // Size verifica o tamanho.
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Minha stack atual = " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha stack atualizada com pop = " + ninjasStack);
        System.out.println("Minha stack com  o próximo elemento do topo = " + ninjasStack.peek());
        System.out.println("Tamanho da stack = " + ninjasStack.size() + " elementos");
    }
}