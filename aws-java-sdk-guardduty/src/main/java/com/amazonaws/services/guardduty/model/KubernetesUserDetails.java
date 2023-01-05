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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Kubernetes user involved in a Kubernetes finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesUserDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesUserDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The username of the user who called the Kubernetes API.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The user ID of the user who called the Kubernetes API.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * The groups that include the user who called the Kubernetes API.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * The username of the user who called the Kubernetes API.
     * </p>
     * 
     * @param username
     *        The username of the user who called the Kubernetes API.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the user who called the Kubernetes API.
     * </p>
     * 
     * @return The username of the user who called the Kubernetes API.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the user who called the Kubernetes API.
     * </p>
     * 
     * @param username
     *        The username of the user who called the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesUserDetails withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The user ID of the user who called the Kubernetes API.
     * </p>
     * 
     * @param uid
     *        The user ID of the user who called the Kubernetes API.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The user ID of the user who called the Kubernetes API.
     * </p>
     * 
     * @return The user ID of the user who called the Kubernetes API.
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The user ID of the user who called the Kubernetes API.
     * </p>
     * 
     * @param uid
     *        The user ID of the user who called the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesUserDetails withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The groups that include the user who called the Kubernetes API.
     * </p>
     * 
     * @return The groups that include the user who called the Kubernetes API.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that include the user who called the Kubernetes API.
     * </p>
     * 
     * @param groups
     *        The groups that include the user who called the Kubernetes API.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The groups that include the user who called the Kubernetes API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The groups that include the user who called the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesUserDetails withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that include the user who called the Kubernetes API.
     * </p>
     * 
     * @param groups
     *        The groups that include the user who called the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesUserDetails withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesUserDetails == false)
            return false;
        KubernetesUserDetails other = (KubernetesUserDetails) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesUserDetails clone() {
        try {
            return (KubernetesUserDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesUserDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
