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
package com.amazonaws.services.servicediscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The namespace that you're trying to create already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceAlreadyExistsException extends com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     */
    private String namespaceId;

    /**
     * Constructs a new NamespaceAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NamespaceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * 
     * @param creatorRequestId
     *        The <code>CreatorRequestId</code> that was used to create the namespace.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CreatorRequestId")
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * 
     * @return The <code>CreatorRequestId</code> that was used to create the namespace.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CreatorRequestId")
    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * 
     * @param creatorRequestId
     *        The <code>CreatorRequestId</code> that was used to create the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceAlreadyExistsException withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the existing namespace.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("NamespaceId")
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * 
     * @return The ID of the existing namespace.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("NamespaceId")
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the existing namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceAlreadyExistsException withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

}
