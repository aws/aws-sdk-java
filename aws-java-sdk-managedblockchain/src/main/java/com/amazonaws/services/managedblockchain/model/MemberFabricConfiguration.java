/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger
 * Fabric framework.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberFabricConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberFabricConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name for the member's initial administrative user.
     * </p>
     */
    private String adminUsername;
    /**
     * <p>
     * The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least eight
     * characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase
     * letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @,
     * or a space.
     * </p>
     */
    private String adminPassword;

    /**
     * <p>
     * The user name for the member's initial administrative user.
     * </p>
     * 
     * @param adminUsername
     *        The user name for the member's initial administrative user.
     */

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * <p>
     * The user name for the member's initial administrative user.
     * </p>
     * 
     * @return The user name for the member's initial administrative user.
     */

    public String getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * <p>
     * The user name for the member's initial administrative user.
     * </p>
     * 
     * @param adminUsername
     *        The user name for the member's initial administrative user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFabricConfiguration withAdminUsername(String adminUsername) {
        setAdminUsername(adminUsername);
        return this;
    }

    /**
     * <p>
     * The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least eight
     * characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase
     * letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @,
     * or a space.
     * </p>
     * 
     * @param adminPassword
     *        The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least
     *        eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one
     *        lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/),
     *        backward slash(\), @, or a space.
     */

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * <p>
     * The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least eight
     * characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase
     * letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @,
     * or a space.
     * </p>
     * 
     * @return The password for the member's initial administrative user. The <code>AdminPassword</code> must be at
     *         least eight characters long and no more than 32 characters. It must contain at least one uppercase
     *         letter, one lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward
     *         slash(/), backward slash(\), @, or a space.
     */

    public String getAdminPassword() {
        return this.adminPassword;
    }

    /**
     * <p>
     * The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least eight
     * characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase
     * letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @,
     * or a space.
     * </p>
     * 
     * @param adminPassword
     *        The password for the member's initial administrative user. The <code>AdminPassword</code> must be at least
     *        eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one
     *        lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/),
     *        backward slash(\), @, or a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFabricConfiguration withAdminPassword(String adminPassword) {
        setAdminPassword(adminPassword);
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
        if (getAdminUsername() != null)
            sb.append("AdminUsername: ").append(getAdminUsername()).append(",");
        if (getAdminPassword() != null)
            sb.append("AdminPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberFabricConfiguration == false)
            return false;
        MemberFabricConfiguration other = (MemberFabricConfiguration) obj;
        if (other.getAdminUsername() == null ^ this.getAdminUsername() == null)
            return false;
        if (other.getAdminUsername() != null && other.getAdminUsername().equals(this.getAdminUsername()) == false)
            return false;
        if (other.getAdminPassword() == null ^ this.getAdminPassword() == null)
            return false;
        if (other.getAdminPassword() != null && other.getAdminPassword().equals(this.getAdminPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        hashCode = prime * hashCode + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        return hashCode;
    }

    @Override
    public MemberFabricConfiguration clone() {
        try {
            return (MemberFabricConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberFabricConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
