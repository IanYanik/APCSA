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
  
  public int compareTo(String cord){
    int dec = compareValue(cord);
    if (dec > pointValue()){
      return 1;
    }
    else if (dec < pointValue()){
      return -1;
    }
    else {
      return 0;
    }
  }

  public int compareValue(String cord){
        String card = "";
    boolean found = false;
    for(int i = 0; i <= 3; i++){
      if (cord.equals(cards[i][0])){
        found = true;
        card = cards[i][1];
      }
    }
    if(found == false){
      return Integer.parseInt(cord);
    }
    else {
      return Integer.parseInt(card);
    }
  }

  public String getDisplayValue(){
    return displayValue;
  }

  public String printCard(){
    String com = "Suit: " + suit + ". Value: " + displayValue;
    return com;
  }
}