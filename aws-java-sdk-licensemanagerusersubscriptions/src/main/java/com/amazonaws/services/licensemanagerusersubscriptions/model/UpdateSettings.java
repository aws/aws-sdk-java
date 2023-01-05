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
 * Updates the registered identity provider’s product related configuration settings such as the subnets to provision
 * VPC endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/UpdateSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require
     * connectivity to activation servers.
     * </p>
     */
    private java.util.List<String> addSubnets;
    /**
     * <p>
     * The ID of one or more subnets to remove.
     * </p>
     */
    private java.util.List<String> removeSubnets;
    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoints for activation servers.
     * </p>
     */
    private String securityGroupId;

    /**
     * <p>
     * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require
     * connectivity to activation servers.
     * </p>
     * 
     * @return The ID of one or more subnets in which License Manager will create a VPC endpoint for products that
     *         require connectivity to activation servers.
     */

    public java.util.List<String> getAddSubnets() {
        return addSubnets;
    }

    /**
     * <p>
     * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require
     * connectivity to activation servers.
     * </p>
     * 
     * @param addSubnets
     *        The ID of one or more subnets in which License Manager will create a VPC endpoint for products that
     *        require connectivity to activation servers.
     */

    public void setAddSubnets(java.util.Collection<String> addSubnets) {
        if (addSubnets == null) {
            this.addSubnets = null;
            return;
        }

        this.addSubnets = new java.util.ArrayList<String>(addSubnets);
    }

    /**
     * <p>
     * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require
     * connectivity to activation servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSubnets(java.util.Collection)} or {@link #withAddSubnets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addSubnets
     *        The ID of one or more subnets in which License Manager will create a VPC endpoint for products that
     *        require connectivity to activation servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettings withAddSubnets(String... addSubnets) {
        if (this.addSubnets == null) {
            setAddSubnets(new java.util.ArrayList<String>(addSubnets.length));
        }
        for (String ele : addSubnets) {
            this.addSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require
     * connectivity to activation servers.
     * </p>
     * 
     * @param addSubnets
     *        The ID of one or more subnets in which License Manager will create a VPC endpoint for products that
     *        require connectivity to activation servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettings withAddSubnets(java.util.Collection<String> addSubnets) {
        setAddSubnets(addSubnets);
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets to remove.
     * </p>
     * 
     * @return The ID of one or more subnets to remove.
     */

    public java.util.List<String> getRemoveSubnets() {
        return removeSubnets;
    }

    /**
     * <p>
     * The ID of one or more subnets to remove.
     * </p>
     * 
     * @param removeSubnets
     *        The ID of one or more subnets to remove.
     */

    public void setRemoveSubnets(java.util.Collection<String> removeSubnets) {
        if (removeSubnets == null) {
            this.removeSubnets = null;
            return;
        }

        this.removeSubnets = new java.util.ArrayList<String>(removeSubnets);
    }

    /**
     * <p>
     * The ID of one or more subnets to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSubnets(java.util.Collection)} or {@link #withRemoveSubnets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removeSubnets
     *        The ID of one or more subnets to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettings withRemoveSubnets(String... removeSubnets) {
        if (this.removeSubnets == null) {
            setRemoveSubnets(new java.util.ArrayList<String>(removeSubnets.length));
        }
        for (String ele : removeSubnets) {
            this.removeSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets to remove.
     * </p>
     * 
     * @param removeSubnets
     *        The ID of one or more subnets to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettings withRemoveSubnets(java.util.Collection<String> removeSubnets) {
        setRemoveSubnets(removeSubnets);
        return this;
    }

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoints for activation servers.
     * </p>
     * 
     * @param securityGroupId
     *        A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *        VPC endpoints for activation servers.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoints for activation servers.
     * </p>
     * 
     * @return A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *         VPC endpoints for activation servers.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC
     * endpoints for activation servers.
     * </p>
     * 
     * @param securityGroupId
     *        A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the
     *        VPC endpoints for activation servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettings withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
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
        if (getAddSubnets() != null)
            sb.append("AddSubnets: ").append(getAddSubnets()).append(",");
        if (getRemoveSubnets() != null)
            sb.append("RemoveSubnets: ").append(getRemoveSubnets()).append(",");
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSettings == false)
            return false;
        UpdateSettings other = (UpdateSettings) obj;
        if (other.getAddSubnets() == null ^ this.getAddSubnets() == null)
            return false;
        if (other.getAddSubnets() != null && other.getAddSubnets().equals(this.getAddSubnets()) == false)
            return false;
        if (other.getRemoveSubnets() == null ^ this.getRemoveSubnets() == null)
            return false;
        if (other.getRemoveSubnets() != null && other.getRemoveSubnets().equals(this.getRemoveSubnets()) == false)
            return false;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddSubnets() == null) ? 0 : getAddSubnets().hashCode());
        hashCode = prime * hashCode + ((getRemoveSubnets() == null) ? 0 : getRemoveSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSettings clone() {
        try {
            return (UpdateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.UpdateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
