package NivelIntermediario.ResumaoArrayListStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] nomeNinjaArray = new String[3];
        System.out.println("----------- ARRAY -----------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[0]);

        /*
        * Arrays comecam com index 0
        * Arrays são estaticos, portanto é necessário alocar memória para ele.
        * Se tentar printar o nome do Array sem passar uma referencia/index, ele vai retornar o endereço da memória.
        * precisa ser nomeNinjaArray[x] para mostrar o que tem dentro da posição de memória.
        *       nomeNinjaArray = [Ljava.lang.String;@7b23ec81
        *       nomeNinjaArray[0] = Naruto Uzumaki
        *
        */

        System.out.println("----------- LISTA -----------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");

        System.out.println("nomeNinjaList = " + nomeNinjaList);
        System.out.println("nomeNinjaList.get(1) = " + nomeNinjaList.get(1));

        /*
        * Listas assim como arrays começam com index 0
        * Listas são dinamicas, portanto elas podem aumentar ou diminuir o tamanho dela
        * Se tentar printar o nome da Lista sem passar referencia/index, diferente do array ele vai printar todos elementos da lista.
        * podemos pegar o dado armazenado em cada indice se quiser, é só digitar o nome da lista seguido de .get(index)
        *           exemplo:
        *               NomeNinjaList.get(1);
        *
        * Listas podem adicionar ou remover itens quando quiser, é basicamente um Array com super poderes!
        *
        * IMPORANTE: As listas são um pouco mais lentas que o Array.
        *
        */

        System.out.println("----------- STACK -----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");

        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        nomeNinjaStack.pop();
        System.out.println("nomeNinjaStack após tirar com .pop = " + nomeNinjaStack);
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        nomeNinjaStack.pop();
        System.out.println("nomeNinjaStack após tirar com .pop = " + nomeNinjaStack);
        nomeNinjaStack.push("Kakashi Hatake");
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("nomeNinjaStack Continua igual após o peek() = " + nomeNinjaStack);
        /*
        * Os stacks funcionam igual uma lista, possui súper poderes e são dinamicas (pau no cu da máquina)
        * A difrença é que Stacks são unicos e exigem uma ordem! | O ULTÍMO A ENTRAR É O PRIMEIRO A SAIR!
        *
        * Diferente da lista, no STACK usamos Push para adicionar e pop para remover. E sempre ira remover o ultimo adicionado.
        * Podemos utilizar o .ADD no STACK, mas não é adequado utilizar.
        * nós vemos a pilha na vertical, tipo uma pilha de livros. Para pegar o da base precisamos tirar o do topo primeiro!
        *
        *   3 princiapis métodos.
        *   push() // colocar na pilha
        *   pop() // remover o ultimo adicionado na pilha
        *   peek() // Mostrao elemento que temos no topo sem remover.
        *
        * */
    }
}
