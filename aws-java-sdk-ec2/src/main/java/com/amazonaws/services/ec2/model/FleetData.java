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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an EC2 Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetData implements Serializable, Cloneable {

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests are
     * placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or greater than
     * its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the status
     * is <code>pending_termination</code> while instances are terminating.
     * </p>
     */
    private String activityStatus;
    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     */
    private String fleetState;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased
     * below the current size of the EC2 Fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity.
     * </p>
     */
    private Double fulfilledCapacity;
    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     */
    private Double fulfilledOnDemandCapacity;
    /**
     * <p>
     * The launch template and overrides.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfig> launchTemplateConfigs;
    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     */
    private TargetCapacitySpecification targetCapacitySpecification;
    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;
    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or also
     * attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places the
     * required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit
     * requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2
     * Fleet places the required requests to meet this target capacity. It also automatically replenishes any
     * interrupted Spot Instances. Default: <code>maintain</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     */
    private java.util.Date validFrom;
    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests are
     * placed or able to fulfill the request. The default end date is 7 days from the current date.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;
    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     */
    private SpotOptions spotOptions;
    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     */
    private OnDemandOptions onDemandOptions;
    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DescribeFleetError> errors;
    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DescribeFleetsInstances> instances;

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests are
     * placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or greater than
     * its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the status
     * is <code>pending_termination</code> while instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests
     *        are placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or
     *        greater than its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is
     *        decreased, the status is <code>pending_termination</code> while instances are terminating.
     * @see FleetActivityStatus
     */

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests are
     * placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or greater than
     * its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the status
     * is <code>pending_termination</code> while instances are terminating.
     * </p>
     * 
     * @return The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests
     *         are placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or
     *         greater than its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is
     *         decreased, the status is <code>pending_termination</code> while instances are terminating.
     * @see FleetActivityStatus
     */

    public String getActivityStatus() {
        return this.activityStatus;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests are
     * placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or greater than
     * its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the status
     * is <code>pending_termination</code> while instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests
     *        are placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or
     *        greater than its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is
     *        decreased, the status is <code>pending_termination</code> while instances are terminating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetActivityStatus
     */

    public FleetData withActivityStatus(String activityStatus) {
        setActivityStatus(activityStatus);
        return this;
    }

    /**
     * <p>
     * The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests are
     * placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or greater than
     * its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is decreased, the status
     * is <code>pending_termination</code> while instances are terminating.
     * </p>
     * 
     * @param activityStatus
     *        The progress of the EC2 Fleet. If there is an error, the status is <code>error</code>. After all requests
     *        are placed, the status is <code>pending_fulfillment</code>. If the size of the EC2 Fleet is equal to or
     *        greater than its target capacity, the status is <code>fulfilled</code>. If the size of the EC2 Fleet is
     *        decreased, the status is <code>pending_termination</code> while instances are terminating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetActivityStatus
     */

    public FleetData withActivityStatus(FleetActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     * 
     * @param createTime
     *        The creation date and time of the EC2 Fleet.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     * 
     * @return The creation date and time of the EC2 Fleet.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation date and time of the EC2 Fleet.
     * </p>
     * 
     * @param createTime
     *        The creation date and time of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @return The ID of the EC2 Fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * 
     * @param fleetState
     *        The state of the EC2 Fleet.
     * @see FleetStateCode
     */

    public void setFleetState(String fleetState) {
        this.fleetState = fleetState;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * 
     * @return The state of the EC2 Fleet.
     * @see FleetStateCode
     */

    public String getFleetState() {
        return this.fleetState;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * 
     * @param fleetState
     *        The state of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStateCode
     */

    public FleetData withFleetState(String fleetState) {
        setFleetState(fleetState);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 Fleet.
     * </p>
     * 
     * @param fleetState
     *        The state of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStateCode
     */

    public FleetData withFleetState(FleetStateCode fleetState) {
        this.fleetState = fleetState.toString();
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraints: Maximum 64 ASCII characters
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased
     * below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased
     * below the current size of the EC2 Fleet.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is
     *         decreased below the current size of the EC2 Fleet.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased
     * below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public FleetData withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased
     * below the current size of the EC2 Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is
     *        decreased below the current size of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */

    public FleetData withExcessCapacityTerminationPolicy(FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of units fulfilled by this request compared to the set target capacity.
     */

    public void setFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity.
     * </p>
     * 
     * @return The number of units fulfilled by this request compared to the set target capacity.
     */

    public Double getFulfilledCapacity() {
        return this.fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of units fulfilled by this request compared to the set target capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withFulfilledCapacity(Double fulfilledCapacity) {
        setFulfilledCapacity(fulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @param fulfilledOnDemandCapacity
     *        The number of units fulfilled by this request compared to the set target On-Demand capacity.
     */

    public void setFulfilledOnDemandCapacity(Double fulfilledOnDemandCapacity) {
        this.fulfilledOnDemandCapacity = fulfilledOnDemandCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @return The number of units fulfilled by this request compared to the set target On-Demand capacity.
     */

    public Double getFulfilledOnDemandCapacity() {
        return this.fulfilledOnDemandCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @param fulfilledOnDemandCapacity
     *        The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withFulfilledOnDemandCapacity(Double fulfilledOnDemandCapacity) {
        setFulfilledOnDemandCapacity(fulfilledOnDemandCapacity);
        return this;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * 
     * @return The launch template and overrides.
     */

    public java.util.List<FleetLaunchTemplateConfig> getLaunchTemplateConfigs() {
        if (launchTemplateConfigs == null) {
            launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfig>();
        }
        return launchTemplateConfigs;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The launch template and overrides.
     */

    public void setLaunchTemplateConfigs(java.util.Collection<FleetLaunchTemplateConfig> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfig>(launchTemplateConfigs);
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplateConfigs(java.util.Collection)} or
     * {@link #withLaunchTemplateConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The launch template and overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withLaunchTemplateConfigs(FleetLaunchTemplateConfig... launchTemplateConfigs) {
        if (this.launchTemplateConfigs == null) {
            setLaunchTemplateConfigs(new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfig>(launchTemplateConfigs.length));
        }
        for (FleetLaunchTemplateConfig ele : launchTemplateConfigs) {
            this.launchTemplateConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * 
     * @param launchTemplateConfigs
     *        The launch template and overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withLaunchTemplateConfigs(java.util.Collection<FleetLaunchTemplateConfig> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     *        If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     */

    public void setTargetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @return The number of units to request. You can choose to set the target capacity in terms of instances or a
     *         performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     *         If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *         later.
     */

    public TargetCapacitySpecification getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param targetCapacitySpecification
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     *        If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withTargetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
        setTargetCapacitySpecification(targetCapacitySpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        setTerminateInstancesWithExpiration(terminateInstancesWithExpiration);
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     * </p>
     * 
     * @return Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */

    public Boolean isTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or also
     * attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places the
     * required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit
     * requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2
     * Fleet places the required requests to meet this target capacity. It also automatically replenishes any
     * interrupted Spot Instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or
     *        also attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places
     *        the required requests; it does not attempt to replenish instances if capacity is diminished, and does not
     *        submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target
     *        capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically
     *        replenishes any interrupted Spot Instances. Default: <code>maintain</code>.
     * @see FleetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or also
     * attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places the
     * required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit
     * requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2
     * Fleet places the required requests to meet this target capacity. It also automatically replenishes any
     * interrupted Spot Instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @return The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or
     *         also attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only
     *         places the required requests; it does not attempt to replenish instances if capacity is diminished, and
     *         does not submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain
     *         target capacity, EC2 Fleet places the required requests to meet this target capacity. It also
     *         automatically replenishes any interrupted Spot Instances. Default: <code>maintain</code>.
     * @see FleetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or also
     * attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places the
     * required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit
     * requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2
     * Fleet places the required requests to meet this target capacity. It also automatically replenishes any
     * interrupted Spot Instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or
     *        also attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places
     *        the required requests; it does not attempt to replenish instances if capacity is diminished, and does not
     *        submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target
     *        capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically
     *        replenishes any interrupted Spot Instances. Default: <code>maintain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or also
     * attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places the
     * required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit
     * requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2
     * Fleet places the required requests to meet this target capacity. It also automatically replenishes any
     * interrupted Spot Instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the EC2 Fleet only <code>requests</code> the target capacity, or
     *        also attempts to <code>maintain</code> it. If you request a certain target capacity, EC2 Fleet only places
     *        the required requests; it does not attempt to replenish instances if capacity is diminished, and does not
     *        submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target
     *        capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically
     *        replenishes any interrupted Spot Instances. Default: <code>maintain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetData withType(FleetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @param validFrom
     *        The start date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *        request immediately.
     */

    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @return The start date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *         request immediately.
     */

    public java.util.Date getValidFrom() {
        return this.validFrom;
    }

    /**
     * <p>
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the request
     * immediately.
     * </p>
     * 
     * @param validFrom
     *        The start date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The default is to start fulfilling the
     *        request immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests are
     * placed or able to fulfill the request. The default end date is 7 days from the current date.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests
     *        are placed or able to fulfill the request. The default end date is 7 days from the current date.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests are
     * placed or able to fulfill the request. The default end date is 7 days from the current date.
     * </p>
     * 
     * @return The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests
     *         are placed or able to fulfill the request. The default end date is 7 days from the current date.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests are
     * placed or able to fulfill the request. The default end date is 7 days from the current date.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new instance requests
     *        are placed or able to fulfill the request. The default end date is 7 days from the current date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public Boolean getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether EC2 Fleet should replace unhealthy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        setReplaceUnhealthyInstances(replaceUnhealthyInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether EC2 Fleet should replace unhealthy instances.
     */

    public Boolean isReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @param spotOptions
     *        The configuration of Spot Instances in an EC2 Fleet.
     */

    public void setSpotOptions(SpotOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @return The configuration of Spot Instances in an EC2 Fleet.
     */

    public SpotOptions getSpotOptions() {
        return this.spotOptions;
    }

    /**
     * <p>
     * The configuration of Spot Instances in an EC2 Fleet.
     * </p>
     * 
     * @param spotOptions
     *        The configuration of Spot Instances in an EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withSpotOptions(SpotOptions spotOptions) {
        setSpotOptions(spotOptions);
        return this;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @param onDemandOptions
     *        The allocation strategy of On-Demand Instances in an EC2 Fleet.
     */

    public void setOnDemandOptions(OnDemandOptions onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @return The allocation strategy of On-Demand Instances in an EC2 Fleet.
     */

    public OnDemandOptions getOnDemandOptions() {
        return this.onDemandOptions;
    }

    /**
     * <p>
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * </p>
     * 
     * @param onDemandOptions
     *        The allocation strategy of On-Demand Instances in an EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withOnDemandOptions(OnDemandOptions onDemandOptions) {
        setOnDemandOptions(onDemandOptions);
        return this;
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     * 
     * @return The tags for an EC2 Fleet resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     * 
     * @param tags
     *        The tags for an EC2 Fleet resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for an EC2 Fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for an EC2 Fleet resource.
     * </p>
     * 
     * @param tags
     *        The tags for an EC2 Fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @return Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *         set to <code>instant</code>.
     */

    public java.util.List<DescribeFleetError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<DescribeFleetError>();
        }
        return errors;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     */

    public void setErrors(java.util.Collection<DescribeFleetError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<DescribeFleetError>(errors);
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withErrors(DescribeFleetError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<DescribeFleetError>(errors.length));
        }
        for (DescribeFleetError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withErrors(java.util.Collection<DescribeFleetError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @return Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *         <code>instant</code>.
     */

    public java.util.List<DescribeFleetsInstances> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<DescribeFleetsInstances>();
        }
        return instances;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     */

    public void setInstances(java.util.Collection<DescribeFleetsInstances> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<DescribeFleetsInstances>(instances);
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withInstances(DescribeFleetsInstances... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<DescribeFleetsInstances>(instances.length));
        }
        for (DescribeFleetsInstances ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetData withInstances(java.util.Collection<DescribeFleetsInstances> instances) {
        setInstances(instances);
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
        if (getActivityStatus() != null)
            sb.append("ActivityStatus: ").append(getActivityStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetState() != null)
            sb.append("FleetState: ").append(getFleetState()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: ").append(getExcessCapacityTerminationPolicy()).append(",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: ").append(getFulfilledCapacity()).append(",");
        if (getFulfilledOnDemandCapacity() != null)
            sb.append("FulfilledOnDemandCapacity: ").append(getFulfilledOnDemandCapacity()).append(",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: ").append(getLaunchTemplateConfigs()).append(",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: ").append(getTargetCapacitySpecification()).append(",");
        if (getTerminateInstancesWithExpiration() != null)
            sb.append("TerminateInstancesWithExpiration: ").append(getTerminateInstancesWithExpiration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: ").append(getValidFrom()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil()).append(",");
        if (getReplaceUnhealthyInstances() != null)
            sb.append("ReplaceUnhealthyInstances: ").append(getReplaceUnhealthyInstances()).append(",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: ").append(getSpotOptions()).append(",");
        if (getOnDemandOptions() != null)
            sb.append("OnDemandOptions: ").append(getOnDemandOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetData == false)
            return false;
        FleetData other = (FleetData) obj;
        if (other.getActivityStatus() == null ^ this.getActivityStatus() == null)
            return false;
        if (other.getActivityStatus() != null && other.getActivityStatus().equals(this.getActivityStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetState() == null ^ this.getFleetState() == null)
            return false;
        if (other.getFleetState() != null && other.getFleetState().equals(this.getFleetState()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getFulfilledCapacity() == null ^ this.getFulfilledCapacity() == null)
            return false;
        if (other.getFulfilledCapacity() != null && other.getFulfilledCapacity().equals(this.getFulfilledCapacity()) == false)
            return false;
        if (other.getFulfilledOnDemandCapacity() == null ^ this.getFulfilledOnDemandCapacity() == null)
            return false;
        if (other.getFulfilledOnDemandCapacity() != null && other.getFulfilledOnDemandCapacity().equals(this.getFulfilledOnDemandCapacity()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null && other.getTargetCapacitySpecification().equals(this.getTargetCapacitySpecification()) == false)
            return false;
        if (other.getTerminateInstancesWithExpiration() == null ^ this.getTerminateInstancesWithExpiration() == null)
            return false;
        if (other.getTerminateInstancesWithExpiration() != null
                && other.getTerminateInstancesWithExpiration().equals(this.getTerminateInstancesWithExpiration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getReplaceUnhealthyInstances() == null ^ this.getReplaceUnhealthyInstances() == null)
            return false;
        if (other.getReplaceUnhealthyInstances() != null && other.getReplaceUnhealthyInstances().equals(this.getReplaceUnhealthyInstances()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        if (other.getOnDemandOptions() == null ^ this.getOnDemandOptions() == null)
            return false;
        if (other.getOnDemandOptions() != null && other.getOnDemandOptions().equals(this.getOnDemandOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityStatus() == null) ? 0 : getActivityStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetState() == null) ? 0 : getFleetState().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getFulfilledOnDemandCapacity() == null) ? 0 : getFulfilledOnDemandCapacity().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacitySpecification() == null) ? 0 : getTargetCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstancesWithExpiration() == null) ? 0 : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getReplaceUnhealthyInstances() == null) ? 0 : getReplaceUnhealthyInstances().hashCode());
        hashCode = prime * hashCode + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        hashCode = prime * hashCode + ((getOnDemandOptions() == null) ? 0 : getOnDemandOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public FleetData clone() {
        try {
            return (FleetData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
