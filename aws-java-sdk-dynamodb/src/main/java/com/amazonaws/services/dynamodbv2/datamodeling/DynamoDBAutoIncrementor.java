package com.amazonaws.services.dynamodbv2.datamodeling;

/**
 * Defines the generation strategy for fields that auto-increment
 *
 * Created by magrnw on 3/3/17.
 */
public interface DynamoDBAutoIncrementor {
    DynamoDBAutoIncrementorStrategy getGenerateStrategy();
}
