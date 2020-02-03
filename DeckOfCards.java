import java.util.ArrayList;
public class DeckOfCards{
  private ArrayList<String> cards = new ArrayList<String>();

  public DeckOfCards(){
insertSuit("Heart");
insertSuit("Spade");
insertSuit("Club");
insertSuit("Dimond");
  }

  public void insertSuit(String suit){
    for (int i = 0; i <= 10; i++){
      cards.add(suit);
      cards.add(Integer.toString(i));
    }
    cards.add(suit);
    cards.add("J");
    cards.add(suit);
    cards.add("Q");
    cards.add(suit);
    cards.add("K");
    cards.add(suit);
    cards.add("A");
  }

  public String[] nextCard(){
String[] returner = {cards.get(cards.size()-2), cards.get(cards.size()-1)};
//returner[0] = cards.get(cards.size()-1);
//returner[1] = cards.get(cards.size());
cards.remove(cards.size()-1);
cards.remove(cards.size()-1);
return returner;
  }
  public String chopper(int i){
    String returner = " (" + cards.get(i) + ", " + cards.get(i+1) + ")";
    return returner;
  }

  public String toString(){
    int lng = cards.size()/2;
    String returner = "[" + lng + "]";
    for (int i = 0; i <= lng; i++){
      i++;
      returner = returner + chopper(i);
    } 
    return returner;
  }
}