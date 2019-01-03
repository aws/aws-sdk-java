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
 * If your simulation job accesses resources in a VPC, you provide this parameter identifying the list of security group
 * IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and two subnet
 * IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/VPCConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of one or more subnet IDs in your VPC.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * A list of one or more security groups IDs in your VPC.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * A boolean indicating whether to assign a public IP address.
     * </p>
     */
    private Boolean assignPublicIp;

    /**
     * <p>
     * A list of one or more subnet IDs in your VPC.
     * </p>
     * 
     * @return A list of one or more subnet IDs in your VPC.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of one or more subnet IDs in your VPC.
     * </p>
     * 
     * @param subnets
     *        A list of one or more subnet IDs in your VPC.
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
     * A list of one or more subnet IDs in your VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of one or more subnet IDs in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfig withSubnets(String... subnets) {
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
     * A list of one or more subnet IDs in your VPC.
     * </p>
     * 
     * @param subnets
     *        A list of one or more subnet IDs in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfig withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * A list of one or more security groups IDs in your VPC.
     * </p>
     * 
     * @return A list of one or more security groups IDs in your VPC.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of one or more security groups IDs in your VPC.
     * </p>
     * 
     * @param securityGroups
     *        A list of one or more security groups IDs in your VPC.
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
     * A list of one or more security groups IDs in your VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of one or more security groups IDs in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfig withSecurityGroups(String... securityGroups) {
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
     * A list of one or more security groups IDs in your VPC.
     * </p>
     * 
     * @param securityGroups
     *        A list of one or more security groups IDs in your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfig withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to assign a public IP address.
     * </p>
     * 
     * @param assignPublicIp
     *        A boolean indicating whether to assign a public IP address.
     */

    public void setAssignPublicIp(Boolean assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * A boolean indicating whether to assign a public IP address.
     * </p>
     * 
     * @return A boolean indicating whether to assign a public IP address.
     */

    public Boolean getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * A boolean indicating whether to assign a public IP address.
     * </p>
     * 
     * @param assignPublicIp
     *        A boolean indicating whether to assign a public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCConfig withAssignPublicIp(Boolean assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether to assign a public IP address.
     * </p>
     * 
     * @return A boolean indicating whether to assign a public IP address.
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

        if (obj instanceof VPCConfig == false)
            return false;
        VPCConfig other = (VPCConfig) obj;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
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
        hashCode = prime * hashCode + ((getAssignPublicIp() == null) ? 0 : getAssignPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public VPCConfig clone() {
        try {
            return (VPCConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.VPCConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
