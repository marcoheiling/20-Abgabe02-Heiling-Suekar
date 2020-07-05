## Was ist eine Queue?
- ist eine Datenstruktur, in unserem Fall nach FIFO Prinzip.
- kann man sich als Warteschlange vorstellen, wer zuerst in der Warteschlange ist, wird als erstes bedient

![Queue by freepik.com](https://image.freepik.com/free-vector/flat-people-forming-line_23-2147679939.jpg)

## Wie kann eine Queue getestet werden?
- z.B. durch das hinzfügen und entfernen von Elementen.
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
- z.B.: die Tests decken 80% vom Source Code ab