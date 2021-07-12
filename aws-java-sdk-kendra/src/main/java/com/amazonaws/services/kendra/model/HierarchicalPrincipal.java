/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information to define the hierarchy for which documents users should have access to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/HierarchicalPrincipal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchicalPrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user
     * or group has allow or deny access for each document.
     * </p>
     */
    private java.util.List<Principal> principalList;

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user
     * or group has allow or deny access for each document.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *         that define the hierarchy for which documents users should have access to. Each hierarchical list
     *         specifies which user or group has allow or deny access for each document.
     */

    public java.util.List<Principal> getPrincipalList() {
        return principalList;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user
     * or group has allow or deny access for each document.
     * </p>
     * 
     * @param principalList
     *        A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to. Each hierarchical list
     *        specifies which user or group has allow or deny access for each document.
     */

    public void setPrincipalList(java.util.Collection<Principal> principalList) {
        if (principalList == null) {
            this.principalList = null;
            return;
        }

        this.principalList = new java.util.ArrayList<Principal>(principalList);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user
     * or group has allow or deny access for each document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipalList(java.util.Collection)} or {@link #withPrincipalList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param principalList
     *        A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to. Each hierarchical list
     *        specifies which user or group has allow or deny access for each document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchicalPrincipal withPrincipalList(Principal... principalList) {
        if (this.principalList == null) {
            setPrincipalList(new java.util.ArrayList<Principal>(principalList.length));
        }
        for (Principal ele : principalList) {
            this.principalList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists that
     * define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user
     * or group has allow or deny access for each document.
     * </p>
     * 
     * @param principalList
     *        A list of <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Principal.html">principal</a> lists
     *        that define the hierarchy for which documents users should have access to. Each hierarchical list
     *        specifies which user or group has allow or deny access for each document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchicalPrincipal withPrincipalList(java.util.Collection<Principal> principalList) {
        setPrincipalList(principalList);
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
        if (getPrincipalList() != null)
            sb.append("PrincipalList: ").append(getPrincipalList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchicalPrincipal == false)
            return false;
        HierarchicalPrincipal other = (HierarchicalPrincipal) obj;
        if (other.getPrincipalList() == null ^ this.getPrincipalList() == null)
            return false;
        if (other.getPrincipalList() != null && other.getPrincipalList().equals(this.getPrincipalList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalList() == null) ? 0 : getPrincipalList().hashCode());
        return hashCode;
    }

    @Override
    public HierarchicalPrincipal clone() {
        try {
            return (HierarchicalPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.HierarchicalPrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
