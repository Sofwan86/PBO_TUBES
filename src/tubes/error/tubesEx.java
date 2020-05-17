/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.error;

/**
 *
 * @author HP
 */
public class tubesEx extends Exception {

    /**
     * Creates a new instance of <code>tubesEx</code> without detail message.
     */
    public tubesEx() {
    }

    /**
     * Constructs an instance of <code>tubesEx</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public tubesEx(String msg) {
        super(msg);
    }
}
