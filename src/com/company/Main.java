package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static   List<Integer> listIntegers = new ArrayList<>();

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insira cinco numeros: ");


            for(int x = 0; x<5;x++){
                int y = scanner.nextInt();
                listIntegers.add(y);

            }
            for(Integer i: listIntegers){
                System.out.println("Numero: " + i);

            }


    }

}
