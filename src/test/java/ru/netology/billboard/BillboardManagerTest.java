package ru.netology.billboard;

import org.junit.jupiter.api.Test;
import ru.netology.billboard.domain.Billboard;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerTest {

    @Test
    public void shouldSaveAllFilms() {
        Billboard first = new Billboard(1, "First");
        Billboard second = new Billboard(2, "Second");
        Billboard third = new Billboard(3, "Third");

        BillboardManager manager = new BillboardManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Billboard[] expected = {first, second, third};
        Billboard[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseConstructor() {
        Billboard first = new Billboard(1, "First");
        Billboard second = new Billboard(2, "Second");
        Billboard third = new Billboard(3, "Third");
        Billboard fourth = new Billboard(4, "Fourth");

        BillboardManager manager = new BillboardManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Billboard[] expected = {fourth, third, second};
        Billboard[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}