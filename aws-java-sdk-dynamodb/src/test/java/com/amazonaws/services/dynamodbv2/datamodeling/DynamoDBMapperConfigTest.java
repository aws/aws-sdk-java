/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DynamoDBMapperConfigTest {
    @Test
    public void noCircularStaticInitializationDependencies() {
        // This seems silly, but we have to statically initialize these classes by referencing them. If we do this and they
        // reference DynamoDBMapperConfig statically, then when we check DynamoDBMapperConfig.DEFAULT's fields, they will be
        // null because DynamoDBMapperConfig.DEFAULT would be initialized BEFORE these classes are.
        assertNotNull(DynamoDBMapperConfig.SaveBehavior.UPDATE);
        assertNotNull(DynamoDBMapperConfig.ConsistentReads.CONSISTENT);
        assertNotNull(DynamoDBMapperConfig.PaginationLoadingStrategy.EAGER_LOADING);
        assertNotNull(DynamoDBMapperConfig.TableNameResolver.class);
        assertNotNull(DynamoDBMapperConfig.BatchWriteRetryStrategy.class);
        assertNotNull(DynamoDBMapperConfig.BatchLoadRetryStrategy.class);
        assertNotNull(DynamoDBTypeConverterFactory.class);
        assertNotNull(ConversionSchema.class);

        assertNotNull(DynamoDBMapperConfig.DEFAULT.getSaveBehavior());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getConsistentReads());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getPaginationLoadingStrategy());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getTableNameResolver());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getBatchWriteRetryStrategy());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getBatchLoadRetryStrategy());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getTypeConverterFactory());
        assertNotNull(DynamoDBMapperConfig.DEFAULT.getConversionSchema());
    }
}