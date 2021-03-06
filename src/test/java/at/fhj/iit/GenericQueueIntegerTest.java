package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing the implementation of GenericQueue")
public class GenericQueueIntegerTest {

    private GenericQueue<Integer> GQ;

    /**
     * inits an GenericQueue for each test with 2 elements
     */
    @BeforeEach
    void setup() {
        GQ = new GenericQueue<>(3);
        GQ.offer(4);
        GQ.offer(2);
    }

    /**
     * To test the offer() method we just add an element which should return true if the queue isn't full.
     * Otherwise it should return false.
     */
    @Test
    @DisplayName("Testing offer from GenericeQueue")
    void testOffer() {
        assertTrue(GQ.offer(0));
        assertFalse(GQ.offer(6));
    }

    /**
     * The poll() method should return the first element in the queue and remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing poll from GenericQueue")
    void testPoll() {
        assertEquals(GQ.poll(), 4);
        assertEquals(GQ.poll(), 2);
        assertNull(GQ.poll());
    }

    /**
     * The remove() method should return the first element in the queue and remove it.
     * If the queue is empty it should throw an Exception.
     */
    @Test
    @DisplayName("Testing removing from GenericQueue")
    void testRemove() {
        assertEquals(GQ.remove(), 4);
        assertEquals(GQ.remove(), 2);
        assertThrows(NoSuchElementException.class, () -> GQ.remove());
    }

    /**
     * The peek() method should return the first element in the queue and it should NOT remove it.
     * If the queue is empty it should return null.
     */
    @Test
    @DisplayName("Testing peeking from GenericQueue")
    void testPeek() {
        assertEquals(GQ.peek(), 4);
        assertEquals(GQ.peek(), 4);
        GQ.remove();
        GQ.remove();
        assertNull(GQ.peek());
    }

    /**
     * The element() method should return the first element in the queue and it should NOT remove it.
     * If the queue is empty it should throw an exception.
     */
    @Test
    @DisplayName("Testing getting an element from Queue")
    void testElement() {
        assertEquals(GQ.element(), 4);
        assertEquals(GQ.element(), 4);
        GQ.remove();
        GQ.remove();
        assertThrows(NoSuchElementException.class, () -> GQ.element());
    }
}
