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
 * The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API of the
 * relevant service to perform the operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotServiceResourceErrorException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     */
    private String resourceARN;

    /**
     * Constructs a new NotServiceResourceErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotServiceResourceErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceARN")
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceARN")
    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the non-Amazon FSx resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotServiceResourceErrorException withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

}
