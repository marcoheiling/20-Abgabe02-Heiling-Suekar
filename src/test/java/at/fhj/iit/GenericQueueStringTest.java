package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing GenericQueue<String> implementation")
class GenericQueueStringTest {

    private GenericQueue<String> queue;

    /**
     * inits a queue with 2 max size and 1 elements
     */
    @BeforeEach
    void setup() {
        queue = new GenericQueue<>(2);
        queue.offer("TestString1");
    }

    /**
     * To test the offer() method we just add an element which should return true if the queue isn't full.
     * Otherwise it should return false.
     */
    @Test
    @DisplayName("Testing offering to Queue")
    void testOffer() {
        assertTrue(queue.offer("TestString2"));
        assertFalse(queue.offer("TestString3"));
    }

    /**
     * The poll() method should return the first element in the queue and remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing polling from Queue")
    void testPoll() {
        assertEquals(queue.poll(), "TestString1");
        assertNull(queue.poll());
    }

    /**
     * The remove() method should return the first element in the queue and remove it.
     * If the queue is empty it should throw an Exception.
     */
    @Test
    @DisplayName("Testing removing from Queue")
    void testRemove() {
        assertEquals(queue.remove(), "TestString1");
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    /**
     * The peek() method should return the first element in the queue and it should NOT remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing peeking from Queue")
    void testPeek() {
        assertEquals(queue.peek(), "TestString1");
        assertEquals(queue.peek(), "TestString1");
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
        assertEquals(queue.element(), "TestString1");
        assertEquals(queue.element(), "TestString1");
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }


}