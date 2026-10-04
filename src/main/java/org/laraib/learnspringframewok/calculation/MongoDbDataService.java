package org.laraib.learnspringframewok.calculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{

    @Override
    public int[] retrieveData() {
        // Implementation for retrieving data from MongoDB
        return new int[]{1, 2, 3, 4, 5};
    }
}
