/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author prahata
 */
public class SumDiceRoll {
    public static void main(String[] args) 
    {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target nspace value to achieve by a single dice: ");

       // get their input as a String
        int nspaces = scanner.nextInt();
        //System.out.println(username);
        //int nspaces=10; 
        System.out.println("You want to check target value : "+ nspaces +"\n\n");
        int totalways=0;
         for (int j=1;j<=nspaces;j++){
             int diceThrowsandmaxvalues[] = new int[j];
            int temp = sumNWayDice(diceThrowsandmaxvalues,j,nspaces );
              System.out.println("throw dice "+j +" times , have " + temp+" ways to get "+ nspaces);
            totalways+= temp;
         }
         
         System.out.println("total number of ways of throwing  , for a 6 faces dice to get nspaces "+nspaces+" is "+totalways);
   
        }catch(InputMismatchException e){
            System.out.println(" Please give integer value only !");
        }  
      }
    
    
    static int sumNWayDice(int diceThrowsandmaxvaluesint[],int Nthrows, int nspaces ){
       
    int temp_sum = 0;
  
  
        if (Nthrows==0)
            return 0;
 
        if (Nthrows==1){
            if (nspaces>=1 && nspaces<=6){
                
               
                diceThrowsandmaxvaluesint[0] = nspaces;
                for (int i : diceThrowsandmaxvaluesint)
                    System.out.print(i+", ");
                System.out.println();
                return 1;
            }
            else
                return 0;
        }
 
       
       // if (lookup[Nthrows][nspaces] != 0)
        //    return lookup[Nthrows][nspaces];
        
        for(int i=1; i<=6; i++){
           diceThrowsandmaxvaluesint[Nthrows-1] = i;
           
           temp_sum += sumNWayDice( diceThrowsandmaxvaluesint,Nthrows-1, nspaces-i);
        }
         //lookup[Nthrows][nspaces] = temp_sum;
        return temp_sum;
    }
}
