/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/SecurityDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN to a role needed for connecting streams to your instances.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The security groups to attach to the elastic network interfaces.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * ARN to a role needed for connecting streams to your instances.
     * </p>
     * 
     * @param roleArn
     *        ARN to a role needed for connecting streams to your instances.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * ARN to a role needed for connecting streams to your instances.
     * </p>
     * 
     * @return ARN to a role needed for connecting streams to your instances.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * ARN to a role needed for connecting streams to your instances.
     * </p>
     * 
     * @param roleArn
     *        ARN to a role needed for connecting streams to your instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The security groups to attach to the elastic network interfaces.
     * </p>
     * 
     * @return The security groups to attach to the elastic network interfaces.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups to attach to the elastic network interfaces.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups to attach to the elastic network interfaces.
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
     * The security groups to attach to the elastic network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups to attach to the elastic network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityDetails withSecurityGroupIds(String... securityGroupIds) {
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
     * The security groups to attach to the elastic network interfaces.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups to attach to the elastic network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityDetails withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
     * </p>
     * 
     * @return A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your
     *         instances.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your
     *        instances.
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
     * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityDetails withSubnetIds(String... subnetIds) {
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
     * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityDetails withSubnetIds(java.util.Collection<String> subnetIds) {
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof SecurityDetails == false)
            return false;
        SecurityDetails other = (SecurityDetails) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public SecurityDetails clone() {
        try {
            return (SecurityDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.SecurityDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
