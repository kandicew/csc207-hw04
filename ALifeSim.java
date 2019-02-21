package Assignment4;

import java.io.PrintWriter;
import java.util.Random;

public class ALifeSim {

  public static void main (String[] args) throws Exception {
   //there are three things in the array  
    Pair<String, Integer>[] pop = (Pair<String, Integer>[]) (new Pair[3]);
    // parseInt changes a string to an integer so that it can take the actual value 
    pop[0] = new Pair<String, Integer>("Cooperator", Integer.parseInt(args[1]));
    pop[1] = new Pair<String, Integer>("Defector", Integer.parseInt(args[2]));
    pop[2] = new Pair<String, Integer>("PartialCooperator",Integer.parseInt(args[3]));
    Population pops = new Population (pop);
   
    //This uses the iterator # to update 
    for (int i = 0; i < Integer.parseInt(args[0]); i++){
      pops.update();
    }
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("After" + Integer.parseInt(args[0]) + " ticks");
    pen.println("Cooperators =" + pops.getPopulationCounts()[0].getRight());
    pen.println("Defectors =" + pops.getPopulationCounts()[1].getRight());
    pen.println("Partial =" + pops.getPopulationCounts()[2].getRight());
    pen.println("Mean Cooperation Probability = " + pops.calculateCooperationMean());   
  }
  
  Random random = new Random();
  
  
  
  
  
}
