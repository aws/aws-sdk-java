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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ResourceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource across services.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Provides information about the Service Catalog App Registry resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The details related to the resource.
     * </p>
     */
    private ResourceDetails resourceDetails;

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the resource across services.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource across services.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the resource across services.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the resource across services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Provides information about the Service Catalog App Registry resource type.
     * </p>
     * 
     * @param resourceType
     *        Provides information about the Service Catalog App Registry resource type.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Provides information about the Service Catalog App Registry resource type.
     * </p>
     * 
     * @return Provides information about the Service Catalog App Registry resource type.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Provides information about the Service Catalog App Registry resource type.
     * </p>
     * 
     * @param resourceType
     *        Provides information about the Service Catalog App Registry resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceInfo withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Provides information about the Service Catalog App Registry resource type.
     * </p>
     * 
     * @param resourceType
     *        Provides information about the Service Catalog App Registry resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceInfo withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The details related to the resource.
     * </p>
     * 
     * @param resourceDetails
     *        The details related to the resource.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * The details related to the resource.
     * </p>
     * 
     * @return The details related to the resource.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * The details related to the resource.
     * </p>
     * 
     * @param resourceDetails
     *        The details related to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceInfo == false)
            return false;
        ResourceInfo other = (ResourceInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourceInfo clone() {
        try {
            return (ResourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ResourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
