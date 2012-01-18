/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.util.XpathUtils;

/**
 * Unmarshalls an AWS error response into an AmazonServiceException, or
 * optionally, a subclass of AmazonServiceException if this class is extended.
 */
public class LegacyErrorUnmarshaller implements Unmarshaller<AmazonServiceException, Node> {
    /**
     * The type of AmazonServiceException that will be instantiated. Subclasses
     * specialized for a specific type of exception can control this through the
     * protected constructor.
     */
    private final Class<? extends AmazonServiceException> exceptionClass;

    /**
     * Constructs a new unmarshaller that will unmarshall AWS error responses as
     * a generic AmazonServiceException object.
     */
    public LegacyErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    /**
     * Constructor allowing subclasses to specify a specific type of
     * AmazonServiceException to instantiating when populating the exception
     * object with data from the AWS error response.
     *
     * @param exceptionClass
     *            The class of AmazonServiceException to create and populate
     *            when unmarshalling the AWS error response.
     */
    protected LegacyErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.transform.Unmarshaller#unmarshall(java.lang.Object)
     */
    public AmazonServiceException unmarshall(Node in) throws Exception {
        String errorCode = parseErrorCode(in);
        String message = XpathUtils.asString("Response/Errors/Error/Message", in);
        String requestId = XpathUtils.asString("Response/RequestID", in);
        String errorType = XpathUtils.asString("Response/Errors/Error/Type", in);

        Constructor<? extends AmazonServiceException> constructor = exceptionClass.getConstructor(String.class);
        AmazonServiceException ase = constructor.newInstance(message);
        ase.setErrorCode(errorCode);
        ase.setRequestId(requestId);

        if (errorType == null) {
            ase.setErrorType(ErrorType.Unknown);
        } else if (errorType.equalsIgnoreCase("server")) {
            ase.setErrorType(ErrorType.Service);
        } else if (errorType.equalsIgnoreCase("client")) {
            ase.setErrorType(ErrorType.Client);
        }

        return ase;
    }

    /**
     * Returns the AWS error code for the specified error response.
     *
     * @param in
     *            The DOM tree node containing the error response.
     *
     * @return The AWS error code contained in the specified error response.
     *
     * @throws Exception
     *             If any problems were encountered pulling out the AWS error
     *             code.
     */
    public String parseErrorCode(Node in) throws Exception {
        return XpathUtils.asString("Response/Errors/Error/Code", in);
    }

    /**
     * Returns the path to the specified property within an error response.
     *
     * @param property
     *            The name of the desired property.
     *
     * @return The path to the specified property within an error message.
     */
    public String getErrorPropertyPath(String property) {
        return "Response/Errors/Error/" + property;
    }

}
