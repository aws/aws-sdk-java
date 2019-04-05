/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the response from an AWS service, including the result payload and
 * any response metadata. AWS response metadata consists primarily of the AWS
 * request ID, which can be used for debugging purposes when services aren't
 * acting as expected.
 *
 * @param <T>
 *            The type of result contained by this response.
 */
public class AmazonWebServiceResponse<T> {

    /** The result contained by this response */
    private T result;

    /** Additional AWS metadata for this response */
    private ResponseMetadata responseMetadata;

    /**
     * Returns the result contained by this response.
     *
     * @return The result contained by this response.
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets the result contained by this response.
     *
     * @param result
     *            The result contained by this response.
     */
    public void setResult(T result) {
        this.result = result;
    }

    /**
     * Sets the response metadata associated with this response.
     * 
     * @param responseMetadata
     *            The response metadata for this response.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Returns the response metadata for this response. Response metadata
     * provides additional information about a response that isn't necessarily
     * directly part of the data the service is returning. Response metadata is
     * primarily used for debugging issues with AWS support when a service isn't
     * working as expected.
     * 
     * @return The response metadata for this response.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Returns the AWS request ID from the response metadata section of an AWS
     * response.
     *
     * @return The AWS request ID from the response metadata section of an AWS
     *         response.
     */
    public String getRequestId() {
        if (responseMetadata == null) return null;
        return responseMetadata.getRequestId();
    }

}
