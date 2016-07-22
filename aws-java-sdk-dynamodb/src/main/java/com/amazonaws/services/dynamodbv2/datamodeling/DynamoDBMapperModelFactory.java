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

/**
 * {@link DynamoDBMapper} table model factory.
 */
public interface DynamoDBMapperModelFactory {

    /**
     * Gets the table model for the given type and configuration.
     */
    public <T> DynamoDBMapperTableModel<T> getTableModel(Class<T> targetType);

    /**
     * {@link DynamoDBMapperModelFactory} factory.
     */
    public static interface Factory {
        /**
         * Gets/creates the mapper's model factory.
         */
        public DynamoDBMapperModelFactory getModelFactory(DynamoDBMapperConfig config);
    }

}
