package org.example.linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void insertSingleNode_head(){

        LinkedList head = new LinkedList();
        head.appendToTail(12);
        assertEquals(head.getHeadValue(), 12);
    }

    @Test
    public void insertSingleNode_tail(){

        LinkedList tail = new LinkedList();
        tail.appendToTail(12);
        assertEquals(tail.getTailValue(), 12);
    }
    @Test
    public void insertMultipleNodes_HeadDoesNotChange(){

        LinkedList head_HeadDoesNotChange = new LinkedList();
        head_HeadDoesNotChange.appendToTail(12);
        head_HeadDoesNotChange.appendToTail(13);

        assertEquals(head_HeadDoesNotChange.getHeadValue(), 12);
    }
    @Test
    public void insertMultipleNodes_TestTail(){

        LinkedList testTail = new LinkedList();
        testTail.appendToTail(12);
        testTail.appendToTail(13);

        assertEquals(testTail.getTailValue(), 13);
    }

    @Test
    public void findValue_OnEmptyList(){

        LinkedList empty = new LinkedList();
        assertEquals(empty.findValue(5),-1);
    }

    @Test
    public void findValue_found(){

        LinkedList testFind = new LinkedList();
        testFind.appendToTail(1);
        testFind.appendToTail(2);
        testFind.appendToTail(3);
        testFind.appendToTail(3);
        testFind.appendToTail(3);

        assertEquals(testFind.findValue(2),2);
    }

    @Test
    public void findValue_notFound(){

        LinkedList testFind = new LinkedList();
        testFind.appendToTail(1);
        testFind.appendToTail(3);
        testFind.appendToTail(3);

        assertEquals(testFind.findValue(2),-1);
    }

    @Test
    public void deleteValue_OnEmptyList(){

        LinkedList empty = new LinkedList();
        assertEquals(empty.deleteValue(5),-1);
    }

    @Test
    public void deleteValue_found(){
        LinkedList testDelete= new LinkedList();
        testDelete.appendToTail(1);
        testDelete.appendToTail(2);
        testDelete.appendToTail(3);

        assertEquals(testDelete.deleteValue(2), 2);
    }

    @Test
    public void deleteValue_ListIntegrity(){
        LinkedList preDelete= new LinkedList();
        preDelete.appendToTail(1);
        preDelete.appendToTail(2);
        preDelete.appendToTail(3);
        LinkedList postDelete= new LinkedList();
        postDelete.appendToTail(1);
        postDelete.appendToTail(3);

        preDelete.deleteValue(2);

        assertEquals(preDelete.equals(postDelete), true);
    }

    @Test
    public void deleteValue_notFound(){
        LinkedList testDelete= new LinkedList();
        testDelete.appendToTail(1);
        testDelete.appendToTail(3);
        testDelete.appendToTail(3);

        assertEquals(testDelete.deleteValue(2), -1);
    }


}
