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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scope of an <code>AccessPolicy</code> that's associated to an <code>AccessEntry</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AccessScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scope type of an access policy.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you specified
     * <code>namespace</code> for <code>Type</code>.
     * </p>
     */
    private java.util.List<String> namespaces;

    /**
     * <p>
     * The scope type of an access policy.
     * </p>
     * 
     * @param type
     *        The scope type of an access policy.
     * @see AccessScopeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The scope type of an access policy.
     * </p>
     * 
     * @return The scope type of an access policy.
     * @see AccessScopeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The scope type of an access policy.
     * </p>
     * 
     * @param type
     *        The scope type of an access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessScopeType
     */

    public AccessScope withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The scope type of an access policy.
     * </p>
     * 
     * @param type
     *        The scope type of an access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessScopeType
     */

    public AccessScope withType(AccessScopeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you specified
     * <code>namespace</code> for <code>Type</code>.
     * </p>
     * 
     * @return A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you
     *         specified <code>namespace</code> for <code>Type</code>.
     */

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you specified
     * <code>namespace</code> for <code>Type</code>.
     * </p>
     * 
     * @param namespaces
     *        A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you
     *        specified <code>namespace</code> for <code>Type</code>.
     */

    public void setNamespaces(java.util.Collection<String> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<String>(namespaces);
    }

    /**
     * <p>
     * A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you specified
     * <code>namespace</code> for <code>Type</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamespaces(java.util.Collection)} or {@link #withNamespaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namespaces
     *        A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you
     *        specified <code>namespace</code> for <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScope withNamespaces(String... namespaces) {
        if (this.namespaces == null) {
            setNamespaces(new java.util.ArrayList<String>(namespaces.length));
        }
        for (String ele : namespaces) {
            this.namespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you specified
     * <code>namespace</code> for <code>Type</code>.
     * </p>
     * 
     * @param namespaces
     *        A Kubernetes <code>namespace</code> that an access policy is scoped to. A value is required if you
     *        specified <code>namespace</code> for <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScope withNamespaces(java.util.Collection<String> namespaces) {
        setNamespaces(namespaces);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNamespaces() != null)
            sb.append("Namespaces: ").append(getNamespaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessScope == false)
            return false;
        AccessScope other = (AccessScope) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null && other.getNamespaces().equals(this.getNamespaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        return hashCode;
    }

    @Override
    public AccessScope clone() {
        try {
            return (AccessScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AccessScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
