package org.laraib.learnspringframewok.calculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataService implements DataService{

    @Override
    public int[] retrieveData() {
        // Implementation for retrieving data from MySQL
        return new int[]{6, 7, 8, 9, 10};
    }
}
