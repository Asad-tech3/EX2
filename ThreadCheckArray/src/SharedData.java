import java.util.ArrayList;

/**
 * The SharedData class is used to store shared data between different parts
 * of the program. It includes a list of integers, a boolean win array,
 * a flag, and a final integer value.
 */
public class SharedData {

    /** List of integer values. */
    private ArrayList<Integer> array;

    /** Boolean array representing win states. */
    private boolean[] winArray;

    /** Boolean flag used for synchronization or status tracking. */
    private boolean flag;

    /** A constant integer value defined at object creation. */
    private final int b;

    /**
     * Constructs a new SharedData object.
     * 
     * @param array the list of integers to store
     * @param b the constant integer value
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the win array.
     * 
     * @return a boolean array representing win states
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the win array.
     * 
     * @param winArray the new boolean array
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the integer list.
     * 
     * @return an ArrayList of Integer values
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Returns the constant integer value.
     * 
     * @return the integer value b
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the flag status.
     * 
     * @return true if the flag is set, false otherwise
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag status.
     * 
     * @param flag the new flag value
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
