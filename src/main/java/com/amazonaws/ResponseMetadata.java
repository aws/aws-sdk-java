/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

/**
 * Represents the metadata included in a response from an AWS service. AWS
 * response metadata consists primarily of the AWS request ID, which can be used
 * for debugging purposes when services aren't acting as expected.
 * 
 * @param <T>
 *            The result with which this metadata is associated.
 */
public class ResponseMetadata<T> {
    
    /** The AWS request ID included in the response */
    private String requestId;

    /** The result with which this metadata is associated */
    private T result;

    /**
     * Returns the result type from the response with which this metadata is
     * associated.
     * 
     * @return The result type from the response with which this metadata is
     *         associated.
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets the result for the response with which this metadata is associated.
     * 
     * @param result
     *            The result type from the response with which this metadata is
     *            associated.
     */
    public void setResult(T result) {
        this.result = result;
    }

    /**
     * Returns the AWS request ID from the response metadata section of an AWS
     * response.
     * 
     * @return The AWS request ID from the response metadata section of an AWS
     *         response.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the AWS request ID for this response metadata object.
     * 
     * @param requestId
     *            The AWS request ID for this response metadata object.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
