package org.fmi.cucumber.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApplicationResponse {

    private String childName;
    private String parentName;
    private String administratorName;
    private int points;
}
