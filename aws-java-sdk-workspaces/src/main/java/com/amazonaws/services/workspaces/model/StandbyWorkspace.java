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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Standby WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StandbyWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandbyWorkspace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     */
    private String primaryWorkspaceId;
    /**
     * <p>
     * The volume encryption key of the Standby WorkSpace.
     * </p>
     */
    private String volumeEncryptionKey;
    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The tags associated with the Standby WorkSpace.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @param primaryWorkspaceId
     *        The identifier of the Standby WorkSpace.
     */

    public void setPrimaryWorkspaceId(String primaryWorkspaceId) {
        this.primaryWorkspaceId = primaryWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @return The identifier of the Standby WorkSpace.
     */

    public String getPrimaryWorkspaceId() {
        return this.primaryWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @param primaryWorkspaceId
     *        The identifier of the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspace withPrimaryWorkspaceId(String primaryWorkspaceId) {
        setPrimaryWorkspaceId(primaryWorkspaceId);
        return this;
    }

    /**
     * <p>
     * The volume encryption key of the Standby WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The volume encryption key of the Standby WorkSpace.
     */

    public void setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    /**
     * <p>
     * The volume encryption key of the Standby WorkSpace.
     * </p>
     * 
     * @return The volume encryption key of the Standby WorkSpace.
     */

    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    /**
     * <p>
     * The volume encryption key of the Standby WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The volume encryption key of the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspace withVolumeEncryptionKey(String volumeEncryptionKey) {
        setVolumeEncryptionKey(volumeEncryptionKey);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for the Standby WorkSpace.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @return The identifier of the directory for the Standby WorkSpace.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspace withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The tags associated with the Standby WorkSpace.
     * </p>
     * 
     * @return The tags associated with the Standby WorkSpace.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the Standby WorkSpace.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Standby WorkSpace.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the Standby WorkSpace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspace withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the Standby WorkSpace.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspace withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPrimaryWorkspaceId() != null)
            sb.append("PrimaryWorkspaceId: ").append(getPrimaryWorkspaceId()).append(",");
        if (getVolumeEncryptionKey() != null)
            sb.append("VolumeEncryptionKey: ").append(getVolumeEncryptionKey()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandbyWorkspace == false)
            return false;
        StandbyWorkspace other = (StandbyWorkspace) obj;
        if (other.getPrimaryWorkspaceId() == null ^ this.getPrimaryWorkspaceId() == null)
            return false;
        if (other.getPrimaryWorkspaceId() != null && other.getPrimaryWorkspaceId().equals(this.getPrimaryWorkspaceId()) == false)
            return false;
        if (other.getVolumeEncryptionKey() == null ^ this.getVolumeEncryptionKey() == null)
            return false;
        if (other.getVolumeEncryptionKey() != null && other.getVolumeEncryptionKey().equals(this.getVolumeEncryptionKey()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryWorkspaceId() == null) ? 0 : getPrimaryWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getVolumeEncryptionKey() == null) ? 0 : getVolumeEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StandbyWorkspace clone() {
        try {
            return (StandbyWorkspace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.StandbyWorkspaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
