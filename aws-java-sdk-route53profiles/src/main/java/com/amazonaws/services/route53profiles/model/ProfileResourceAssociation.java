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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The association between a Route 53 Profile and resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ProfileResourceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileResourceAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the Profile resource association was created, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * ID of the Profile resource association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     */
    private java.util.Date modificationTime;
    /**
     * <p>
     * Name of the Profile resource association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Web Services account ID of the Profile resource association owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Profile ID of the Profile that the resources are associated with.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource association.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     * </p>
     */
    private String resourceProperties;
    /**
     * <p>
     * Resource type, such as a private hosted zone, or DNS Firewall rule group.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Status of the Profile resource association.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the Profile resource association.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The date and time that the Profile resource association was created, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile resource association was created, in Unix time format and Coordinated
     *        Universal Time (UTC).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile resource association was created, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the Profile resource association was created, in Unix time format and Coordinated
     *         Universal Time (UTC).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile resource association was created, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile resource association was created, in Unix time format and Coordinated
     *        Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * ID of the Profile resource association.
     * </p>
     * 
     * @param id
     *        ID of the Profile resource association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the Profile resource association.
     * </p>
     * 
     * @return ID of the Profile resource association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the Profile resource association.
     * </p>
     * 
     * @param id
     *        ID of the Profile resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     *        Universal Time (UTC).
     */

    public void setModificationTime(java.util.Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     *         Universal Time (UTC).
     */

    public java.util.Date getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile resource association was modified, in Unix time format and Coordinated
     *        Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withModificationTime(java.util.Date modificationTime) {
        setModificationTime(modificationTime);
        return this;
    }

    /**
     * <p>
     * Name of the Profile resource association.
     * </p>
     * 
     * @param name
     *        Name of the Profile resource association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Profile resource association.
     * </p>
     * 
     * @return Name of the Profile resource association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Profile resource association.
     * </p>
     * 
     * @param name
     *        Name of the Profile resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile resource association owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile resource association owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile resource association owner.
     * </p>
     * 
     * @return Amazon Web Services account ID of the Profile resource association owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile resource association owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile resource association owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Profile ID of the Profile that the resources are associated with.
     * </p>
     * 
     * @param profileId
     *        Profile ID of the Profile that the resources are associated with.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Profile ID of the Profile that the resources are associated with.
     * </p>
     * 
     * @return Profile ID of the Profile that the resources are associated with.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Profile ID of the Profile that the resources are associated with.
     * </p>
     * 
     * @param profileId
     *        Profile ID of the Profile that the resources are associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource association.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource association.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource association.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource association.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     * </p>
     * 
     * @param resourceProperties
     *        If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     */

    public void setResourceProperties(String resourceProperties) {
        this.resourceProperties = resourceProperties;
    }

    /**
     * <p>
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     * </p>
     * 
     * @return If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     */

    public String getResourceProperties() {
        return this.resourceProperties;
    }

    /**
     * <p>
     * If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     * </p>
     * 
     * @param resourceProperties
     *        If the DNS resource is a DNS Firewall rule group, this indicates the priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withResourceProperties(String resourceProperties) {
        setResourceProperties(resourceProperties);
        return this;
    }

    /**
     * <p>
     * Resource type, such as a private hosted zone, or DNS Firewall rule group.
     * </p>
     * 
     * @param resourceType
     *        Resource type, such as a private hosted zone, or DNS Firewall rule group.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type, such as a private hosted zone, or DNS Firewall rule group.
     * </p>
     * 
     * @return Resource type, such as a private hosted zone, or DNS Firewall rule group.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type, such as a private hosted zone, or DNS Firewall rule group.
     * </p>
     * 
     * @param resourceType
     *        Resource type, such as a private hosted zone, or DNS Firewall rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Status of the Profile resource association.
     * </p>
     * 
     * @param status
     *        Status of the Profile resource association.
     * @see ProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the Profile resource association.
     * </p>
     * 
     * @return Status of the Profile resource association.
     * @see ProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the Profile resource association.
     * </p>
     * 
     * @param status
     *        Status of the Profile resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public ProfileResourceAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the Profile resource association.
     * </p>
     * 
     * @param status
     *        Status of the Profile resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public ProfileResourceAssociation withStatus(ProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the Profile resource association.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the Profile resource association.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the Profile resource association.
     * </p>
     * 
     * @return Additional information about the Profile resource association.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the Profile resource association.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the Profile resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileResourceAssociation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceProperties() != null)
            sb.append("ResourceProperties: ").append(getResourceProperties()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileResourceAssociation == false)
            return false;
        ProfileResourceAssociation other = (ProfileResourceAssociation) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceProperties() == null ^ this.getResourceProperties() == null)
            return false;
        if (other.getResourceProperties() != null && other.getResourceProperties().equals(this.getResourceProperties()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceProperties() == null) ? 0 : getResourceProperties().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ProfileResourceAssociation clone() {
        try {
            return (ProfileResourceAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53profiles.model.transform.ProfileResourceAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
