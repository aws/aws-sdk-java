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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an association with a resource share and either a principal or a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceShareAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceShareAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String resourceShareName;
    /**
     * <p>
     * The associated entity. This can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a resource association, this is the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * For principal associations, this is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an organizational unit (OU) in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM role
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM user
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String associatedEntity;
    /**
     * <p>
     * The type of entity included in this association.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The current status of the association.
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
     * The date and time when the association was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time when the association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services
     * account that owns the resource share.
     * </p>
     */
    private Boolean external;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of the resource share.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     */

    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withResourceShareName(String resourceShareName) {
        setResourceShareName(resourceShareName);
        return this;
    }

    /**
     * <p>
     * The associated entity. This can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a resource association, this is the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * For principal associations, this is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an organizational unit (OU) in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM role
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM user
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param associatedEntity
     *        The associated entity. This can be either of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a resource association, this is the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a> of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For principal associations, this is one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ID of an Amazon Web Services account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of an organization in Organizations
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an organizational unit (OU) in Organizations
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an IAM role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an IAM user
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    /**
     * <p>
     * The associated entity. This can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a resource association, this is the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * For principal associations, this is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an organizational unit (OU) in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM role
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM user
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The associated entity. This can be either of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a resource association, this is the <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *         (ARN)</a> of the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For principal associations, this is one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The ID of an Amazon Web Services account
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of an organization in Organizations
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN of an organizational unit (OU) in Organizations
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN of an IAM role
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN of an IAM user
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getAssociatedEntity() {
        return this.associatedEntity;
    }

    /**
     * <p>
     * The associated entity. This can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a resource association, this is the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>
     * of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * For principal associations, this is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an organizational unit (OU) in Organizations
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM role
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN of an IAM user
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param associatedEntity
     *        The associated entity. This can be either of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a resource association, this is the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a> of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For principal associations, this is one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The ID of an Amazon Web Services account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of an organization in Organizations
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an organizational unit (OU) in Organizations
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an IAM role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The ARN of an IAM user
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withAssociatedEntity(String associatedEntity) {
        setAssociatedEntity(associatedEntity);
        return this;
    }

    /**
     * <p>
     * The type of entity included in this association.
     * </p>
     * 
     * @param associationType
     *        The type of entity included in this association.
     * @see ResourceShareAssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of entity included in this association.
     * </p>
     * 
     * @return The type of entity included in this association.
     * @see ResourceShareAssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of entity included in this association.
     * </p>
     * 
     * @param associationType
     *        The type of entity included in this association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public ResourceShareAssociation withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of entity included in this association.
     * </p>
     * 
     * @param associationType
     *        The type of entity included in this association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationType
     */

    public ResourceShareAssociation withAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
     * @see ResourceShareAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @return The current status of the association.
     * @see ResourceShareAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareAssociationStatus
     */

    public ResourceShareAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
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
     * The date and time when the association was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the association was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when the association was created.
     * </p>
     * 
     * @return The date and time when the association was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time when the association was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the association was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the association was last updated.
     * </p>
     * 
     * @return The date and time when the association was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services
     * account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web
     *        Services account that owns the resource share.
     */

    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services
     * account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web
     *         Services account that owns the resource share.
     */

    public Boolean getExternal() {
        return this.external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services
     * account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web
     *        Services account that owns the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareAssociation withExternal(Boolean external) {
        setExternal(external);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services
     * account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web
     *         Services account that owns the resource share.
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
        if (getResourceShareName() != null)
            sb.append("ResourceShareName: ").append(getResourceShareName()).append(",");
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
        if (other.getResourceShareName() == null ^ this.getResourceShareName() == null)
            return false;
        if (other.getResourceShareName() != null && other.getResourceShareName().equals(this.getResourceShareName()) == false)
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
        hashCode = prime * hashCode + ((getResourceShareName() == null) ? 0 : getResourceShareName().hashCode());
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
