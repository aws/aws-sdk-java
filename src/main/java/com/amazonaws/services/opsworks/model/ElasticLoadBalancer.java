/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an Elastic Load Balancing instance.
 * </p>
 */
public class ElasticLoadBalancer implements Serializable {

    /**
     * The Elastic Load Balancing instance's name.
     */
    private String elasticLoadBalancerName;

    /**
     * The instance's AWS region.
     */
    private String region;

    /**
     * The instance's public DNS name.
     */
    private String dnsName;

    /**
     * The ID of the stack that the instance is associated with.
     */
    private String stackId;

    /**
     * The ID of the layer that the instance is attached to.
     */
    private String layerId;

    /**
     * The VPC ID.
     */
    private String vpcId;

    /**
     * A list of Availability Zones.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * A list of subnet IDs, if the stack is running in a VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * A list of the EC2 instances that the Elastic Load Balancing instance
     * is managing traffic for.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ec2InstanceIds;

    /**
     * The Elastic Load Balancing instance's name.
     *
     * @return The Elastic Load Balancing instance's name.
     */
    public String getElasticLoadBalancerName() {
        return elasticLoadBalancerName;
    }
    
    /**
     * The Elastic Load Balancing instance's name.
     *
     * @param elasticLoadBalancerName The Elastic Load Balancing instance's name.
     */
    public void setElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
    }
    
    /**
     * The Elastic Load Balancing instance's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticLoadBalancerName The Elastic Load Balancing instance's name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withElasticLoadBalancerName(String elasticLoadBalancerName) {
        this.elasticLoadBalancerName = elasticLoadBalancerName;
        return this;
    }

    /**
     * The instance's AWS region.
     *
     * @return The instance's AWS region.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The instance's AWS region.
     *
     * @param region The instance's AWS region.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The instance's AWS region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The instance's AWS region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * The instance's public DNS name.
     *
     * @return The instance's public DNS name.
     */
    public String getDnsName() {
        return dnsName;
    }
    
    /**
     * The instance's public DNS name.
     *
     * @param dnsName The instance's public DNS name.
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }
    
    /**
     * The instance's public DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsName The instance's public DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * The ID of the stack that the instance is associated with.
     *
     * @return The ID of the stack that the instance is associated with.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The ID of the stack that the instance is associated with.
     *
     * @param stackId The ID of the stack that the instance is associated with.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The ID of the stack that the instance is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The ID of the stack that the instance is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The ID of the layer that the instance is attached to.
     *
     * @return The ID of the layer that the instance is attached to.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * The ID of the layer that the instance is attached to.
     *
     * @param layerId The ID of the layer that the instance is attached to.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * The ID of the layer that the instance is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId The ID of the layer that the instance is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * The VPC ID.
     *
     * @return The VPC ID.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The VPC ID.
     *
     * @param vpcId The VPC ID.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The VPC ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The VPC ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * A list of Availability Zones.
     *
     * @return A list of Availability Zones.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones.
     *
     * @param availabilityZones A list of Availability Zones.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * A list of subnet IDs, if the stack is running in a VPC.
     *
     * @return A list of subnet IDs, if the stack is running in a VPC.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * A list of subnet IDs, if the stack is running in a VPC.
     *
     * @param subnetIds A list of subnet IDs, if the stack is running in a VPC.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * A list of subnet IDs, if the stack is running in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet IDs, if the stack is running in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of subnet IDs, if the stack is running in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet IDs, if the stack is running in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
        }

        return this;
    }

    /**
     * A list of the EC2 instances that the Elastic Load Balancing instance
     * is managing traffic for.
     *
     * @return A list of the EC2 instances that the Elastic Load Balancing instance
     *         is managing traffic for.
     */
    public java.util.List<String> getEc2InstanceIds() {
        if (ec2InstanceIds == null) {
              ec2InstanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ec2InstanceIds.setAutoConstruct(true);
        }
        return ec2InstanceIds;
    }
    
    /**
     * A list of the EC2 instances that the Elastic Load Balancing instance
     * is managing traffic for.
     *
     * @param ec2InstanceIds A list of the EC2 instances that the Elastic Load Balancing instance
     *         is managing traffic for.
     */
    public void setEc2InstanceIds(java.util.Collection<String> ec2InstanceIds) {
        if (ec2InstanceIds == null) {
            this.ec2InstanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ec2InstanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ec2InstanceIds.size());
        ec2InstanceIdsCopy.addAll(ec2InstanceIds);
        this.ec2InstanceIds = ec2InstanceIdsCopy;
    }
    
    /**
     * A list of the EC2 instances that the Elastic Load Balancing instance
     * is managing traffic for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceIds A list of the EC2 instances that the Elastic Load Balancing instance
     *         is managing traffic for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withEc2InstanceIds(String... ec2InstanceIds) {
        if (getEc2InstanceIds() == null) setEc2InstanceIds(new java.util.ArrayList<String>(ec2InstanceIds.length));
        for (String value : ec2InstanceIds) {
            getEc2InstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of the EC2 instances that the Elastic Load Balancing instance
     * is managing traffic for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceIds A list of the EC2 instances that the Elastic Load Balancing instance
     *         is managing traffic for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticLoadBalancer withEc2InstanceIds(java.util.Collection<String> ec2InstanceIds) {
        if (ec2InstanceIds == null) {
            this.ec2InstanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ec2InstanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ec2InstanceIds.size());
            ec2InstanceIdsCopy.addAll(ec2InstanceIds);
            this.ec2InstanceIds = ec2InstanceIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getElasticLoadBalancerName() != null) sb.append("ElasticLoadBalancerName: " + getElasticLoadBalancerName() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getDnsName() != null) sb.append("DnsName: " + getDnsName() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getEc2InstanceIds() != null) sb.append("Ec2InstanceIds: " + getEc2InstanceIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ElasticLoadBalancer == false) return false;
        ElasticLoadBalancer other = (ElasticLoadBalancer)obj;
        
        if (other.getElasticLoadBalancerName() == null ^ this.getElasticLoadBalancerName() == null) return false;
        if (other.getElasticLoadBalancerName() != null && other.getElasticLoadBalancerName().equals(this.getElasticLoadBalancerName()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getDnsName() == null ^ this.getDnsName() == null) return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getEc2InstanceIds() == null ^ this.getEc2InstanceIds() == null) return false;
        if (other.getEc2InstanceIds() != null && other.getEc2InstanceIds().equals(this.getEc2InstanceIds()) == false) return false; 
        return true;
    }
    
}
    