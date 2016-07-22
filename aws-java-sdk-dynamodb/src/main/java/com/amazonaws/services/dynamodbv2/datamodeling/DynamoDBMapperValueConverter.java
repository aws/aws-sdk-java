/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * {@link AttributeValue} converter.
 */
public interface DynamoDBMapperValueConverter<T> extends DynamoDBTypeConverter<AttributeValue,T> {

    /**
     * Returns the DynamoDB attribute type.
     */
    public DynamoDBAttributeType getDynamoDBAttributeType();

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeValue convert(T object);

    /**
     * {@inheritDoc}
     */
    @Override
    public T unconvert(AttributeValue object);

}
