import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsTest {
    @Test
    public void testFindAll() {
        Films movies = new Films();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        String[] actual = movies.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast() {
        Films movies = new Films(12);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        String[] actual = movies.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }



    @Test
    public void testLast2() {
        Films movies = new Films();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Троли";
        String movie7 = "Номер один";

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        String[] actual = movies.findLast();
        String[] expected = {movie7, movie6, movie5,movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }




}
