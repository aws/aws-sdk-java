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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * VPC configuration associated with your simulation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/VPCConfigResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of subnet IDs associated with the simulation job.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * A list of security group IDs associated with the simulation job.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The VPC ID associated with your simulation job.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A boolean indicating if a public IP was assigned.
     * </p>
     */
    private Boolean assignPublicIp;

    /**
     * <p>
     * A list of subnet IDs associated with the simulation job.
     * </p>
     * 
     * @return A list of subnet IDs associated with the simulation job.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of subnet IDs associated with the simulation job.
     * </p>
     * 
     * @param subnets
     *        A list of subnet IDs associated with the simulation job.
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
     * A list of subnet IDs associated with the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of subnet IDs associated with the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withSubnets(String... subnets) {
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
     * A list of subnet IDs associated with the simulation job.
     * </p>
     * 
     * @param subnets
     *        A list of subnet IDs associated with the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * A list of security group IDs associated with the simulation job.
     * </p>
     * 
     * @return A list of security group IDs associated with the simulation job.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of security group IDs associated with the simulation job.
     * </p>
     * 
     * @param securityGroups
     *        A list of security group IDs associated with the simulation job.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * A list of security group IDs associated with the simulation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of security group IDs associated with the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group IDs associated with the simulation job.
     * </p>
     * 
     * @param securityGroups
     *        A list of security group IDs associated with the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The VPC ID associated with your simulation job.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with your simulation job.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with your simulation job.
     * </p>
     * 
     * @return The VPC ID associated with your simulation job.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with your simulation job.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with your simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A boolean indicating if a public IP was assigned.
     * </p>
     * 
     * @param assignPublicIp
     *        A boolean indicating if a public IP was assigned.
     */

    public void setAssignPublicIp(Boolean assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * A boolean indicating if a public IP was assigned.
     * </p>
     * 
     * @return A boolean indicating if a public IP was assigned.
     */

    public Boolean getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * A boolean indicating if a public IP was assigned.
     * </p>
     * 
     * @param assignPublicIp
     *        A boolean indicating if a public IP was assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfigResponse withAssignPublicIp(Boolean assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * A boolean indicating if a public IP was assigned.
     * </p>
     * 
     * @return A boolean indicating if a public IP was assigned.
     */

    public Boolean isAssignPublicIp() {
        return this.assignPublicIp;
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
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAssignPublicIp() != null)
            sb.append("AssignPublicIp: ").append(getAssignPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPCConfigResponse == false)
            return false;
        VPCConfigResponse other = (VPCConfigResponse) obj;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAssignPublicIp() == null ^ this.getAssignPublicIp() == null)
            return false;
        if (other.getAssignPublicIp() != null && other.getAssignPublicIp().equals(this.getAssignPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAssignPublicIp() == null) ? 0 : getAssignPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public VPCConfigResponse clone() {
        try {
            return (VPCConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.VPCConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
