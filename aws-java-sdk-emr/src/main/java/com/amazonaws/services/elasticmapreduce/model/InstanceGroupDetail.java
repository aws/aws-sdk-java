/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about an instance group.
 * </p>
 */
public class InstanceGroupDetail implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     */
    private String market;
    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     */
    private String instanceRole;
    /**
     * <p>
     * Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * EC2 instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     */
    private Integer instanceRequestCount;
    /**
     * <p>
     * Actual count of running instances.
     * </p>
     */
    private Integer instanceRunningCount;
    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     */
    private String lastStateChangeReason;
    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     */
    private java.util.Date readyDateTime;
    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * Default constructor for InstanceGroupDetail object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public InstanceGroupDetail() {
    }

    /**
     * Constructs a new InstanceGroupDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @param instanceType
     *        EC2 instance type.
     * @param instanceRequestCount
     *        Target number of instances to run in the instance group.
     * @param instanceRunningCount
     *        Actual count of running instances.
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @param creationDateTime
     *        The date/time the instance group was created.
     */
    public InstanceGroupDetail(String instanceRole, String instanceType, Integer instanceRequestCount, Integer instanceRunningCount, String state,
            java.util.Date creationDateTime) {
        setInstanceRole(instanceRole);
        setInstanceType(instanceType);
        setInstanceRequestCount(instanceRequestCount);
        setInstanceRunningCount(instanceRunningCount);
        setState(state);
        setCreationDateTime(creationDateTime);
    }

    /**
     * Constructs a new InstanceGroupDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @param instanceType
     *        EC2 instance type.
     * @param instanceRequestCount
     *        Target number of instances to run in the instance group.
     * @param instanceRunningCount
     *        Actual count of running instances.
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @param creationDateTime
     *        The date/time the instance group was created.
     */
    public InstanceGroupDetail(InstanceRoleType instanceRole, String instanceType, Integer instanceRequestCount, Integer instanceRunningCount,
            InstanceGroupState state, java.util.Date creationDateTime) {
        setInstanceRole(instanceRole.toString());
        setInstanceType(instanceType);
        setInstanceRequestCount(instanceRequestCount);
        setInstanceRunningCount(instanceRunningCount);
        setState(state.toString());
        setCreationDateTime(creationDateTime);
    }

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique identifier for the instance group.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * 
     * @return Unique identifier for the instance group.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique identifier for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     * 
     * @param name
     *        Friendly name for the instance group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     * 
     * @return Friendly name for the instance group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     * 
     * @param name
     *        Friendly name for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @return Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroupDetail withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroupDetail withMarket(MarketType market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @see InstanceRoleType
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * 
     * @return Instance group role in the cluster
     * @see InstanceRoleType
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public InstanceGroupDetail withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @see InstanceRoleType
     */

    public void setInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * 
     * @param instanceRole
     *        Instance group role in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public InstanceGroupDetail withInstanceRole(InstanceRoleType instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @return Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        Bid price for EC2 Instances when launching nodes as Spot Instances, expressed in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * EC2 instance type.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * EC2 instance type.
     * </p>
     * 
     * @return EC2 instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * EC2 instance type.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     * 
     * @param instanceRequestCount
     *        Target number of instances to run in the instance group.
     */

    public void setInstanceRequestCount(Integer instanceRequestCount) {
        this.instanceRequestCount = instanceRequestCount;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     * 
     * @return Target number of instances to run in the instance group.
     */

    public Integer getInstanceRequestCount() {
        return this.instanceRequestCount;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     * 
     * @param instanceRequestCount
     *        Target number of instances to run in the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withInstanceRequestCount(Integer instanceRequestCount) {
        setInstanceRequestCount(instanceRequestCount);
        return this;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     * 
     * @param instanceRunningCount
     *        Actual count of running instances.
     */

    public void setInstanceRunningCount(Integer instanceRunningCount) {
        this.instanceRunningCount = instanceRunningCount;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     * 
     * @return Actual count of running instances.
     */

    public Integer getInstanceRunningCount() {
        return this.instanceRunningCount;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     * 
     * @param instanceRunningCount
     *        Actual count of running instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withInstanceRunningCount(Integer instanceRunningCount) {
        setInstanceRunningCount(instanceRunningCount);
        return this;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     * 
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @see InstanceGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     * 
     * @return State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @see InstanceGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     * 
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupState
     */

    public InstanceGroupDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     * 
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @see InstanceGroupState
     */

    public void setState(InstanceGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * </p>
     * 
     * @param state
     *        State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupState
     */

    public InstanceGroupDetail withState(InstanceGroupState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * 
     * @param lastStateChangeReason
     *        Details regarding the state of the instance group.
     */

    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * 
     * @return Details regarding the state of the instance group.
     */

    public String getLastStateChangeReason() {
        return this.lastStateChangeReason;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * 
     * @param lastStateChangeReason
     *        Details regarding the state of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withLastStateChangeReason(String lastStateChangeReason) {
        setLastStateChangeReason(lastStateChangeReason);
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date/time the instance group was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     * 
     * @return The date/time the instance group was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date/time the instance group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     * 
     * @param startDateTime
     *        The date/time the instance group was started.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     * 
     * @return The date/time the instance group was started.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     * 
     * @param startDateTime
     *        The date/time the instance group was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     * 
     * @param readyDateTime
     *        The date/time the instance group was available to the cluster.
     */

    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     * 
     * @return The date/time the instance group was available to the cluster.
     */

    public java.util.Date getReadyDateTime() {
        return this.readyDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     * 
     * @param readyDateTime
     *        The date/time the instance group was available to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withReadyDateTime(java.util.Date readyDateTime) {
        setReadyDateTime(readyDateTime);
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     * 
     * @param endDateTime
     *        The date/time the instance group was terminated.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     * 
     * @return The date/time the instance group was terminated.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     * 
     * @param endDateTime
     *        The date/time the instance group was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupDetail withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: " + getInstanceRole() + ",");
        if (getBidPrice() != null)
            sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceRequestCount() != null)
            sb.append("InstanceRequestCount: " + getInstanceRequestCount() + ",");
        if (getInstanceRunningCount() != null)
            sb.append("InstanceRunningCount: " + getInstanceRunningCount() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getLastStateChangeReason() != null)
            sb.append("LastStateChangeReason: " + getLastStateChangeReason() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: " + getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupDetail == false)
            return false;
        InstanceGroupDetail other = (InstanceGroupDetail) obj;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceRequestCount() == null ^ this.getInstanceRequestCount() == null)
            return false;
        if (other.getInstanceRequestCount() != null && other.getInstanceRequestCount().equals(this.getInstanceRequestCount()) == false)
            return false;
        if (other.getInstanceRunningCount() == null ^ this.getInstanceRunningCount() == null)
            return false;
        if (other.getInstanceRunningCount() != null && other.getInstanceRunningCount().equals(this.getInstanceRunningCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null)
            return false;
        if (other.getLastStateChangeReason() != null && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequestCount() == null) ? 0 : getInstanceRequestCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceRunningCount() == null) ? 0 : getInstanceRunningCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroupDetail clone() {
        try {
            return (InstanceGroupDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
