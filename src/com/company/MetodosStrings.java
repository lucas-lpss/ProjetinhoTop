package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosStrings
{
    static List<String> listString = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner list = new Scanner(System.in);
        System.out.println(" Insira 3 Strings: ");
        for(int z = 0; z < 3 ; z++)
        {
          String s = list.nextLine();
          listString.add(s);

        }

        for(String a : listString)
        {
            if (a.equals("AbcD"))
            {
                System.out.println(" É " + true + " que AbcD é igual  " + a);
            }
            else if (a.equals("ABCd"))
            {
                System.out.println("É " + true + "que aBVd é igual  " + a);
            } else {
                System.out.println(a + "não é igual nem  " + "a AbcD " + "nem igual a aBCd ");
                   }
        }
        if (listString.contains("FFFg"))
            {
            System.out.println(" FFFg existe na lista! ");
            }
        else
            {
            System.out.println("FFFg não exixte na lista! ");
            }
        if(!listString.contains("1"))
            {
            System.out.println(" 1 não existe na lista ");

            }
        else
            {
            System.out.println(" 1 existe na lista ");
            }
    }
}
