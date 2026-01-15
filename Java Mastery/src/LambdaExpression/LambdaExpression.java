package LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {

        // Lambda Expression
        Animals animal = (a, s) -> {
            System.out.println("A " + a + " can reach " + "speed of " + s + " kilometers per hour");
        };

        animal.show("Cheetah", 120);

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

    }
}
