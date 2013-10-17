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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * Configuration defining a new instance group.
 * </p>
 */
public class InstanceGroupConfig implements Serializable {

    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceRole;

    /**
     * Bid price for each Amazon EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String bidPrice;

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * Target number of instances for the instance group.
     */
    private Integer instanceCount;

    /**
     * Default constructor for a new InstanceGroupConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InstanceGroupConfig() {}
    
    /**
     * Constructs a new InstanceGroupConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole The role of the instance group in the cluster.
     * @param instanceType The Amazon EC2 instance type for all instances in
     * the instance group.
     * @param instanceCount Target number of instances for the instance
     * group.
     */
    public InstanceGroupConfig(String instanceRole, String instanceType, Integer instanceCount) {
        setInstanceRole(instanceRole);
        setInstanceType(instanceType);
        setInstanceCount(instanceCount);
    }

    /**
     * Constructs a new InstanceGroupConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole The role of the instance group in the cluster.
     * @param instanceType The Amazon EC2 instance type for all instances in
     * the instance group.
     * @param instanceCount Target number of instances for the instance
     * group.
     */
    public InstanceGroupConfig(InstanceRoleType instanceRole, String instanceType, Integer instanceCount) {
        this.instanceRole = instanceRole.toString();
        this.instanceType = instanceType;
        this.instanceCount = instanceCount;
    }

    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Friendly name given to the instance group.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Friendly name given to the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name given to the instance group.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Friendly name given to the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name given to the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MarketType
     */
    public InstanceGroupConfig withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }
    
    /**
     * Market type of the Amazon EC2 instances used to create a cluster node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market Market type of the Amazon EC2 instances used to create a cluster node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MarketType
     */
    public InstanceGroupConfig withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return The role of the instance group in the cluster.
     *
     * @see InstanceRoleType
     */
    public String getInstanceRole() {
        return instanceRole;
    }
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @see InstanceRoleType
     */
    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceRoleType
     */
    public InstanceGroupConfig withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * The role of the instance group in the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @see InstanceRoleType
     */
    public void setInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
    }
    
    /**
     * The role of the instance group in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole The role of the instance group in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceRoleType
     */
    public InstanceGroupConfig withInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
        return this;
    }

    /**
     * Bid price for each Amazon EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Bid price for each Amazon EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     */
    public String getBidPrice() {
        return bidPrice;
    }
    
    /**
     * Bid price for each Amazon EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param bidPrice Bid price for each Amazon EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }
    
    /**
     * Bid price for each Amazon EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param bidPrice Bid price for each Amazon EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupConfig withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon EC2 instance type for all instances in the instance group.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The Amazon EC2 instance type for all instances in the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The Amazon EC2 instance type for all instances in the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Target number of instances for the instance group.
     *
     * @return Target number of instances for the instance group.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Target number of instances for the instance group.
     *
     * @param instanceCount Target number of instances for the instance group.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Target number of instances for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount Target number of instances for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMarket() != null) sb.append("Market: " + getMarket() + ",");
        if (getInstanceRole() != null) sb.append("InstanceRole: " + getInstanceRole() + ",");
        if (getBidPrice() != null) sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode()); 
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceGroupConfig == false) return false;
        InstanceGroupConfig other = (InstanceGroupConfig)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getMarket() == null ^ this.getMarket() == null) return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false) return false; 
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null) return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false) return false; 
        if (other.getBidPrice() == null ^ this.getBidPrice() == null) return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        return true;
    }
    
}
    