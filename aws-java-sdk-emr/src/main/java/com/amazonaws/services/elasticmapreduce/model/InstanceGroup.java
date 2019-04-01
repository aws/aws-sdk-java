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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This entity represents an instance group, which is a group of instances that have common purpose. For example, CORE
 * instance group is used for HDFS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the instance group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     */
    private String market;
    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     */
    private String instanceGroupType;
    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     */
    private Integer requestedInstanceCount;
    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     */
    private Integer runningInstanceCount;
    /**
     * <p>
     * The current status of the instance group.
     * </p>
     */
    private InstanceGroupStatus status;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * The version number of the requested configuration specification for this instance group.
     * </p>
     */
    private Long configurationsVersion;
    /**
     * <p>
     * A list of configurations that were successfully applied for an instance group last time.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> lastSuccessfullyAppliedConfigurations;
    /**
     * <p>
     * The version number of a configuration specification that was successfully applied for an instance group last
     * time.
     * </p>
     */
    private Long lastSuccessfullyAppliedConfigurationsVersion;
    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EbsBlockDevice> ebsBlockDevices;
    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack
     * and provides additional, dedicated capacity for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     */
    private ShrinkPolicy shrinkPolicy;
    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     */
    private AutoScalingPolicyDescription autoScalingPolicy;

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @param id
     *        The identifier of the instance group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @return The identifier of the instance group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @param id
     *        The identifier of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @param name
     *        The name of the instance group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @return The name of the instance group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @param name
     *        The name of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     * 
     * @return The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroup withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        withMarket(market);
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroup withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or TASK.
     * @see InstanceGroupType
     */

    public void setInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @return The type of the instance group. Valid values are MASTER, CORE or TASK.
     * @see InstanceGroupType
     */

    public String getInstanceGroupType() {
        return this.instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupType
     */

    public InstanceGroup withInstanceGroupType(String instanceGroupType) {
        setInstanceGroupType(instanceGroupType);
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or TASK.
     * @see InstanceGroupType
     */

    public void setInstanceGroupType(InstanceGroupType instanceGroupType) {
        withInstanceGroupType(instanceGroupType);
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupType
     */

    public InstanceGroup withInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @param bidPrice
     *        The maximum Spot price your are willing to pay for EC2 instances.</p>
     *        <p>
     *        An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *        specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *        <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @return The maximum Spot price your are willing to pay for EC2 instances.</p>
     *         <p>
     *         An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *         specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *         <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @param bidPrice
     *        The maximum Spot price your are willing to pay for EC2 instances.</p>
     *        <p>
     *        An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *        specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *        <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @return The EC2 instance type for all instances in the instance group.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @param requestedInstanceCount
     *        The target number of instances for the instance group.
     */

    public void setRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @return The target number of instances for the instance group.
     */

    public Integer getRequestedInstanceCount() {
        return this.requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @param requestedInstanceCount
     *        The target number of instances for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withRequestedInstanceCount(Integer requestedInstanceCount) {
        setRequestedInstanceCount(requestedInstanceCount);
        return this;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @param runningInstanceCount
     *        The number of instances currently running in this instance group.
     */

    public void setRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @return The number of instances currently running in this instance group.
     */

    public Integer getRunningInstanceCount() {
        return this.runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @param runningInstanceCount
     *        The number of instances currently running in this instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withRunningInstanceCount(Integer runningInstanceCount) {
        setRunningInstanceCount(runningInstanceCount);
        return this;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @param status
     *        The current status of the instance group.
     */

    public void setStatus(InstanceGroupStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @return The current status of the instance group.
     */

    public InstanceGroupStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @param status
     *        The current status of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withStatus(InstanceGroupStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *         configuration for each instance group (master, core, and task).
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this instance group.
     * </p>
     * 
     * @param configurationsVersion
     *        The version number of the requested configuration specification for this instance group.
     */

    public void setConfigurationsVersion(Long configurationsVersion) {
        this.configurationsVersion = configurationsVersion;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this instance group.
     * </p>
     * 
     * @return The version number of the requested configuration specification for this instance group.
     */

    public Long getConfigurationsVersion() {
        return this.configurationsVersion;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this instance group.
     * </p>
     * 
     * @param configurationsVersion
     *        The version number of the requested configuration specification for this instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withConfigurationsVersion(Long configurationsVersion) {
        setConfigurationsVersion(configurationsVersion);
        return this;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance group last time.
     * </p>
     * 
     * @return A list of configurations that were successfully applied for an instance group last time.
     */

    public java.util.List<Configuration> getLastSuccessfullyAppliedConfigurations() {
        if (lastSuccessfullyAppliedConfigurations == null) {
            lastSuccessfullyAppliedConfigurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return lastSuccessfullyAppliedConfigurations;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance group last time.
     * </p>
     * 
     * @param lastSuccessfullyAppliedConfigurations
     *        A list of configurations that were successfully applied for an instance group last time.
     */

    public void setLastSuccessfullyAppliedConfigurations(java.util.Collection<Configuration> lastSuccessfullyAppliedConfigurations) {
        if (lastSuccessfullyAppliedConfigurations == null) {
            this.lastSuccessfullyAppliedConfigurations = null;
            return;
        }

        this.lastSuccessfullyAppliedConfigurations = new com.amazonaws.internal.SdkInternalList<Configuration>(lastSuccessfullyAppliedConfigurations);
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance group last time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastSuccessfullyAppliedConfigurations(java.util.Collection)} or
     * {@link #withLastSuccessfullyAppliedConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param lastSuccessfullyAppliedConfigurations
     *        A list of configurations that were successfully applied for an instance group last time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withLastSuccessfullyAppliedConfigurations(Configuration... lastSuccessfullyAppliedConfigurations) {
        if (this.lastSuccessfullyAppliedConfigurations == null) {
            setLastSuccessfullyAppliedConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(lastSuccessfullyAppliedConfigurations.length));
        }
        for (Configuration ele : lastSuccessfullyAppliedConfigurations) {
            this.lastSuccessfullyAppliedConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance group last time.
     * </p>
     * 
     * @param lastSuccessfullyAppliedConfigurations
     *        A list of configurations that were successfully applied for an instance group last time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withLastSuccessfullyAppliedConfigurations(java.util.Collection<Configuration> lastSuccessfullyAppliedConfigurations) {
        setLastSuccessfullyAppliedConfigurations(lastSuccessfullyAppliedConfigurations);
        return this;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully applied for an instance group last
     * time.
     * </p>
     * 
     * @param lastSuccessfullyAppliedConfigurationsVersion
     *        The version number of a configuration specification that was successfully applied for an instance group
     *        last time.
     */

    public void setLastSuccessfullyAppliedConfigurationsVersion(Long lastSuccessfullyAppliedConfigurationsVersion) {
        this.lastSuccessfullyAppliedConfigurationsVersion = lastSuccessfullyAppliedConfigurationsVersion;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully applied for an instance group last
     * time.
     * </p>
     * 
     * @return The version number of a configuration specification that was successfully applied for an instance group
     *         last time.
     */

    public Long getLastSuccessfullyAppliedConfigurationsVersion() {
        return this.lastSuccessfullyAppliedConfigurationsVersion;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully applied for an instance group last
     * time.
     * </p>
     * 
     * @param lastSuccessfullyAppliedConfigurationsVersion
     *        The version number of a configuration specification that was successfully applied for an instance group
     *        last time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withLastSuccessfullyAppliedConfigurationsVersion(Long lastSuccessfullyAppliedConfigurationsVersion) {
        setLastSuccessfullyAppliedConfigurationsVersion(lastSuccessfullyAppliedConfigurationsVersion);
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @return The EBS block devices that are mapped to this instance group.
     */

    public java.util.List<EbsBlockDevice> getEbsBlockDevices() {
        if (ebsBlockDevices == null) {
            ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>();
        }
        return ebsBlockDevices;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     */

    public void setEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        if (ebsBlockDevices == null) {
            this.ebsBlockDevices = null;
            return;
        }

        this.ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(ebsBlockDevices);
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsBlockDevices(java.util.Collection)} or {@link #withEbsBlockDevices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withEbsBlockDevices(EbsBlockDevice... ebsBlockDevices) {
        if (this.ebsBlockDevices == null) {
            setEbsBlockDevices(new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(ebsBlockDevices.length));
        }
        for (EbsBlockDevice ele : ebsBlockDevices) {
            this.ebsBlockDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        setEbsBlockDevices(ebsBlockDevices);
        return this;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack
     * and provides additional, dedicated capacity for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration
     *        stack and provides additional, dedicated capacity for Amazon EBS I/O.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack
     * and provides additional, dedicated capacity for Amazon EBS I/O.
     * </p>
     * 
     * @return If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration
     *         stack and provides additional, dedicated capacity for Amazon EBS I/O.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack
     * and provides additional, dedicated capacity for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration
     *        stack and provides additional, dedicated capacity for Amazon EBS I/O.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack
     * and provides additional, dedicated capacity for Amazon EBS I/O.
     * </p>
     * 
     * @return If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration
     *         stack and provides additional, dedicated capacity for Amazon EBS I/O.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @param shrinkPolicy
     *        Policy for customizing shrink operations.
     */

    public void setShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @return Policy for customizing shrink operations.
     */

    public ShrinkPolicy getShrinkPolicy() {
        return this.shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * 
     * @param shrinkPolicy
     *        Policy for customizing shrink operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        setShrinkPolicy(shrinkPolicy);
        return this;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     * 
     * @param autoScalingPolicy
     *        An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     *        automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in
     *        response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     */

    public void setAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     * 
     * @return An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster.
     *         The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     *         in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     */

    public AutoScalingPolicyDescription getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     * 
     * @param autoScalingPolicy
     *        An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     *        automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in
     *        response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
        setAutoScalingPolicy(autoScalingPolicy);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMarket() != null)
            sb.append("Market: ").append(getMarket()).append(",");
        if (getInstanceGroupType() != null)
            sb.append("InstanceGroupType: ").append(getInstanceGroupType()).append(",");
        if (getBidPrice() != null)
            sb.append("BidPrice: ").append(getBidPrice()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getRequestedInstanceCount() != null)
            sb.append("RequestedInstanceCount: ").append(getRequestedInstanceCount()).append(",");
        if (getRunningInstanceCount() != null)
            sb.append("RunningInstanceCount: ").append(getRunningInstanceCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getConfigurationsVersion() != null)
            sb.append("ConfigurationsVersion: ").append(getConfigurationsVersion()).append(",");
        if (getLastSuccessfullyAppliedConfigurations() != null)
            sb.append("LastSuccessfullyAppliedConfigurations: ").append(getLastSuccessfullyAppliedConfigurations()).append(",");
        if (getLastSuccessfullyAppliedConfigurationsVersion() != null)
            sb.append("LastSuccessfullyAppliedConfigurationsVersion: ").append(getLastSuccessfullyAppliedConfigurationsVersion()).append(",");
        if (getEbsBlockDevices() != null)
            sb.append("EbsBlockDevices: ").append(getEbsBlockDevices()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getShrinkPolicy() != null)
            sb.append("ShrinkPolicy: ").append(getShrinkPolicy()).append(",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: ").append(getAutoScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroup == false)
            return false;
        InstanceGroup other = (InstanceGroup) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceGroupType() == null ^ this.getInstanceGroupType() == null)
            return false;
        if (other.getInstanceGroupType() != null && other.getInstanceGroupType().equals(this.getInstanceGroupType()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRequestedInstanceCount() == null ^ this.getRequestedInstanceCount() == null)
            return false;
        if (other.getRequestedInstanceCount() != null && other.getRequestedInstanceCount().equals(this.getRequestedInstanceCount()) == false)
            return false;
        if (other.getRunningInstanceCount() == null ^ this.getRunningInstanceCount() == null)
            return false;
        if (other.getRunningInstanceCount() != null && other.getRunningInstanceCount().equals(this.getRunningInstanceCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getConfigurationsVersion() == null ^ this.getConfigurationsVersion() == null)
            return false;
        if (other.getConfigurationsVersion() != null && other.getConfigurationsVersion().equals(this.getConfigurationsVersion()) == false)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurations() == null ^ this.getLastSuccessfullyAppliedConfigurations() == null)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurations() != null
                && other.getLastSuccessfullyAppliedConfigurations().equals(this.getLastSuccessfullyAppliedConfigurations()) == false)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurationsVersion() == null ^ this.getLastSuccessfullyAppliedConfigurationsVersion() == null)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurationsVersion() != null
                && other.getLastSuccessfullyAppliedConfigurationsVersion().equals(this.getLastSuccessfullyAppliedConfigurationsVersion()) == false)
            return false;
        if (other.getEbsBlockDevices() == null ^ this.getEbsBlockDevices() == null)
            return false;
        if (other.getEbsBlockDevices() != null && other.getEbsBlockDevices().equals(this.getEbsBlockDevices()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getShrinkPolicy() == null ^ this.getShrinkPolicy() == null)
            return false;
        if (other.getShrinkPolicy() != null && other.getShrinkPolicy().equals(this.getShrinkPolicy()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getConfigurationsVersion() == null) ? 0 : getConfigurationsVersion().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfullyAppliedConfigurations() == null) ? 0 : getLastSuccessfullyAppliedConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getLastSuccessfullyAppliedConfigurationsVersion() == null) ? 0 : getLastSuccessfullyAppliedConfigurationsVersion().hashCode());
        hashCode = prime * hashCode + ((getEbsBlockDevices() == null) ? 0 : getEbsBlockDevices().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getShrinkPolicy() == null) ? 0 : getShrinkPolicy().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingPolicy() == null) ? 0 : getAutoScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroup clone() {
        try {
            return (InstanceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
