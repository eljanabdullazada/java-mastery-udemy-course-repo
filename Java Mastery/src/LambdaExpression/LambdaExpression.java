package LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {

        /*
        // Anonymous class
        Animals animal = new Animals() {
            @Override
            public void show(String animal, int speed) {

                System.out.println("A " + animal + " can reach " + "speed of " + speed + " kilometers per hour");

            }
        };
        animal.show("Cheetah", 120);
        */

        // Lambda Expression
        Animals animal = LambdaExpression::display;

        animal.show("Cheetah", 120);
    }

    // show() in Animal functional interface and display have the same signatures.
    public static void display(String animal, int speed){
        System.out.println("A " + animal + " can reach " + "speed of " + speed + " kilometers per hour");
    }


}
