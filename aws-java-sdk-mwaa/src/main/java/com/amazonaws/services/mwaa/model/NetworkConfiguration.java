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
 * Provide the security group and subnet IDs for the workers and scheduler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/NetworkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two different
     * availability zones.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * </p>
     * 
     * @return A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * </p>
     * 
     * @param securityGroupIds
     *        A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
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
     * A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
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
     * A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * </p>
     * 
     * @param securityGroupIds
     *        A JSON list of 1 or more security groups IDs by name, in the same VPC as the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two different
     * availability zones.
     * </p>
     * 
     * @return Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two
     *         different availability zones.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two different
     * availability zones.
     * </p>
     * 
     * @param subnetIds
     *        Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two
     *        different availability zones.
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
     * Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two different
     * availability zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two
     *        different availability zones.
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
     * Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two different
     * availability zones.
     * </p>
     * 
     * @param subnetIds
     *        Provide a JSON list of 2 subnet IDs by name. These must be private subnets, in the same VPC, in two
     *        different availability zones.
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
