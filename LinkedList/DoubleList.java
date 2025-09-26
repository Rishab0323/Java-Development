

    class DoubleLinkedList{
        private Node head;
        // private Node tail;


        private class Node{
            private int value;
            private Node next;
            private Node prev;

             public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        }

       

        public void insertFirst(int value){
            Node node = new Node(value);
            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }
            head = node;
        }

        public void display(){
            Node node = head;
            while(node != null){
                System.out.print(node.value  +"->");
                node = node.next;
            }
            System.out.println("END");
        }
    }

    class DoubleList{
    
    public static void main(String [] args){
        DoubleLinkedList  dl= new DoubleLinkedList();

        dl.insertFirst(5);
        dl.insertFirst(55);
        dl.insertFirst(555);
        dl.display();
    }
} 