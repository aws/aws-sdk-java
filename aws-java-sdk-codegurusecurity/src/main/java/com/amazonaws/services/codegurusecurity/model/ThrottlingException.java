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
package com.amazonaws.services.codegurusecurity.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.codegurusecurity.model.AmazonCodeGuruSecurityException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier for the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The identifier for the originating quota.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The identifier for the originating service.
     * </p>
     */
    private String serviceCode;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @param errorCode
     *        The identifier for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @return The identifier for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @param errorCode
     *        The identifier for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The identifier for the originating quota.
     * </p>
     * 
     * @param quotaCode
     *        The identifier for the originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The identifier for the originating quota.
     * </p>
     * 
     * @return The identifier for the originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The identifier for the originating quota.
     * </p>
     * 
     * @param quotaCode
     *        The identifier for the originating quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The identifier for the originating service.
     * </p>
     * 
     * @param serviceCode
     *        The identifier for the originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The identifier for the originating service.
     * </p>
     * 
     * @return The identifier for the originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The identifier for the originating service.
     * </p>
     * 
     * @param serviceCode
     *        The identifier for the originating service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
