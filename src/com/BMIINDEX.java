package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BMIINDEX {
    public static void main(String[] args) throws IOException{

        float heightlilian , weightlilian, bmililian;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightlilian = Float.parseFloat(br.readLine())/501;
        System.out.println("Enter your weight in kg (and press Enter): ");
        weightlilian = Float.parseFloat(br.readLine());

        bmililian = (float) (weightlilian / (Math.pow(heightlilian, 2)));
        System.out.printf("Your BMI is: " + "%2.2f,  \n", bmililian);


        if (bmililian < 16){
            System.out.println("You are slim/skinny/suffering from starvation");
        } else if ((bmililian >= 16)&&(bmililian < 16.99)){
            System.out.println("You're emaciated");
        }else if ((bmililian >= 17)&&(bmililian < 18.49)){
            System.out.println("You're underweight");
        }else if ((bmililian >= 18.50)&&(bmililian < 22.99)){
            System.out.println("You're in a low range or the norm");
        }else if ((bmililian >= 23)&&(bmililian < 24.99)){
            System.out.println("You're in the high range of the norm");
        }else if ((bmililian >= 25)&&(bmililian < 27.49)){
            System.out.println("You're overweight ot pre-obese");
        }else if ((bmililian >= 27.50)&&(bmililian < 29.99)){
            System.out.println("You're overweight");
        }else if ((bmililian >= 30)&&(bmililian < 34.99)){
            System.out.println("You've 1st degree obesity");
        }else if ((bmililian >= 35)&&(bmililian < 39.99)){
            System.out.println("You've 2nd degree obesity");
        }else if ((bmililian > 40)){
            System.out.println("You've 3rd degree obesity");
        }








    }






}
