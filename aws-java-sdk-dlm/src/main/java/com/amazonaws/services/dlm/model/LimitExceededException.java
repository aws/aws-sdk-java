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
package com.amazonaws.services.dlm.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because a limit was exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitExceededException extends com.amazonaws.services.dlm.model.AmazonDLMException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LimitExceededException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * 
     * @param resourceType
     *        Value is the type of resource for which a limit was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * 
     * @return Value is the type of resource for which a limit was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * 
     * @param resourceType
     *        Value is the type of resource for which a limit was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LimitExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
