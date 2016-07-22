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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.lang.reflect.Method;

public class StandardModelFactoriesV2UnconvertTest extends UnmarshallerTest implements DynamoDBMapperModelFactory.Factory {

    @Override
    public DynamoDBMapperModelFactory getModelFactory(DynamoDBMapperConfig config) {
        return StandardModelFactories.of(dependencies()).getModelFactory(config);
    }

    @Override
    protected <T> Object unconvert(Class<T> clazz, Method getter, Method setter, AttributeValue value) {
        final DynamoDBMapperConfig config = new DynamoDBMapperConfig.Builder().withConversionSchema(schema()).build();
        final DynamoDBMapperTableModel<T> model = getModelFactory(config).getTableModel(clazz);
        return model.field(StandardBeanProperties.nameOf(getter, null)).unconvert(value);
    }

}
