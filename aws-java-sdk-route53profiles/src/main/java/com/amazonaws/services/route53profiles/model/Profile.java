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
 * A complex type that includes settings for a Route 53 Profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/Profile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Profile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The <code>ClientToken</code> value that was assigned when the Profile was created.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * ID of the Profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date modificationTime;
    /**
     * <p>
     * Name of the Profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Web Services account ID of the Profile owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Sharing status for the Profile.
     * </p>
     */
    private String shareStatus;
    /**
     * <p>
     * The status for the Profile.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Status message that includes additiona information about the Profile.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The <code>ClientToken</code> value that was assigned when the Profile was created.
     * </p>
     * 
     * @param clientToken
     *        The <code>ClientToken</code> value that was assigned when the Profile was created.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The <code>ClientToken</code> value that was assigned when the Profile was created.
     * </p>
     * 
     * @return The <code>ClientToken</code> value that was assigned when the Profile was created.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The <code>ClientToken</code> value that was assigned when the Profile was created.
     * </p>
     * 
     * @param clientToken
     *        The <code>ClientToken</code> value that was assigned when the Profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Profile was created, in Unix time format and Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param id
     *        ID of the Profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @return ID of the Profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param id
     *        ID of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     */

    public void setModificationTime(java.util.Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public java.util.Date getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Profile was modified, in Unix time format and Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withModificationTime(java.util.Date modificationTime) {
        setModificationTime(modificationTime);
        return this;
    }

    /**
     * <p>
     * Name of the Profile.
     * </p>
     * 
     * @param name
     *        Name of the Profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Profile.
     * </p>
     * 
     * @return Name of the Profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Profile.
     * </p>
     * 
     * @param name
     *        Name of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile owner.
     * </p>
     * 
     * @return Amazon Web Services account ID of the Profile owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Amazon Web Services account ID of the Profile owner.
     * </p>
     * 
     * @param ownerId
     *        Amazon Web Services account ID of the Profile owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Sharing status for the Profile.
     * </p>
     * 
     * @param shareStatus
     *        Sharing status for the Profile.
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * Sharing status for the Profile.
     * </p>
     * 
     * @return Sharing status for the Profile.
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * Sharing status for the Profile.
     * </p>
     * 
     * @param shareStatus
     *        Sharing status for the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public Profile withShareStatus(String shareStatus) {
        setShareStatus(shareStatus);
        return this;
    }

    /**
     * <p>
     * Sharing status for the Profile.
     * </p>
     * 
     * @param shareStatus
     *        Sharing status for the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public Profile withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status for the Profile.
     * </p>
     * 
     * @param status
     *        The status for the Profile.
     * @see ProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for the Profile.
     * </p>
     * 
     * @return The status for the Profile.
     * @see ProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for the Profile.
     * </p>
     * 
     * @param status
     *        The status for the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public Profile withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for the Profile.
     * </p>
     * 
     * @param status
     *        The status for the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileStatus
     */

    public Profile withStatus(ProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Status message that includes additiona information about the Profile.
     * </p>
     * 
     * @param statusMessage
     *        Status message that includes additiona information about the Profile.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Status message that includes additiona information about the Profile.
     * </p>
     * 
     * @return Status message that includes additiona information about the Profile.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Status message that includes additiona information about the Profile.
     * </p>
     * 
     * @param statusMessage
     *        Status message that includes additiona information about the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withStatusMessage(String statusMessage) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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
        if (getShareStatus() != null)
            sb.append("ShareStatus: ").append(getShareStatus()).append(",");
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

        if (obj instanceof Profile == false)
            return false;
        Profile other = (Profile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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
        if (other.getShareStatus() == null ^ this.getShareStatus() == null)
            return false;
        if (other.getShareStatus() != null && other.getShareStatus().equals(this.getShareStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public Profile clone() {
        try {
            return (Profile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53profiles.model.transform.ProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
