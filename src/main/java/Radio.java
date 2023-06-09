public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 9) {
            currentStation = newCurrentStation = 0;
        } else {
            currentStation = newCurrentStation + 1;
        }
        return;
    }

    public void setMinCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 0) {
            currentStation = newCurrentStation = 9;
        } else {
            currentStation = newCurrentStation - 1;
        }
        return;
    }

    public void setNewCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNewCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 100) {
            currentVolume = newCurrentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
        return;
    }

    public void setMinCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = newCurrentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
        return;
    }
}


