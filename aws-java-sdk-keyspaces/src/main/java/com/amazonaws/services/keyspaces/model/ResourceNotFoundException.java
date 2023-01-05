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
package com.amazonaws.services.keyspaces.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified correctly,
 * or its status might not be <code>ACTIVE</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.keyspaces.model.AmazonKeyspacesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     * </p>
     */
    private String resourceArn;

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
     * The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     * </p>
     * 
     * @param resourceArn
     *        The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     * </p>
     * 
     * @return The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     * </p>
     * 
     * @param resourceArn
     *        The unique identifier in the format of Amazon Resource Name (ARN), for the resource not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

}
