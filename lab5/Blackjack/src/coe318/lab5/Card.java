package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
  
  //Declaring variables used in constructor
  int rankc;
  int suitc;
  boolean faceUpc;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) { //Constructor
      rankc = rank;
      suitc = suit;
      faceUpc = faceUp;
    //FIX THIS
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return faceUpc; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
      faceUpc = faceUp;
    //FIX THIS
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return rankc; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return suitc;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    //FIX THIS
    if(c.rankc == rankc && c.suitc == suitc){ //If both ranks and suits of both cards are equal the return is true 
        return true;
    } else {
        return false;
    }
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      //FIX THIS
      if(this.rankc < c.rankc){ //Used to compare the ranks of the cards
          return -1;
      } else if(this.rankc > rankc){
          return 1;
      }
      
      if(this.suitc > c.suitc){ //Used to compare the suits of the cards
          return 1;
      } else if(this.rankc < rankc){
          return -1;
      } else {
          return 0;
      }
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() { //Uses switch statement to take int value and return a string value corresponding to it
      //FIX THIS
      switch(this.rankc){
          case 11:
              return "Jack";
          case 12:
              return "Queen";
          case 13:
              return "King";
          case 14:
              return "Ace";
          default:
              return Integer.toString(rankc);
      }
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      //FIX THIS
      String suit = " ";
      switch(this.suitc){ //Uses switch statement to take int value and return a string value corresponding to it
          case 0:
              suit = " Clubs";
              break;
          case 1:
              suit = " Diamonds";
              break;
          case 2:
              suit = " Hearts";
              break;
          case 3:
              suit = " Spades";
              break;
      }
      return suit;
  }
  
  public int score(){ //This method is used to get the total score of a card
      if(this.rankc == 14){ //
          return 1;
      } else if(rankc > 10){
          return 10;
      } else {
          return rankc;
      }
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() { //If the card is face up it will be displayed if not a question mark will be displayed
      //FIX THIS
      if(isFaceUp() == true){
          return "" + getRankString() + " of" + getSuitString();
      } else {
          return "?";
      }
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
