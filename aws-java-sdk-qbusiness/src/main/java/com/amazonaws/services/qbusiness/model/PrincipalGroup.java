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
 * Provides information about a group associated with the principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PrincipalGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrincipalGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Provides information about whether to allow or deny access to the principal.
     * </p>
     */
    private String access;
    /**
     * <p>
     * The type of group.
     * </p>
     */
    private String membershipType;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Provides information about whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Provides information about whether to allow or deny access to the principal.
     * @see ReadAccessType
     */

    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * <p>
     * Provides information about whether to allow or deny access to the principal.
     * </p>
     * 
     * @return Provides information about whether to allow or deny access to the principal.
     * @see ReadAccessType
     */

    public String getAccess() {
        return this.access;
    }

    /**
     * <p>
     * Provides information about whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Provides information about whether to allow or deny access to the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadAccessType
     */

    public PrincipalGroup withAccess(String access) {
        setAccess(access);
        return this;
    }

    /**
     * <p>
     * Provides information about whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Provides information about whether to allow or deny access to the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadAccessType
     */

    public PrincipalGroup withAccess(ReadAccessType access) {
        this.access = access.toString();
        return this;
    }

    /**
     * <p>
     * The type of group.
     * </p>
     * 
     * @param membershipType
     *        The type of group.
     * @see MembershipType
     */

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * <p>
     * The type of group.
     * </p>
     * 
     * @return The type of group.
     * @see MembershipType
     */

    public String getMembershipType() {
        return this.membershipType;
    }

    /**
     * <p>
     * The type of group.
     * </p>
     * 
     * @param membershipType
     *        The type of group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public PrincipalGroup withMembershipType(String membershipType) {
        setMembershipType(membershipType);
        return this;
    }

    /**
     * <p>
     * The type of group.
     * </p>
     * 
     * @param membershipType
     *        The type of group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public PrincipalGroup withMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAccess() != null)
            sb.append("Access: ").append(getAccess()).append(",");
        if (getMembershipType() != null)
            sb.append("MembershipType: ").append(getMembershipType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrincipalGroup == false)
            return false;
        PrincipalGroup other = (PrincipalGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        if (other.getMembershipType() == null ^ this.getMembershipType() == null)
            return false;
        if (other.getMembershipType() != null && other.getMembershipType().equals(this.getMembershipType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        hashCode = prime * hashCode + ((getMembershipType() == null) ? 0 : getMembershipType().hashCode());
        return hashCode;
    }

    @Override
    public PrincipalGroup clone() {
        try {
            return (PrincipalGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.PrincipalGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
