package com.amazonaws.services.dynamodbv2.datamodeling;

/**
 * Created by magrnw on 3/3/17.
 */
public interface DynamoDBAutoIncrementor {
    public DynamoDBAutoIncrementorStrategy getGenerateStrategy();
}
