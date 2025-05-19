package NivelIntermediario.NivelIntermediario12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[5];

        // Listas
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // Queue // Filas
        Queue<String> ninjasQueue = new LinkedList<>(); //Sempre vai ser iniciado com LinkedList
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        System.out.println("ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("ninjas na fila depois do poll: " + ninjasQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no HEAD/primeiro da fila: " + ninjasQueue.peek());
        ninjasQueue.poll();

        // Adicionar na fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("ninjas na fila: " + ninjasQueue);

        // Deletar o tail
        // TOMANDO NO CU

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // Verificar se está vazia a fila
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia!");
        }
    }
}