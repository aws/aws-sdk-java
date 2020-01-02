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
 * Attributes of Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberFabricAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberFabricAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name for the initial administrator user for the member.
     * </p>
     */
    private String adminUsername;
    /**
     * <p>
     * The endpoint used to access the member's certificate authority.
     * </p>
     */
    private String caEndpoint;

    /**
     * <p>
     * The user name for the initial administrator user for the member.
     * </p>
     * 
     * @param adminUsername
     *        The user name for the initial administrator user for the member.
     */

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * <p>
     * The user name for the initial administrator user for the member.
     * </p>
     * 
     * @return The user name for the initial administrator user for the member.
     */

    public String getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * <p>
     * The user name for the initial administrator user for the member.
     * </p>
     * 
     * @param adminUsername
     *        The user name for the initial administrator user for the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFabricAttributes withAdminUsername(String adminUsername) {
        setAdminUsername(adminUsername);
        return this;
    }

    /**
     * <p>
     * The endpoint used to access the member's certificate authority.
     * </p>
     * 
     * @param caEndpoint
     *        The endpoint used to access the member's certificate authority.
     */

    public void setCaEndpoint(String caEndpoint) {
        this.caEndpoint = caEndpoint;
    }

    /**
     * <p>
     * The endpoint used to access the member's certificate authority.
     * </p>
     * 
     * @return The endpoint used to access the member's certificate authority.
     */

    public String getCaEndpoint() {
        return this.caEndpoint;
    }

    /**
     * <p>
     * The endpoint used to access the member's certificate authority.
     * </p>
     * 
     * @param caEndpoint
     *        The endpoint used to access the member's certificate authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFabricAttributes withCaEndpoint(String caEndpoint) {
        setCaEndpoint(caEndpoint);
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
        if (getCaEndpoint() != null)
            sb.append("CaEndpoint: ").append(getCaEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberFabricAttributes == false)
            return false;
        MemberFabricAttributes other = (MemberFabricAttributes) obj;
        if (other.getAdminUsername() == null ^ this.getAdminUsername() == null)
            return false;
        if (other.getAdminUsername() != null && other.getAdminUsername().equals(this.getAdminUsername()) == false)
            return false;
        if (other.getCaEndpoint() == null ^ this.getCaEndpoint() == null)
            return false;
        if (other.getCaEndpoint() != null && other.getCaEndpoint().equals(this.getCaEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        hashCode = prime * hashCode + ((getCaEndpoint() == null) ? 0 : getCaEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public MemberFabricAttributes clone() {
        try {
            return (MemberFabricAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberFabricAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
