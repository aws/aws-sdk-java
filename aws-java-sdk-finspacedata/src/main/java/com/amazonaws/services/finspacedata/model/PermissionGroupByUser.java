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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of a permission group associated with a user account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/PermissionGroupByUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionGroupByUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     */
    private String permissionGroupId;
    /**
     * <p>
     * The name of the permission group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     */
    private String membershipStatus;

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     */

    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @return The unique identifier for the permission group.
     */

    public String getPermissionGroupId() {
        return this.permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroupByUser withPermissionGroupId(String permissionGroupId) {
        setPermissionGroupId(permissionGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @param name
     *        The name of the permission group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @return The name of the permission group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @param name
     *        The name of the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroupByUser withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @see PermissionGroupMembershipStatus
     */

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of the user account within a permission group.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *         </p>
     *         </li>
     * @see PermissionGroupMembershipStatus
     */

    public String getMembershipStatus() {
        return this.membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public PermissionGroupByUser withMembershipStatus(String membershipStatus) {
        setMembershipStatus(membershipStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public PermissionGroupByUser withMembershipStatus(PermissionGroupMembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus.toString();
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
        if (getPermissionGroupId() != null)
            sb.append("PermissionGroupId: ").append(getPermissionGroupId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getMembershipStatus() != null)
            sb.append("MembershipStatus: ").append(getMembershipStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionGroupByUser == false)
            return false;
        PermissionGroupByUser other = (PermissionGroupByUser) obj;
        if (other.getPermissionGroupId() == null ^ this.getPermissionGroupId() == null)
            return false;
        if (other.getPermissionGroupId() != null && other.getPermissionGroupId().equals(this.getPermissionGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMembershipStatus() == null ^ this.getMembershipStatus() == null)
            return false;
        if (other.getMembershipStatus() != null && other.getMembershipStatus().equals(this.getMembershipStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMembershipStatus() == null) ? 0 : getMembershipStatus().hashCode());
        return hashCode;
    }

    @Override
    public PermissionGroupByUser clone() {
        try {
            return (PermissionGroupByUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.PermissionGroupByUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
