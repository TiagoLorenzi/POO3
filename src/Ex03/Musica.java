package Ex03;

import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double somatorioAvaliacoes;
    double mediaAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("titulo:" + titulo);
        System.out.println("artista:" + artista);
        System.out.println("Ano de Lançamento:" + anoLancamento);
        System.out.println("Avaliação:" + avaliacao);
        System.out.println("número Avaliações:" + numAvaliacoes);
    }
    public void lerDadosMusica(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o titulo: ");
        titulo = ler.nextLine();
        System.out.println("Informe o artista: ");
        artista = ler.nextLine();
        System.out.println("Ano de Lançamento: ");
        anoLancamento = ler.nextInt();
        System.out.println("Avaliação: ");
        avaliacao = ler.nextDouble();

        atualizaMedia(avaliacao);
    }
    public void atualizaMedia(double avaliacao){
        numAvaliacoes++;
        somatorioAvaliacoes = somatorioAvaliacoes + avaliacao;
        mediaAvaliacoes = somatorioAvaliacoes / numAvaliacoes;


    }
}
