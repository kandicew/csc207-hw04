package Assignment4;

public class Cooperator extends Organism {

 
  // -------------------------------------------WE NEED TO WORK ON THESE LATER --------------

  @Override
  public String getType() {
    return "Cooperator";
  } // getType()

  
  @Override
  public Organism reproduce() throws Exception {
    
    if (this.getEnergy() >= 10) {
      return new Cooperator();
    } else {
      throw new Exception("cannot reproduce");
    }
  } // reproduce()
  

  @Override
  public double getCooperationProbability() {
    return 1;

  } // getCooperationProbability()

  @Override
  public boolean cooperates() {
    return true;

  } // cooperates()



}
