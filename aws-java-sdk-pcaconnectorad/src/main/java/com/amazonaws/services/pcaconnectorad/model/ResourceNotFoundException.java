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
package com.amazonaws.services.pcaconnectorad.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation tried to access a nonexistent resource. The resource might not be specified correctly, or its status
 * might not be ACTIVE.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.pcaconnectorad.model.AWSPcaConnectorAdException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the Amazon Web Services resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     * <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     * <code>DirectoryRegistration</code>.
     * </p>
     */
    private String resourceType;

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
     * The identifier of the Amazon Web Services resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the Amazon Web Services resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services resource.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     * <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     * <code>DirectoryRegistration</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     *        <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     *        <code>DirectoryRegistration</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     * <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     * <code>DirectoryRegistration</code>.
     * </p>
     * 
     * @return The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     *         <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     *         <code>DirectoryRegistration</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     * <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     * <code>DirectoryRegistration</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type, which can be one of <code>Connector</code>, <code>Template</code>,
     *        <code>TemplateGroupAccessControlEntry</code>, <code>ServicePrincipalName</code>, or
     *        <code>DirectoryRegistration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
