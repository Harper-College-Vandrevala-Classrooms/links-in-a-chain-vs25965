public class Node {
  String color;
  Node next;

  //This constructor simulates a node with the data instance that saves the value(color) of the node 
  //and next instance which is a reference to the succeeding node.
    Node(ChainLink _chainLink)
    {
        this.color = _chainLink.toString();
        this.next = null;
    }

    void Append (ChainLink _NewchainLink)
    {
        Node current = this; // Start with the current node

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(_NewchainLink); // Create a new node for the new ChainLink and append it
    }

    void display() {
        Node current = this; // Start from the head node
        while (current != null) {
            System.out.print(current.color + " -> "); // Print the color
            current = current.next; // Move to the next node
        }
    }

    // Method to get a specific node by index
    Node getNodeAt(int index) {
        Node current = this; // Start from the head node
        int count = 0; // Initialize a counter

        // Traverse the list until the desired index is reached
        while (current != null) {
            if (count == index) {
                return current; // Return the node at the specified index
            }
            current = current.next; // Move to the next node
            count++; // Increment the counter
        }

        return null; // Return null if the index is out of bounds
    }

}
