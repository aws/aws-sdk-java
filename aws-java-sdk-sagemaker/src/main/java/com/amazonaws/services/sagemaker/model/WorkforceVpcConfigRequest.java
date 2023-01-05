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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The VPC object you use to create or update a workforce.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/WorkforceVpcConfigRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkforceVpcConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the VPC that the workforce uses for communication.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The ID of the subnets in the VPC that you want to connect.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * The ID of the VPC that the workforce uses for communication.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the workforce uses for communication.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the workforce uses for communication.
     * </p>
     * 
     * @return The ID of the VPC that the workforce uses for communication.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the workforce uses for communication.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the workforce uses for communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkforceVpcConfigRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @return The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *         specified in the subnet.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
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
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkforceVpcConfigRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in
     * the subnet.
     * </p>
     * 
     * @param securityGroupIds
     *        The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as
     *        specified in the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkforceVpcConfigRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the subnets in the VPC that you want to connect.
     * </p>
     * 
     * @return The ID of the subnets in the VPC that you want to connect.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The ID of the subnets in the VPC that you want to connect.
     * </p>
     * 
     * @param subnets
     *        The ID of the subnets in the VPC that you want to connect.
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
     * The ID of the subnets in the VPC that you want to connect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The ID of the subnets in the VPC that you want to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkforceVpcConfigRequest withSubnets(String... subnets) {
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
     * The ID of the subnets in the VPC that you want to connect.
     * </p>
     * 
     * @param subnets
     *        The ID of the subnets in the VPC that you want to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkforceVpcConfigRequest withSubnets(java.util.Collection<String> subnets) {
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
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

        if (obj instanceof WorkforceVpcConfigRequest == false)
            return false;
        WorkforceVpcConfigRequest other = (WorkforceVpcConfigRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
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

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public WorkforceVpcConfigRequest clone() {
        try {
            return (WorkforceVpcConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.WorkforceVpcConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
