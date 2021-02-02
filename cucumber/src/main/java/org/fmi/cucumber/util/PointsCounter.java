package org.fmi.cucumber.util;

import org.fmi.cucumber.model.ApplicationResponse;

public class PointsCounter {

    private int points;

    public PointsCounter() {
        points = 0;
    }

    public void addPoints(int pointsToAdd) {

        if(isValid(pointsToAdd)) {
            throw new IllegalArgumentException("Your points to add are invalid -> " + pointsToAdd);
        }

        points += pointsToAdd;
    }

    private boolean isValid(int pointsToAdd) {
        return pointsToAdd < 0;
    }

    public int getPoints() {
        return points;
    }
}
