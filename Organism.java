package Assignment4;

public class Organism {

  int energy;
  //String name;

  public Organism() {
    this.energy = 0;
  } // Organism ()


  public void update() {
    this.energy += 1;
  } // update()


  public int getEnergy() {
    return this.energy;
  } // getEnergy()

  public void incrementEnergy() {
    this.energy += 1;
  } // incrementEnergy()


  public void decrementEnergy() {
    if (this.energy > 0) {
      this.energy -= 1;
    } else {
      this.energy = 0;
    }
  } // decrementEnergy()


  // ---------------------------------WE NEED TO WORK ON THESE LATER -----------------//


  public String getType() {
    return null;
  } // getType()

  public Organism reproduce() throws Exception {
    if (this.getEnergy() >= 10) {
      return new Organism();
    } else {
      throw new Exception("cannot reproduce");
    }
  } // reproduce()

  public double getCooperationProbability() {
    return 0;

  } // getCooperationProbability()

  public boolean cooperates() {
    return true;

  } // cooperates()



} // Class Organism
