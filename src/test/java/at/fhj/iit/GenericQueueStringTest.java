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

    @Test
    @DisplayName("Testing offering to Queue")
    void testOffer() {
        assertTrue(queue.offer("TestString2"));
        assertFalse(queue.offer("TestString3"));
    }

    @Test
    @DisplayName("Testing polling from Queue")
    void testPoll() {
        assertEquals(queue.poll(), "TestString1");
        assertNull(queue.poll());
    }

    @Test
    @DisplayName("Testing removing from Queue")
    void testRemove() {
        assertEquals(queue.remove(), "TestString1");
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    @DisplayName("Testing peeking from Queue")
    void testPeek() {
        assertEquals(queue.peek(), "TestString1");
        assertEquals(queue.peek(), "TestString1");
        queue.remove();
        assertNull(queue.peek());
    }

    @Test
    @DisplayName("Testing getting an element from Queue")
    void testElement() {
        assertEquals(queue.element(), "TestString1");
        assertEquals(queue.element(), "TestString1");
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }


}