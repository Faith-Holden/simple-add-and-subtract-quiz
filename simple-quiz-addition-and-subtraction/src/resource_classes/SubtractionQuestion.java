package resource_classes;

public class SubtractionQuestion implements IntQuestion {

    private int a, b; // The numbers in the problem.
    public SubtractionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        if (a>=b){
            return "What is " + a + " - " + b + " ?";
        }else{
            return "What is " + b + " - " + a + " ?";
        }

    }
    public int getCorrectAnswer() {
        if(a>=b){
            return a-b;
        }else{
            return b-a;
        }
    }

}
