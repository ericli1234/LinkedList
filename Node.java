
/**
 * A node in an abstract data structure
 * 
 * @author Eric Li
 * @version 1.0 2016-01-20
 */
public class Node
{
    // instance variables
    private int data;
    private Node next;

    /**
     * Constructs an empty node which does not point to another.
     */
    public Node()
    {
        // initialise instance variables
    }
    
    /**
     * Constructs a node with the specified data and link to a node which follows this node.
     * 
     * @param data the data to be stored in this node
     * @param next the node which follows this node
     */
    public Node(int data, Node next)
    {
        // initialise instance variables
    }

    /**
     * Compares this node to the specified node.
     * 
     * @param otherObject the object to which this node is compared
     * @return <code>true</code> if this node is the same as <code>otherObject</code>, otherwise <code>false</code>
     */
    public boolean equals(Object otherObject)
    {

    } // end of method equals(Object otherObject)
    
    /**
     * Returns the data stored in this node.
     * 
     * @return the data stored in this node
     */
    public int getData()
    {
        return data;
    } // end of method getData()
    
    /**
     * Returns the node which follows this node.
     * 
     * @return the node which follows this node
     */
    public Node getNext()
    {
        return next;
    } // end of method getNext()
    
   /**
     * Returns a string representation of this node
     * 
     * @return a string representation of this node
     */
    public String toString()
    {
        return
        "["
        + "Data: " + data
        + "Next Node: " + next
        + "]";
    } // end of method toString()
    
    
    /**
     * Sets the data to be stored in this node.
     * 
     * @param data the data to be stored in this node
     */
    public void setData(int data)
    {
       this.data = data;
    } // end of method setData(int data)
    
    /**
     * Sets the node which follows this node.
     * 
     * @param data the data to be stored in this node
     */
    public void setNext(Node next)
    {
        this.next = next;
    } // end of method setNext(Node next)
}
