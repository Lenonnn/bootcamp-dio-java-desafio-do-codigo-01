package br.com.dio.desafiocodigo_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //System.out.println("Digite primeiro número: ");
        int a = Integer.parseInt(st.nextToken());
        //System.out.println("Digite Segundo número: ");
        int b = Integer.parseInt(st.nextToken());
        int total = a + b ;
        System.out.println("A Soma entre os dois números é: " + total);

    }
}
