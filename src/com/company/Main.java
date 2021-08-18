package com.company;

import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int totalIncome = 0;
        System.out.println("Enter all the ages: ");

        int countPatient = 0;
        while(true){
            int age = 0;
            String AGE = Sc.nextLine();
            if(AGE==""){
                break;
            }else{
                age = Integer.parseInt(AGE);
            }
            if(age<17){
                totalIncome = totalIncome+200;
            }else if(age>=17 && age<=40){
                totalIncome = totalIncome+400;
            }else if(age>40){
                totalIncome = totalIncome+300;
            }
            countPatient++;
            if(countPatient>20){
                break;
            }
        }
        System.out.println("Total Income: "+totalIncome);
    }
}