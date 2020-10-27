package DataStructures.Stacks;

public class CardStackApp {
    BasicStack<String> stack = new BasicStack<String>();

    public static void main(String[] args) {
        CardStackApp app = new CardStackApp();
        app.stackCards();
        app.unstackCards();
        app.stackCards();

        app.desckSize();

        app.containsCard("Red Card");

        app.containsCard("Blue");

        app.goToCard("Yellow Card");

        app.desckSize();
    }

    private void stackCards() {
        stack.push("Red Card");
        stack.push("Blue Card");
        stack.push("Green Card");
        stack.push("Yellow Card");
    }

    private void unstackCards() {
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    public void containsCard(String card) {
        System.out.println(stack.contains(card));
    }

    public void goToCard(String card) {
        System.out.println(stack.access(card));
    }

    public void desckSize() {
        System.out.println(stack.size());
    }
}
