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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainVPCOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainVPCOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of Availability Zones associated with the VPC subnets.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The list of security group IDs associated with the VPC endpoints for the domain.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoints for the domain.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * ID for the VPC.
     * </p>
     */
    private String vPCId;

    /**
     * <p>
     * The list of Availability Zones associated with the VPC subnets.
     * </p>
     * 
     * @return The list of Availability Zones associated with the VPC subnets.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The list of Availability Zones associated with the VPC subnets.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones associated with the VPC subnets.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The list of Availability Zones associated with the VPC subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones associated with the VPC subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones associated with the VPC subnets.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones associated with the VPC subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The list of security group IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @return The list of security group IDs associated with the VPC endpoints for the domain.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The list of security group IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security group IDs associated with the VPC endpoints for the domain.
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
     * The list of security group IDs associated with the VPC endpoints for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security group IDs associated with the VPC endpoints for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withSecurityGroupIds(String... securityGroupIds) {
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
     * The list of security group IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @param securityGroupIds
     *        The list of security group IDs associated with the VPC endpoints for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @return A list of subnet IDs associated with the VPC endpoints for the domain.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoints for the domain.
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
     * A list of subnet IDs associated with the VPC endpoints for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoints for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withSubnetIds(String... subnetIds) {
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
     * A list of subnet IDs associated with the VPC endpoints for the domain.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs associated with the VPC endpoints for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * ID for the VPC.
     * </p>
     * 
     * @param vPCId
     *        ID for the VPC.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * ID for the VPC.
     * </p>
     * 
     * @return ID for the VPC.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * ID for the VPC.
     * </p>
     * 
     * @param vPCId
     *        ID for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainVPCOptions withVPCId(String vPCId) {
        setVPCId(vPCId);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainVPCOptions == false)
            return false;
        AwsElasticsearchDomainVPCOptions other = (AwsElasticsearchDomainVPCOptions) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainVPCOptions clone() {
        try {
            return (AwsElasticsearchDomainVPCOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainVPCOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
