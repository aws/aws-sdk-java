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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of seconds the vended session credentials are valid for.
     * </p>
     */
    private Integer durationSeconds;
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
     * The unique identifier of the profile.
     * </p>
     */
    private String profileId;
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

    public UpdateProfileRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
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

    public UpdateProfileRequest withManagedPolicyArns(String... managedPolicyArns) {
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

    public UpdateProfileRequest withManagedPolicyArns(java.util.Collection<String> managedPolicyArns) {
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

    public UpdateProfileRequest withName(String name) {
        setName(name);
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

    public UpdateProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
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

    public UpdateProfileRequest withRoleArns(String... roleArns) {
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

    public UpdateProfileRequest withRoleArns(java.util.Collection<String> roleArns) {
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

    public UpdateProfileRequest withSessionPolicy(String sessionPolicy) {
        setSessionPolicy(sessionPolicy);
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
        if (getManagedPolicyArns() != null)
            sb.append("ManagedPolicyArns: ").append(getManagedPolicyArns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getRoleArns() != null)
            sb.append("RoleArns: ").append(getRoleArns()).append(",");
        if (getSessionPolicy() != null)
            sb.append("SessionPolicy: ").append(getSessionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getManagedPolicyArns() == null ^ this.getManagedPolicyArns() == null)
            return false;
        if (other.getManagedPolicyArns() != null && other.getManagedPolicyArns().equals(this.getManagedPolicyArns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getRoleArns() == null ^ this.getRoleArns() == null)
            return false;
        if (other.getRoleArns() != null && other.getRoleArns().equals(this.getRoleArns()) == false)
            return false;
        if (other.getSessionPolicy() == null ^ this.getSessionPolicy() == null)
            return false;
        if (other.getSessionPolicy() != null && other.getSessionPolicy().equals(this.getSessionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getManagedPolicyArns() == null) ? 0 : getManagedPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getRoleArns() == null) ? 0 : getRoleArns().hashCode());
        hashCode = prime * hashCode + ((getSessionPolicy() == null) ? 0 : getSessionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileRequest clone() {
        return (UpdateProfileRequest) super.clone();
    }

}
