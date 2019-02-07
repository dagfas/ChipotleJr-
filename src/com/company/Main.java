package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String[] riceSelection = {"white", "brown", "none"};
        String[] meatSelection = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String[] beansSelection = {"pinto", "black", "no"};
        String[] salsaSelection = {"mild", "medium", "hot", "no", "all"};
        String[] veggiesSelection = {"lettuce", "fajita", "veggies"};

        for (int i = 1; i <= 25; i++) {
            int rice = random.nextInt(3);
            int meat = random.nextInt(6);
            int beans = random.nextInt(3);
            int salsa = random.nextInt(5);
            int veggies = random.nextInt(3);


//            double basePrice = 3.00;
//            double allIngredients = 1.50;
//            double whiteRice = 0.5;
//            double brownRice = 0.5;


            if (riceSelection[rice].equals("none")) {
                riceSelection[rice] = "no rice";
               // totalPrice += basePrice;
            } else if (riceSelection[rice].equals("white")) {
                riceSelection[rice] = "white rice";
                //totalPrice =  basePrice + whiteRice;
            } else if (riceSelection[rice].equals("brown")) {
                riceSelection[rice] = "brown rice";
               // totalPrice = basePrice + brownRice;
            } else if (salsaSelection[salsa].equals("all")){
                //totalPrice = basePrice + allIngredients;
            }else{
                //totalPrice += basePrice;
            }



            System.out.println("Burrito " + i + ": " + riceSelection[rice] + "," + " " + meatSelection[meat] + ", " + beansSelection[beans] + " beans," + " " + salsaSelection[salsa] + " salsa, " + veggiesSelection[veggies]);
            //System.out.println("Your total is: $" + totalPrice);


        }



    }


}

