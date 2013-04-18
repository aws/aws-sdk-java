/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Annotation for marking a property in a class as the attribute to be used as 
 * range key for one or more local secondary indexes on a DynamoDB table.
 * Applied to the getter for the indexed range key property.
 * <p>
 * This annotation is required if this attribute will be used as index key for 
 * item queries.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DynamoDBIndexRangeKey {

    /**
     * Optional parameter when the name of the attribute as stored in DynamoDB
     * should differ from the name used by the getter / setter.
     */
    String attributeName() default "";
    
    /**
     * Parameter for the name of the local secondary index.
     * <p>
     * This is required if this attribute is the index key for only one local secondary
     * index.
     */
    String localSecondaryIndexName() default "";
    
    /**
     * Parameter for the names of the local secondary indexes.
     * This is required if this attribute is the index key for multiple local secondary
     * indexes.
     */
    String[] localSecondaryIndexNames() default {};

}
