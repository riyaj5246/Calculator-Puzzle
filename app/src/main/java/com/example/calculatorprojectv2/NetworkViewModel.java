package com.example.calculatorprojectv2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NetworkViewModel extends ViewModel {
    private final MutableLiveData<Integer> currentLevel = new MutableLiveData<>(0);
    private final MutableLiveData<Integer> points = new MutableLiveData<>(0);

    public MutableLiveData<Integer> getCurrentLevel() {
        return currentLevel;
    }

    public MutableLiveData<Integer> getPoints() {
        return points;
    }

    public void setCurrentLevel(int level) {
        currentLevel.setValue(level);
    }

    public void setPoints(int point) {
        points.setValue(point);
    }

    public void reset() {
        this.setCurrentLevel(0);
        this.setPoints(0);
    }
}