/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of the profile after a read or write operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ProfileDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Web Services account that created the profile.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The number of seconds the vended session credentials are valid for.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * Indicates whether the profile is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A list of managed policy ARNs that apply to the vended session credentials.
     * </p>
     */
    private java.util.List<String> managedPolicyArns;
    /**
     * <p>
     * The name of the profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the profile.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Specifies whether instance properties are required in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile.
     * </p>
     */
    private Boolean requireInstanceProperties;
    /**
     * <p>
     * A list of IAM roles that this profile can assume in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     */
    private java.util.List<String> roleArns;
    /**
     * <p>
     * A session policy that applies to the trust boundary of the vended session credentials.
     * </p>
     */
    private String sessionPolicy;
    /**
     * <p>
     * The ISO-8601 timestamp when the profile was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the profile was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was created.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the profile was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that created the profile.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Web Services account that created the profile.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Web Services account that created the profile.
     * </p>
     * 
     * @return The Amazon Web Services account that created the profile.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Web Services account that created the profile.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Web Services account that created the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The number of seconds the vended session credentials are valid for.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds the vended session credentials are valid for.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The number of seconds the vended session credentials are valid for.
     * </p>
     * 
     * @return The number of seconds the vended session credentials are valid for.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The number of seconds the vended session credentials are valid for.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds the vended session credentials are valid for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * Indicates whether the profile is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the profile is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the profile is enabled.
     * </p>
     * 
     * @return Indicates whether the profile is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the profile is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the profile is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the profile is enabled.
     * </p>
     * 
     * @return Indicates whether the profile is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A list of managed policy ARNs that apply to the vended session credentials.
     * </p>
     * 
     * @return A list of managed policy ARNs that apply to the vended session credentials.
     */

    public java.util.List<String> getManagedPolicyArns() {
        return managedPolicyArns;
    }

    /**
     * <p>
     * A list of managed policy ARNs that apply to the vended session credentials.
     * </p>
     * 
     * @param managedPolicyArns
     *        A list of managed policy ARNs that apply to the vended session credentials.
     */

    public void setManagedPolicyArns(java.util.Collection<String> managedPolicyArns) {
        if (managedPolicyArns == null) {
            this.managedPolicyArns = null;
            return;
        }

        this.managedPolicyArns = new java.util.ArrayList<String>(managedPolicyArns);
    }

    /**
     * <p>
     * A list of managed policy ARNs that apply to the vended session credentials.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedPolicyArns(java.util.Collection)} or {@link #withManagedPolicyArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param managedPolicyArns
     *        A list of managed policy ARNs that apply to the vended session credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withManagedPolicyArns(String... managedPolicyArns) {
        if (this.managedPolicyArns == null) {
            setManagedPolicyArns(new java.util.ArrayList<String>(managedPolicyArns.length));
        }
        for (String ele : managedPolicyArns) {
            this.managedPolicyArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of managed policy ARNs that apply to the vended session credentials.
     * </p>
     * 
     * @param managedPolicyArns
     *        A list of managed policy ARNs that apply to the vended session credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withManagedPolicyArns(java.util.Collection<String> managedPolicyArns) {
        setManagedPolicyArns(managedPolicyArns);
        return this;
    }

    /**
     * <p>
     * The name of the profile.
     * </p>
     * 
     * @param name
     *        The name of the profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the profile.
     * </p>
     * 
     * @return The name of the profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the profile.
     * </p>
     * 
     * @param name
     *        The name of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the profile.
     * </p>
     * 
     * @param profileArn
     *        The ARN of the profile.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The ARN of the profile.
     * </p>
     * 
     * @return The ARN of the profile.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The ARN of the profile.
     * </p>
     * 
     * @param profileArn
     *        The ARN of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @return The unique identifier of the profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile.
     * </p>
     * 
     * @param requireInstanceProperties
     *        Specifies whether instance properties are required in <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> requests with this profile.
     */

    public void setRequireInstanceProperties(Boolean requireInstanceProperties) {
        this.requireInstanceProperties = requireInstanceProperties;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile.
     * </p>
     * 
     * @return Specifies whether instance properties are required in <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> requests with this profile.
     */

    public Boolean getRequireInstanceProperties() {
        return this.requireInstanceProperties;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile.
     * </p>
     * 
     * @param requireInstanceProperties
     *        Specifies whether instance properties are required in <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> requests with this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withRequireInstanceProperties(Boolean requireInstanceProperties) {
        setRequireInstanceProperties(requireInstanceProperties);
        return this;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile.
     * </p>
     * 
     * @return Specifies whether instance properties are required in <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> requests with this profile.
     */

    public Boolean isRequireInstanceProperties() {
        return this.requireInstanceProperties;
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @return A list of IAM roles that this profile can assume in a <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation.
     */

    public java.util.List<String> getRoleArns() {
        return roleArns;
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     */

    public void setRoleArns(java.util.Collection<String> roleArns) {
        if (roleArns == null) {
            this.roleArns = null;
            return;
        }

        this.roleArns = new java.util.ArrayList<String>(roleArns);
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleArns(java.util.Collection)} or {@link #withRoleArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withRoleArns(String... roleArns) {
        if (this.roleArns == null) {
            setRoleArns(new java.util.ArrayList<String>(roleArns.length));
        }
        for (String ele : roleArns) {
            this.roleArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withRoleArns(java.util.Collection<String> roleArns) {
        setRoleArns(roleArns);
        return this;
    }

    /**
     * <p>
     * A session policy that applies to the trust boundary of the vended session credentials.
     * </p>
     * 
     * @param sessionPolicy
     *        A session policy that applies to the trust boundary of the vended session credentials.
     */

    public void setSessionPolicy(String sessionPolicy) {
        this.sessionPolicy = sessionPolicy;
    }

    /**
     * <p>
     * A session policy that applies to the trust boundary of the vended session credentials.
     * </p>
     * 
     * @return A session policy that applies to the trust boundary of the vended session credentials.
     */

    public String getSessionPolicy() {
        return this.sessionPolicy;
    }

    /**
     * <p>
     * A session policy that applies to the trust boundary of the vended session credentials.
     * </p>
     * 
     * @param sessionPolicy
     *        A session policy that applies to the trust boundary of the vended session credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withSessionPolicy(String sessionPolicy) {
        setSessionPolicy(sessionPolicy);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the profile was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was last updated.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the profile was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the profile was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the profile was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileDetail withUpdatedAt(java.util.Date updatedAt) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getManagedPolicyArns() != null)
            sb.append("ManagedPolicyArns: ").append(getManagedPolicyArns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getRequireInstanceProperties() != null)
            sb.append("RequireInstanceProperties: ").append(getRequireInstanceProperties()).append(",");
        if (getRoleArns() != null)
            sb.append("RoleArns: ").append(getRoleArns()).append(",");
        if (getSessionPolicy() != null)
            sb.append("SessionPolicy: ").append(getSessionPolicy()).append(",");
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

        if (obj instanceof ProfileDetail == false)
            return false;
        ProfileDetail other = (ProfileDetail) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getManagedPolicyArns() == null ^ this.getManagedPolicyArns() == null)
            return false;
        if (other.getManagedPolicyArns() != null && other.getManagedPolicyArns().equals(this.getManagedPolicyArns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getRequireInstanceProperties() == null ^ this.getRequireInstanceProperties() == null)
            return false;
        if (other.getRequireInstanceProperties() != null && other.getRequireInstanceProperties().equals(this.getRequireInstanceProperties()) == false)
            return false;
        if (other.getRoleArns() == null ^ this.getRoleArns() == null)
            return false;
        if (other.getRoleArns() != null && other.getRoleArns().equals(this.getRoleArns()) == false)
            return false;
        if (other.getSessionPolicy() == null ^ this.getSessionPolicy() == null)
            return false;
        if (other.getSessionPolicy() != null && other.getSessionPolicy().equals(this.getSessionPolicy()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getManagedPolicyArns() == null) ? 0 : getManagedPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getRequireInstanceProperties() == null) ? 0 : getRequireInstanceProperties().hashCode());
        hashCode = prime * hashCode + ((getRoleArns() == null) ? 0 : getRoleArns().hashCode());
        hashCode = prime * hashCode + ((getSessionPolicy() == null) ? 0 : getSessionPolicy().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProfileDetail clone() {
        try {
            return (ProfileDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.ProfileDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
