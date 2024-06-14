import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    private PosterMovie[] setItems() {
        PosterMovie item1 = new PosterMovie();
        item1.setName("Мизери");
        item1.setStyle("триллер");
        item1.setAge(18);

        PosterMovie item2 = new PosterMovie();
        item2.setName("Волчица");
        item2.setStyle("боевик");
        item2.setAge(18);

        PosterMovie item3 = new PosterMovie();
        item3.setName("Брат");
        item3.setStyle("боевик");
        item3.setAge(18);

        PosterMovie item4 = new PosterMovie();
        item4.setName("Титаник");
        item4.setStyle("драма");
        item4.setAge(16);

        PosterMovie item5 = new PosterMovie();
        item5.setName("Монстр");
        item5.setStyle("триллер");
        item5.setAge(18);

        PosterMovie item6 = new PosterMovie();
        item6.setName("Леон");
        item6.setStyle("боевик");
        item6.setAge(12);

        PosterMovie item7 = new PosterMovie();
        item7.setName("Эмели");
        item7.setStyle("драма");
        item7.setAge(12);

        PosterMovie item8 = new PosterMovie();
        item8.setName("Психо");
        item8.setStyle("триллер");
        item8.setAge(18);

        PosterMovie item9 = new PosterMovie();
        item9.setName("Птицы");
        item9.setStyle("триллер");
        item9.setAge(18);

        PosterMovie item10 = new PosterMovie();
        item10.setName("Дорога");
        item10.setStyle("драма");
        item10.setAge(18);

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

        for (int i = 0; i < items.length; i++) {
            manager.add(items[i]);
        }

        PosterMovie[] expected = items;
        PosterMovie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastStandart() {
        PosterManager manager = new PosterManager();
        PosterMovie[] items = setItems();

        for (int i = 0; i < items.length; i++) {
            manager.add(items[i]);
        }

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5], items[4], items[3], items[2], items[1], items[0]};
        PosterMovie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMin() {
        PosterManager manager = new PosterManager(5);
        PosterMovie[] items = setItems();

        for (int i = 0; i < items.length; i++) {
            manager.add(items[i]);
        }

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5]};
        PosterMovie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMax() {
        PosterManager manager = new PosterManager(15);
        PosterMovie[] items = setItems();

        for (int i = 0; i < items.length; i++) {
            manager.add(items[i]);
        }

        PosterMovie[] expected = {items[9], items[8], items[7], items[6], items[5], items[4], items[3], items[2], items[1], items[0]};
        PosterMovie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
