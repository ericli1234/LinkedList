
/**
 * A linked list implementation.
 * 
 * @author Eric Li
 * @version 1.0 2016-01-20
 */
public class LinkedList
{
   /**
    * Implements a sorted linked list
    */
   public static void main(String[] argument)
   {
      int[] data = {10, -3, 7, 2, 18, 12, -15, 0, -3};
      Node head = null;
      
      // Insert data
      for (int i = 0; i < data.length; i++)
      {
         // Create a new node.
         Node newNode = new Node(data[i], null);
         
         if (head == null)
         {
            head = newNode;
         }
         else if (newNode.getData() < head.getData())
         {
            head = newNode;
         }
         else
         { 
            boolean checking = true;
            while (checking) 
            {
                
            }
            // Traverse the linked list looking for the correct insertion point.
         } // end of if (head == null)
      } // end of for (int i = 0; i < data.length; i++)
      System.out.println(head);
   } // end of method main(String[] argument)
} // end of class LinkedList
