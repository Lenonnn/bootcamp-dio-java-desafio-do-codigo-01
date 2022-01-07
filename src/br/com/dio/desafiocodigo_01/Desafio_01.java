package br.com.dio.desafiocodigo_01;
import java.io.IOException;
import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
        if ( ( A + B ) > N )
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }
}
