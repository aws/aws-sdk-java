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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request could not be completed due to a conflict with the current state of the target resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.mgn.model.AWSmgnException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * A conflict occured when prompting for the Resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A conflict occured when prompting for resource type.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A conflict occured when prompting for the Resource ID.
     * </p>
     * 
     * @param resourceId
     *        A conflict occured when prompting for the Resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * A conflict occured when prompting for the Resource ID.
     * </p>
     * 
     * @return A conflict occured when prompting for the Resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * A conflict occured when prompting for the Resource ID.
     * </p>
     * 
     * @param resourceId
     *        A conflict occured when prompting for the Resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A conflict occured when prompting for resource type.
     * </p>
     * 
     * @param resourceType
     *        A conflict occured when prompting for resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * A conflict occured when prompting for resource type.
     * </p>
     * 
     * @return A conflict occured when prompting for resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * A conflict occured when prompting for resource type.
     * </p>
     * 
     * @param resourceType
     *        A conflict occured when prompting for resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
