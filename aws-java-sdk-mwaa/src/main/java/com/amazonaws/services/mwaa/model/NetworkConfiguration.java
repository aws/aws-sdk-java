/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The VPC networking components used to secure and enable network traffic between the AWS resources for your
 * environment. To learn more, see <a
 * href="https://docs.aws.amazon.com/mwaa/latest/userguide/networking-about.html">About networking on Amazon MWAA</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/NetworkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be attached to
     * the same VPC as the subnets. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     * MWAA</a>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     * availability zones. A subnet must be attached to the same VPC as the security group.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be attached to
     * the same VPC as the subnets. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @return A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be
     *         attached to the same VPC as the subnets. To learn more, see <a
     *         href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     *         MWAA</a>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be attached to
     * the same VPC as the subnets. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be
     *        attached to the same VPC as the subnets. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     *        MWAA</a>.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be attached to
     * the same VPC as the subnets. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     * MWAA</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be
     *        attached to the same VPC as the subnets. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     *        MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be attached to
     * the same VPC as the subnets. To learn more, see <a
     * href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     * MWAA</a>.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of 1 or more security group IDs. Accepts up to 5 security group IDs. A security group must be
     *        attached to the same VPC as the subnets. To learn more, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/vpc-security.html">Security in your VPC on Amazon
     *        MWAA</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     * availability zones. A subnet must be attached to the same VPC as the security group.
     * </p>
     * 
     * @return A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two
     *         different availability zones. A subnet must be attached to the same VPC as the security group.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     * availability zones. A subnet must be attached to the same VPC as the security group.
     * </p>
     * 
     * @param subnetIds
     *        A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     *        availability zones. A subnet must be attached to the same VPC as the security group.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     * availability zones. A subnet must be attached to the same VPC as the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     *        availability zones. A subnet must be attached to the same VPC as the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     * availability zones. A subnet must be attached to the same VPC as the security group.
     * </p>
     * 
     * @param subnetIds
     *        A list of 2 subnet IDs. <b>Required</b> to create an environment. Must be private subnets in two different
     *        availability zones. A subnet must be attached to the same VPC as the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfiguration == false)
            return false;
        NetworkConfiguration other = (NetworkConfiguration) obj;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public NetworkConfiguration clone() {
        try {
            return (NetworkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.NetworkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
