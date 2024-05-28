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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the role binding that grants the permission defined in a Kubernetes role.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesRoleBindingDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesRoleBindingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     * </p>
     */
    private String kind;
    /**
     * <p>
     * The name of the <code>RoleBinding</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the role binding.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * The name of the role being referenced. This must match the name of the <code>Role</code> or
     * <code>ClusterRole</code> that you want to bind to.
     * </p>
     */
    private String roleRefName;
    /**
     * <p>
     * The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     * </p>
     */
    private String roleRefKind;

    /**
     * <p>
     * The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     * </p>
     * 
     * @param kind
     *        The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     * </p>
     * 
     * @return The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     * </p>
     * 
     * @param kind
     *        The kind of the role. For role binding, this value will be <code>RoleBinding</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleBindingDetails withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The name of the <code>RoleBinding</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>RoleBinding</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>RoleBinding</code>.
     * </p>
     * 
     * @return The name of the <code>RoleBinding</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>RoleBinding</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>RoleBinding</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleBindingDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the role binding.
     * </p>
     * 
     * @param uid
     *        The unique identifier of the role binding.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The unique identifier of the role binding.
     * </p>
     * 
     * @return The unique identifier of the role binding.
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The unique identifier of the role binding.
     * </p>
     * 
     * @param uid
     *        The unique identifier of the role binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleBindingDetails withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The name of the role being referenced. This must match the name of the <code>Role</code> or
     * <code>ClusterRole</code> that you want to bind to.
     * </p>
     * 
     * @param roleRefName
     *        The name of the role being referenced. This must match the name of the <code>Role</code> or
     *        <code>ClusterRole</code> that you want to bind to.
     */

    public void setRoleRefName(String roleRefName) {
        this.roleRefName = roleRefName;
    }

    /**
     * <p>
     * The name of the role being referenced. This must match the name of the <code>Role</code> or
     * <code>ClusterRole</code> that you want to bind to.
     * </p>
     * 
     * @return The name of the role being referenced. This must match the name of the <code>Role</code> or
     *         <code>ClusterRole</code> that you want to bind to.
     */

    public String getRoleRefName() {
        return this.roleRefName;
    }

    /**
     * <p>
     * The name of the role being referenced. This must match the name of the <code>Role</code> or
     * <code>ClusterRole</code> that you want to bind to.
     * </p>
     * 
     * @param roleRefName
     *        The name of the role being referenced. This must match the name of the <code>Role</code> or
     *        <code>ClusterRole</code> that you want to bind to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleBindingDetails withRoleRefName(String roleRefName) {
        setRoleRefName(roleRefName);
        return this;
    }

    /**
     * <p>
     * The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     * </p>
     * 
     * @param roleRefKind
     *        The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     */

    public void setRoleRefKind(String roleRefKind) {
        this.roleRefKind = roleRefKind;
    }

    /**
     * <p>
     * The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     * </p>
     * 
     * @return The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>
     *         .
     */

    public String getRoleRefKind() {
        return this.roleRefKind;
    }

    /**
     * <p>
     * The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     * </p>
     * 
     * @param roleRefKind
     *        The type of the role being referenced. This could be either <code>Role</code> or <code>ClusterRole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleBindingDetails withRoleRefKind(String roleRefKind) {
        setRoleRefKind(roleRefKind);
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
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getRoleRefName() != null)
            sb.append("RoleRefName: ").append(getRoleRefName()).append(",");
        if (getRoleRefKind() != null)
            sb.append("RoleRefKind: ").append(getRoleRefKind());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesRoleBindingDetails == false)
            return false;
        KubernetesRoleBindingDetails other = (KubernetesRoleBindingDetails) obj;
        if (other.getKind() == null ^ this.getKind() == null)
            return false;
        if (other.getKind() != null && other.getKind().equals(this.getKind()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getRoleRefName() == null ^ this.getRoleRefName() == null)
            return false;
        if (other.getRoleRefName() != null && other.getRoleRefName().equals(this.getRoleRefName()) == false)
            return false;
        if (other.getRoleRefKind() == null ^ this.getRoleRefKind() == null)
            return false;
        if (other.getRoleRefKind() != null && other.getRoleRefKind().equals(this.getRoleRefKind()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getRoleRefName() == null) ? 0 : getRoleRefName().hashCode());
        hashCode = prime * hashCode + ((getRoleRefKind() == null) ? 0 : getRoleRefKind().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesRoleBindingDetails clone() {
        try {
            return (KubernetesRoleBindingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesRoleBindingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
