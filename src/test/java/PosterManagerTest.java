import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);

    String item1 = "Мизери";
    String item2 = "Волчица";
    String item3 = "Брат";
    String item4 = "Титаник";
    String item5 = "Монстр";

    String item6 = "Леон";
    String item7 = "Эмели";
    String item8 = "Психо";
    String item9 = "Птицы";
    String item10 = "Дороги";

    @Test
    public void testAll() {
        PosterManager manager = new PosterManager(repo);
        String[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        doReturn(items).when(repo).getItems();

        String[] expected = items;
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastStandart() {
        PosterManager manager = new PosterManager(repo);
        String[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        doReturn(items).when(repo).getItems();

        String[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMin() {
        PosterManager manager = new PosterManager(repo, 5);
        String[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        doReturn(items).when(repo).getItems();

        String[] expected = {item10, item9, item8, item7, item6};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMax() {
        PosterManager manager = new PosterManager(repo, 15);
        String[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        doReturn(items).when(repo).getItems();

        String[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
