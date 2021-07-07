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
package com.amazonaws.services.iotsitewise.model;

import javax.annotation.Generated;

/**
 * <p>
 * You've reached the limit for the number of tags allowed for a resource. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag naming limits and
 * requirements</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyTagsException extends com.amazonaws.services.iotsitewise.model.AWSIoTSiteWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the resource with too many tags.
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
     * The name of the resource with too many tags.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource with too many tags.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource with too many tags.
     * </p>
     * 
     * @return The name of the resource with too many tags.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource with too many tags.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource with too many tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyTagsException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
