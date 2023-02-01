import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit;
    private String faceName;

    /**
     * This is the constructor, it will create a new Card object in system
     * memory. It will validate the suit and faceName are found in standard playing cards
     * @param suit "hearts","clubs","spades","diamonds"
     * @param faceName "2","3","4",..."jack","queen","king","ace"
     */
    public Card(String suit, String faceName) {
        this.suit = suit;
        this.faceName = faceName;
    }




    public String getSuit() {
        return suit;
    }

    /**
     * Validates the argument and sets the instance variable
     * @param suit "hearts","clubs","spades","diamonds"
     */

    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        if (suit.charAt(suit.length()-1) != 's')
            suit=suit+"s";

        List<String> validSuits = Arrays.asList("hearts","clubs","spades","diamonds");
        //test if the argument is in the list of valid suits
        if(validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was not in the list of " + validSuits);

    }

    public String getFaceName() {
        return faceName;
    }

    public List<String> getFaceNames(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public void setFaceName(String faceName) {

        List<String> validFaceNames = getFaceNames();
        faceName = faceName.toLowerCase();

        if(validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " was not in the list of " + validFaceNames);
    }

    public String toString(){
        return faceName + " of " + suit;
    }

    /**
     *  This method returns the color of the suit.
     * Black = clubs or spades
     */

    public String getColor(){

        if(suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    /**
     * This returns the value of the card
     * faceName "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     */
    public int getCardValue(){
        List<String> faceNames = getFaceNames();
        int indexPosition = faceNames.indexOf(faceName);
        return indexPosition + 2;
    }
}


