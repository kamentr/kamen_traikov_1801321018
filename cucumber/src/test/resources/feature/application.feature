Feature: Кандидатстване за детска градина

  Scenario: Кандидатстване за място в детска градина
    Given Един работещ родител
    And Има близнаци
    When Регистрира децата си
    Then Трябва да получи "2" точки

  Scenario: Кандидатстване за място в детска градина
    Given Двама работещи родителя
    And Имат едно дете с увреждане
    When Регистрират детето си
    Then Трябва да получи "4" точки

  Scenario: Кандидатстване за място в детска градина
    Given Един работещ родител
    And Има дете с брат/сестра в детското заведение
    When Регистрира децата си
    Then Трябва да получи "2" точки

  Scenario: Кандидатстване за място в детска градина
    Given Двама работещи родители
    And Имат близнаци
    And Едно дете с увреждане
    When Регистрират децата си
    Then Трябва да получи "5" точки

  Scenario: Кандидатстване за място в детска градина
    Given Двама работещи родители
    And Имат дете с брат/сестра в детското заведение
    And Едно дете с увреждане
    When Регистрират децата си
    Then Трябва да получи "5" точки