import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void addT() {
        Container<String> container = new Container<String>();
        container.add("Первый");
        assertEquals(1, container.size());
        assertEquals("Первый", container.get(0));
    }

    @org.junit.jupiter.api.Test
    void getT() {
        Container<String> container = new Container<String>();
        container.add("Первый");
        container.add("Второй");
        assertEquals("Второй", container.get(1));
    }

    @org.junit.jupiter.api.Test
    void removeT() {
        Container<String> container = new Container<String>();
        container.add("Первый");
        container.add("Второй");
        container.remove(1);
        assertEquals(1, container.size());
        assertEquals("Первый", container.get(0));
    }

    @org.junit.jupiter.api.Test
    void sizeT() {
        Container<String> container = new Container<String>();
        assertEquals(0, container.size());
        container.add("Первый");
        assertEquals(1, container.size());
        container.add("Второй");
        assertEquals(2, container.size());
        container.remove(1);
        assertEquals(1, container.size());
    }
}