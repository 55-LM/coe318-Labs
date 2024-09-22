/**
 *
 * @author Alvi Alam
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int dig;
    private int mod;
    private Counter left;
    
    public Counter(int modulus, Counter left) { //Constructor 
        this.dig=0;
        this.mod=modulus;
        this.left=left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.dig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        if(this.dig<this.mod){
            this.dig=digit;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        this.dig++;
        if(this.dig==this.mod){
            this.dig=0; //reaches maximum value
            if(this.left!=null){ //increments left neighbour if it doesn't equal null
                this.left.increment();
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(this.left==null){
            return this.dig;
        }else{
            return(this.dig+this.mod*(this.left.getCount()));
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}

