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
 * Describes the configuration of a Spot Fleet request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotFleetRequestConfigData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetRequestConfigData implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     */
    private String onDemandAllocationStrategy;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to
     * avoid duplicate listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
     * </p>
     */
    private Double fulfilledCapacity;
    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     */
    private Double onDemandFulfilledCapacity;
    /**
     * <p>
     * Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     */
    private String iamFleetRole;
    /**
     * <p>
     * The launch specifications for the Spot Fleet request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification> launchSpecifications;
    /**
     * <p>
     * The launch template and overrides.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig> launchTemplateConfigs;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     * price.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     */
    private Integer targetCapacity;
    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a
     * performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     */
    private Integer onDemandTargetCapacity;
    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;
    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
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
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance requests are
     * placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel
     * it.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     */
    private Boolean replaceUnhealthyInstances;
    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     */
    private String instanceInterruptionBehavior;
    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers
     * the running Spot Instances with the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1,
     * CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     */
    private LoadBalancersConfig loadBalancersConfig;
    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     */
    private Integer instancePoolsToUseCount;

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @return Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *         The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationStrategy
     */

    public SpotFleetRequestConfigData withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public void setAllocationStrategy(AllocationStrategy allocationStrategy) {
        withAllocationStrategy(allocationStrategy);
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationStrategy
     */

    public SpotFleetRequestConfigData withAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet
     *        launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet
     *        defaults to <code>lowestPrice</code>.
     * @see OnDemandAllocationStrategy
     */

    public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * 
     * @return The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *         <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first.
     *         If you specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet
     *         launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet
     *         defaults to <code>lowestPrice</code>.
     * @see OnDemandAllocationStrategy
     */

    public String getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet
     *        launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet
     *        defaults to <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandAllocationStrategy
     */

    public SpotFleetRequestConfigData withOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
        setOnDemandAllocationStrategy(onDemandAllocationStrategy);
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet
     *        launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet
     *        defaults to <code>lowestPrice</code>.
     * @see OnDemandAllocationStrategy
     */

    public void setOnDemandAllocationStrategy(OnDemandAllocationStrategy onDemandAllocationStrategy) {
        withOnDemandAllocationStrategy(onDemandAllocationStrategy);
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet launch template
     * override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to
     * <code>lowestPrice</code>.
     * </p>
     * 
     * @param onDemandAllocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowestPrice</code>, Spot Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, Spot Fleet uses the priority that you assign to each Spot Fleet
     *        launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet
     *        defaults to <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandAllocationStrategy
     */

    public SpotFleetRequestConfigData withOnDemandAllocationStrategy(OnDemandAllocationStrategy onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to
     * avoid duplicate listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This
     *        helps to avoid duplicate listings. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to
     * avoid duplicate listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This
     *         helps to avoid duplicate listings. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to
     * avoid duplicate listings. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This
     *        helps to avoid duplicate listings. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @return Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *         request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        withExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is
     * decreased below the current size of the Spot Fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet
     *        request is decreased below the current size of the Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of units fulfilled by this request compared to the set target capacity. You cannot set this
     *        value.
     */

    public void setFulfilledCapacity(Double fulfilledCapacity) {
        this.fulfilledCapacity = fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
     * </p>
     * 
     * @return The number of units fulfilled by this request compared to the set target capacity. You cannot set this
     *         value.
     */

    public Double getFulfilledCapacity() {
        return this.fulfilledCapacity;
    }

    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
     * </p>
     * 
     * @param fulfilledCapacity
     *        The number of units fulfilled by this request compared to the set target capacity. You cannot set this
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withFulfilledCapacity(Double fulfilledCapacity) {
        setFulfilledCapacity(fulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @param onDemandFulfilledCapacity
     *        The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     */

    public void setOnDemandFulfilledCapacity(Double onDemandFulfilledCapacity) {
        this.onDemandFulfilledCapacity = onDemandFulfilledCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @return The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     */

    public Double getOnDemandFulfilledCapacity() {
        return this.onDemandFulfilledCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     * </p>
     * 
     * @param onDemandFulfilledCapacity
     *        The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withOnDemandFulfilledCapacity(Double onDemandFulfilledCapacity) {
        setOnDemandFulfilledCapacity(onDemandFulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @param iamFleetRole
     *        Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     *        request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     *        <code>terminateInstancesWithExpiration</code>.
     */

    public void setIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }

    /**
     * <p>
     * Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @return Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot
     *         Fleet request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     *         <code>terminateInstancesWithExpiration</code>.
     */

    public String getIamFleetRole() {
        return this.iamFleetRole;
    }

    /**
     * <p>
     * Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @param iamFleetRole
     *        Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet
     *        request using <a>CancelSpotFleetRequests</a> or when the Spot Fleet request expires, if you set
     *        <code>terminateInstancesWithExpiration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withIamFleetRole(String iamFleetRole) {
        setIamFleetRole(iamFleetRole);
        return this;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request.
     * </p>
     * 
     * @return The launch specifications for the Spot Fleet request.
     */

    public java.util.List<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        if (launchSpecifications == null) {
            launchSpecifications = new com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>();
        }
        return launchSpecifications;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request.
     * </p>
     * 
     * @param launchSpecifications
     *        The launch specifications for the Spot Fleet request.
     */

    public void setLaunchSpecifications(java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        if (launchSpecifications == null) {
            this.launchSpecifications = null;
            return;
        }

        this.launchSpecifications = new com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>(launchSpecifications);
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchSpecifications(java.util.Collection)} or {@link #withLaunchSpecifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param launchSpecifications
     *        The launch specifications for the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withLaunchSpecifications(SpotFleetLaunchSpecification... launchSpecifications) {
        if (this.launchSpecifications == null) {
            setLaunchSpecifications(new com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>(launchSpecifications.length));
        }
        for (SpotFleetLaunchSpecification ele : launchSpecifications) {
            this.launchSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch specifications for the Spot Fleet request.
     * </p>
     * 
     * @param launchSpecifications
     *        The launch specifications for the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withLaunchSpecifications(java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        setLaunchSpecifications(launchSpecifications);
        return this;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * 
     * @return The launch template and overrides.
     */

    public java.util.List<LaunchTemplateConfig> getLaunchTemplateConfigs() {
        if (launchTemplateConfigs == null) {
            launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>();
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

    public void setLaunchTemplateConfigs(java.util.Collection<LaunchTemplateConfig> launchTemplateConfigs) {
        if (launchTemplateConfigs == null) {
            this.launchTemplateConfigs = null;
            return;
        }

        this.launchTemplateConfigs = new com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>(launchTemplateConfigs);
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

    public SpotFleetRequestConfigData withLaunchTemplateConfigs(LaunchTemplateConfig... launchTemplateConfigs) {
        if (this.launchTemplateConfigs == null) {
            setLaunchTemplateConfigs(new com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>(launchTemplateConfigs.length));
        }
        for (LaunchTemplateConfig ele : launchTemplateConfigs) {
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

    public SpotFleetRequestConfigData withLaunchTemplateConfigs(java.util.Collection<LaunchTemplateConfig> launchTemplateConfigs) {
        setLaunchTemplateConfigs(launchTemplateConfigs);
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     * price.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the
     *        On-Demand price.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     * price.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the
     *         On-Demand price.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand
     * price.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the
     *        On-Demand price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param targetCapacity
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     *        If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     */

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
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

    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
     * is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param targetCapacity
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     *        If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withTargetCapacity(Integer targetCapacity) {
        setTargetCapacity(targetCapacity);
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a
     * performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param onDemandTargetCapacity
     *        The number of On-Demand units to request. You can choose to set the target capacity in terms of instances
     *        or a performance characteristic that is important to your application workload, such as vCPUs, memory, or
     *        I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     */

    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a
     * performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @return The number of On-Demand units to request. You can choose to set the target capacity in terms of instances
     *         or a performance characteristic that is important to your application workload, such as vCPUs, memory, or
     *         I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add
     *         capacity later.
     */

    public Integer getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a
     * performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the
     * request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
     * </p>
     * 
     * @param onDemandTargetCapacity
     *        The number of On-Demand units to request. You can choose to set the target capacity in terms of instances
     *        or a performance characteristic that is important to your application workload, such as vCPUs, memory, or
     *        I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity
     *        later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        setOnDemandTargetCapacity(onDemandTargetCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     */

    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * </p>
     * 
     * @return Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     */

    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        setTerminateInstancesWithExpiration(terminateInstancesWithExpiration);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     * </p>
     * 
     * @return Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
     */

    public Boolean isTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts
     *        to maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests.
     *        It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in
     *        alternative Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot
     *        Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and
     *        automatically replenishes any interrupted instances. Default: <code>maintain</code>. <code>instant</code>
     *        is listed but is not used by Spot Fleet.
     * @see FleetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
     * </p>
     * 
     * @return The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts
     *         to maintain it. When this value is <code>request</code>, the Spot Fleet only places the required
     *         requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit
     *         requests in alternative Spot pools if capacity is not available. When this value is <code>maintain</code>
     *         , the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet
     *         capacity and automatically replenishes any interrupted instances. Default: <code>maintain</code>.
     *         <code>instant</code> is listed but is not used by Spot Fleet.
     * @see FleetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts
     *        to maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests.
     *        It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in
     *        alternative Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot
     *        Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and
     *        automatically replenishes any interrupted instances. Default: <code>maintain</code>. <code>instant</code>
     *        is listed but is not used by Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public SpotFleetRequestConfigData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts
     *        to maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests.
     *        It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in
     *        alternative Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot
     *        Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and
     *        automatically replenishes any interrupted instances. Default: <code>maintain</code>. <code>instant</code>
     *        is listed but is not used by Spot Fleet.
     * @see FleetType
     */

    public void setType(FleetType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests. It does
     * not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative
     * Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot Fleet maintains the
     * target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any
     * interrupted instances. Default: <code>maintain</code>. <code>instant</code> is listed but is not used by Spot
     * Fleet.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts
     *        to maintain it. When this value is <code>request</code>, the Spot Fleet only places the required requests.
     *        It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in
     *        alternative Spot pools if capacity is not available. When this value is <code>maintain</code>, the Spot
     *        Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and
     *        automatically replenishes any interrupted instances. Default: <code>maintain</code>. <code>instant</code>
     *        is listed but is not used by Spot Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public SpotFleetRequestConfigData withType(FleetType type) {
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

    public SpotFleetRequestConfigData withValidFrom(java.util.Date validFrom) {
        setValidFrom(validFrom);
        return this;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance requests are
     * placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel
     * it.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance
     *        requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request
     *        remains until you cancel it.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance requests are
     * placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel
     * it.
     * </p>
     * 
     * @return The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance
     *         requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request
     *         remains until you cancel it.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance requests are
     * placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel
     * it.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot Instance
     *        requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request
     *        remains until you cancel it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether Spot Fleet should replace unhealthy instances.
     */

    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether Spot Fleet should replace unhealthy instances.
     */

    public Boolean getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     * 
     * @param replaceUnhealthyInstances
     *        Indicates whether Spot Fleet should replace unhealthy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        setReplaceUnhealthyInstances(replaceUnhealthyInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether Spot Fleet should replace unhealthy instances.
     * </p>
     * 
     * @return Indicates whether Spot Fleet should replace unhealthy instances.
     */

    public Boolean isReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @return The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public String getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public SpotFleetRequestConfigData withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        setInstanceInterruptionBehavior(instanceInterruptionBehavior);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see InstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(InstanceInterruptionBehavior instanceInterruptionBehavior) {
        withInstanceInterruptionBehavior(instanceInterruptionBehavior);
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInterruptionBehavior
     */

    public SpotFleetRequestConfigData withInstanceInterruptionBehavior(InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers
     * the running Spot Instances with the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1,
     * CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     * 
     * @param loadBalancersConfig
     *        One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet
     *        registers the running Spot Instances with the specified Classic Load Balancers and target groups.</p>
     *        <p>
     *        With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types:
     *        C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     */

    public void setLoadBalancersConfig(LoadBalancersConfig loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers
     * the running Spot Instances with the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1,
     * CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     * 
     * @return One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet
     *         registers the running Spot Instances with the specified Classic Load Balancers and target groups.</p>
     *         <p>
     *         With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types:
     *         C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     */

    public LoadBalancersConfig getLoadBalancersConfig() {
        return this.loadBalancersConfig;
    }

    /**
     * <p>
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers
     * the running Spot Instances with the specified Classic Load Balancers and target groups.
     * </p>
     * <p>
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1,
     * CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     * </p>
     * 
     * @param loadBalancersConfig
     *        One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet
     *        registers the running Spot Instances with the specified Classic Load Balancers and target groups.</p>
     *        <p>
     *        With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types:
     *        C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withLoadBalancersConfig(LoadBalancersConfig loadBalancersConfig) {
        setLoadBalancersConfig(loadBalancersConfig);
        return this;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @param instancePoolsToUseCount
     *        The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *        <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools
     *        and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     */

    public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @return The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *         <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools
     *         and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     */

    public Integer getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @param instancePoolsToUseCount
     *        The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *        <b>AllocationStrategy</b> is set to <code>lowest-price</code>. Spot Fleet selects the cheapest Spot pools
     *        and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        setInstancePoolsToUseCount(instancePoolsToUseCount);
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getOnDemandAllocationStrategy() != null)
            sb.append("OnDemandAllocationStrategy: ").append(getOnDemandAllocationStrategy()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: ").append(getExcessCapacityTerminationPolicy()).append(",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: ").append(getFulfilledCapacity()).append(",");
        if (getOnDemandFulfilledCapacity() != null)
            sb.append("OnDemandFulfilledCapacity: ").append(getOnDemandFulfilledCapacity()).append(",");
        if (getIamFleetRole() != null)
            sb.append("IamFleetRole: ").append(getIamFleetRole()).append(",");
        if (getLaunchSpecifications() != null)
            sb.append("LaunchSpecifications: ").append(getLaunchSpecifications()).append(",");
        if (getLaunchTemplateConfigs() != null)
            sb.append("LaunchTemplateConfigs: ").append(getLaunchTemplateConfigs()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: ").append(getTargetCapacity()).append(",");
        if (getOnDemandTargetCapacity() != null)
            sb.append("OnDemandTargetCapacity: ").append(getOnDemandTargetCapacity()).append(",");
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
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: ").append(getInstanceInterruptionBehavior()).append(",");
        if (getLoadBalancersConfig() != null)
            sb.append("LoadBalancersConfig: ").append(getLoadBalancersConfig()).append(",");
        if (getInstancePoolsToUseCount() != null)
            sb.append("InstancePoolsToUseCount: ").append(getInstancePoolsToUseCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotFleetRequestConfigData == false)
            return false;
        SpotFleetRequestConfigData other = (SpotFleetRequestConfigData) obj;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getOnDemandAllocationStrategy() == null ^ this.getOnDemandAllocationStrategy() == null)
            return false;
        if (other.getOnDemandAllocationStrategy() != null && other.getOnDemandAllocationStrategy().equals(this.getOnDemandAllocationStrategy()) == false)
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
        if (other.getOnDemandFulfilledCapacity() == null ^ this.getOnDemandFulfilledCapacity() == null)
            return false;
        if (other.getOnDemandFulfilledCapacity() != null && other.getOnDemandFulfilledCapacity().equals(this.getOnDemandFulfilledCapacity()) == false)
            return false;
        if (other.getIamFleetRole() == null ^ this.getIamFleetRole() == null)
            return false;
        if (other.getIamFleetRole() != null && other.getIamFleetRole().equals(this.getIamFleetRole()) == false)
            return false;
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null)
            return false;
        if (other.getLaunchSpecifications() != null && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false)
            return false;
        if (other.getLaunchTemplateConfigs() == null ^ this.getLaunchTemplateConfigs() == null)
            return false;
        if (other.getLaunchTemplateConfigs() != null && other.getLaunchTemplateConfigs().equals(this.getLaunchTemplateConfigs()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getOnDemandTargetCapacity() == null ^ this.getOnDemandTargetCapacity() == null)
            return false;
        if (other.getOnDemandTargetCapacity() != null && other.getOnDemandTargetCapacity().equals(this.getOnDemandTargetCapacity()) == false)
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
        if (other.getInstanceInterruptionBehavior() == null ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null && other.getInstanceInterruptionBehavior().equals(this.getInstanceInterruptionBehavior()) == false)
            return false;
        if (other.getLoadBalancersConfig() == null ^ this.getLoadBalancersConfig() == null)
            return false;
        if (other.getLoadBalancersConfig() != null && other.getLoadBalancersConfig().equals(this.getLoadBalancersConfig()) == false)
            return false;
        if (other.getInstancePoolsToUseCount() == null ^ this.getInstancePoolsToUseCount() == null)
            return false;
        if (other.getInstancePoolsToUseCount() != null && other.getInstancePoolsToUseCount().equals(this.getInstancePoolsToUseCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getOnDemandAllocationStrategy() == null) ? 0 : getOnDemandAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getOnDemandFulfilledCapacity() == null) ? 0 : getOnDemandFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getIamFleetRole() == null) ? 0 : getIamFleetRole().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateConfigs() == null) ? 0 : getLaunchTemplateConfigs().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getOnDemandTargetCapacity() == null) ? 0 : getOnDemandTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstancesWithExpiration() == null) ? 0 : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getReplaceUnhealthyInstances() == null) ? 0 : getReplaceUnhealthyInstances().hashCode());
        hashCode = prime * hashCode + ((getInstanceInterruptionBehavior() == null) ? 0 : getInstanceInterruptionBehavior().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancersConfig() == null) ? 0 : getLoadBalancersConfig().hashCode());
        hashCode = prime * hashCode + ((getInstancePoolsToUseCount() == null) ? 0 : getInstancePoolsToUseCount().hashCode());
        return hashCode;
    }

    @Override
    public SpotFleetRequestConfigData clone() {
        try {
            return (SpotFleetRequestConfigData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
