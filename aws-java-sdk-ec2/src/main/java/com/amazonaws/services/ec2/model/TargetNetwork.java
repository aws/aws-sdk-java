/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a target network associated with a Client VPN endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TargetNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetNetwork implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     */
    private String targetNetworkId;
    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is associated.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The current state of the target network association.
     * </p>
     */
    private AssociationStatus status;
    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the target network (subnet) is located.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     * 
     * @return The ID of the VPC in which the target network (subnet) is located.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the target network (subnet) is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the target network (subnet) is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     * 
     * @param targetNetworkId
     *        The ID of the subnet specified as the target network.
     */

    public void setTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     * 
     * @return The ID of the subnet specified as the target network.
     */

    public String getTargetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * <p>
     * The ID of the subnet specified as the target network.
     * </p>
     * 
     * @param targetNetworkId
     *        The ID of the subnet specified as the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withTargetNetworkId(String targetNetworkId) {
        setTargetNetworkId(targetNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the target network is associated.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is associated.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint with which the target network is associated.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the target network is associated.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint with which the target network is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @param status
     *        The current state of the target network association.
     */

    public void setStatus(AssociationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @return The current state of the target network association.
     */

    public AssociationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @param status
     *        The current state of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withStatus(AssociationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * 
     * @return The IDs of the security groups applied to the target network association.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups applied to the target network association.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups applied to the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups applied to the target network association.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups applied to the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetNetwork withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getTargetNetworkId() != null)
            sb.append("TargetNetworkId: ").append(getTargetNetworkId()).append(",");
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetNetwork == false)
            return false;
        TargetNetwork other = (TargetNetwork) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTargetNetworkId() == null ^ this.getTargetNetworkId() == null)
            return false;
        if (other.getTargetNetworkId() != null && other.getTargetNetworkId().equals(this.getTargetNetworkId()) == false)
            return false;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getTargetNetworkId() == null) ? 0 : getTargetNetworkId().hashCode());
        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public TargetNetwork clone() {
        try {
            return (TargetNetwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
