public class PlayingCard{
  private String suit;
  private String displayValue;
  String[][] cards = {
    {"A", "14"},
    {"K", "13"},
    {"Q", "12"},
    {"J", "11"},
  };
  public PlayingCard(String suit, String displayValue){
    this.suit = suit;
    this.displayValue = displayValue;
  }

  public int pointValue(){
    System.out.println(cards[0][0]);
    System.out.println(cards[0][1]);
    String card = "";
    boolean found = false;
    for(int i = 0; i <= 3; i++){
      if (displayValue.equals(cards[i][0])){
        found = true;
        card = cards[i][1];
      }
    }
    if(found == false){
      return Integer.parseInt(displayValue);
    }
    else {
      return Integer.parseInt(card);
    }
  }
}