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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceShare implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     */
    private String owningAccountId;
    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     */
    private Boolean allowExternalPrincipals;
    /**
     * <p>
     * The status of the resource share.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The tags for the resource share.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource share.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     * 
     * @param owningAccountId
     *        The ID of the AWS account that owns the resource share.
     */

    public void setOwningAccountId(String owningAccountId) {
        this.owningAccountId = owningAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     * 
     * @return The ID of the AWS account that owns the resource share.
     */

    public String getOwningAccountId() {
        return this.owningAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     * 
     * @param owningAccountId
     *        The ID of the AWS account that owns the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withOwningAccountId(String owningAccountId) {
        setOwningAccountId(owningAccountId);
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Indicates whether principals outside your organization can be associated with a resource share.
     */

    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     */

    public Boolean getAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Indicates whether principals outside your organization can be associated with a resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        setAllowExternalPrincipals(allowExternalPrincipals);
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your organization can be associated with a resource share.
     * </p>
     * 
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     */

    public Boolean isAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param status
     *        The status of the resource share.
     * @see ResourceShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @return The status of the resource share.
     * @see ResourceShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param status
     *        The status of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public ResourceShare withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param status
     *        The status of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public ResourceShare withStatus(ResourceShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the resource share.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     * 
     * @return A message about the status of the resource share.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     * 
     * @return The tags for the resource share.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     * 
     * @param tags
     *        The tags for the resource share.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     * 
     * @param tags
     *        The tags for the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the resource share was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     * 
     * @return The time when the resource share was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the resource share was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the resource share was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     * 
     * @return The time when the resource share was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the resource share was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShare withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwningAccountId() != null)
            sb.append("OwningAccountId: ").append(getOwningAccountId()).append(",");
        if (getAllowExternalPrincipals() != null)
            sb.append("AllowExternalPrincipals: ").append(getAllowExternalPrincipals()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShare == false)
            return false;
        ResourceShare other = (ResourceShare) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningAccountId() == null ^ this.getOwningAccountId() == null)
            return false;
        if (other.getOwningAccountId() != null && other.getOwningAccountId().equals(this.getOwningAccountId()) == false)
            return false;
        if (other.getAllowExternalPrincipals() == null ^ this.getAllowExternalPrincipals() == null)
            return false;
        if (other.getAllowExternalPrincipals() != null && other.getAllowExternalPrincipals().equals(this.getAllowExternalPrincipals()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningAccountId() == null) ? 0 : getOwningAccountId().hashCode());
        hashCode = prime * hashCode + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceShare clone() {
        try {
            return (ResourceShare) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ResourceShareMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
