package Assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Population {

  Pair<String, Integer>[] counts;
  Organism[] orgs;

  public Population(Pair<String, Integer>[] counts) throws IllegalArgumentException {
    this.counts = counts;
    // get the array length
    int arraylength = 0;
    for (int i = 0; i < counts.length; i++) {
      // this gets a count of the population from the counts array and adds it up
      arraylength += counts[i].getRight().intValue();

    } // for goes through the pair array

    // this a population array
    this.orgs = new Organism[arraylength];
    // moved outside
    int start = 0;
    for (int i = 0; i < counts.length; i++) {
      for (int j = 0; j < counts[i].getRight().intValue(); j++) {
        orgs[j + start].name = counts[i].getLeft();

        // think of end @ 7 indexed 6
        if (j == counts[i].getRight().intValue() - 1) {
          start = j + start + 1;
        } // if
      } // for goes through each pair
    } // for goes through the pair array
  } // Population (Pair<String, Integer>[] counts)


  public void update() throws Exception {

    for (int i = 0; i < orgs.length; i++) {


      orgs[i].update();
      if (orgs[i].cooperates()) {
        orgs[i].decrementEnergy();

        // made a new array of Int and got the value as int

        Integer[] arr = new Integer[orgs.length];

        for (int j = 0; j < orgs.length; j++) {

          arr[j] = Integer.valueOf(j);

        }

        // converted the array into list (WON"T WORK WITH int because not a object)
        List<Integer> list = Arrays.asList(arr);

        // shuffled list
        Collections.shuffle(list);

        // go through the random list and pick out the first 8 elements of the randomized list
        for (int k = 0; k < 8; k++) {
          int counter = 0;
          // if this index is the one being decremented from above i , then skip it
          if (list.get(k).intValue() == i) {
            counter++;
          } // if

          // if the index we decrement from appears we skip it (GO OVER THIS ONE)
          orgs[list.get(k + counter).intValue()].incrementEnergy();
        } // for



      } // if cooperates


      Organism orgs2 = orgs[i].reproduce();

      Random rand = new Random();

      int l = rand.nextInt(orgs.length);
      // replaces just means that we will put l in place of org 2
      orgs[l] = orgs2;


    } // for

  }// update

  public double calculateCooperationMean() {
    int totalval = 0;

    for (int i = 0; i < this.counts.length; i++) {
      Organism org = new Organism();
      if (org instanceof Cooperator) {
        totalval += this.counts[i].getRight().intValue();
      } else if (org instanceof PartialCooperator) {
        // we are dividing by 2 here because true false (0,1)/2 = 0.5
        totalval += this.counts[i].getRight().intValue() / 2;
      } else {
        totalval += 0;
      }
    }
    return totalval / this.counts.length;
  } // calculateCooperationMean()

  public Pair<String, Integer>[] getPopulationCounts() {

    int CooperatorCount = 0;
    int DefectorCount = 0;
    int PartialCooperatorCount = 0;


    for (int i = 0; i < this.orgs.length; i++) {

      if (this.orgs[i].getType().equals("Cooperator")) {
        CooperatorCount++;
      } // if Cooperator

      else if (this.orgs[i].getType().equals("Defector")) {

        DefectorCount++;

      } // else if Defector

      else if (this.orgs[i].getType().equals("PartialCooperator")) {
        PartialCooperatorCount++;
      } // else if PartialCooperator

    } // for



    Pair<String, Integer>[] pop = (Pair<String, Integer>[]) (new Pair[3]);
    pop[0] = new Pair<String, Integer>("Cooperators", CooperatorCount);
    pop[1] = new Pair<String, Integer>("Defectors", DefectorCount);
    pop[2] = new Pair<String, Integer>("PartialCooperators", PartialCooperatorCount);

    return pop;

  } // getPopulationCounts()


} // Class Population
