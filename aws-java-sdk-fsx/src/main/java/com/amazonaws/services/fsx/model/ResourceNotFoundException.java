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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource specified by the Amazon Resource Name (ARN) can't be found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource ARN of the resource that can't be found.
     * </p>
     */
    private String resourceARN;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource ARN of the resource that can't be found.
     * </p>
     * 
     * @param resourceARN
     *        The resource ARN of the resource that can't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceARN")
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The resource ARN of the resource that can't be found.
     * </p>
     * 
     * @return The resource ARN of the resource that can't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceARN")
    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The resource ARN of the resource that can't be found.
     * </p>
     * 
     * @param resourceARN
     *        The resource ARN of the resource that can't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

}
