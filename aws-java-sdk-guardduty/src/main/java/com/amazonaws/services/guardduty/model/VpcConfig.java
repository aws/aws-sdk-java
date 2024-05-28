/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/VpcConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifiers of the subnets that are associated with your Lambda function.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The identifier of the Amazon Virtual Private Cloud.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifier of the security group attached to the Lambda function.
     * </p>
     */
    private java.util.List<SecurityGroup> securityGroups;

    /**
     * <p>
     * The identifiers of the subnets that are associated with your Lambda function.
     * </p>
     * 
     * @return The identifiers of the subnets that are associated with your Lambda function.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers of the subnets that are associated with your Lambda function.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets that are associated with your Lambda function.
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
     * The identifiers of the subnets that are associated with your Lambda function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets that are associated with your Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSubnetIds(String... subnetIds) {
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
     * The identifiers of the subnets that are associated with your Lambda function.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets that are associated with your Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the Amazon Virtual Private Cloud.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @return The identifier of the Amazon Virtual Private Cloud.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the Amazon Virtual Private Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifier of the security group attached to the Lambda function.
     * </p>
     * 
     * @return The identifier of the security group attached to the Lambda function.
     */

    public java.util.List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The identifier of the security group attached to the Lambda function.
     * </p>
     * 
     * @param securityGroups
     *        The identifier of the security group attached to the Lambda function.
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * The identifier of the security group attached to the Lambda function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The identifier of the security group attached to the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSecurityGroups(SecurityGroup... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<SecurityGroup>(securityGroups.length));
        }
        for (SecurityGroup ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the security group attached to the Lambda function.
     * </p>
     * 
     * @param securityGroups
     *        The identifier of the security group attached to the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfig withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
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

        if (obj instanceof VpcConfig == false)
            return false;
        VpcConfig other = (VpcConfig) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
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

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfig clone() {
        try {
            return (VpcConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.VpcConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
