package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing GenericQueue<Character> implementation")
class GenericQueueCharacterTest {

    private GenericQueue<Character> queue;

    /**
     * inits a queue with 2 max size and 1 elements
     */
    @BeforeEach
    void setup() {
        queue = new GenericQueue<>(2);
        queue.offer('A');
    }

    @Test
    @DisplayName("Testing offering to Queue")
    void testOffer() {
        assertTrue(queue.offer('B'));
        assertFalse(queue.offer('C'));
    }

    @Test
    @DisplayName("Testing polling from Queue")
    void testPoll() {
        assertEquals(queue.poll(), 'A');
        assertNull(queue.poll());
    }

    @Test
    @DisplayName("Testing removing from Queue")
    void testRemove() {
        assertEquals(queue.remove(), 'A');
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    @DisplayName("Testing peeking from Queue")
    void testPeek() {
        assertEquals(queue.peek(), 'A');
        assertEquals(queue.peek(), 'A');
        queue.remove();
        assertNull(queue.peek());
    }

    @Test
    @DisplayName("Testing getting an element from Queue")
    void testElement() {
        assertEquals(queue.element(), 'A');
        assertEquals(queue.element(), 'A');
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }


}