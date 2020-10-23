
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        hand.stream().forEach(System.out::println);
    }
    
    public void sort(){
        Collections.sort(hand, (p1, p2) -> p1.compareTo(p2));
    }
    
    public int calculateHand(){
        int sum = 0;
        for(Card card: hand){
            sum = sum + card.getValue();
        }
        return sum;
    }

    
    
    @Override
    public int compareTo(Hand newHand) {       
        int toCompare = calculateHand();
        newHand.calculateHand();
        if(toCompare == newHand.calculateHand()) {
            return 0;
        } else if (toCompare > newHand.calculateHand()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
