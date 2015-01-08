/*
 * Copyright 2011-2015 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

public class DynamoDBMapperFieldModel {

    public enum DynamoDBAttributeType {
        S, N, B,
        SS, NS, BS,
        BOOL, NULL,
        L, M
    }

    private final String dynamoDBAttributeName;
    private final DynamoDBAttributeType dynamoDBAttributeType;
    private final ArgumentMarshaller argumentMarshaller;

    public DynamoDBMapperFieldModel(
            String dynamoDBAttributeName,
            DynamoDBAttributeType dynamoDBAttributeType,
            ArgumentMarshaller argumentMarshaller) {
        this.dynamoDBAttributeName = dynamoDBAttributeName;
        this.dynamoDBAttributeType = dynamoDBAttributeType;
        this.argumentMarshaller = argumentMarshaller;
    }

    /**
     * Returns the name of the DynamoDB attribute this mapped field will be
     * stored as.
     */
    public String getDynamoDBAttributeName() {
        return dynamoDBAttributeName;
    }

    /**
     * Returns the type of the DynamoDB attribute this mapped field will be
     * stored as.
     */
    public DynamoDBAttributeType getDynamoDBAttributeType() {
        return dynamoDBAttributeType;
    }

    /**
     * (Internal usage only)
     * Returns the argument marshaller that is bound to this mapped field.
     */
    ArgumentMarshaller getArgumentMarshaller() {
        return argumentMarshaller;
    }

}
