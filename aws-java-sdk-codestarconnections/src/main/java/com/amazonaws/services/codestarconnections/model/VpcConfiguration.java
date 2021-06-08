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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The VPC configuration provisioned for the host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/VpcConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     * provider type is installed.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure
     * where your provider type is installed.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     * provider type is installed.
     * </p>
     */
    private String tlsCertificate;

    /**
     * <p>
     * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * </p>
     * 
     * @return The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @return The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     *         provider type is installed.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     *        provider type is installed.
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
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     * provider type is installed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     *        provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(String... subnetIds) {
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
     * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @param subnetIds
     *        The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your
     *        provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure
     * where your provider type is installed.
     * </p>
     * 
     * @return The ID of the security group or security groups associated with the Amazon VPC connected to the
     *         infrastructure where your provider type is installed.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure
     * where your provider type is installed.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of the security group or security groups associated with the Amazon VPC connected to the
     *        infrastructure where your provider type is installed.
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
     * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure
     * where your provider type is installed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of the security group or security groups associated with the Amazon VPC connected to the
     *        infrastructure where your provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(String... securityGroupIds) {
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
     * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure
     * where your provider type is installed.
     * </p>
     * 
     * @param securityGroupIds
     *        The ID of the security group or security groups associated with the Amazon VPC connected to the
     *        infrastructure where your provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @param tlsCertificate
     *        The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     *        provider type is installed.
     */

    public void setTlsCertificate(String tlsCertificate) {
        this.tlsCertificate = tlsCertificate;
    }

    /**
     * <p>
     * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @return The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     *         provider type is installed.
     */

    public String getTlsCertificate() {
        return this.tlsCertificate;
    }

    /**
     * <p>
     * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     * provider type is installed.
     * </p>
     * 
     * @param tlsCertificate
     *        The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your
     *        provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withTlsCertificate(String tlsCertificate) {
        setTlsCertificate(tlsCertificate);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTlsCertificate() != null)
            sb.append("TlsCertificate: ").append(getTlsCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfiguration == false)
            return false;
        VpcConfiguration other = (VpcConfiguration) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTlsCertificate() == null ^ this.getTlsCertificate() == null)
            return false;
        if (other.getTlsCertificate() != null && other.getTlsCertificate().equals(this.getTlsCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTlsCertificate() == null) ? 0 : getTlsCertificate().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfiguration clone() {
        try {
            return (VpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarconnections.model.transform.VpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
