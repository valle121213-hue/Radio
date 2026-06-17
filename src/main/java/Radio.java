public class Radio {

    private int currentRadioStationNumber; // Номер Радиостанции
    private int soundVolume; // Позиция громкости
    private int radioStationsCount; // Количсевто радиостанций

    public Radio() {
        radioStationsCount = 10;
    }

    public Radio(int radioStationsCount) {
        this.radioStationsCount = radioStationsCount;
    }


    // получать текущую станцию
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }


    // условие даипазона станций
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber >= radioStationsCount) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

//  следующая радиостанция

    public void next() {
        if (currentRadioStationNumber == radioStationsCount - 1) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

// предыдущая радиостанция

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = radioStationsCount - 1;
        } else {
            currentRadioStationNumber--;
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