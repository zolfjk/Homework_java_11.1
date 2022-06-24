import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.movies.Movie;
import ru.netology.movies.MovieServiceManager;

public class MovieServiceManagerTest {
    Movie first = new Movie("Бладшот", ",боевик", "IMG_01");
    Movie second = new Movie("Вперед", ",мультфмльм", "IMG_02");
    Movie third = new Movie("Отель Белград", "комедия", "IMG_03");
    Movie fourth = new Movie("Джентельмены", "боевик", "IMG_04");
    Movie fifth = new Movie("Человек невидимка", "ужасы", "IMG_05");
    Movie sixth = new Movie("Тролли. Мировой тур", "мультфильм", "IMG_06");
    Movie seventh = new Movie("Номер один", "комедия", "IMG_07");
    Movie eighth = new Movie("Зеленая миля", "драма", "IMG_08");
    Movie ninth = new Movie("Темный рыцарь", "боевик", "IMG_09");
    Movie tenth = new Movie("Оно", "ужасы", "IMG_10");
    Movie eleventh = new Movie("Матрица", "боевик", "IMG_11");

    @Test
    public void managerFindAllest() {
        MovieServiceManager manager = new MovieServiceManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.FindAll();
        Movie[] expected = {first, second, third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnEqualTenTest() {
        MovieServiceManager manager = new MovieServiceManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnMoreThanTenTest() {
        MovieServiceManager manager = new MovieServiceManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnLessThanTenTest() {
        MovieServiceManager manager = new MovieServiceManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnEqualLimitTest() {
        MovieServiceManager manager = new MovieServiceManager(4);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnMoreThanLimitTest() {
        MovieServiceManager manager = new MovieServiceManager(4);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerReturnLessThanLimitTest() {
        MovieServiceManager manager = new MovieServiceManager(4);
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.FindLast();
        Movie[] expected = {third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

}
