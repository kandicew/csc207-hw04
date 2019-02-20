package Assignment4;

public class Defector extends Organism {
 public Defector() {
   this.energy= 0;
 }
  // -------------------------------------------WE NEED TO WORK ON THESE LATER --------------
  public String getType() {
    return "Defector";
  } // getType()



  @Override
 public Organism reproduce() throws Exception {
   if (this.getEnergy() >= 10) {
      return new Defector();
    } else {
      throw new Exception("cannot reproduce");
    }
  } // reproduce()

  @Override
  public double getCooperationProbability() {
    return 0;

  } // getCooperationProbability()

  @Override
  public boolean cooperates() {
    return false;

  } // cooperates()


}
