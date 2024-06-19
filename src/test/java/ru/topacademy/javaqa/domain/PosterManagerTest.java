package ru.topacademy.javaqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    private PosterMovie[] setItems() {
        PosterMovie item1 = new PosterMovie("Мизери", "триллер", 18);
        PosterMovie item2 = new PosterMovie("Волчица", "боевик", 18);
        PosterMovie item3 = new PosterMovie("Брат", "боевик", 18);
        PosterMovie item4 = new PosterMovie("Титаник", "драма", 16);
        PosterMovie item5 = new PosterMovie("Монстр", "триллер", 18);
        PosterMovie item6 = new PosterMovie("Леон", "боевик", 12);
        PosterMovie item7 = new PosterMovie("Эмели", "драма", 12);
        PosterMovie item8 = new PosterMovie("Психо", "триллер", 18);
        PosterMovie item9 = new PosterMovie("Птицы", "триллер", 18);
        PosterMovie item10 = new PosterMovie("Дорога", "драма", 18);

        PosterMovie[] items = new PosterMovie[10];;
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;
        items[4] = item5;
        items[5] = item6;
        items[6] = item7;
        items[7] = item8;
        items[8] = item9;
        items[9] = item10;
        return items;
    }

    @Test
    public void testAll() {
        PosterManager manager = new PosterManager();
        PosterMovie[] items = setItems();
        manager.addMany(items);

        PosterMovie[] expected = items;
        PosterMovie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastStandart() {
        PosterManager manager = new PosterManager();
        PosterMovie[] items = setItems();
        manager.addMany(items);

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5], items[4], items[3], items[2], items[1], items[0]};
        PosterMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMin() {
        PosterManager manager = new PosterManager(5);
        PosterMovie[] items = setItems();
        manager.addMany(items);

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5]};
        PosterMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMax() {
        PosterManager manager = new PosterManager(15);
        PosterMovie[] items = setItems();
        manager.addMany(items);

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5], items[4], items[3], items[2], items[1], items[0]};
        PosterMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddPosterMovie() {
        PosterMovie movie11 = new PosterMovie("Гостья", "детский", 0);
        PosterManager manager = new PosterManager();
        PosterMovie[] items = setItems();
        manager.addMany(items);
        manager.add(movie11);

        PosterMovie[] expected = {items[0], items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9], movie11};
        PosterMovie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
