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
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.Map;

/**
 * Provides an extension of the AmazonServiceException
 * for errors reported by Amazon S3 while
 * processing a request. In particular, this class provides access to Amazon S3's
 * extended request ID.  This ID is required debugging information in the case
 * the user needs to contact Amazon about an issue where Amazon S3 is incorrectly
 * handling a request.
 */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {
    private static final long serialVersionUID = 7573680383273658477L;

    /**
     * An S3 specific request ID that provides additional debugging information.
     */
    private String extendedRequestId;

    /**
     * An S3 specific CloudFront ID in responses from the accelerate endpoint.
     */
    private String cloudFrontId;

    /**
     * Additional information on the exception.
     */
    private Map<String,String> additionalDetails;

    /**
     * Returns the error XML received in the HTTP Response or null if the
     * exception is constructed from the headers.
     */
    private final String errorResponseXml;

    /**
     * Constructs a new {@link AmazonS3Exception} with the specified message.
     *
     * @param message
     *            The error message describing why this exception was thrown.
     *
     * @see AmazonS3Exception#AmazonS3Exception(String, Exception)
     */
    public AmazonS3Exception(String message) {
        super(message);
        this.errorResponseXml = null;
    }

    /**
     * Constructs a new {@link AmazonS3Exception} with the specified message and root
     * cause.
     *
     * @param message
     *            The error message describing why this exception was thrown.
     * @param cause
     *            The root exception that caused this exception to be thrown.
     *
     * @see AmazonS3Exception#AmazonS3Exception(String)
     */
    public AmazonS3Exception(String message, Exception cause) {
        super(message, cause);
        this.errorResponseXml = null;
    }

    /**
     * Constructs a new {@link AmazonS3Exception} with the specified message and
     * error response xml from Amazon S3.
     *
     * @param message
     *            The error message describing why this exception was thrown.
     * @param errorResponseXml
     *            The original error response XML received from Amazon S3
     *
     * @see AmazonS3Exception#AmazonS3Exception(String)
     */
    public AmazonS3Exception(String message, String errorResponseXml) {
        super(message);
        if(errorResponseXml == null){
            throw new IllegalArgumentException("Error Response XML cannot be null");
        }
        this.errorResponseXml = errorResponseXml;
    }

    /**
     * Gets Amazon S3's extended request ID. This ID is required debugging information in the case
     * the user needs to contact Amazon about an issue where Amazon S3 is incorrectly
     * handling a request.
     *
     * @return Amazon S3's extended request ID.
     *
     * @see AmazonS3Exception#setExtendedRequestId(String)
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
     * @see AmazonS3Exception#getExtendedRequestId()
     */
    public void setExtendedRequestId(String extendedRequestId) {
        this.extendedRequestId = extendedRequestId;
    }

    /**
     * Gets Amazon S3's CloudFront ID when the request is performed in the accelerate mode.
     *
     * @return Amazon S3's CloudFront ID in response from the accelerate endpoint.
     *
     * @see AmazonS3Exception#setCloudFrontId(String)
     */
    public String getCloudFrontId() {
        return cloudFrontId;
    }

    /**
     * Sets Amazon S3's CloudFront ID.
     *
     * @param cloudFrontId
     *         Amazon S3's CloudFront ID in response from the accelerate endpoint.
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
     * Sets additional information about the error response.
     */
    public void setAdditionalDetails(Map<String, String> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    /**
     * Extends the implementation from AmazonServiceException to include
     * additional information on S3's extended request ID.
     */
    @Override
    public String toString() {
        return super.toString() + ", "
            + "S3 Extended Request ID: " + getExtendedRequestId();
    }

    @Override
    public String getMessage() {
        return getErrorMessage()
               + " (Service: " + getServiceName()
               + "; Status Code: " + getStatusCode()
               + "; Error Code: " + getErrorCode()
               + "; Request ID: " + getRequestId()
               + "; S3 Extended Request ID: " + getExtendedRequestId() + ")";
    }

    /**
     * Returns the error XML received in the HTTP Response or null if the
     * exception is constructed from the headers.
     */
    public String getErrorResponseXml() {
        return errorResponseXml;
    }
}
