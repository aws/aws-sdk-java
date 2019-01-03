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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Elastic Load Balancing instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ElasticLoadBalancer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticLoadBalancer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     */
    private String elasticLoadBalancerName;
    /**
     * <p>
     * The instance's AWS region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The instance's public DNS name.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The ID of the stack that the instance is associated with.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The ID of the layer that the instance is attached to.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * The VPC ID.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of Availability Zones.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * A list of subnet IDs, if the stack is running in a VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ec2InstanceIds;

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @param elasticLoadBalancerName
     *        The Elastic Load Balancing instance's name.
     */

    public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
    }

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @return The Elastic Load Balancing instance's name.
     */

    public String getElasticLoadBalancerName() {
        return this.elasticLoadBalancerName;
    }

    /**
     * <p>
     * The Elastic Load Balancing instance's name.
     * </p>
     * 
     * @param elasticLoadBalancerName
     *        The Elastic Load Balancing instance's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withElasticLoadBalancerName(String elasticLoadBalancerName) {
        setElasticLoadBalancerName(elasticLoadBalancerName);
        return this;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @param region
     *        The instance's AWS region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @return The instance's AWS region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The instance's AWS region.
     * </p>
     * 
     * @param region
     *        The instance's AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The instance's public DNS name.
     * </p>
     * 
     * @param dnsName
     *        The instance's public DNS name.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The instance's public DNS name.
     * </p>
     * 
     * @return The instance's public DNS name.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The instance's public DNS name.
     * </p>
     * 
     * @param dnsName
     *        The instance's public DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The ID of the stack that the instance is associated with.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack that the instance is associated with.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack that the instance is associated with.
     * </p>
     * 
     * @return The ID of the stack that the instance is associated with.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack that the instance is associated with.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack that the instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The ID of the layer that the instance is attached to.
     * </p>
     * 
     * @param layerId
     *        The ID of the layer that the instance is attached to.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * The ID of the layer that the instance is attached to.
     * </p>
     * 
     * @return The ID of the layer that the instance is attached to.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * The ID of the layer that the instance is attached to.
     * </p>
     * 
     * @param layerId
     *        The ID of the layer that the instance is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @return The VPC ID.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones.
     * </p>
     * 
     * @return A list of Availability Zones.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs, if the stack is running in a VPC.
     * </p>
     * 
     * @return A list of subnet IDs, if the stack is running in a VPC.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs, if the stack is running in a VPC.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs, if the stack is running in a VPC.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs, if the stack is running in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs, if the stack is running in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs, if the stack is running in a VPC.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs, if the stack is running in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * </p>
     * 
     * @return A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     */

    public java.util.List<String> getEc2InstanceIds() {
        if (ec2InstanceIds == null) {
            ec2InstanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ec2InstanceIds;
    }

    /**
     * <p>
     * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * </p>
     * 
     * @param ec2InstanceIds
     *        A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     */

    public void setEc2InstanceIds(java.util.Collection<String> ec2InstanceIds) {
        if (ec2InstanceIds == null) {
            this.ec2InstanceIds = null;
            return;
        }

        this.ec2InstanceIds = new com.amazonaws.internal.SdkInternalList<String>(ec2InstanceIds);
    }

    /**
     * <p>
     * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceIds(java.util.Collection)} or {@link #withEc2InstanceIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2InstanceIds
     *        A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withEc2InstanceIds(String... ec2InstanceIds) {
        if (this.ec2InstanceIds == null) {
            setEc2InstanceIds(new com.amazonaws.internal.SdkInternalList<String>(ec2InstanceIds.length));
        }
        for (String ele : ec2InstanceIds) {
            this.ec2InstanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * </p>
     * 
     * @param ec2InstanceIds
     *        A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticLoadBalancer withEc2InstanceIds(java.util.Collection<String> ec2InstanceIds) {
        setEc2InstanceIds(ec2InstanceIds);
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
        if (getElasticLoadBalancerName() != null)
            sb.append("ElasticLoadBalancerName: ").append(getElasticLoadBalancerName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getEc2InstanceIds() != null)
            sb.append("Ec2InstanceIds: ").append(getEc2InstanceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticLoadBalancer == false)
            return false;
        ElasticLoadBalancer other = (ElasticLoadBalancer) obj;
        if (other.getElasticLoadBalancerName() == null ^ this.getElasticLoadBalancerName() == null)
            return false;
        if (other.getElasticLoadBalancerName() != null && other.getElasticLoadBalancerName().equals(this.getElasticLoadBalancerName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getEc2InstanceIds() == null ^ this.getEc2InstanceIds() == null)
            return false;
        if (other.getEc2InstanceIds() != null && other.getEc2InstanceIds().equals(this.getEc2InstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticLoadBalancerName() == null) ? 0 : getElasticLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceIds() == null) ? 0 : getEc2InstanceIds().hashCode());
        return hashCode;
    }

    @Override
    public ElasticLoadBalancer clone() {
        try {
            return (ElasticLoadBalancer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.ElasticLoadBalancerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
