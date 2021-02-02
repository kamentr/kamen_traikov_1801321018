package org.fmi.cucumber.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Parent {

    @Getter
    private String name;

    @Getter
    @Setter
    private List<Child> children;
}
