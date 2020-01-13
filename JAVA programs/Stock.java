class Stock {
  String tickerSymbol;
  String companyName;
  int price;
  double precentChange = 0.0;
  int totalShares;
  long marketCap;
  Stock(String tickerSymbol, String companyName, int price, int totalShares){
    this.tickerSymbol = tickerSymbol.toUpperCase();
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    marketCap = totalShares*price;
  }
  public void adjustPrice(int change){
    int stPrice = price;
    price = price + change;
    precentChange = change/stPrice * 100;
    marketCap = totalShares*price;
    printer();
  }
  public String toString(){
    String wow = "Ticker Symbol:" + tickerSymbol + " Company:" + companyName + " Current Price:" + price + " (+" + precentChange + ")" + " Market Cap: " + marketCap;
    return wow;
  }
  public void printer(){
    System.out.println(precentChange);
  }
}