import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterMovieTest {

    @Test
    public void testName() {
        PosterMovie movie = new PosterMovie();
        String name = "Птицы";
        movie.setName(name);

        String expected = name;
        String actual = movie.getName();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStyle() {
        PosterMovie movie = new PosterMovie();
        String style = "триллер";
        movie.setStyle(style);

        String expected = style;
        String actual = movie.getStyle();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAge() {
        PosterMovie movie = new PosterMovie();
        int age = 16;
        movie.setAge(age);

        int expected = age;
        int actual = movie.getAge();

        Assertions.assertEquals(expected, actual);
    }
}
