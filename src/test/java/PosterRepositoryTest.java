import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {
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
    public void test() {
        PosterRepository repo = new PosterRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);

        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);

        String[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        String[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }
}
