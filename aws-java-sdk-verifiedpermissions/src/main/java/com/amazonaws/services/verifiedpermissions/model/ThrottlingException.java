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
package com.amazonaws.services.verifiedpermissions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because it exceeded a throttling quota.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.verifiedpermissions.model.AmazonVerifiedPermissionsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     */
    private String quotaCode;

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
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Service that owns the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @return The code for the Amazon Web Service that owns the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Service that owns the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @param quotaCode
     *        The quota code recognized by the Amazon Web Services Service Quotas service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @return The quota code recognized by the Amazon Web Services Service Quotas service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @param quotaCode
     *        The quota code recognized by the Amazon Web Services Service Quotas service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

}
