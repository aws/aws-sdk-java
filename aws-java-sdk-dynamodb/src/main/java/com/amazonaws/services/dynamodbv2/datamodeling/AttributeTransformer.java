/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A hook allowing a custom transform/untransform of the raw attribute
 * values immediately before writing them into DynamoDB and immediately
 * after reading them out of DynamoDB, but with extra context about
 * the model class not available at the raw AmazonDynamoDB level.
 * <p>
 * This interface contains both a {@code transform} method and a corresponding
 * {@code untransform} method. These methods SHOULD be inverses, such that
 * untransform(transform(value)) == value.
 */
public interface AttributeTransformer {
    /**
     * Parameters for the {@code transform} and {@code untransform} methods,
     * so we don't have to break the interface in order to add additional
     * parameters.
     * <p>
     * Consuming code should NOT implement this interface. 
     */
    interface Parameters<T> {
        /**
         * Returns the raw attribute values to be transformed or untransformed.
         * The returned map is not modifiable.
         *
         * @return the raw attribute values to transform or untransform
         */
        Map<String, AttributeValue> getAttributeValues();

        /**
         * Returns true if this transformation is being called as part of a
         * partial update operation. If true, the attributes returned by
         * {@link #getAttributeValues()} do not represent the entire new
         * item, but only a snapshot of the attributes which are getting
         * new values.
         * <p>
         * Implementations which do not support transforming a partial
         * view of an item (for example, because they need to calculate a
         * signature based on all of the item's attributes that won't be valid
         * if only a subset of the attributes are taken into consideration)
         * should check this flag and throw an exception rather than than
         * corrupting the data in DynamoDB.
         * <p>
         * This method always returns {@code false} for instances passed to
         * {@link AttributeTransformer#untransform(Parameters)}.
         *
         * @return true if this operation is a partial update, false otherwise
         */
        boolean isPartialUpdate();

        /**
         * @return the type of the model class we're transforming to or from
         */
        Class<T> getModelClass();
        
        /**
         * @return the mapper config for this operation
         */
        DynamoDBMapperConfig getMapperConfig();
        
        /**
         * @return the name of the DynamoDB table the attributes were read
         *         from or will be written to
         */
        String getTableName();
        
        /**
         * @return the name of the hash key for the table
         */
        String getHashKeyName();
        
        /**
         * @return the name of the range key for the table, if it has one,
         *         otherwise {@code null}
         */
        String getRangeKeyName();
    }
    
    /**
     * Transforms the input set of attribute values derived from the model
     * object before writing them into DynamoDB.
     * 
     * @param parameters transformation parameters
     * @return the transformed attribute value map
     */
    Map<String, AttributeValue> transform(Parameters<?> parameters);
    
    /**
     * Untransform the input set of attribute values read from DynamoDB before
     * creating a model object from them.
     * 
     * @param parameters transformation parameters
     * @return the untransformed attribute value map
     */
    Map<String, AttributeValue> untransform(Parameters<?> parameters);
}
