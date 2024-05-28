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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how your DataSync agent connects to Amazon Web Services using a <a href=
 * "https://docs.aws.amazon.com/datasync/latest/userguide/choose-service-endpoint.html#choose-service-endpoint-vpc"
 * >virtual private cloud (VPC) service endpoint</a>. An agent that uses a VPC endpoint isn't accessible over the public
 * internet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/PrivateLinkConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateLinkConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that your agent connects to.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * Specifies the VPC endpoint provided by <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services PrivateLink</a>
     * that your agent connects to.
     * </p>
     */
    private String privateLinkEndpoint;
    /**
     * <p>
     * Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> subnetArns;
    /**
     * <p>
     * Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     * endpoint. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> securityGroupArns;

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that your agent connects to.
     * </p>
     * 
     * @param vpcEndpointId
     *        Specifies the ID of the VPC endpoint that your agent connects to.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that your agent connects to.
     * </p>
     * 
     * @return Specifies the ID of the VPC endpoint that your agent connects to.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * Specifies the ID of the VPC endpoint that your agent connects to.
     * </p>
     * 
     * @param vpcEndpointId
     *        Specifies the ID of the VPC endpoint that your agent connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC endpoint provided by <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services PrivateLink</a>
     * that your agent connects to.
     * </p>
     * 
     * @param privateLinkEndpoint
     *        Specifies the VPC endpoint provided by <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services
     *        PrivateLink</a> that your agent connects to.
     */

    public void setPrivateLinkEndpoint(String privateLinkEndpoint) {
        this.privateLinkEndpoint = privateLinkEndpoint;
    }

    /**
     * <p>
     * Specifies the VPC endpoint provided by <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services PrivateLink</a>
     * that your agent connects to.
     * </p>
     * 
     * @return Specifies the VPC endpoint provided by <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services
     *         PrivateLink</a> that your agent connects to.
     */

    public String getPrivateLinkEndpoint() {
        return this.privateLinkEndpoint;
    }

    /**
     * <p>
     * Specifies the VPC endpoint provided by <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services PrivateLink</a>
     * that your agent connects to.
     * </p>
     * 
     * @param privateLinkEndpoint
     *        Specifies the VPC endpoint provided by <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html">Amazon Web Services
     *        PrivateLink</a> that your agent connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withPrivateLinkEndpoint(String privateLinkEndpoint) {
        setPrivateLinkEndpoint(privateLinkEndpoint);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     */

    public java.util.List<String> getSubnetArns() {
        return subnetArns;
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     */

    public void setSubnetArns(java.util.Collection<String> subnetArns) {
        if (subnetArns == null) {
            this.subnetArns = null;
            return;
        }

        this.subnetArns = new java.util.ArrayList<String>(subnetArns);
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetArns(java.util.Collection)} or {@link #withSubnetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withSubnetArns(String... subnetArns) {
        if (this.subnetArns == null) {
            setSubnetArns(new java.util.ArrayList<String>(subnetArns.length));
        }
        for (String ele : subnetArns) {
            this.subnetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * </p>
     * 
     * @param subnetArns
     *        Specifies the ARN of the subnet where your VPC endpoint is located. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withSubnetArns(java.util.Collection<String> subnetArns) {
        setSubnetArns(subnetArns);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     * endpoint. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     *         endpoint. You can only specify one ARN.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     * endpoint. You can only specify one ARN.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     *        endpoint. You can only specify one ARN.
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
     * Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     * endpoint. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     *        endpoint. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withSecurityGroupArns(String... securityGroupArns) {
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
     * Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     * endpoint. You can only specify one ARN.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon Resource Names (ARN) of the security group that provides DataSync access to your VPC
     *        endpoint. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateLinkConfig withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getPrivateLinkEndpoint() != null)
            sb.append("PrivateLinkEndpoint: ").append(getPrivateLinkEndpoint()).append(",");
        if (getSubnetArns() != null)
            sb.append("SubnetArns: ").append(getSubnetArns()).append(",");
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

        if (obj instanceof PrivateLinkConfig == false)
            return false;
        PrivateLinkConfig other = (PrivateLinkConfig) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getPrivateLinkEndpoint() == null ^ this.getPrivateLinkEndpoint() == null)
            return false;
        if (other.getPrivateLinkEndpoint() != null && other.getPrivateLinkEndpoint().equals(this.getPrivateLinkEndpoint()) == false)
            return false;
        if (other.getSubnetArns() == null ^ this.getSubnetArns() == null)
            return false;
        if (other.getSubnetArns() != null && other.getSubnetArns().equals(this.getSubnetArns()) == false)
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

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getPrivateLinkEndpoint() == null) ? 0 : getPrivateLinkEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSubnetArns() == null) ? 0 : getSubnetArns().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public PrivateLinkConfig clone() {
        try {
            return (PrivateLinkConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.PrivateLinkConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
