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
package com.amazonaws.services.bedrockruntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed due to an error while processing the model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelErrorException extends com.amazonaws.services.bedrockruntime.model.AmazonBedrockRuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The original status code.
     * </p>
     */
    private Integer originalStatusCode;
    /**
     * <p>
     * The resource name.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new ModelErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ModelErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * The original status code.
     * </p>
     * 
     * @param originalStatusCode
     *        The original status code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("originalStatusCode")
    public void setOriginalStatusCode(Integer originalStatusCode) {
        this.originalStatusCode = originalStatusCode;
    }

    /**
     * <p>
     * The original status code.
     * </p>
     * 
     * @return The original status code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("originalStatusCode")
    public Integer getOriginalStatusCode() {
        return this.originalStatusCode;
    }

    /**
     * <p>
     * The original status code.
     * </p>
     * 
     * @param originalStatusCode
     *        The original status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelErrorException withOriginalStatusCode(Integer originalStatusCode) {
        setOriginalStatusCode(originalStatusCode);
        return this;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @return The resource name.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelErrorException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
