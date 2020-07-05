package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.NoSuchElementException;

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

   @Test
   @DisplayName("Testing offering to Queue")
   void testOffer() {
       assertTrue(queue.offer("Test3"));
       assertFalse(queue.offer("Test4"));
   }

    @Test
    @DisplayName("Testing polling from Queue")
    void testPoll() {
        assertEquals(queue.poll(), "Test1");
        assertEquals(queue.poll(), "Test2");
        assertEquals(queue.poll(), null);
    }

    @Test
    @DisplayName("Testing removing from Queue")
    void testRemove() {
        assertEquals(queue.remove(), "Test1");
        assertEquals(queue.remove(), "Test2");
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    @DisplayName("Testing peeking from Queue")
    void testPeek() {
        assertEquals(queue.peek(), "Test1");
        assertEquals(queue.peek(), "Test1");
        queue.remove();
        queue.remove();
        assertEquals(queue.peek(), null);
    }

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