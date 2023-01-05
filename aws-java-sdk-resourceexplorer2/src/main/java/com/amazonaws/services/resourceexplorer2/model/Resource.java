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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource in Amazon Web Services that Amazon Web Services Resource Explorer has discovered, and for which it has
 * stored information in the index of the Amazon Web Services Region that contains the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that Resource Explorer last queried this resource and updated the index with the latest
     * information about the resource.
     * </p>
     */
    private java.util.Date lastReportedAt;
    /**
     * <p>
     * The Amazon Web Services account that owns the resource.
     * </p>
     */
    private String owningAccountId;
    /**
     * <p>
     * A structure with additional type-specific details about the resource. These properties can be added by turning on
     * integration between Resource Explorer and other Amazon Web Services services.
     * </p>
     */
    private java.util.List<ResourceProperty> properties;
    /**
     * <p>
     * The Amazon Web Services Region in which the resource was created and exists.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The type of the resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the resource.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that Resource Explorer last queried this resource and updated the index with the latest
     * information about the resource.
     * </p>
     * 
     * @param lastReportedAt
     *        The date and time that Resource Explorer last queried this resource and updated the index with the latest
     *        information about the resource.
     */

    public void setLastReportedAt(java.util.Date lastReportedAt) {
        this.lastReportedAt = lastReportedAt;
    }

    /**
     * <p>
     * The date and time that Resource Explorer last queried this resource and updated the index with the latest
     * information about the resource.
     * </p>
     * 
     * @return The date and time that Resource Explorer last queried this resource and updated the index with the latest
     *         information about the resource.
     */

    public java.util.Date getLastReportedAt() {
        return this.lastReportedAt;
    }

    /**
     * <p>
     * The date and time that Resource Explorer last queried this resource and updated the index with the latest
     * information about the resource.
     * </p>
     * 
     * @param lastReportedAt
     *        The date and time that Resource Explorer last queried this resource and updated the index with the latest
     *        information about the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withLastReportedAt(java.util.Date lastReportedAt) {
        setLastReportedAt(lastReportedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @param owningAccountId
     *        The Amazon Web Services account that owns the resource.
     */

    public void setOwningAccountId(String owningAccountId) {
        this.owningAccountId = owningAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @return The Amazon Web Services account that owns the resource.
     */

    public String getOwningAccountId() {
        return this.owningAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @param owningAccountId
     *        The Amazon Web Services account that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withOwningAccountId(String owningAccountId) {
        setOwningAccountId(owningAccountId);
        return this;
    }

    /**
     * <p>
     * A structure with additional type-specific details about the resource. These properties can be added by turning on
     * integration between Resource Explorer and other Amazon Web Services services.
     * </p>
     * 
     * @return A structure with additional type-specific details about the resource. These properties can be added by
     *         turning on integration between Resource Explorer and other Amazon Web Services services.
     */

    public java.util.List<ResourceProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A structure with additional type-specific details about the resource. These properties can be added by turning on
     * integration between Resource Explorer and other Amazon Web Services services.
     * </p>
     * 
     * @param properties
     *        A structure with additional type-specific details about the resource. These properties can be added by
     *        turning on integration between Resource Explorer and other Amazon Web Services services.
     */

    public void setProperties(java.util.Collection<ResourceProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<ResourceProperty>(properties);
    }

    /**
     * <p>
     * A structure with additional type-specific details about the resource. These properties can be added by turning on
     * integration between Resource Explorer and other Amazon Web Services services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        A structure with additional type-specific details about the resource. These properties can be added by
     *        turning on integration between Resource Explorer and other Amazon Web Services services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withProperties(ResourceProperty... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<ResourceProperty>(properties.length));
        }
        for (ResourceProperty ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure with additional type-specific details about the resource. These properties can be added by turning on
     * integration between Resource Explorer and other Amazon Web Services services.
     * </p>
     * 
     * @param properties
     *        A structure with additional type-specific details about the resource. These properties can be added by
     *        turning on integration between Resource Explorer and other Amazon Web Services services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withProperties(java.util.Collection<ResourceProperty> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the resource was created and exists.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the resource was created and exists.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the resource was created and exists.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the resource was created and exists.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the resource was created and exists.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the resource was created and exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * </p>
     * 
     * @param service
     *        The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * </p>
     * 
     * @return The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * </p>
     * 
     * @param service
     *        The Amazon Web Service that owns the resource and is responsible for creating and updating it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withService(String service) {
        setService(service);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLastReportedAt() != null)
            sb.append("LastReportedAt: ").append(getLastReportedAt()).append(",");
        if (getOwningAccountId() != null)
            sb.append("OwningAccountId: ").append(getOwningAccountId()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLastReportedAt() == null ^ this.getLastReportedAt() == null)
            return false;
        if (other.getLastReportedAt() != null && other.getLastReportedAt().equals(this.getLastReportedAt()) == false)
            return false;
        if (other.getOwningAccountId() == null ^ this.getOwningAccountId() == null)
            return false;
        if (other.getOwningAccountId() != null && other.getOwningAccountId().equals(this.getOwningAccountId()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLastReportedAt() == null) ? 0 : getLastReportedAt().hashCode());
        hashCode = prime * hashCode + ((getOwningAccountId() == null) ? 0 : getOwningAccountId().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
