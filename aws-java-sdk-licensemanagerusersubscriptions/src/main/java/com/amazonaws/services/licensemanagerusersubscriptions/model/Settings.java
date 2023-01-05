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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The registered identity provider’s product related configuration settings such as the subnets to provision VPC
 * endpoints, and the security group ID that is associated with the VPC endpoints. The security group should permit
 * inbound TCP port 1688 communication from resources in the VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/Settings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoint for activation servers.
     * </p>
     */
    private String securityGroupId;
    /**
     * <p>
     * The subnets defined for the registered identity provider.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoint for activation servers.
     * </p>
     * 
     * @param securityGroupId
     *        A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *        VPC endpoint for activation servers.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoint for activation servers.
     * </p>
     * 
     * @return A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *         VPC endpoint for activation servers.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoint for activation servers.
     * </p>
     * 
     * @param securityGroupId
     *        A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *        VPC endpoint for activation servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
        return this;
    }

    /**
     * <p>
     * The subnets defined for the registered identity provider.
     * </p>
     * 
     * @return The subnets defined for the registered identity provider.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets defined for the registered identity provider.
     * </p>
     * 
     * @param subnets
     *        The subnets defined for the registered identity provider.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The subnets defined for the registered identity provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The subnets defined for the registered identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets defined for the registered identity provider.
     * </p>
     * 
     * @param subnets
     *        The subnets defined for the registered identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Settings == false)
            return false;
        Settings other = (Settings) obj;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public Settings clone() {
        try {
            return (Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
