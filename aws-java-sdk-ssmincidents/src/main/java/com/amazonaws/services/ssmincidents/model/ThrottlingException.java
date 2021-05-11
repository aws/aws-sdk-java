/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.ssmincidents.model.AWSSSMIncidentsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Originating quota code
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Originating service code
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
     * Originating quota code
     * </p>
     * 
     * @param quotaCode
     *        Originating quota code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Originating quota code
     * </p>
     * 
     * @return Originating quota code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Originating quota code
     * </p>
     * 
     * @param quotaCode
     *        Originating quota code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @see ServiceCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @return Originating service code
     * @see ServiceCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceCode
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceCode
     */

    public ThrottlingException withServiceCode(ServiceCode serviceCode) {
        this.serviceCode = serviceCode.toString();
        return this;
    }

}
