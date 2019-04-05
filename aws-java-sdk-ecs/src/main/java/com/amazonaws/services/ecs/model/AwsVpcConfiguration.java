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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the networking details for a task or service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/AwsVpcConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsVpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnets;
    /**
     * <p>
     * The security groups associated with the task or service. If you do not specify a security group, the default
     * security group for the VPC is used. There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     */
    private String assignPublicIp;

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * 
     * @return The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     *         <code>AwsVpcConfiguration</code>.</p> <note>
     *         <p>
     *         All specified subnets must be from the same VPC.
     *         </p>
     */

    public java.util.List<String> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnets;
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * 
     * @param subnets
     *        The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     *        <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified subnets must be from the same VPC.
     *        </p>
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<String>(subnets);
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     *        <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified subnets must be from the same VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified subnets must be from the same VPC.
     * </p>
     * </note>
     * 
     * @param subnets
     *        The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per
     *        <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified subnets must be from the same VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not specify a security group, the default
     * security group for the VPC is used. There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * 
     * @return The security groups associated with the task or service. If you do not specify a security group, the
     *         default security group for the VPC is used. There is a limit of 5 security groups that can be specified
     *         per <code>AwsVpcConfiguration</code>.</p> <note>
     *         <p>
     *         All specified security groups must be from the same VPC.
     *         </p>
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The security groups associated with the task or service. If you do not specify a security group, the default
     * security group for the VPC is used. There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * 
     * @param securityGroups
     *        The security groups associated with the task or service. If you do not specify a security group, the
     *        default security group for the VPC is used. There is a limit of 5 security groups that can be specified
     *        per <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified security groups must be from the same VPC.
     *        </p>
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
     * The security groups associated with the task or service. If you do not specify a security group, the default
     * security group for the VPC is used. There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups associated with the task or service. If you do not specify a security group, the
     *        default security group for the VPC is used. There is a limit of 5 security groups that can be specified
     *        per <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified security groups must be from the same VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSecurityGroups(String... securityGroups) {
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
     * The security groups associated with the task or service. If you do not specify a security group, the default
     * security group for the VPC is used. There is a limit of 5 security groups that can be specified per
     * <code>AwsVpcConfiguration</code>.
     * </p>
     * <note>
     * <p>
     * All specified security groups must be from the same VPC.
     * </p>
     * </note>
     * 
     * @param securityGroups
     *        The security groups associated with the task or service. If you do not specify a security group, the
     *        default security group for the VPC is used. There is a limit of 5 security groups that can be specified
     *        per <code>AwsVpcConfiguration</code>.</p> <note>
     *        <p>
     *        All specified security groups must be from the same VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Whether the task's elastic network interface receives a public IP address. The default value is
     *        <code>DISABLED</code>.
     * @see AssignPublicIp
     */

    public void setAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return Whether the task's elastic network interface receives a public IP address. The default value is
     *         <code>DISABLED</code>.
     * @see AssignPublicIp
     */

    public String getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Whether the task's elastic network interface receives a public IP address. The default value is
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignPublicIp
     */

    public AwsVpcConfiguration withAssignPublicIp(String assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * Whether the task's elastic network interface receives a public IP address. The default value is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Whether the task's elastic network interface receives a public IP address. The default value is
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignPublicIp
     */

    public AwsVpcConfiguration withAssignPublicIp(AssignPublicIp assignPublicIp) {
        this.assignPublicIp = assignPublicIp.toString();
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

        if (obj instanceof AwsVpcConfiguration == false)
            return false;
        AwsVpcConfiguration other = (AwsVpcConfiguration) obj;
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
    public AwsVpcConfiguration clone() {
        try {
            return (AwsVpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AwsVpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
