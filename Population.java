package Assignment4;

public class Population {
  
  Pair<String, Integer>[] counts;
  
  public Population (Pair<String, Integer>[] counts) throws IllegalArgumentException {
    this.counts = counts;
  } // Population (Pair<String, Integer>[] counts)
  
  
  public void update() {
   
    
    for (int i = 0;  i < this.counts.length; i++  ) {
      // change Integer to int (intValue())
      for (int j = 0; j < this.counts[i].getRight().intValue(); j++) {
        Organism org = new Organism();
        org.update();
        
      } // inner for loop
       
      
      
    } // for loop
      
    
  } // update()
  
  
 
  
  public double calculateCooperationMean() {
    int totalval = 0;
    
    for (int i = 0; i < this.counts.length; i++) {
      Organism org = new Organism();
      if (org instanceof Cooperator) {
        totalval += this.counts[i].getRight().intValue();
      }else if(org instanceof PartialCooperator) {
        //we are dividing by 2 here because true false (0,1)/2 = 0.5
        totalval += this.counts[i].getRight().intValue() / 2;
      } else {
        totalval += 0;
      }
    }
    return totalval / this.counts.length;
  } //  calculateCooperationMean()
  
  public Pair<String, Integer>[] getPopulationCounts() {

    
  
  } // getPopulationCounts()
  
  
  } // Class Population 
