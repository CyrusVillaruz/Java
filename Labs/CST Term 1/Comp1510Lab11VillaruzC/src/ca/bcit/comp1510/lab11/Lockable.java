package ca.bcit.comp1510.lab11;

/**
 * Lockable.
 * This interface manages whether something is locked or not.
 * 
 * @author cyrus
 * @version 1.0
 */
public interface Lockable {
    /**
     * Sets the key.
     * @param key to set.
     */
    void setKey(int key);
    
    /**
     * Locks a given object if correct key is given.
     * @param key to check.
     * @return true if locked.
     */
    boolean lock(int key);
    
    /**
     * Unlocks a given object if correct key is given.
     * @param key to check.
     * @return true if unlocked.
     */
    boolean unlock(int key);
    
    /**
     * Checks if an object is locked.
     * @return true if locked.
     */
    boolean locked();
}
