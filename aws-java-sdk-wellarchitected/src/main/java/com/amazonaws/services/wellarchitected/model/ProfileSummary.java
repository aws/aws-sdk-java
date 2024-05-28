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
 * Summary of a profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ProfileSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileSummary implements Serializable, Cloneable, StructuredPojo {

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

    private String owner;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

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

    public ProfileSummary withProfileArn(String profileArn) {
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

    public ProfileSummary withProfileVersion(String profileVersion) {
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

    public ProfileSummary withProfileName(String profileName) {
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

    public ProfileSummary withProfileDescription(String profileDescription) {
        setProfileDescription(profileDescription);
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

    public ProfileSummary withOwner(String owner) {
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

    public ProfileSummary withCreatedAt(java.util.Date createdAt) {
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

    public ProfileSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileSummary == false)
            return false;
        ProfileSummary other = (ProfileSummary) obj;
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
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProfileSummary clone() {
        try {
            return (ProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
