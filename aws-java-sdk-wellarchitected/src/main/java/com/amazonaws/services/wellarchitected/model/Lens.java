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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lens return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/Lens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Lens implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a lens.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The version of a lens.
     * </p>
     */
    private String lensVersion;

    private String name;

    private String description;
    /**
     * <p>
     * The Amazon Web Services account ID that owns the lens.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     */
    private String shareInvitationId;
    /**
     * <p>
     * The tags assigned to the lens.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of a lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN of a lens.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The ARN of a lens.
     * </p>
     * 
     * @return The ARN of a lens.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The ARN of a lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN of a lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The version of a lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of a lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of a lens.
     * </p>
     * 
     * @return The version of a lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of a lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of a lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the lens.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account ID that owns the lens.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the lens.
     * </p>
     * 
     * @return The Amazon Web Services account ID that owns the lens.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the lens.
     * </p>
     * 
     * @param owner
     *        The Amazon Web Services account ID that owns the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     */

    public void setShareInvitationId(String shareInvitationId) {
        this.shareInvitationId = shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @return The ID assigned to the share invitation.
     */

    public String getShareInvitationId() {
        return this.shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the lens.
     * </p>
     * 
     * @return The tags assigned to the lens.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the lens.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the lens.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the lens.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Lens#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Lens addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lens clearTagsEntries() {
        this.tags = null;
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
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getShareInvitationId() != null)
            sb.append("ShareInvitationId: ").append(getShareInvitationId()).append(",");
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

        if (obj instanceof Lens == false)
            return false;
        Lens other = (Lens) obj;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getShareInvitationId() == null ^ this.getShareInvitationId() == null)
            return false;
        if (other.getShareInvitationId() != null && other.getShareInvitationId().equals(this.getShareInvitationId()) == false)
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

        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Lens clone() {
        try {
            return (Lens) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
