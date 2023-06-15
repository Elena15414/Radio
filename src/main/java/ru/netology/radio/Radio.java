package ru.netology.radio;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int quantityStation = 10;
    private int currentStation;


    public Radio(int quantityStation) {
        this.quantityStation = quantityStation - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }


    public void setNewCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            currentStation = newCurrentStation = minStation;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void setPrevCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = newCurrentStation = maxStation;
        } else {
            currentStation = newCurrentStation;
        }
    }


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNewCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setUpVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = newCurrentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void setDownVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = newCurrentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
    }
}


