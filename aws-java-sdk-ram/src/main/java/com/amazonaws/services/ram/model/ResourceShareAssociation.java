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
 * Describes an association with a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceShareAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceShareAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the resource. For principal associations,
     * this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     * </p>
     */
    private String associatedEntity;
    /**
     * <p>
     * The association type.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The status of the association.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message about the status of the association.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time when the association was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     */
    private Boolean external;

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

    public ResourceShareAssociation withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the resource. For principal associations,
     * this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     * </p>
     * 
     * @param associatedEntity
     *        The associated entity. For resource associations, this is the ARN of the resource. For principal
     *        associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     */

    public void setAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the resource. For principal associations,
     * this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     * </p>
     * 
     * @return The associated entity. For resource associations, this is the ARN of the resource. For principal
     *         associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS
     *         Organizations.
     */

    public String getAssociatedEntity() {
        return this.associatedEntity;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the resource. For principal associations,
     * this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     * </p>
     * 
     * @param associatedEntity
     *        The associated entity. For resource associations, this is the ARN of the resource. For principal
     *        associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withAssociatedEntity(String associatedEntity) {
        setAssociatedEntity(associatedEntity);
        return this;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @param associationType
     *        The association type.
     * @see ResourceShareAssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @return The association type.
     * @see ResourceShareAssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @param associationType
     *        The association type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public ResourceShareAssociation withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @param associationType
     *        The association type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public ResourceShareAssociation withAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @see ResourceShareAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @return The status of the association.
     * @see ResourceShareAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public ResourceShareAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * 
     * @param status
     *        The status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public ResourceShareAssociation withStatus(ResourceShareAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the association.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     * 
     * @return A message about the status of the association.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the association was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     * 
     * @return The time when the association was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the association was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @return The time when the association was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization as the AWS account that owns the resource
     *        share.
     */

    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization as the AWS account that owns the
     *         resource share.
     */

    public Boolean getExternal() {
        return this.external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization as the AWS account that owns the resource
     *        share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withExternal(Boolean external) {
        setExternal(external);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization as the AWS account that owns the
     *         resource share.
     */

    public Boolean isExternal() {
        return this.external;
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
        if (getAssociatedEntity() != null)
            sb.append("AssociatedEntity: ").append(getAssociatedEntity()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getExternal() != null)
            sb.append("External: ").append(getExternal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShareAssociation == false)
            return false;
        ResourceShareAssociation other = (ResourceShareAssociation) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getAssociatedEntity() == null ^ this.getAssociatedEntity() == null)
            return false;
        if (other.getAssociatedEntity() != null && other.getAssociatedEntity().equals(this.getAssociatedEntity()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getExternal() == null ^ this.getExternal() == null)
            return false;
        if (other.getExternal() != null && other.getExternal().equals(this.getExternal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getAssociatedEntity() == null) ? 0 : getAssociatedEntity().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getExternal() == null) ? 0 : getExternal().hashCode());
        return hashCode;
    }

    @Override
    public ResourceShareAssociation clone() {
        try {
            return (ResourceShareAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ResourceShareAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
