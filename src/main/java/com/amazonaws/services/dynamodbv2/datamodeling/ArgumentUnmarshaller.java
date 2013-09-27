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

import java.lang.reflect.Method;
import java.text.ParseException;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * Unmarshaller interface to make it possible to cache the expensive
 * type-determination behavior necessary when turning a service result back
 * into an object.
 */
public interface ArgumentUnmarshaller {

    /**
     * Asserts that the value given can be processed using the setter given.
     */
    public void typeCheck(AttributeValue value, Method setter);
    
    /**
     * Unmarshalls the {@link AttributeValue} given into an instance of the
     * appropriate type, as determined by {@link DynamoDBReflector} and
     * {@link DynamoDBMapper}
     * 
     * @throws ParseException when unable to parse a date string
     */
    public Object unmarshall(AttributeValue value) throws ParseException;
}
