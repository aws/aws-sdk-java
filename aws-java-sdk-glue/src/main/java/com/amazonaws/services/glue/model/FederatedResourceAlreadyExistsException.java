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
package com.amazonaws.services.glue.model;

import javax.annotation.Generated;

/**
 * <p>
 * A federated resource already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedResourceAlreadyExistsException extends com.amazonaws.services.glue.model.AWSGlueException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The associated Glue resource already exists.
     * </p>
     */
    private String associatedGlueResource;

    /**
     * Constructs a new FederatedResourceAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FederatedResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The associated Glue resource already exists.
     * </p>
     * 
     * @param associatedGlueResource
     *        The associated Glue resource already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AssociatedGlueResource")
    public void setAssociatedGlueResource(String associatedGlueResource) {
        this.associatedGlueResource = associatedGlueResource;
    }

    /**
     * <p>
     * The associated Glue resource already exists.
     * </p>
     * 
     * @return The associated Glue resource already exists.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AssociatedGlueResource")
    public String getAssociatedGlueResource() {
        return this.associatedGlueResource;
    }

    /**
     * <p>
     * The associated Glue resource already exists.
     * </p>
     * 
     * @param associatedGlueResource
     *        The associated Glue resource already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedResourceAlreadyExistsException withAssociatedGlueResource(String associatedGlueResource) {
        setAssociatedGlueResource(associatedGlueResource);
        return this;
    }

}
