# csc207-hw04
Names: Kandice Wu, Kedam Habte, Bella Koures
This project is about the implementation of artifcial life, especially in the population growth of organism.
Sources used:
https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
https://stackoverflow.com/questions/16000196/java-generating-non-repeating-random-numbers
https://www.geeksforgeeks.org/collections-shuffle-java-examples/

Testing:

TEST NAME : 1 cooperator and the rest defectors;

PREDICTION FOR THE TEST:  Since this is a defector dominant test, we predict that the mean cooperation probability for this specific test will be around 0 because the defector will dominate over the cooperator.

POPULATION: 10 

Average Cooperation: 0.0

Analysis of Prediction: Our prediction for this test seems accurate based on the following results. 


TEST NAME : 1 cooperator and the rest defectors;
PREDICTION FOR THE TEST: Since this is a defector dominant test we predict that the mean cooperation probability for this specific test will also be around 0 because the defector will dominate over the cooperator.

POPULATION: 100

Average Cooperation: 0.0

Analysis of Prediction: Our prediction for this test seems accurate based on the following results.


TEST NAME : 1 defector and the rest cooperators

PREDICTION FOR THE TEST: Since this is a cooperator dominant test we predict that the mean cooperation probability for this specific test will be higher than 0.5 because the cooperators  will dominate over the defectors, but since the sample size is small it may be that the probability could be a bit lower than 1.

POPULATION: 10 

Average Cooperation: 0.84

Analysis of Prediction:  We were correct in our prediction, and the average cooperation supports that fact.


TEST NAME : 1 defector and the rest cooperators

PREDICTION FOR THE TEST: Since this is a cooperator dominant test we predict that the mean cooperation probability for this specific test will be higher than 0.5 because the cooperators  will dominate over the defectors, but since the sample size is small it may be that the probability could be a bit lower than 1.

POPULATION: 10 

Average Cooperation: 0.84

Analysis of Prediction:  We were correct in our prediction, and the average cooperation supports that fact.



TEST NAME : 1 defector and the rest cooperators
PREDICTION FOR THE TEST: Since this is a cooperator dominant test we predict that the mean cooperation probability for this specific test will  also be around 1 because the cooperators  will dominate over the defectors. Since the population is 100 and larger than our first sample , we predict that most of the tests if not all will mostly be 1.

POPULATION: 100

Average Cooperation: 0.903

Analysis of Prediction: This test was almost exactly as expected, but there exists a  single result that is an outlier, and we believe that this may be a result of the random generator. 


TEST NAME :1/3 cooperators, 1/3 defectors and 1/3 partial cooperators

PREDICTION FOR THE TEST: For this test we predict that the cooperation probability will be lower than 0.4 because defector and partial cooperator have more dominance in this test, and cooperator only makes up a third of the test. 
POPULATION: 10

Average Cooperation: 0.02

Analysis of Prediction:  Our prediction appears to be correct, but we overestimated the probability value. It could be that the sample size for this test is only 10, so there is a lower probability for cooperation. 


TEST NAME :1/3 cooperators, 1/3 defectors and 1/3 partial cooperators

PREDICTION FOR THE TEST: For this test we predict that the cooperation probability will be lower than 0.4 because defector and partial cooperator have more dominance in this test, and cooperator only makes up a third of the test. 

POPULATION: 100

Average Cooperation: 0.0

Analysis of Prediction: Our prediction appears to be correct. 

CONCLUDING PARAGRAPH 

From the results we have gathered it appears that defector dominates over cooperators, and this is because of how we made the update procedure. When we update cooperators, they lose one energy point, so that it will take them the double amount of time to reach the time to reproduce than defectors and non-cooperator partial cooperators. So the population growth of defectors is faster than cooperators. When there is more defectors and partial cooperators we can see that the mean cooperability decreases. 

