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
 * Detailed information about an instance group.
 * </p>
 */
public class InstanceGroupDetail implements Serializable {

    /**
     * Unique identifier for the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceGroupId;

    /**
     * Friendly name for the instance group.
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
     * Instance group role in the cluster
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceRole;

    /**
     * Bid price for EC2 Instances when launching nodes as Spot Instances,
     * expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String bidPrice;

    /**
     * Amazon EC2 Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * Target number of instances to run in the instance group.
     */
    private Integer instanceRequestCount;

    /**
     * Actual count of running instances.
     */
    private Integer instanceRunningCount;

    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     */
    private String state;

    /**
     * Details regarding the state of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lastStateChangeReason;

    /**
     * The date/time the instance group was created.
     */
    private java.util.Date creationDateTime;

    /**
     * The date/time the instance group was started.
     */
    private java.util.Date startDateTime;

    /**
     * The date/time the instance group was available to the cluster.
     */
    private java.util.Date readyDateTime;

    /**
     * The date/time the instance group was terminated.
     */
    private java.util.Date endDateTime;

    /**
     * Default constructor for a new InstanceGroupDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InstanceGroupDetail() {}
    
    /**
     * Constructs a new InstanceGroupDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole Instance group role in the cluster
     * @param instanceType Amazon EC2 Instance type.
     * @param instanceRequestCount Target number of instances to run in the
     * instance group.
     * @param instanceRunningCount Actual count of running instances.
     * @param state State of instance group. The following values are
     * deprecated: STARTING, TERMINATED, and FAILED.
     * @param creationDateTime The date/time the instance group was created.
     */
    public InstanceGroupDetail(String instanceRole, String instanceType, Integer instanceRequestCount, Integer instanceRunningCount, String state, java.util.Date creationDateTime) {
        setInstanceRole(instanceRole);
        setInstanceType(instanceType);
        setInstanceRequestCount(instanceRequestCount);
        setInstanceRunningCount(instanceRunningCount);
        setState(state);
        setCreationDateTime(creationDateTime);
    }

    /**
     * Constructs a new InstanceGroupDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole Instance group role in the cluster
     * @param instanceType Amazon EC2 Instance type.
     * @param instanceRequestCount Target number of instances to run in the
     * instance group.
     * @param instanceRunningCount Actual count of running instances.
     * @param state State of instance group. The following values are
     * deprecated: STARTING, TERMINATED, and FAILED.
     * @param creationDateTime The date/time the instance group was created.
     */
    public InstanceGroupDetail(InstanceRoleType instanceRole, String instanceType, Integer instanceRequestCount, Integer instanceRunningCount, InstanceGroupState state, java.util.Date creationDateTime) {
        this.instanceRole = instanceRole.toString();
        this.instanceType = instanceType;
        this.instanceRequestCount = instanceRequestCount;
        this.instanceRunningCount = instanceRunningCount;
        this.state = state.toString();
        this.creationDateTime = creationDateTime;
    }

    /**
     * Unique identifier for the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Unique identifier for the instance group.
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }
    
    /**
     * Unique identifier for the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceGroupId Unique identifier for the instance group.
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }
    
    /**
     * Unique identifier for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceGroupId Unique identifier for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * Friendly name for the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Friendly name for the instance group.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Friendly name for the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name for the instance group.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Friendly name for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Friendly name for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withName(String name) {
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
    public InstanceGroupDetail withMarket(String market) {
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
    public InstanceGroupDetail withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * Instance group role in the cluster
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return Instance group role in the cluster
     *
     * @see InstanceRoleType
     */
    public String getInstanceRole() {
        return instanceRole;
    }
    
    /**
     * Instance group role in the cluster
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole Instance group role in the cluster
     *
     * @see InstanceRoleType
     */
    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }
    
    /**
     * Instance group role in the cluster
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole Instance group role in the cluster
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceRoleType
     */
    public InstanceGroupDetail withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * Instance group role in the cluster
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole Instance group role in the cluster
     *
     * @see InstanceRoleType
     */
    public void setInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
    }
    
    /**
     * Instance group role in the cluster
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole Instance group role in the cluster
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceRoleType
     */
    public InstanceGroupDetail withInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
        return this;
    }

    /**
     * Bid price for EC2 Instances when launching nodes as Spot Instances,
     * expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Bid price for EC2 Instances when launching nodes as Spot Instances,
     *         expressed in USD.
     */
    public String getBidPrice() {
        return bidPrice;
    }
    
    /**
     * Bid price for EC2 Instances when launching nodes as Spot Instances,
     * expressed in USD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param bidPrice Bid price for EC2 Instances when launching nodes as Spot Instances,
     *         expressed in USD.
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }
    
    /**
     * Bid price for EC2 Instances when launching nodes as Spot Instances,
     * expressed in USD.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param bidPrice Bid price for EC2 Instances when launching nodes as Spot Instances,
     *         expressed in USD.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * Amazon EC2 Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Amazon EC2 Instance type.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Amazon EC2 Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType Amazon EC2 Instance type.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Amazon EC2 Instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType Amazon EC2 Instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Target number of instances to run in the instance group.
     *
     * @return Target number of instances to run in the instance group.
     */
    public Integer getInstanceRequestCount() {
        return instanceRequestCount;
    }
    
    /**
     * Target number of instances to run in the instance group.
     *
     * @param instanceRequestCount Target number of instances to run in the instance group.
     */
    public void setInstanceRequestCount(Integer instanceRequestCount) {
        this.instanceRequestCount = instanceRequestCount;
    }
    
    /**
     * Target number of instances to run in the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceRequestCount Target number of instances to run in the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withInstanceRequestCount(Integer instanceRequestCount) {
        this.instanceRequestCount = instanceRequestCount;
        return this;
    }

    /**
     * Actual count of running instances.
     *
     * @return Actual count of running instances.
     */
    public Integer getInstanceRunningCount() {
        return instanceRunningCount;
    }
    
    /**
     * Actual count of running instances.
     *
     * @param instanceRunningCount Actual count of running instances.
     */
    public void setInstanceRunningCount(Integer instanceRunningCount) {
        this.instanceRunningCount = instanceRunningCount;
    }
    
    /**
     * Actual count of running instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceRunningCount Actual count of running instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withInstanceRunningCount(Integer instanceRunningCount) {
        this.instanceRunningCount = instanceRunningCount;
        return this;
    }

    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @return State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *
     * @see InstanceGroupState
     */
    public String getState() {
        return state;
    }
    
    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *
     * @see InstanceGroupState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupState
     */
    public InstanceGroupDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *
     * @see InstanceGroupState
     */
    public void setState(InstanceGroupState state) {
        this.state = state.toString();
    }
    
    /**
     * State of instance group. The following values are deprecated:
     * STARTING, TERMINATED, and FAILED.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupState
     */
    public InstanceGroupDetail withState(InstanceGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Details regarding the state of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Details regarding the state of the instance group.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * Details regarding the state of the instance group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lastStateChangeReason Details regarding the state of the instance group.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * Details regarding the state of the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lastStateChangeReason Details regarding the state of the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
        return this;
    }

    /**
     * The date/time the instance group was created.
     *
     * @return The date/time the instance group was created.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The date/time the instance group was created.
     *
     * @param creationDateTime The date/time the instance group was created.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The date/time the instance group was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The date/time the instance group was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The date/time the instance group was started.
     *
     * @return The date/time the instance group was started.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The date/time the instance group was started.
     *
     * @param startDateTime The date/time the instance group was started.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The date/time the instance group was started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The date/time the instance group was started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * The date/time the instance group was available to the cluster.
     *
     * @return The date/time the instance group was available to the cluster.
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }
    
    /**
     * The date/time the instance group was available to the cluster.
     *
     * @param readyDateTime The date/time the instance group was available to the cluster.
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }
    
    /**
     * The date/time the instance group was available to the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readyDateTime The date/time the instance group was available to the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * The date/time the instance group was terminated.
     *
     * @return The date/time the instance group was terminated.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date/time the instance group was terminated.
     *
     * @param endDateTime The date/time the instance group was terminated.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date/time the instance group was terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date/time the instance group was terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
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
        if (getInstanceGroupId() != null) sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMarket() != null) sb.append("Market: " + getMarket() + ",");
        if (getInstanceRole() != null) sb.append("InstanceRole: " + getInstanceRole() + ",");
        if (getBidPrice() != null) sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceRequestCount() != null) sb.append("InstanceRequestCount: " + getInstanceRequestCount() + ",");
        if (getInstanceRunningCount() != null) sb.append("InstanceRunningCount: " + getInstanceRunningCount() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getLastStateChangeReason() != null) sb.append("LastStateChangeReason: " + getLastStateChangeReason() + ",");
        if (getCreationDateTime() != null) sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null) sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getReadyDateTime() != null) sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null) sb.append("EndDateTime: " + getEndDateTime() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceGroupDetail == false) return false;
        InstanceGroupDetail other = (InstanceGroupDetail)obj;
        
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null) return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false) return false; 
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
        if (other.getInstanceRequestCount() == null ^ this.getInstanceRequestCount() == null) return false;
        if (other.getInstanceRequestCount() != null && other.getInstanceRequestCount().equals(this.getInstanceRequestCount()) == false) return false; 
        if (other.getInstanceRunningCount() == null ^ this.getInstanceRunningCount() == null) return false;
        if (other.getInstanceRunningCount() != null && other.getInstanceRunningCount().equals(this.getInstanceRunningCount()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null) return false;
        if (other.getLastStateChangeReason() != null && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false) return false; 
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null) return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false) return false; 
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null) return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false) return false; 
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null) return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false) return false; 
        return true;
    }
    
}
    