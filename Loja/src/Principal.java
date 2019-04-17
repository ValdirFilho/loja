
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scan1=new Scanner(System.in);
        System.out.print(carro.nome);
        carro.nome=scan1.next();
        System.out.print(carro.marca);
        carro.marca=scan1.next();
        System.out.print(carro.cor);
        carro.cor=scan1.next();
        System.out.print(carro.fabricacao);
        carro.fabricacao=scan1.next();
        System.out.print(carro.largura);
        carro.largura=scan1.next();
        System.out.print(carro.peso);
        carro.peso=scan1.next();
        
        System.out.println("nome"+carro.nome);
        System.out.println("marca"+carro.marca);
        System.out.println("cor"+carro.cor);
        System.out.println("fabricacao"+carro.fabricacao);
        System.out.println("largura"+carro.largura);
        System.out.println("peso"+carro.peso);

        System.out.println(carro.nome);
        System.out.println(carro.marca);
        System.out.println(carro.cor);
        System.out.println(carro.fabricacao);
        System.out.println(carro.largura);
        System.out.println(carro.peso);
        

    }

}
