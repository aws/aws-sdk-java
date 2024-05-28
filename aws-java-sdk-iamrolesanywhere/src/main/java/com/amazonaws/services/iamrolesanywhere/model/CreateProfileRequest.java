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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Used to determine how long sessions vended using this profile are valid for. See the <code>Expiration</code>
     * section of the <a href=
     * "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     * >CreateSession API documentation</a> page for more details. In requests, if this value is not provided, the
     * default value will be 3600.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * Specifies whether the profile is enabled.
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
     * Specifies whether instance properties are required in temporary credential requests with this profile.
     * </p>
     */
    private Boolean requireInstanceProperties;
    /**
     * <p>
     * A list of IAM roles that this profile can assume in a temporary credential request.
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
     * The tags to attach to the profile.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Used to determine how long sessions vended using this profile are valid for. See the <code>Expiration</code>
     * section of the <a href=
     * "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     * >CreateSession API documentation</a> page for more details. In requests, if this value is not provided, the
     * default value will be 3600.
     * </p>
     * 
     * @param durationSeconds
     *        Used to determine how long sessions vended using this profile are valid for. See the
     *        <code>Expiration</code> section of the <a href=
     *        "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     *        >CreateSession API documentation</a> page for more details. In requests, if this value is not provided,
     *        the default value will be 3600.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * Used to determine how long sessions vended using this profile are valid for. See the <code>Expiration</code>
     * section of the <a href=
     * "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     * >CreateSession API documentation</a> page for more details. In requests, if this value is not provided, the
     * default value will be 3600.
     * </p>
     * 
     * @return Used to determine how long sessions vended using this profile are valid for. See the
     *         <code>Expiration</code> section of the <a href=
     *         "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     *         >CreateSession API documentation</a> page for more details. In requests, if this value is not provided,
     *         the default value will be 3600.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * Used to determine how long sessions vended using this profile are valid for. See the <code>Expiration</code>
     * section of the <a href=
     * "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     * >CreateSession API documentation</a> page for more details. In requests, if this value is not provided, the
     * default value will be 3600.
     * </p>
     * 
     * @param durationSeconds
     *        Used to determine how long sessions vended using this profile are valid for. See the
     *        <code>Expiration</code> section of the <a href=
     *        "https://docs.aws.amazon.com/rolesanywhere/latest/userguide/authentication-create-session.html#credentials-object"
     *        >CreateSession API documentation</a> page for more details. In requests, if this value is not provided,
     *        the default value will be 3600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies whether the profile is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the profile is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the profile is enabled.
     * </p>
     * 
     * @return Specifies whether the profile is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the profile is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the profile is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the profile is enabled.
     * </p>
     * 
     * @return Specifies whether the profile is enabled.
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

    public CreateProfileRequest withManagedPolicyArns(String... managedPolicyArns) {
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

    public CreateProfileRequest withManagedPolicyArns(java.util.Collection<String> managedPolicyArns) {
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

    public CreateProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in temporary credential requests with this profile.
     * </p>
     * 
     * @param requireInstanceProperties
     *        Specifies whether instance properties are required in temporary credential requests with this profile.
     */

    public void setRequireInstanceProperties(Boolean requireInstanceProperties) {
        this.requireInstanceProperties = requireInstanceProperties;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in temporary credential requests with this profile.
     * </p>
     * 
     * @return Specifies whether instance properties are required in temporary credential requests with this profile.
     */

    public Boolean getRequireInstanceProperties() {
        return this.requireInstanceProperties;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in temporary credential requests with this profile.
     * </p>
     * 
     * @param requireInstanceProperties
     *        Specifies whether instance properties are required in temporary credential requests with this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withRequireInstanceProperties(Boolean requireInstanceProperties) {
        setRequireInstanceProperties(requireInstanceProperties);
        return this;
    }

    /**
     * <p>
     * Specifies whether instance properties are required in temporary credential requests with this profile.
     * </p>
     * 
     * @return Specifies whether instance properties are required in temporary credential requests with this profile.
     */

    public Boolean isRequireInstanceProperties() {
        return this.requireInstanceProperties;
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a temporary credential request.
     * </p>
     * 
     * @return A list of IAM roles that this profile can assume in a temporary credential request.
     */

    public java.util.List<String> getRoleArns() {
        return roleArns;
    }

    /**
     * <p>
     * A list of IAM roles that this profile can assume in a temporary credential request.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a temporary credential request.
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
     * A list of IAM roles that this profile can assume in a temporary credential request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleArns(java.util.Collection)} or {@link #withRoleArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a temporary credential request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withRoleArns(String... roleArns) {
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
     * A list of IAM roles that this profile can assume in a temporary credential request.
     * </p>
     * 
     * @param roleArns
     *        A list of IAM roles that this profile can assume in a temporary credential request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withRoleArns(java.util.Collection<String> roleArns) {
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

    public CreateProfileRequest withSessionPolicy(String sessionPolicy) {
        setSessionPolicy(sessionPolicy);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the profile.
     * </p>
     * 
     * @return The tags to attach to the profile.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the profile.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the profile.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to attach to the profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the profile.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getManagedPolicyArns() != null)
            sb.append("ManagedPolicyArns: ").append(getManagedPolicyArns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequireInstanceProperties() != null)
            sb.append("RequireInstanceProperties: ").append(getRequireInstanceProperties()).append(",");
        if (getRoleArns() != null)
            sb.append("RoleArns: ").append(getRoleArns()).append(",");
        if (getSessionPolicy() != null)
            sb.append("SessionPolicy: ").append(getSessionPolicy()).append(",");
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

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
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

        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getManagedPolicyArns() == null) ? 0 : getManagedPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequireInstanceProperties() == null) ? 0 : getRequireInstanceProperties().hashCode());
        hashCode = prime * hashCode + ((getRoleArns() == null) ? 0 : getRoleArns().hashCode());
        hashCode = prime * hashCode + ((getSessionPolicy() == null) ? 0 : getSessionPolicy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
