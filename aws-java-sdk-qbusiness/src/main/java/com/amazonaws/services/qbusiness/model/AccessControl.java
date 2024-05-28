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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of principals. Each principal can be either a <code>USER</code> or a <code>GROUP</code> and can be designated
 * document access permissions of either <code>ALLOW</code> or <code>DENY</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AccessControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>. Each
     * principal can be have the following type of document access: <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     */
    private java.util.List<Principal> principals;
    /**
     * <p>
     * Describes the member relation within a principal list.
     * </p>
     */
    private String memberRelation;

    /**
     * <p>
     * Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>. Each
     * principal can be have the following type of document access: <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @return Contains a list of principals, where a principal can be either a <code>USER</code> or a
     *         <code>GROUP</code>. Each principal can be have the following type of document access: <code>ALLOW</code>
     *         or <code>DENY</code>.
     */

    public java.util.List<Principal> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>. Each
     * principal can be have the following type of document access: <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param principals
     *        Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>
     *        . Each principal can be have the following type of document access: <code>ALLOW</code> or
     *        <code>DENY</code>.
     */

    public void setPrincipals(java.util.Collection<Principal> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<Principal>(principals);
    }

    /**
     * <p>
     * Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>. Each
     * principal can be have the following type of document access: <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>
     *        . Each principal can be have the following type of document access: <code>ALLOW</code> or
     *        <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControl withPrincipals(Principal... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<Principal>(principals.length));
        }
        for (Principal ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>. Each
     * principal can be have the following type of document access: <code>ALLOW</code> or <code>DENY</code>.
     * </p>
     * 
     * @param principals
     *        Contains a list of principals, where a principal can be either a <code>USER</code> or a <code>GROUP</code>
     *        . Each principal can be have the following type of document access: <code>ALLOW</code> or
     *        <code>DENY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControl withPrincipals(java.util.Collection<Principal> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Describes the member relation within a principal list.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within a principal list.
     * @see MemberRelation
     */

    public void setMemberRelation(String memberRelation) {
        this.memberRelation = memberRelation;
    }

    /**
     * <p>
     * Describes the member relation within a principal list.
     * </p>
     * 
     * @return Describes the member relation within a principal list.
     * @see MemberRelation
     */

    public String getMemberRelation() {
        return this.memberRelation;
    }

    /**
     * <p>
     * Describes the member relation within a principal list.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within a principal list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberRelation
     */

    public AccessControl withMemberRelation(String memberRelation) {
        setMemberRelation(memberRelation);
        return this;
    }

    /**
     * <p>
     * Describes the member relation within a principal list.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within a principal list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberRelation
     */

    public AccessControl withMemberRelation(MemberRelation memberRelation) {
        this.memberRelation = memberRelation.toString();
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getMemberRelation() != null)
            sb.append("MemberRelation: ").append(getMemberRelation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControl == false)
            return false;
        AccessControl other = (AccessControl) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getMemberRelation() == null ^ this.getMemberRelation() == null)
            return false;
        if (other.getMemberRelation() != null && other.getMemberRelation().equals(this.getMemberRelation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getMemberRelation() == null) ? 0 : getMemberRelation().hashCode());
        return hashCode;
    }

    @Override
    public AccessControl clone() {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AccessControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
