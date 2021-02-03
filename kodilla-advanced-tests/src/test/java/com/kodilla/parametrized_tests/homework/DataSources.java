package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSources {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.55,45)),
                Arguments.of(new Person(1.67,78)),
                Arguments.of(new Person(1.63,60)),
                Arguments.of(new Person(1.85,99)),
                Arguments.of(new Person(1.70,60)),
                Arguments.of(new Person(1.75,145))
        );
    }

    static Stream<Arguments> provideWrongDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(0,0)),
                Arguments.of(new Person(1.50,0)),
                Arguments.of(new Person(0,50))

        );
    }
}
