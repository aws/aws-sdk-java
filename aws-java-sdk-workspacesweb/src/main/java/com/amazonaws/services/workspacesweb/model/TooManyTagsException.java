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
package com.amazonaws.services.workspacesweb.model;

import javax.annotation.Generated;

/**
 * <p>
 * There are too many tags.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyTagsException extends com.amazonaws.services.workspacesweb.model.AmazonWorkSpacesWebException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Name of the resource affected.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new TooManyTagsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyTagsException(String message) {
        super(message);
    }

    /**
     * <p>
     * Name of the resource affected.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * Name of the resource affected.
     * </p>
     * 
     * @return Name of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * Name of the resource affected.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyTagsException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
