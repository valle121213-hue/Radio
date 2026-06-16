public class Radio {

    private int currentRadioStationNumber;
    private int soundVolume;


    // получать текущую станцию
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }


    // условие даипазона станций
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

// следующая радиостанция

    public void next() {

        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }

    }

// предыдущая радиостанция

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }
    }



// Функция Горомкость
    // получать текущую громкость
    public int getSoundVolume() {
        return soundVolume;
    }

    // условие даипазона громкости
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    //громче звук
    public void louderVolume() {
        if (soundVolume < 100) {
            soundVolume++;

        }
    }


// тише звук

    public void quietVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }

}