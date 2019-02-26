/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.transform;

import java.lang.reflect.Constructor;

import com.amazonaws.AmazonServiceException;

public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<AmazonServiceException, T> {

    /**
     * The type of AmazonServiceException that will be instantiated. Subclasses
     * specialized for a specific type of exception can control this through the
     * protected constructor.
     */
    protected final Class<? extends AmazonServiceException> exceptionClass;

    /**
     * Constructs a new error unmarshaller that will unmarshall error responses
     * into AmazonServiceException objects.
     */
    public AbstractErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    /**
     * Constructs a new error unmarshaller that will unmarshall error responses
     * into objects of the specified class, extending AmazonServiceException.
     * 
     * @param exceptionClass
     *            The subclass of AmazonServiceException which will be
     *            instantiated and populated by this class.
     */
    public AbstractErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    /**
     * Constructs a new exception object of the type specified in this class's
     * constructor and sets the specified error message.
     * 
     * @param message
     *            The error message to set in the new exception object.
     * 
     * @return A new exception object of the type specified in this class's
     *         constructor and sets the specified error message.
     * 
     * @throws Exception
     *             If there are any problems using reflection to invoke the
     *             exception class's constructor.
     */
    protected AmazonServiceException newException(String message) throws Exception {
        Constructor<? extends AmazonServiceException> constructor = exceptionClass.getConstructor(String.class);
        return constructor.newInstance(message);
    }

}
