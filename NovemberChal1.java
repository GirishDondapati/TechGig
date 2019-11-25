package com.girish.techgig;

import java.io.*;
import java.util.*;
public class NovemberChal1 {
    public static void main(String args[] ) throws Exception {

    	long startTime = System.currentTimeMillis();
    	Scanner scan = new Scanner(System.in);
        String noOfDaysStr = "10";//scan.nextLine();
        String profitsScale = "14564545154411 14564545154416 14564545154409 14564545154413 14564545154400 14564545154418 14564545154406 14564545154404 14564545154390 14564545154425";//scan.nextLine();
        
        int noOfDays = Integer.parseInt(noOfDaysStr);
        String[] profils = profitsScale.split(" ");

        ArrayList<Double> profitsList = new ArrayList<Double>();
        for(int i = 0; i < profils.length; i++)
            profitsList.add(Double.parseDouble(profils[i]));

        double minLoss = 0;
        for(int i = 0; i < noOfDays-1; i++)
        {
            double iDateValue = profitsList.get(i);
            for (int j = i+1 ; j < noOfDays; j++)
            {
                double lossCr = iDateValue - profitsList.get(j);
                if(lossCr > 0)
                {
                	if(minLoss == 0)
                		minLoss = lossCr;
                	else if(minLoss > lossCr)
                        minLoss = lossCr;
                }
            }
        }
        System.out.println(minLoss);
        System.out.println(System.currentTimeMillis() - startTime);

   }
}