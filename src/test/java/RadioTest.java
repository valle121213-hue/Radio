import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // Проверка границ радиостанции (Пограничные значения)
    @Test
     public void shouldRadioStationMin () {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationNegativeValue() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStation1 () {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationMax () {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStation8 () {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldRadioStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }


// Провеерка фукции  Next
@Test
public void shouldNextRadioStation() {
    Radio radio = new Radio();

    radio.setCurrentRadioStationNumber(3);
    radio.next();

    int expected = 4;
    int actual = radio.getCurrentRadioStationNumber();

    Assertions.assertEquals(expected, actual);
}

    @Test
    public void shouldGoNextAfterNineZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


//Проверка фкнкции Prev
        @Test
        public void shouldPrevRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStationNumber(8);
            radio.prev();

            int expected = 7;
            int actual = radio.getCurrentRadioStationNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPrevBeforeZeroNine() {
            Radio radio = new Radio();

            radio.setCurrentRadioStationNumber(0);
            radio.prev();

            int expected = 9;
            int actual = radio.getCurrentRadioStationNumber();

            Assertions.assertEquals(expected, actual);
        }





        // Проверка функции Гормкости

    // Проверка границ громкости (Пограничные значения)

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldValidVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativeVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldValidVolume99() {
        Radio radio = new Radio();

        radio.setSoundVolume(99);

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAfterMaxVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка функции Громче

    @Test
    public void shouldLouderVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(40);
        radio.louderVolume();

        int expected = 41;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
@Test
    public void shouldLouderVolumeMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);
        radio.louderVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    //  Проверка функции Тише
    @Test
    public void shouldQuiet() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);
        radio.quietVolume();

        int expected = 49;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuietBelowMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);
        radio.quietVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }



}
