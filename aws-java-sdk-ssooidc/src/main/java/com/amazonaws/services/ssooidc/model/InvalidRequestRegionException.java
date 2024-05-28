/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ssooidc.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that a token provided as input to the request was issued by and is only usable by calling IAM Identity
 * Center endpoints in another region.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestRegionException extends com.amazonaws.services.ssooidc.model.AWSSSOOIDCException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Single error code. For this exception the value will be <code>invalid_request</code>.
     * </p>
     */
    private String error;
    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     */
    private String error_description;
    /**
     * <p>
     * Indicates the IAM Identity Center endpoint which the requester may call with this token.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Indicates the region which the requester may call with this token.
     * </p>
     */
    private String region;

    /**
     * Constructs a new InvalidRequestRegionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestRegionException(String message) {
        super(message);
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>invalid_request</code>.
     * </p>
     * 
     * @param error
     *        Single error code. For this exception the value will be <code>invalid_request</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>invalid_request</code>.
     * </p>
     * 
     * @return Single error code. For this exception the value will be <code>invalid_request</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>invalid_request</code>.
     * </p>
     * 
     * @param error
     *        Single error code. For this exception the value will be <code>invalid_request</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestRegionException withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @param error_description
     *        Human-readable text providing additional information, used to assist the client developer in understanding
     *        the error that occurred.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @return Human-readable text providing additional information, used to assist the client developer in
     *         understanding the error that occurred.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public String getError_description() {
        return this.error_description;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @param error_description
     *        Human-readable text providing additional information, used to assist the client developer in understanding
     *        the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestRegionException withError_description(String error_description) {
        setError_description(error_description);
        return this;
    }

    /**
     * <p>
     * Indicates the IAM Identity Center endpoint which the requester may call with this token.
     * </p>
     * 
     * @param endpoint
     *        Indicates the IAM Identity Center endpoint which the requester may call with this token.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Indicates the IAM Identity Center endpoint which the requester may call with this token.
     * </p>
     * 
     * @return Indicates the IAM Identity Center endpoint which the requester may call with this token.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Indicates the IAM Identity Center endpoint which the requester may call with this token.
     * </p>
     * 
     * @param endpoint
     *        Indicates the IAM Identity Center endpoint which the requester may call with this token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestRegionException withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Indicates the region which the requester may call with this token.
     * </p>
     * 
     * @param region
     *        Indicates the region which the requester may call with this token.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Indicates the region which the requester may call with this token.
     * </p>
     * 
     * @return Indicates the region which the requester may call with this token.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("region")
    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Indicates the region which the requester may call with this token.
     * </p>
     * 
     * @param region
     *        Indicates the region which the requester may call with this token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestRegionException withRegion(String region) {
        setRegion(region);
        return this;
    }

}
