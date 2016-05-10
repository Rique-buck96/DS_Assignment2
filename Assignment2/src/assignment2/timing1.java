/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Rique
 */
public class timing1
{
  
    public static void Time() {

    long problemSize = 100000000;
    System.out.println(" \n ProblemSize"+ "        Seconds");
    for (int count=0; count <8; count ++){
       //final long startTime = System.nanoTime();
       long startTime = System.currentTimeMillis();
        // the start of clock
        int work = 1;
        for (long x=0; x <problemSize; x++){
            work +=1;
            work -=1;
        }
         //the end of clock
          long endTime= System.currentTimeMillis();
         //final long endTime = System.nanoTime();
         //long elapsed = endTime- startTime;
         System.out.printf("%12d  %.3f \n", problemSize, (float)(endTime- startTime)/1000);
         problemSize *=2;
        }
    }    
 
}

