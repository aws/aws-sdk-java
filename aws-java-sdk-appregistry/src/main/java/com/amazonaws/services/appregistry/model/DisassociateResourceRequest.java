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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The type of the resource that is being disassociated.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name or ID of the resource.
     * </p>
     */
    private String resource;

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @param application
     *        The name or ID of the application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @return The name or ID of the application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @param application
     *        The name or ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The type of the resource that is being disassociated.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is being disassociated.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that is being disassociated.
     * </p>
     * 
     * @return The type of the resource that is being disassociated.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that is being disassociated.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is being disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DisassociateResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource that is being disassociated.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is being disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DisassociateResourceRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name or ID of the resource.
     * </p>
     * 
     * @param resource
     *        The name or ID of the resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name or ID of the resource.
     * </p>
     * 
     * @return The name or ID of the resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name or ID of the resource.
     * </p>
     * 
     * @param resource
     *        The name or ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateResourceRequest == false)
            return false;
        DisassociateResourceRequest other = (DisassociateResourceRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResourceRequest clone() {
        return (DisassociateResourceRequest) super.clone();
    }

}
