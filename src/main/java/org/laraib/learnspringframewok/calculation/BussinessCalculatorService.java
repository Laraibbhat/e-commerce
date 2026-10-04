package org.laraib.learnspringframewok.calculation;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BussinessCalculatorService {

    private final DataService dataService;

    public BussinessCalculatorService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        int max = Arrays.stream(dataService.retrieveData())
                .max()
                .orElse(Integer.MIN_VALUE);
        System.out.printf("Max value is %d\n", max);
        return max;
    }
}
