/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <a>PutResourcePolicy</a> API action enforces two limits. A policy can't be greater than 1024 bytes in size. And
 * only one policy can be attached to <code>OpsItemGroup</code>. Verify these limits and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicyLimitExceededException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private Integer limit;

    private String limitType;

    /**
     * Constructs a new ResourcePolicyLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourcePolicyLimitExceededException(String message) {
        super(message);
    }

    /**
     * @param limit
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicyLimitExceededException withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param limitType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitType")
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitType")
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * @param limitType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicyLimitExceededException withLimitType(String limitType) {
        setLimitType(limitType);
        return this;
    }

}
