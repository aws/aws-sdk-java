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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
 * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC
 * Endpoints for Amazon Elasticsearch Service Domains</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCDerivedInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     */
    private String vPCId;
    /**
     * <p>
     * Specifies the subnets for VPC endpoint.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * Specifies the security groups for VPC endpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @param vPCId
     *        The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @return The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @param vPCId
     *        The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withVPCId(String vPCId) {
        setVPCId(vPCId);
        return this;
    }

    /**
     * <p>
     * Specifies the subnets for VPC endpoint.
     * </p>
     * 
     * @return Specifies the subnets for VPC endpoint.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the subnets for VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the subnets for VPC endpoint.
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
     * Specifies the subnets for VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the subnets for VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withSubnetIds(String... subnetIds) {
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
     * Specifies the subnets for VPC endpoint.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the subnets for VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @return The availability zones for the Elasticsearch domain. Exists only if the domain was created with
     *         VPCOptions.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @param availabilityZones
     *        The availability zones for the Elasticsearch domain. Exists only if the domain was created with
     *        VPCOptions.
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
     * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The availability zones for the Elasticsearch domain. Exists only if the domain was created with
     *        VPCOptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withAvailabilityZones(String... availabilityZones) {
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
     * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
     * </p>
     * 
     * @param availabilityZones
     *        The availability zones for the Elasticsearch domain. Exists only if the domain was created with
     *        VPCOptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Specifies the security groups for VPC endpoint.
     * </p>
     * 
     * @return Specifies the security groups for VPC endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Specifies the security groups for VPC endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the security groups for VPC endpoint.
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
     * Specifies the security groups for VPC endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the security groups for VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withSecurityGroupIds(String... securityGroupIds) {
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
     * Specifies the security groups for VPC endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Specifies the security groups for VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCDerivedInfo withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPCDerivedInfo == false)
            return false;
        VPCDerivedInfo other = (VPCDerivedInfo) obj;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public VPCDerivedInfo clone() {
        try {
            return (VPCDerivedInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.VPCDerivedInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
