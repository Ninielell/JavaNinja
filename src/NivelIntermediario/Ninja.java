package NivelIntermediario;

public class Ninja {
    String aldeia;
    String nome;
    int idade;

    //Criar um método público personalizado

    /*
    * O metodo VOID não retorna valor nenhum!
    * */
    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou!");
    }

    /*
    * O metodo STRING vai ter que retornar uma string
    * */
    public String EuSouUmNinja() {
        return "Ola, meu nome é " + this.nome;
    }

    /*
    * O metodo INT vai ter que retornar um inteiro
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {


        return idadeMinimaParaSerHokage - this.idade;
    }
}