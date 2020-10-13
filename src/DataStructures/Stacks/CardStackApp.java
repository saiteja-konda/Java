package DataStructures.Stacks;

public class CardStackApp {
    BasicStack<String> stack = new BasicStack<String>();

    public static void main(String[] args) {
        CardStackApp app = new CardStackApp();
        app.stackCards();
        app.unstackCards();
        //restack cards
        app.stackCards();

        //how many cards are on the deck
        app.desckSize();

        //do we have queen of hearts in the deck
        app.containsCard("Red Card");

        //do we have a joker
        app.containsCard("Blue");

        //go to the king of diamonds
        app.goToCard("Yellow Card");

        //now how many cards are on the deck
        app.desckSize();
    }

    private void stackCards() {
        stack.push("Red Card");
        stack.push("Blue Card");
        stack.push("Green Card");
        stack.push("Yellow Card");
    }

    private void unstackCards() {
        //now pull the cards off the stack and print them
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
