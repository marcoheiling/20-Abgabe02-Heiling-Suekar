## Was ist eine Queue?
- ist eine Datenstruktur, in unserem Fall nach FIFO Prinzip.

## Wie kann eine Queue getestet werden?
- durch das hinzfügen und entfernen von Elementen. 
```java
@Test
@DisplayName("Testing removing from Queue")
void testRemove() {
        assertEquals(queue.remove(), "TestString1");
        assertThrows(NoSuchElementException.class, () -> queue.remove());
}
```

## Mögliche Einsatzgebiete einer Queue
- Beispiel ein Restaurant, Bestellungen kommen nach einander rein und werden
demnach abgearbeitet.

## Was sind Generics?
- Generics sind Platzhalter für Datentypen. Sprich sie können 
in der Implementation durch andere Datentypen ersetzt werden.

## Was ist eine Code Coverage bei Source Code Tests?
- Abdeckungsgrad des Source Codes durch diverse Tests.