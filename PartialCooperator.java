package Assignment4;

import java.util.Random;

public class PartialCooperator extends Organism {

  public PartialCooperator() {
this.energy = 0;
  }
  // -------------------------------------------WE NEED TO WORK ON THESE LATER --------------

  @Override
  public String getType() {
    return "PartialCooperator";
  } // getType()

  @Override
  public Organism reproduce() throws Exception {
    if (this.getEnergy() >= 10) {
      return new PartialCooperator();
    } else {
      throw new Exception("cannot reproduce");
    }
  } // reproduce()


  @Override
  public double getCooperationProbability() {
    return 0.5;

  } // getCooperationProbability()

  @Override
  public boolean cooperates() {


    Random rand = new Random();

    int j = rand.nextInt(2);

    if (j == 1) {
      return true;
    } else {
      return false;
    }
  } // cooperates()

} // class PartialCooperator
