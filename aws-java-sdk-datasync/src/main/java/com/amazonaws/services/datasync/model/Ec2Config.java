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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The subnet and the security group that the target Amazon EFS file system uses. The subnet must have at least one
 * mount target for that file system. The security group that you provide needs to be able to communicate with the
 * security group on the mount target in the subnet specified.
 * </p>
 * <p>
 * The exact relationship between security group M (of the mount target) and security group S (which you provide for
 * DataSync to use at this stage) is as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control
 * Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address
 * (CIDR range) or security group.
 * </p>
 * </li>
 * <li>
 * <p>
 * Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS
 * port on one of the file system’s mount targets. You can enable outbound connections either by IP address (CIDR range)
 * or security group. For information about security groups and mount targets, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/security-considerations.html#network-access">Security Groups for
 * Amazon EC2 Instances and Mount Targets</a> in the <i>Amazon EFS User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Ec2Config" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2Config implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the subnet that the Amazon EC2 resource belongs in.
     * </p>
     */
    private String subnetArn;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * </p>
     */
    private java.util.List<String> securityGroupArns;

    /**
     * <p>
     * The ARN of the subnet that the Amazon EC2 resource belongs in.
     * </p>
     * 
     * @param subnetArn
     *        The ARN of the subnet that the Amazon EC2 resource belongs in.
     */

    public void setSubnetArn(String subnetArn) {
        this.subnetArn = subnetArn;
    }

    /**
     * <p>
     * The ARN of the subnet that the Amazon EC2 resource belongs in.
     * </p>
     * 
     * @return The ARN of the subnet that the Amazon EC2 resource belongs in.
     */

    public String getSubnetArn() {
        return this.subnetArn;
    }

    /**
     * <p>
     * The ARN of the subnet that the Amazon EC2 resource belongs in.
     * </p>
     * 
     * @param subnetArn
     *        The ARN of the subnet that the Amazon EC2 resource belongs in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Config withSubnetArn(String subnetArn) {
        setSubnetArn(subnetArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Config withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Config withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
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
        if (getSubnetArn() != null)
            sb.append("SubnetArn: ").append(getSubnetArn()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2Config == false)
            return false;
        Ec2Config other = (Ec2Config) obj;
        if (other.getSubnetArn() == null ^ this.getSubnetArn() == null)
            return false;
        if (other.getSubnetArn() != null && other.getSubnetArn().equals(this.getSubnetArn()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetArn() == null) ? 0 : getSubnetArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public Ec2Config clone() {
        try {
            return (Ec2Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.Ec2ConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
