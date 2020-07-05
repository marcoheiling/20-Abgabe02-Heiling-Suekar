package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing StringQueue implementation")
class StringQueueTest {

   private StringQueue queue;

    /**
     * inits a queue with 3 max size and 2 elements
     */
   @BeforeEach
    void setup() {
       queue = new StringQueue(3);
       queue.offer("Test1");
       queue.offer("Test2");
   }

    /**
     * To test the offer() method we just add an element which should return true if the queue isn't full.
     * Otherwise it should return false.
     */
   @Test
   @DisplayName("Testing offering to Queue")
   void testOffer() {
       assertTrue(queue.offer("Test3"));
       assertFalse(queue.offer("Test4"));
   }

    /**
     * The poll() method should return the first element in the queue and remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing polling from Queue")
    void testPoll() {
        assertEquals(queue.poll(), "Test1");
        assertEquals(queue.poll(), "Test2");
        assertNull(queue.poll());
    }

    /**
     * The remove() method should return the first element in the queue and remove it.
     * If the queue is empty it should throw an Exception.
     */
    @Test
    @DisplayName("Testing removing from Queue")
    void testRemove() {
        assertEquals(queue.remove(), "Test1");
        assertEquals(queue.remove(), "Test2");
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    /**
     * The peek() method should return the first element in the queue and it should NOT remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing peeking from Queue")
    void testPeek() {
        assertEquals(queue.peek(), "Test1");
        assertEquals(queue.peek(), "Test1");
        queue.remove();
        queue.remove();
        assertNull(queue.peek());
    }

    /**
     * The element() method should return the first element in the queue and it should NOT remove it.
     * If the queue is empty it should throw an exception.
     */
    @Test
    @DisplayName("Testing getting an element from Queue")
    void testElement() {
        assertEquals(queue.element(), "Test1");
        assertEquals(queue.element(), "Test1");
        queue.remove();
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }


}