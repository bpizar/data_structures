package org.example.linkedList;

import java.util.Objects;

public class LinkedList {
    /**
     * Inner Node class
     */
    private class Node{
        private int value;
        private Node next = null;

         public Node( int value ){
             this.value = value;
         }

         public void setValue(int value){
             this.value = value;
         }

        public void setNext( Node next){
             this.next = next;
        }
        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

   private Node head = new Node(0);

    public int getHeadValue() {
        return head.getNext().getValue();
    }
    public int getTailValue(){
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        return n.getValue();
    }

    public void appendToTail (int value){
        Node end = new Node(value);
         Node n = head;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    /**
     * Returns first value found
     *
     * @param target
     * @return target value or -1 if not found
     */
    public int findValue(int target){
        Node n = head;
        int returnVal = -1;

            while ( n.next!= null && n.next.getValue() != target) {
                n = n.next;
            }
        if(n.next == null)
            return returnVal;
        else {
            n = n.next;
            returnVal = n.getValue();
        }
        return returnVal;
    }

    /**
     * Returns first target value found
     * @param target
     * @return target value or -1 if not found
     */
    public int deleteValue(int target){
        Node n = head;
        Node deleted;
        int returnVal = -1;

        while (n.next != null && n.next.getValue() != target){
            n = n.next;
        }
        if(n.next == null)
            return returnVal;
        else {
            deleted = n.next;
            n.setNext(deleted.getNext());
            deleted.setNext(null);
            returnVal =deleted.getValue();
        }
        return returnVal;
    }

    /**
     *
     * @param target
     * @return true if this list is equal to target list
     */
    public boolean equals(LinkedList target) {
        boolean result = false;
        Node thisNode = head;
        Node targetNode = target.head;
        while(thisNode.next != null && targetNode.next != null){
            thisNode = thisNode.next;
            targetNode = targetNode.next;
            if(thisNode.getValue() == targetNode.getValue())
                result = true;
            else
                result = false;
        }
        return result;
    }

}
