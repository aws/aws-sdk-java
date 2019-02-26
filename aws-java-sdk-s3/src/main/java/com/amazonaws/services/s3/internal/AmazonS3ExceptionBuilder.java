/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/**
 * Builder class that builds the <code>AmazonS3Exception</code>
 */
public class AmazonS3ExceptionBuilder {

    /**
     * The unique AWS identifier for the service request the caller made. The
     * AWS request ID can uniquely identify the AWS request, and is used for
     * reporting an error to AWS support team.
     */
    private String requestId;

    /**
     * The AWS error code represented by this exception (ex:
     * InvalidParameterValue).
     */
    private String errorCode;

    /**
     * The error message as returned by the service.
     */
    private String errorMessage;

    /** The HTTP status code that was returned with this error */
    private int statusCode;

    /**
     * An S3 specific request ID that provides additional debugging information.
     */
    private String extendedRequestId;

    /**
     * An accelerate mode specific ID sent from CloudFront that provides additional debugging information.
     */
    private String cloudFrontId;

    /**
     * Additional information on the exception.
     */
    private Map<String, String> additionalDetails;

    /**
     * Returns the error XML received in the HTTP Response or null if the
     * exception is constructed from the headers.
     */
    private String errorResponseXml;

    /**
     * Returns the AWS request ID that uniquely identifies the service request
     * the caller made.
     *
     * @return The AWS request ID that uniquely identifies the service request
     *         the caller made.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the AWS requestId for this exception.
     *
     * @param requestId
     *            The unique identifier for the service request the caller made.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Sets the AWS error code represented by this exception.
     *
     * @param errorCode
     *            The AWS error code represented by this exception.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns the AWS error code represented by this exception.
     *
     * @return The AWS error code represented by this exception.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Returns the human-readable error message provided by the service
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the human-readable error message provided by the service
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Sets the HTTP status code that was returned with this service exception.
     *
     * @param statusCode
     *            The HTTP status code that was returned with this service
     *            exception.
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Returns the HTTP status code that was returned with this service
     * exception.
     *
     * @return The HTTP status code that was returned with this service
     *         exception.
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Gets Amazon S3's extended request ID. This ID is required debugging
     * information in the case the user needs to contact Amazon about an issue
     * where Amazon S3 is incorrectly handling a request.
     *
     * @return Amazon S3's extended request ID.
     *
     * @see AmazonS3Exception#setExtendedRequestId(String)
     * @see AmazonS3Exception#getExtendedRequestId()
     */
    public String getExtendedRequestId() {
        return extendedRequestId;
    }

    /**
     * Sets Amazon S3's extended request ID.
     *
     * @param extendedRequestId
     *            S3's extended request ID.
     *
     * @see AmazonS3Exception#setExtendedRequestId(String)
     * @see AmazonS3Exception#getExtendedRequestId()
     */
    public void setExtendedRequestId(String extendedRequestId) {
        this.extendedRequestId = extendedRequestId;
    }

    /**
     * Gets Amazon S3's CloudFront ID when the request is performed in the accelerate mode.
     *
     * @return Amazon S3's CloudFront ID when in accelerate mode.
     */
    public String getCloudFrontId() {
        return cloudFrontId;
    }

    /**
     * Sets Amazon S3's CloudFront ID when the request is performed in the accelerate mode.
     *
     * @param cloudFrontId
     *         Amazon S3's CloudFront ID.
     */
    public void setCloudFrontId(String cloudFrontId) {
        this.cloudFrontId = cloudFrontId;
    }

    /**
     * Returns any additional information retrieved in the error response.
     */
    public Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets additional information about the response.
     */
    public void setAdditionalDetails(Map<String, String> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    /**
     * Adds an entry to the additional information map.
     */
    public void addAdditionalDetail(String key, String detail) {
        if (detail == null || detail.trim().isEmpty())
            return;

        if (this.additionalDetails == null) {
            this.additionalDetails = new HashMap<String, String>();
        }

        String additionalContent = this.additionalDetails.get(key);
        if (additionalContent != null && !additionalContent.trim().isEmpty())
            detail = additionalContent + "-" + detail;
        if (!detail.isEmpty())
            additionalDetails.put(key, detail);
    }

    /**
     * Returns the original error response XML received from Amazon S3
     */
    public String getErrorResponseXml() {
        return errorResponseXml;
    }

    /**
     * Sets the error response XML received from Amazon S3
     */
    public void setErrorResponseXml(String errorResponseXml) {
        this.errorResponseXml = errorResponseXml;
    }

    /**
     * Creates a new AmazonS3Exception object with the values set.
     */
    public AmazonS3Exception build() {
        AmazonS3Exception s3Exception = errorResponseXml == null ? new AmazonS3Exception(
                errorMessage) : new AmazonS3Exception(errorMessage,
                errorResponseXml);
        s3Exception.setErrorCode(errorCode);
        s3Exception.setExtendedRequestId(extendedRequestId);
        s3Exception.setStatusCode(statusCode);
        s3Exception.setRequestId(requestId);
        s3Exception.setCloudFrontId(cloudFrontId);
        s3Exception.setAdditionalDetails(additionalDetails);
        s3Exception.setErrorType(errorTypeOf(statusCode));
        return s3Exception;
    }

    /**
     * Returns the AWS error type information by looking at the HTTP status code
     * in the error response. S3 error responses don't explicitly declare a
     * sender or client fault like other AWS services, so we have to use the
     * HTTP status code to infer this information.
     *
     * @param httpResponse
     *            The HTTP error response to use to determine the right error
     *            type to set.
     */
    private ErrorType errorTypeOf(int statusCode) {
        return statusCode >= 500 ? ErrorType.Service : ErrorType.Client;
    }

}
