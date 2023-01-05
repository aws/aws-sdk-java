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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     * </p>
     */
    private String assignPublicIp;
    /**
     * <p>
     * The IDs of the security groups associated with the task or service.
     * </p>
     * <p>
     * You can provide up to five security groups.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The IDs of the subnets associated with the task or service.
     * </p>
     * <p>
     * You can provide up to 16 subnets.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     * </p>
     * 
     * @param assignPublicIp
     *        Whether the task's elastic network interface receives a public IP address. The default value is
     *        <code>DISABLED</code>.</p>
     *        <p>
     *        Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     */

    public void setAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     * </p>
     * 
     * @return Whether the task's elastic network interface receives a public IP address. The default value is
     *         <code>DISABLED</code>.</p>
     *         <p>
     *         Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     */

    public String getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * <p>
     * Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     * </p>
     * 
     * @param assignPublicIp
     *        Whether the task's elastic network interface receives a public IP address. The default value is
     *        <code>DISABLED</code>.</p>
     *        <p>
     *        Valid values: <code>ENABLED</code> | <code>DISABLED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails withAssignPublicIp(String assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups associated with the task or service.
     * </p>
     * <p>
     * You can provide up to five security groups.
     * </p>
     * 
     * @return The IDs of the security groups associated with the task or service.</p>
     *         <p>
     *         You can provide up to five security groups.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups associated with the task or service.
     * </p>
     * <p>
     * You can provide up to five security groups.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups associated with the task or service.</p>
     *        <p>
     *        You can provide up to five security groups.
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
     * The IDs of the security groups associated with the task or service.
     * </p>
     * <p>
     * You can provide up to five security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups associated with the task or service.</p>
     *        <p>
     *        You can provide up to five security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails withSecurityGroups(String... securityGroups) {
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
     * The IDs of the security groups associated with the task or service.
     * </p>
     * <p>
     * You can provide up to five security groups.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups associated with the task or service.</p>
     *        <p>
     *        You can provide up to five security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets associated with the task or service.
     * </p>
     * <p>
     * You can provide up to 16 subnets.
     * </p>
     * 
     * @return The IDs of the subnets associated with the task or service.</p>
     *         <p>
     *         You can provide up to 16 subnets.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets associated with the task or service.
     * </p>
     * <p>
     * You can provide up to 16 subnets.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets associated with the task or service.</p>
     *        <p>
     *        You can provide up to 16 subnets.
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
     * The IDs of the subnets associated with the task or service.
     * </p>
     * <p>
     * You can provide up to 16 subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets associated with the task or service.</p>
     *        <p>
     *        You can provide up to 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails withSubnets(String... subnets) {
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
     * The IDs of the subnets associated with the task or service.
     * </p>
     * <p>
     * You can provide up to 16 subnets.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets associated with the task or service.</p>
     *        <p>
     *        You can provide up to 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails withSubnets(java.util.Collection<String> subnets) {
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
        if (getAssignPublicIp() != null)
            sb.append("AssignPublicIp: ").append(getAssignPublicIp()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
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

        if (obj instanceof AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails == false)
            return false;
        AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails other = (AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails) obj;
        if (other.getAssignPublicIp() == null ^ this.getAssignPublicIp() == null)
            return false;
        if (other.getAssignPublicIp() != null && other.getAssignPublicIp().equals(this.getAssignPublicIp()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
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

        hashCode = prime * hashCode + ((getAssignPublicIp() == null) ? 0 : getAssignPublicIp().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails clone() {
        try {
            return (AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
