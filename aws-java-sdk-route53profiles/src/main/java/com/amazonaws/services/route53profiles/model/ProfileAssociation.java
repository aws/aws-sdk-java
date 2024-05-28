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
 * An association between a Route 53 Profile and a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ProfileAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the Profile association was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * ID of the Profile association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the Profile association was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private java.util.Date modificationTime;
    /**
     * <p>
     * Name of the Profile association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Web Services account ID of the Profile association owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * ID of the Profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Status of the Profile association.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the Profile association.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The date and time that the Profile association was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile association was created, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile association was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the Profile association was created, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile association was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile association was created, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * ID of the Profile association.
     * </p>
     * 
     * @param id
     *        ID of the Profile association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the Profile association.
     * </p>
     * 
     * @return ID of the Profile association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the Profile association.
     * </p>
     * 
     * @param id
     *        ID of the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the Profile association was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile association was modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(java.util.Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile association was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the Profile association was modified, in Unix time format and Coordinated
     *         Universal Time (UTC).
     */

    public java.util.Date getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile association was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile association was modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withModificationTime(java.util.Date modificationTime) {
        setModificationTime(modificationTime);
        return this;
    }

    /**
     * <p>
     * Name of the Profile association.
     * </p>
     * 
     * @param name
     *        Name of the Profile association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Profile association.
     * </p>
     * 
     * @return Name of the Profile association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Profile association.
     * </p>
     * 
     * @param name
     *        Name of the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile association owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile association owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile association owner.
     * </p>
     * 
     * @return Amazon Web Services account ID of the Profile association owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile association owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile association owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @return ID of the Profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @param resourceId
     *        The Amazon Resource Name (ARN) of the VPC.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @param resourceId
     *        The Amazon Resource Name (ARN) of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Status of the Profile association.
     * </p>
     * 
     * @param status
     *        Status of the Profile association.
     * @see ProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the Profile association.
     * </p>
     * 
     * @return Status of the Profile association.
     * @see ProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the Profile association.
     * </p>
     * 
     * @param status
     *        Status of the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public ProfileAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the Profile association.
     * </p>
     * 
     * @param status
     *        Status of the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public ProfileAssociation withStatus(ProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the Profile association.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the Profile association.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the Profile association.
     * </p>
     * 
     * @return Additional information about the Profile association.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the Profile association.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileAssociation withStatusMessage(String statusMessage) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof ProfileAssociation == false)
            return false;
        ProfileAssociation other = (ProfileAssociation) obj;
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
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ProfileAssociation clone() {
        try {
            return (ProfileAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53profiles.model.transform.ProfileAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
