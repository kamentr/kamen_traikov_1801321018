package org.fmi.cucumber.business;

import org.fmi.cucumber.model.Administrator;
import org.fmi.cucumber.model.ApplicationResponse;
import org.fmi.cucumber.model.Child;
import org.fmi.cucumber.model.Parent;
import org.fmi.cucumber.util.PointsCounter;

public class ApplicationService {


    public ApplicationResponse register(Child child, Parent parent, Administrator administrator) {

        PointsCounter pointsCounter = new PointsCounter();

        if (child.hasSiblingInKindergarten()){
            pointsCounter.addPoints(1);
        }

        if (child.isDisabled()) {
            pointsCounter.addPoints(2);
        }

        if (child.isTwin()) {
            pointsCounter.addPoints(1);
        }

        int numberOfWorkingParents = child.getNumberOfWorkingParents();
        pointsCounter.addPoints(numberOfWorkingParents);

        return new ApplicationResponse(child.getName(), parent.getName(), administrator.getName(), pointsCounter.getPoints());
    }
}
