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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the configuration of a Spot fleet request.
 * </p>
 */
public class SpotFleetRequestConfigData implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     * duplicate listings. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The bid price per unit hour.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * </p>
     */
    private Integer targetCapacity;
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
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance requests are
     * placed or enabled to fulfill the request.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * </p>
     */
    private Boolean terminateInstancesWithExpiration;
    /**
     * <p>
     * Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     */
    private String iamFleetRole;
    /**
     * <p>
     * Information about the launch specifications for the Spot fleet request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification> launchSpecifications;
    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     */
    private String excessCapacityTerminationPolicy;
    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The number of units fulfilled by this request compared to the set target capacity.
     * </p>
     */
    private Double fulfilledCapacity;
    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     * duplicate listings. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *        duplicate listings. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     * duplicate listings. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *         duplicate listings. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     * duplicate listings. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid
     *        duplicate listings. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The bid price per unit hour.
     * </p>
     * 
     * @param spotPrice
     *        The bid price per unit hour.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The bid price per unit hour.
     * </p>
     * 
     * @return The bid price per unit hour.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The bid price per unit hour.
     * </p>
     * 
     * @param spotPrice
     *        The bid price per unit hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * </p>
     * 
     * @param targetCapacity
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     */

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * </p>
     * 
     * @return The number of units to request. You can choose to set the target capacity in terms of instances or a
     *         performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     */

    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * <p>
     * The number of units to request. You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * </p>
     * 
     * @param targetCapacity
     *        The number of units to request. You can choose to set the target capacity in terms of instances or a
     *        performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withTargetCapacity(Integer targetCapacity) {
        setTargetCapacity(targetCapacity);
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
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance requests are
     * placed or enabled to fulfill the request.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance
     *        requests are placed or enabled to fulfill the request.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance requests are
     * placed or enabled to fulfill the request.
     * </p>
     * 
     * @return The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance
     *         requests are placed or enabled to fulfill the request.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance requests are
     * placed or enabled to fulfill the request.
     * </p>
     * 
     * @param validUntil
     *        The end date and time of the request, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At this point, no new Spot instance
     *        requests are placed or enabled to fulfill the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     */

    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * </p>
     * 
     * @return Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     */

    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * </p>
     * 
     * @param terminateInstancesWithExpiration
     *        Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        setTerminateInstancesWithExpiration(terminateInstancesWithExpiration);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     * </p>
     * 
     * @return Indicates whether running Spot instances should be terminated when the Spot fleet request expires.
     */

    public Boolean isTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * <p>
     * Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @param iamFleetRole
     *        Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     *        request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     *        <code>terminateInstancesWithExpiration</code>.
     */

    public void setIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }

    /**
     * <p>
     * Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @return Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot
     *         fleet request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     *         <code>terminateInstancesWithExpiration</code>.
     */

    public String getIamFleetRole() {
        return this.iamFleetRole;
    }

    /**
     * <p>
     * Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     * request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     * <code>terminateInstancesWithExpiration</code>.
     * </p>
     * 
     * @param iamFleetRole
     *        Grants the Spot fleet permission to terminate Spot instances on your behalf when you cancel its Spot fleet
     *        request using <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires, if you set
     *        <code>terminateInstancesWithExpiration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withIamFleetRole(String iamFleetRole) {
        setIamFleetRole(iamFleetRole);
        return this;
    }

    /**
     * <p>
     * Information about the launch specifications for the Spot fleet request.
     * </p>
     * 
     * @return Information about the launch specifications for the Spot fleet request.
     */

    public java.util.List<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        if (launchSpecifications == null) {
            launchSpecifications = new com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>();
        }
        return launchSpecifications;
    }

    /**
     * <p>
     * Information about the launch specifications for the Spot fleet request.
     * </p>
     * 
     * @param launchSpecifications
     *        Information about the launch specifications for the Spot fleet request.
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
     * Information about the launch specifications for the Spot fleet request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchSpecifications(java.util.Collection)} or {@link #withLaunchSpecifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param launchSpecifications
     *        Information about the launch specifications for the Spot fleet request.
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
     * Information about the launch specifications for the Spot fleet request.
     * </p>
     * 
     * @param launchSpecifications
     *        Information about the launch specifications for the Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotFleetRequestConfigData withLaunchSpecifications(java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        setLaunchSpecifications(launchSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet
     *        request is decreased below the current size of the Spot fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     * 
     * @return Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet
     *         request is decreased below the current size of the Spot fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet
     *        request is decreased below the current size of the Spot fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet
     *        request is decreased below the current size of the Spot fleet.
     * @see ExcessCapacityTerminationPolicy
     */

    public void setExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet request is
     * decreased below the current size of the Spot fleet.
     * </p>
     * 
     * @param excessCapacityTerminationPolicy
     *        Indicates whether running Spot instances should be terminated if the target capacity of the Spot fleet
     *        request is decreased below the current size of the Spot fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcessCapacityTerminationPolicy
     */

    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        setExcessCapacityTerminationPolicy(excessCapacityTerminationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request.
     *        The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @return Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request.
     *         The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request.
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
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request.
     *        The default is <code>lowestPrice</code>.
     * @see AllocationStrategy
     */

    public void setAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot fleet request.
     *        The default is <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationStrategy
     */

    public SpotFleetRequestConfigData withAllocationStrategy(AllocationStrategy allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
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

    public SpotFleetRequestConfigData withFulfilledCapacity(Double fulfilledCapacity) {
        setFulfilledCapacity(fulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or
     *        also attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the
     *        fleet will only place the required bids. It will not attempt to replenish Spot instances if capacity is
     *        diminished, nor will it submit bids in alternative Spot pools if capacity is not available. When you want
     *        to <code>maintain</code> a certain target capacity, fleet will place the required bids to meet this target
     *        capacity. It will also automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * @see FleetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @return The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or
     *         also attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the
     *         fleet will only place the required bids. It will not attempt to replenish Spot instances if capacity is
     *         diminished, nor will it submit bids in alternative Spot pools if capacity is not available. When you want
     *         to <code>maintain</code> a certain target capacity, fleet will place the required bids to meet this
     *         target capacity. It will also automatically replenish any interrupted instances. Default:
     *         <code>maintain</code>.
     * @see FleetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or
     *        also attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the
     *        fleet will only place the required bids. It will not attempt to replenish Spot instances if capacity is
     *        diminished, nor will it submit bids in alternative Spot pools if capacity is not available. When you want
     *        to <code>maintain</code> a certain target capacity, fleet will place the required bids to meet this target
     *        capacity. It will also automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public SpotFleetRequestConfigData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or
     *        also attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the
     *        fleet will only place the required bids. It will not attempt to replenish Spot instances if capacity is
     *        diminished, nor will it submit bids in alternative Spot pools if capacity is not available. When you want
     *        to <code>maintain</code> a certain target capacity, fleet will place the required bids to meet this target
     *        capacity. It will also automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * @see FleetType
     */

    public void setType(FleetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or also
     * attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the fleet will only
     * place the required bids. It will not attempt to replenish Spot instances if capacity is diminished, nor will it
     * submit bids in alternative Spot pools if capacity is not available. When you want to <code>maintain</code> a
     * certain target capacity, fleet will place the required bids to meet this target capacity. It will also
     * automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * </p>
     * 
     * @param type
     *        The type of request. Indicates whether the fleet will only <code>request</code> the target capacity or
     *        also attempt to <code>maintain</code> it. When you <code>request</code> a certain target capacity, the
     *        fleet will only place the required bids. It will not attempt to replenish Spot instances if capacity is
     *        diminished, nor will it submit bids in alternative Spot pools if capacity is not available. When you want
     *        to <code>maintain</code> a certain target capacity, fleet will place the required bids to meet this target
     *        capacity. It will also automatically replenish any interrupted instances. Default: <code>maintain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public SpotFleetRequestConfigData withType(FleetType type) {
        setType(type);
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: " + getTargetCapacity() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getTerminateInstancesWithExpiration() != null)
            sb.append("TerminateInstancesWithExpiration: " + getTerminateInstancesWithExpiration() + ",");
        if (getIamFleetRole() != null)
            sb.append("IamFleetRole: " + getIamFleetRole() + ",");
        if (getLaunchSpecifications() != null)
            sb.append("LaunchSpecifications: " + getLaunchSpecifications() + ",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy() + ",");
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: " + getAllocationStrategy() + ",");
        if (getFulfilledCapacity() != null)
            sb.append("FulfilledCapacity: " + getFulfilledCapacity() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getTerminateInstancesWithExpiration() == null ^ this.getTerminateInstancesWithExpiration() == null)
            return false;
        if (other.getTerminateInstancesWithExpiration() != null
                && other.getTerminateInstancesWithExpiration().equals(this.getTerminateInstancesWithExpiration()) == false)
            return false;
        if (other.getIamFleetRole() == null ^ this.getIamFleetRole() == null)
            return false;
        if (other.getIamFleetRole() != null && other.getIamFleetRole().equals(this.getIamFleetRole()) == false)
            return false;
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null)
            return false;
        if (other.getLaunchSpecifications() != null && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getFulfilledCapacity() == null ^ this.getFulfilledCapacity() == null)
            return false;
        if (other.getFulfilledCapacity() != null && other.getFulfilledCapacity().equals(this.getFulfilledCapacity()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstancesWithExpiration() == null) ? 0 : getTerminateInstancesWithExpiration().hashCode());
        hashCode = prime * hashCode + ((getIamFleetRole() == null) ? 0 : getIamFleetRole().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getFulfilledCapacity() == null) ? 0 : getFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
