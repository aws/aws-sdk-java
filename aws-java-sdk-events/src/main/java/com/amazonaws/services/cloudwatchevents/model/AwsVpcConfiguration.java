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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure specifies the VPC subnets and security groups for the task, and whether a public IP address is to be
 * used. This structure is relevant only for ECS tasks that use the <code>awsvpc</code> network mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/AwsVpcConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsVpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * Specifies whether the task's elastic network interface receives a public IP address. You can specify
     * <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     * <code>FARGATE</code>.
     * </p>
     */
    private String assignPublicIp;

    /**
     * <p>
     * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @return Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can
     *         specify as many as 16 subnets.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify
     *        as many as 16 subnets.
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
     * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify
     *        as many as 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSubnets(String... subnets) {
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
     * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as
     * many as 16 subnets.
     * </p>
     * 
     * @param subnets
     *        Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify
     *        as many as 16 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @return Specifies the security groups associated with the task. These security groups must all be in the same
     *         VPC. You can specify as many as five security groups. If you do not specify a security group, the default
     *         security group for the VPC is used.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @param securityGroups
     *        Specifies the security groups associated with the task. These security groups must all be in the same VPC.
     *        You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
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
     * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Specifies the security groups associated with the task. These security groups must all be in the same VPC.
     *        You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSecurityGroups(String... securityGroups) {
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
     * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You
     * can specify as many as five security groups. If you do not specify a security group, the default security group
     * for the VPC is used.
     * </p>
     * 
     * @param securityGroups
     *        Specifies the security groups associated with the task. These security groups must all be in the same VPC.
     *        You can specify as many as five security groups. If you do not specify a security group, the default
     *        security group for the VPC is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsVpcConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies whether the task's elastic network interface receives a public IP address. You can specify
     * <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     * <code>FARGATE</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Specifies whether the task's elastic network interface receives a public IP address. You can specify
     *        <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     *        <code>FARGATE</code>.
     * @see AssignPublicIp
     */

    public void setAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * Specifies whether the task's elastic network interface receives a public IP address. You can specify
     * <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     * <code>FARGATE</code>.
     * </p>
     * 
     * @return Specifies whether the task's elastic network interface receives a public IP address. You can specify
     *         <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     *         <code>FARGATE</code>.
     * @see AssignPublicIp
     */

    public String getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * Specifies whether the task's elastic network interface receives a public IP address. You can specify
     * <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     * <code>FARGATE</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Specifies whether the task's elastic network interface receives a public IP address. You can specify
     *        <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     *        <code>FARGATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignPublicIp
     */

    public AwsVpcConfiguration withAssignPublicIp(String assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * Specifies whether the task's elastic network interface receives a public IP address. You can specify
     * <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     * <code>FARGATE</code>.
     * </p>
     * 
     * @param assignPublicIp
     *        Specifies whether the task's elastic network interface receives a public IP address. You can specify
     *        <code>ENABLED</code> only when <code>LaunchType</code> in <code>EcsParameters</code> is set to
     *        <code>FARGATE</code>.
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
        com.amazonaws.services.cloudwatchevents.model.transform.AwsVpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
