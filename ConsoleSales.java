/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
public class ConsoleSales {

    public static void main(String[] args) {
        System.out.println("-----------------------\n GAMNG CONSOLE REPORT \n-----------------------");
        System.out.println();
        
        //Populate Array for cities
        String [] cities = {"Cape Town","Port Elizabeth", "Pretoria"};
        for (int i =0; i< cities.length; i++){
            System.out.println(cities[i]);
        }
        
      String [] consoles = {"PS5","XBOX", "SWITCH"};
        for (int x =0; x< consoles.length; x++){
            System.out.print(consoles[x]+" ");
        }
                
        // Populate 2-D Array for Console and Sales
        int[][] consoleSales = {{1000,2000,3000},
                                {2000,3000,4000},
                                {1500,1100,1200}
                               };
        //outer loop
        for (int row =0; row < consoleSales.length; row++)
            for (int column = 0; column<consoleSales[row].length; column ++){
                //Print ech each value
                System.out.print(consoleSales[row][column]+ " ");
            }
        }
    }

