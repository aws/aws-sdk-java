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
package com.amazonaws.services.databasemigrationservice.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource you are attempting to create already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceAlreadyExistsException extends com.amazonaws.services.databasemigrationservice.model.AWSDatabaseMigrationServiceException {
    private static final long serialVersionUID = 1L;

    private String resourceArn;

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param resourceArn
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceArn")
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAlreadyExistsException withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

}
