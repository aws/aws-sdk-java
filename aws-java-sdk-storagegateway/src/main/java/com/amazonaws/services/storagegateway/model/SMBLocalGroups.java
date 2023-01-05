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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of Active Directory users and groups that have special permissions for SMB file shares on the gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SMBLocalGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMBLocalGroups implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     * include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and <code>group1</code>.
     * </p>
     * <p>
     * Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open
     * and locked.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> gatewayAdmins;

    /**
     * <p>
     * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     * include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and <code>group1</code>.
     * </p>
     * <p>
     * Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open
     * and locked.
     * </p>
     * 
     * @return A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     *         include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and
     *         <code>group1</code>.</p>
     *         <p>
     *         Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that
     *         are open and locked.
     */

    public java.util.List<String> getGatewayAdmins() {
        if (gatewayAdmins == null) {
            gatewayAdmins = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return gatewayAdmins;
    }

    /**
     * <p>
     * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     * include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and <code>group1</code>.
     * </p>
     * <p>
     * Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open
     * and locked.
     * </p>
     * 
     * @param gatewayAdmins
     *        A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     *        include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and
     *        <code>group1</code>.</p>
     *        <p>
     *        Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that
     *        are open and locked.
     */

    public void setGatewayAdmins(java.util.Collection<String> gatewayAdmins) {
        if (gatewayAdmins == null) {
            this.gatewayAdmins = null;
            return;
        }

        this.gatewayAdmins = new com.amazonaws.internal.SdkInternalList<String>(gatewayAdmins);
    }

    /**
     * <p>
     * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     * include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and <code>group1</code>.
     * </p>
     * <p>
     * Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open
     * and locked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayAdmins(java.util.Collection)} or {@link #withGatewayAdmins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gatewayAdmins
     *        A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     *        include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and
     *        <code>group1</code>.</p>
     *        <p>
     *        Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that
     *        are open and locked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBLocalGroups withGatewayAdmins(String... gatewayAdmins) {
        if (this.gatewayAdmins == null) {
            setGatewayAdmins(new com.amazonaws.internal.SdkInternalList<String>(gatewayAdmins.length));
        }
        for (String ele : gatewayAdmins) {
            this.gatewayAdmins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     * include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and <code>group1</code>.
     * </p>
     * <p>
     * Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open
     * and locked.
     * </p>
     * 
     * @param gatewayAdmins
     *        A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats
     *        include: <code>DOMAIN\User1</code>, <code>user1</code>, <code>DOMAIN\group1</code>, and
     *        <code>group1</code>.</p>
     *        <p>
     *        Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that
     *        are open and locked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMBLocalGroups withGatewayAdmins(java.util.Collection<String> gatewayAdmins) {
        setGatewayAdmins(gatewayAdmins);
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
        if (getGatewayAdmins() != null)
            sb.append("GatewayAdmins: ").append(getGatewayAdmins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMBLocalGroups == false)
            return false;
        SMBLocalGroups other = (SMBLocalGroups) obj;
        if (other.getGatewayAdmins() == null ^ this.getGatewayAdmins() == null)
            return false;
        if (other.getGatewayAdmins() != null && other.getGatewayAdmins().equals(this.getGatewayAdmins()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayAdmins() == null) ? 0 : getGatewayAdmins().hashCode());
        return hashCode;
    }

    @Override
    public SMBLocalGroups clone() {
        try {
            return (SMBLocalGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.SMBLocalGroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
