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
 * Information about the Kubernetes role name and role type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesRoleDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesRoleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     * </p>
     */
    private String kind;
    /**
     * <p>
     * The name of the Kubernetes role.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the Kubernetes role name.
     * </p>
     */
    private String uid;

    /**
     * <p>
     * The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     * </p>
     * 
     * @param kind
     *        The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     * </p>
     * 
     * @return The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     * </p>
     * 
     * @param kind
     *        The kind of role. For this API, the value of <code>kind</code> will be <code>Role</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleDetails withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes role.
     * </p>
     * 
     * @param name
     *        The name of the Kubernetes role.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Kubernetes role.
     * </p>
     * 
     * @return The name of the Kubernetes role.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Kubernetes role.
     * </p>
     * 
     * @param name
     *        The name of the Kubernetes role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Kubernetes role name.
     * </p>
     * 
     * @param uid
     *        The unique identifier of the Kubernetes role name.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The unique identifier of the Kubernetes role name.
     * </p>
     * 
     * @return The unique identifier of the Kubernetes role name.
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The unique identifier of the Kubernetes role name.
     * </p>
     * 
     * @param uid
     *        The unique identifier of the Kubernetes role name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesRoleDetails withUid(String uid) {
        setUid(uid);
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
            sb.append("Uid: ").append(getUid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesRoleDetails == false)
            return false;
        KubernetesRoleDetails other = (KubernetesRoleDetails) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesRoleDetails clone() {
        try {
            return (KubernetesRoleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesRoleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
