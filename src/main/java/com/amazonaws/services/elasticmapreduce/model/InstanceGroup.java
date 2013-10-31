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
 * This entity represents an instance group, which is a group of instances that have common purpose. For example, CORE instance group is used for HDFS.
 * </p>
 */
public class InstanceGroup implements Serializable {

    /**
     * The identifier of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String id;

    /**
     * The name of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String name;

    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceGroupType;

    /**
     * The bid price for each EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String bidPrice;

    /**
     * The EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * The target number of instances for the instance group.
     */
    private Integer requestedInstanceCount;

    /**
     * The number of instances currently running in this instance group.
     */
    private Integer runningInstanceCount;

    /**
     * The current status of the instance group.
     */
    private InstanceGroupStatus status;

    /**
     * The identifier of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The identifier of the instance group.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The identifier of the instance group.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The identifier of the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The name of the instance group.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the instance group.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return The marketplace to provision instances for this group. Valid values
     *         are ON_DEMAND or SPOT.
     *
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }
    
    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market The marketplace to provision instances for this group. Valid values
     *         are ON_DEMAND or SPOT.
     *
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }
    
    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market The marketplace to provision instances for this group. Valid values
     *         are ON_DEMAND or SPOT.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MarketType
     */
    public InstanceGroup withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market The marketplace to provision instances for this group. Valid values
     *         are ON_DEMAND or SPOT.
     *
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }
    
    /**
     * The marketplace to provision instances for this group. Valid values
     * are ON_DEMAND or SPOT.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market The marketplace to provision instances for this group. Valid values
     *         are ON_DEMAND or SPOT.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MarketType
     */
    public InstanceGroup withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return The type of the instance group. Valid values are MASTER, CORE or TASK.
     *
     * @see InstanceGroupType
     */
    public String getInstanceGroupType() {
        return instanceGroupType;
    }
    
    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType The type of the instance group. Valid values are MASTER, CORE or TASK.
     *
     * @see InstanceGroupType
     */
    public void setInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
    }
    
    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType The type of the instance group. Valid values are MASTER, CORE or TASK.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupType
     */
    public InstanceGroup withInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
        return this;
    }

    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType The type of the instance group. Valid values are MASTER, CORE or TASK.
     *
     * @see InstanceGroupType
     */
    public void setInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
    }
    
    /**
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType The type of the instance group. Valid values are MASTER, CORE or TASK.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupType
     */
    public InstanceGroup withInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
        return this;
    }

    /**
     * The bid price for each EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The bid price for each EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     */
    public String getBidPrice() {
        return bidPrice;
    }
    
    /**
     * The bid price for each EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param bidPrice The bid price for each EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }
    
    /**
     * The bid price for each EC2 instance in the instance group when
     * launching nodes as Spot Instances, expressed in USD.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param bidPrice The bid price for each EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * The EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The EC2 instance type for all instances in the instance group.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The EC2 instance type for all instances in the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The EC2 instance type for all instances in the instance group.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The EC2 instance type for all instances in the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The EC2 instance type for all instances in the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The target number of instances for the instance group.
     *
     * @return The target number of instances for the instance group.
     */
    public Integer getRequestedInstanceCount() {
        return requestedInstanceCount;
    }
    
    /**
     * The target number of instances for the instance group.
     *
     * @param requestedInstanceCount The target number of instances for the instance group.
     */
    public void setRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
    }
    
    /**
     * The target number of instances for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestedInstanceCount The target number of instances for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
        return this;
    }

    /**
     * The number of instances currently running in this instance group.
     *
     * @return The number of instances currently running in this instance group.
     */
    public Integer getRunningInstanceCount() {
        return runningInstanceCount;
    }
    
    /**
     * The number of instances currently running in this instance group.
     *
     * @param runningInstanceCount The number of instances currently running in this instance group.
     */
    public void setRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
    }
    
    /**
     * The number of instances currently running in this instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningInstanceCount The number of instances currently running in this instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
        return this;
    }

    /**
     * The current status of the instance group.
     *
     * @return The current status of the instance group.
     */
    public InstanceGroupStatus getStatus() {
        return status;
    }
    
    /**
     * The current status of the instance group.
     *
     * @param status The current status of the instance group.
     */
    public void setStatus(InstanceGroupStatus status) {
        this.status = status;
    }
    
    /**
     * The current status of the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current status of the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroup withStatus(InstanceGroupStatus status) {
        this.status = status;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMarket() != null) sb.append("Market: " + getMarket() + ",");
        if (getInstanceGroupType() != null) sb.append("InstanceGroupType: " + getInstanceGroupType() + ",");
        if (getBidPrice() != null) sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getRequestedInstanceCount() != null) sb.append("RequestedInstanceCount: " + getRequestedInstanceCount() + ",");
        if (getRunningInstanceCount() != null) sb.append("RunningInstanceCount: " + getRunningInstanceCount() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroupType() == null) ? 0 : getInstanceGroupType().hashCode()); 
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getRequestedInstanceCount() == null) ? 0 : getRequestedInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getRunningInstanceCount() == null) ? 0 : getRunningInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceGroup == false) return false;
        InstanceGroup other = (InstanceGroup)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getMarket() == null ^ this.getMarket() == null) return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false) return false; 
        if (other.getInstanceGroupType() == null ^ this.getInstanceGroupType() == null) return false;
        if (other.getInstanceGroupType() != null && other.getInstanceGroupType().equals(this.getInstanceGroupType()) == false) return false; 
        if (other.getBidPrice() == null ^ this.getBidPrice() == null) return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getRequestedInstanceCount() == null ^ this.getRequestedInstanceCount() == null) return false;
        if (other.getRequestedInstanceCount() != null && other.getRequestedInstanceCount().equals(this.getRequestedInstanceCount()) == false) return false; 
        if (other.getRunningInstanceCount() == null ^ this.getRunningInstanceCount() == null) return false;
        if (other.getRunningInstanceCount() != null && other.getRunningInstanceCount().equals(this.getRunningInstanceCount()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    