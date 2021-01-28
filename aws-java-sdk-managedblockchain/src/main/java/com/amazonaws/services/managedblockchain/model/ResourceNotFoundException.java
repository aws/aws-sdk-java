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
package com.amazonaws.services.managedblockchain.model;

import javax.annotation.Generated;

/**
 * <p>
 * A requested resource does not exist. It may have been deleted or referenced inaccurately.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.managedblockchain.model.AmazonManagedBlockchainException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * </p>
     */
    private String resourceName;

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
     * A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * </p>
     * 
     * @param resourceName
     *        A requested resource does not exist. It may have been deleted or referenced inaccurately.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * </p>
     * 
     * @return A requested resource does not exist. It may have been deleted or referenced inaccurately.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * </p>
     * 
     * @param resourceName
     *        A requested resource does not exist. It may have been deleted or referenced inaccurately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
