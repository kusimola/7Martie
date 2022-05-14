package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean continuare = true;

        List<String> nume = new ArrayList<>();
        List<Double> salariu = new ArrayList<>();

        while (continuare == true) {
            System.out.println("Introdu nume salariat: ");
            Scanner scannerNume = new Scanner(System.in);
            String numeSalariat = scannerNume.nextLine();
            nume.add(numeSalariat);

            System.out.println("Introdu salariul: ");
            Scanner scannerSalariu = new Scanner(System.in);
            double salariuSalariat = scannerSalariu.nextDouble();
            salariu.add(salariuSalariat);

            System.out.println("Doresti sa introduci alt salariat in continuare? true/false");
            Scanner scannerContinuare = new Scanner(System.in);
            continuare = scannerContinuare.nextBoolean();
        }

        System.out.println("Salariatii sunt " + nume);
        System.out.println("Salariile sunt " + salariu);


        double salariuMaxim = Double.MIN_VALUE;
        String salariuMaximNume = "";
        for (int i = 0; i < salariu.size(); i++) {
            if (salariu.get(i) > salariuMaxim)
            { salariuMaxim = salariu.get(i);
                salariuMaximNume = nume.get(i);}
        }


        System.out.println("Salariul cel mai inalt este: " + salariuMaxim + " " + salariuMaximNume);



    }
}
