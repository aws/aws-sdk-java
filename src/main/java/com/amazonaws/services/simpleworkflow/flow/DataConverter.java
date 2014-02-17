/*
 * Copyright 2012-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import java.lang.reflect.Method;

/**
 * Used by the framework to serialize/deserialize method parameters that need to
 * be sent over the wire. 
 * 
 * @author fateev
 */
public abstract class DataConverter {

    /**
     * Implements conversion of the single value.
     * 
     * @param value
     *            Java value to convert to String.
     * @return converted value
     * @throws DataConverterException
     *             if conversion of the value passed as parameter failed for any
     *             reason.
     */
    public abstract String toData(Object value) throws DataConverterException;

    /**
     * Implements conversion of the single value.
     * 
     * @param data
     *            Simple Workflow Data value to convert to a Java object.
     * @return converted Java object
     * @throws DataConverterException
     *             if conversion of the data passed as parameter failed for any
     *             reason.
     */
    public abstract <T> T fromData(String data, Class<T> valueType) throws DataConverterException;

    /**
     * Parses the method arguments for {@code Method} from  Simple Workflow Data value.
     * @param data  Simple Workflow Data value to convert to a Java object.
     * @param method {@code Method} whose arguments needs to be parsed..
     * @return {@code Object[]} Parsed method arguments.
     * @throws DataConverterException  if conversion of the data passed as parameter failed for any
     *             reason.
     */
    public abstract Object[] parseMethodArguments (String data, Method method) throws DataConverterException;

}
