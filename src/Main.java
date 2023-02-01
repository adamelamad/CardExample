public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("hearts","Queen");
        System.out.println(card1);

        System.out.println(card1 + " color: " + card1.getColor());
        System.out.println(card1.getCardValue());
    }
}
