/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request caused OpsItems to exceed one or more limits. For information about OpsItem limits, see <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
 * >What are the resource limits for OpsCenter?</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemLimitExceededException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    private Integer limit;

    private String limitType;

    /**
     * Constructs a new OpsItemLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OpsItemLimitExceededException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceTypes")
    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * @param resourceTypes
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceTypes")
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemLimitExceededException withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * @param resourceTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemLimitExceededException withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
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

    public OpsItemLimitExceededException withLimit(Integer limit) {
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

    public OpsItemLimitExceededException withLimitType(String limitType) {
        setLimitType(limitType);
        return this;
    }

}
