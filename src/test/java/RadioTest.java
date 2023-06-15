import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void testQuantityStation(){
        Radio radio = new Radio(29);

        Assertions.assertEquals(28,radio.getQuantityStation());
    }

    @Test
    public void testNoQuantityStation(){
        Radio radio = new Radio();

        Assertions.assertEquals(10,radio.getQuantityStation());
    }


    @Test

    public void shuldMaxStation() {
        Radio radio = new Radio();

        radio.setNewCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldZeroCurrentStation() {
        Radio radio = new Radio();

        radio.setNewCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldMaxCurrentStation() {
        Radio radio = new Radio();

        radio.setNewCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldMinCurrentStation() {
        Radio radio = new Radio();

        radio.setNewCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNextMaxCurrentStation() {
        Radio radio = new Radio();

        radio.setNextCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNextCurrentStation() {
        Radio radio = new Radio();

        radio.setNextCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shuldPrevCurrentStation() {
        Radio radio = new Radio();

        radio.setPrevCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shuldPrevMinCurrentStation() {
        Radio radio = new Radio();

        radio.setPrevCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxNewCurrentVolume() {
        Radio radio = new Radio();

        radio.setNewCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseZeroSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setNewCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMinCurrentVolume() {
        Radio radio = new Radio();

        radio.setNewCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setNewCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetUpVolume() {
        Radio radio = new Radio();

        radio.setUpVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetUpMaxVolume() {
        Radio radio = new Radio();

        radio.setUpVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetUpMinVolume() {
        Radio radio = new Radio();

        radio.setUpVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetDownVolume() {
        Radio radio = new Radio();

        radio.setDownVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetDownMinVolume() {
        Radio radio = new Radio();

        radio.setDownVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSetDownMaxVolume() {
        Radio radio = new Radio();

        radio.setDownVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}