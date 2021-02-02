package org.fmi.cucumber.model;

import lombok.*;

@Data
@NoArgsConstructor
public class Child {

    private String name;
    private boolean isTwin;
    private boolean isDisabled;
    @Getter(AccessLevel.NONE)
    private boolean hasSiblingInKindergarten;
    private int numberOfWorkingParents;

    public void setNumberOfWorkingParents(int number) {
        if (number < 0 || number > 2){
            throw new IllegalArgumentException("Parents count cannot be less than 0 or more than 2");
        }

        numberOfWorkingParents = number;
    }

    public void setHasSiblingInKindergarten(boolean hasSiblingInKindergarten){
        this.hasSiblingInKindergarten = hasSiblingInKindergarten;
    }

    public boolean hasSiblingInKindergarten() {
        return hasSiblingInKindergarten;
    }
}
