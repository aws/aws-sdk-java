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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options that specify the subnets and security groups for an OpenSearch Ingestion VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/VpcOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoint.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of security groups associated with the VPC endpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Options for attaching a VPC to a pipeline.
     * </p>
     */
    private VpcAttachmentOptions vpcAttachmentOptions;

    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoint.
     * </p>
     * 
     * @return A list of subnet IDs associated with the VPC endpoint.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoint.
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
     * A list of subnet IDs associated with the VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withSubnetIds(String... subnetIds) {
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
     * A list of subnet IDs associated with the VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of security groups associated with the VPC endpoint.
     * </p>
     * 
     * @return A list of security groups associated with the VPC endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security groups associated with the VPC endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security groups associated with the VPC endpoint.
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
     * A list of security groups associated with the VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security groups associated with the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of security groups associated with the VPC endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security groups associated with the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Options for attaching a VPC to a pipeline.
     * </p>
     * 
     * @param vpcAttachmentOptions
     *        Options for attaching a VPC to a pipeline.
     */

    public void setVpcAttachmentOptions(VpcAttachmentOptions vpcAttachmentOptions) {
        this.vpcAttachmentOptions = vpcAttachmentOptions;
    }

    /**
     * <p>
     * Options for attaching a VPC to a pipeline.
     * </p>
     * 
     * @return Options for attaching a VPC to a pipeline.
     */

    public VpcAttachmentOptions getVpcAttachmentOptions() {
        return this.vpcAttachmentOptions;
    }

    /**
     * <p>
     * Options for attaching a VPC to a pipeline.
     * </p>
     * 
     * @param vpcAttachmentOptions
     *        Options for attaching a VPC to a pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withVpcAttachmentOptions(VpcAttachmentOptions vpcAttachmentOptions) {
        setVpcAttachmentOptions(vpcAttachmentOptions);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getVpcAttachmentOptions() != null)
            sb.append("VpcAttachmentOptions: ").append(getVpcAttachmentOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcOptions == false)
            return false;
        VpcOptions other = (VpcOptions) obj;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getVpcAttachmentOptions() == null ^ this.getVpcAttachmentOptions() == null)
            return false;
        if (other.getVpcAttachmentOptions() != null && other.getVpcAttachmentOptions().equals(this.getVpcAttachmentOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcAttachmentOptions() == null) ? 0 : getVpcAttachmentOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpcOptions clone() {
        try {
            return (VpcOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.VpcOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
