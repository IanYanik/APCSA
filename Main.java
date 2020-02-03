public class Main {
  public static void main( String[] args ){
    PlayingCard example = new PlayingCard ("Heart", "K");
    PlayingCard example2 = new PlayingCard ("Spade", "A");
    example.compareTo("J");
    example2.compareTo("4");
    example.getDisplayValue();
    example2.getDisplayValue();
    System.out.println(example);
    System.out.println(example.printCard());
    System.out.println(example2.printCard());
    DeckOfCards example3 = new DeckOfCards ();
    example3.nextCard();
    System.out.println(example3.toString());
    example3.nextCard();
    System.out.println(example3.toString());
  }
}