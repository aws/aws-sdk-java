package com.amazonaws.services.dynamodbv2.datamodeling;

/**
 * Created by magrnw on 3/3/17.
 */
public class DynamoDBAutoIncrementorStrategy {
    private Integer incrBy;

    public DynamoDBAutoIncrementorStrategy() {}

    public DynamoDBAutoIncrementorStrategy(int incr) {
        this.incrBy = incr;
    }

    public Integer getIncrBy() {
        return incrBy;
    }

    public void setIncrBy(Integer incrBy) {
        this.incrBy = incrBy;
    }
}
