 class LinkedList {

        public static void main(String[] args) {
    
            //create ChainLink objects to create Nodes with them to fill the data instance 
            ChainLink color1 = new ChainLink("Pink");
            ChainLink color2 = new ChainLink("Black");
            ChainLink color3 = new ChainLink("Blue");
            ChainLink color4 = new ChainLink("Yellow");
            
            //create head nodes/append new nodes
            Node head = new Node( color1); 
            head.Append(color2);
            head.Append(color3);
            head.Append(color4);
    
            //Link the Nodes
           head.display();

           System.out.println("\n\nCreating a new ChainLink object and append it as a new Node in the LinkedList:");
           ChainLink color5 = new ChainLink("Green");
           head.Append(color5);
           head.display();
           System.out.println("\nNode at index 3: "+ head.getNodeAt(3).color);
    }
      
}
