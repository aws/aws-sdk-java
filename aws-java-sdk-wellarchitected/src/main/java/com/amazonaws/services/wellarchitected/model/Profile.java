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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/Profile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Profile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The profile ARN.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The profile version.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The profile name.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The profile description.
     * </p>
     */
    private String profileDescription;
    /**
     * <p>
     * Profile questions.
     * </p>
     */
    private java.util.List<ProfileQuestion> profileQuestions;

    private String owner;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;
    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     */
    private String shareInvitationId;
    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @return The profile ARN.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The profile version.
     * </p>
     * 
     * @param profileVersion
     *        The profile version.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The profile version.
     * </p>
     * 
     * @return The profile version.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The profile version.
     * </p>
     * 
     * @param profileVersion
     *        The profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @return The profile name.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The profile name.
     * </p>
     * 
     * @param profileName
     *        The profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @param profileDescription
     *        The profile description.
     */

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @return The profile description.
     */

    public String getProfileDescription() {
        return this.profileDescription;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @param profileDescription
     *        The profile description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileDescription(String profileDescription) {
        setProfileDescription(profileDescription);
        return this;
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * 
     * @return Profile questions.
     */

    public java.util.List<ProfileQuestion> getProfileQuestions() {
        return profileQuestions;
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
     */

    public void setProfileQuestions(java.util.Collection<ProfileQuestion> profileQuestions) {
        if (profileQuestions == null) {
            this.profileQuestions = null;
            return;
        }

        this.profileQuestions = new java.util.ArrayList<ProfileQuestion>(profileQuestions);
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileQuestions(java.util.Collection)} or {@link #withProfileQuestions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileQuestions(ProfileQuestion... profileQuestions) {
        if (this.profileQuestions == null) {
            setProfileQuestions(new java.util.ArrayList<ProfileQuestion>(profileQuestions.length));
        }
        for (ProfileQuestion ele : profileQuestions) {
            this.profileQuestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withProfileQuestions(java.util.Collection<ProfileQuestion> profileQuestions) {
        setProfileQuestions(profileQuestions);
        return this;
    }

    /**
     * @param owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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

    public Profile withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @return The tags assigned to the profile.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the profile.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Profile withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Profile#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Profile addTagsEntry(String key, String value) {
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

    public Profile clearTagsEntries() {
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
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileDescription() != null)
            sb.append("ProfileDescription: ").append(getProfileDescription()).append(",");
        if (getProfileQuestions() != null)
            sb.append("ProfileQuestions: ").append(getProfileQuestions()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof Profile == false)
            return false;
        Profile other = (Profile) obj;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileDescription() == null ^ this.getProfileDescription() == null)
            return false;
        if (other.getProfileDescription() != null && other.getProfileDescription().equals(this.getProfileDescription()) == false)
            return false;
        if (other.getProfileQuestions() == null ^ this.getProfileQuestions() == null)
            return false;
        if (other.getProfileQuestions() != null && other.getProfileQuestions().equals(this.getProfileQuestions()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileDescription() == null) ? 0 : getProfileDescription().hashCode());
        hashCode = prime * hashCode + ((getProfileQuestions() == null) ? 0 : getProfileQuestions().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
        com.amazonaws.services.wellarchitected.model.transform.ProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
