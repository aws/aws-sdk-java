/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the configuration of a Spot fleet request.
 * </p>
 */
public class SpotFleetRequestConfigData implements Serializable, Cloneable {

    /**
     * A unique, case-sensitive identifier you provide to ensure idempotency
     * of your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     */
    private String clientToken;

    /**
     * The bid price per unit hour.
     */
    private String spotPrice;

    /**
     * The number of units to request. You can choose to set the target
     * capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    private Integer targetCapacity;

    /**
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     */
    private java.util.Date validFrom;

    /**
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     * this point, no new Spot instance requests are placed or enabled to
     * fulfill the request.
     */
    private java.util.Date validUntil;

    /**
     * Indicates whether running Spot instances should be terminated when the
     * Spot fleet request expires.
     */
    private Boolean terminateInstancesWithExpiration;

    /**
     * Grants the Spot fleet permission to terminate Spot instances on your
     * behalf when you cancel its Spot fleet request using
     * <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     * if you set <code>terminateInstancesWithExpiration</code>.
     */
    private String iamFleetRole;

    /**
     * Information about the launch specifications for the Spot fleet
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification> launchSpecifications;

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     */
    private String excessCapacityTerminationPolicy;

    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     */
    private String allocationStrategy;

    /**
     * A unique, case-sensitive identifier you provide to ensure idempotency
     * of your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @return A unique, case-sensitive identifier you provide to ensure idempotency
     *         of your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * A unique, case-sensitive identifier you provide to ensure idempotency
     * of your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @param clientToken A unique, case-sensitive identifier you provide to ensure idempotency
     *         of your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * A unique, case-sensitive identifier you provide to ensure idempotency
     * of your listings. This helps avoid duplicate listings. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken A unique, case-sensitive identifier you provide to ensure idempotency
     *         of your listings. This helps avoid duplicate listings. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The bid price per unit hour.
     *
     * @return The bid price per unit hour.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * The bid price per unit hour.
     *
     * @param spotPrice The bid price per unit hour.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * The bid price per unit hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice The bid price per unit hour.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * The number of units to request. You can choose to set the target
     * capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     *
     * @return The number of units to request. You can choose to set the target
     *         capacity in terms of instances or a performance characteristic that is
     *         important to your application workload, such as vCPUs, memory, or I/O.
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }
    
    /**
     * The number of units to request. You can choose to set the target
     * capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     *
     * @param targetCapacity The number of units to request. You can choose to set the target
     *         capacity in terms of instances or a performance characteristic that is
     *         important to your application workload, such as vCPUs, memory, or I/O.
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }
    
    /**
     * The number of units to request. You can choose to set the target
     * capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetCapacity The number of units to request. You can choose to set the target
     *         capacity in terms of instances or a performance characteristic that is
     *         important to your application workload, such as vCPUs, memory, or I/O.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     *
     * @return The start date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     *         default is to start fulfilling the request immediately.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     *
     * @param validFrom The start date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     *         default is to start fulfilling the request immediately.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * The start date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     * default is to start fulfilling the request immediately.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom The start date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). The
     *         default is to start fulfilling the request immediately.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     * this point, no new Spot instance requests are placed or enabled to
     * fulfill the request.
     *
     * @return The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     *         this point, no new Spot instance requests are placed or enabled to
     *         fulfill the request.
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     * this point, no new Spot instance requests are placed or enabled to
     * fulfill the request.
     *
     * @param validUntil The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     *         this point, no new Spot instance requests are placed or enabled to
     *         fulfill the request.
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * The end date and time of the request, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     * this point, no new Spot instance requests are placed or enabled to
     * fulfill the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil The end date and time of the request, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). At
     *         this point, no new Spot instance requests are placed or enabled to
     *         fulfill the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated when the
     * Spot fleet request expires.
     *
     * @return Indicates whether running Spot instances should be terminated when the
     *         Spot fleet request expires.
     */
    public Boolean isTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated when the
     * Spot fleet request expires.
     *
     * @param terminateInstancesWithExpiration Indicates whether running Spot instances should be terminated when the
     *         Spot fleet request expires.
     */
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated when the
     * Spot fleet request expires.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminateInstancesWithExpiration Indicates whether running Spot instances should be terminated when the
     *         Spot fleet request expires.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated when the
     * Spot fleet request expires.
     *
     * @return Indicates whether running Spot instances should be terminated when the
     *         Spot fleet request expires.
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * Grants the Spot fleet permission to terminate Spot instances on your
     * behalf when you cancel its Spot fleet request using
     * <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     * if you set <code>terminateInstancesWithExpiration</code>.
     *
     * @return Grants the Spot fleet permission to terminate Spot instances on your
     *         behalf when you cancel its Spot fleet request using
     *         <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     *         if you set <code>terminateInstancesWithExpiration</code>.
     */
    public String getIamFleetRole() {
        return iamFleetRole;
    }
    
    /**
     * Grants the Spot fleet permission to terminate Spot instances on your
     * behalf when you cancel its Spot fleet request using
     * <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     * if you set <code>terminateInstancesWithExpiration</code>.
     *
     * @param iamFleetRole Grants the Spot fleet permission to terminate Spot instances on your
     *         behalf when you cancel its Spot fleet request using
     *         <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     *         if you set <code>terminateInstancesWithExpiration</code>.
     */
    public void setIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }
    
    /**
     * Grants the Spot fleet permission to terminate Spot instances on your
     * behalf when you cancel its Spot fleet request using
     * <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     * if you set <code>terminateInstancesWithExpiration</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamFleetRole Grants the Spot fleet permission to terminate Spot instances on your
     *         behalf when you cancel its Spot fleet request using
     *         <a>CancelSpotFleetRequests</a> or when the Spot fleet request expires,
     *         if you set <code>terminateInstancesWithExpiration</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withIamFleetRole(String iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
        return this;
    }

    /**
     * Information about the launch specifications for the Spot fleet
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Information about the launch specifications for the Spot fleet
     *         request.
     */
    public java.util.List<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        if (launchSpecifications == null) {
              launchSpecifications = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification>();
              launchSpecifications.setAutoConstruct(true);
        }
        return launchSpecifications;
    }
    
    /**
     * Information about the launch specifications for the Spot fleet
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param launchSpecifications Information about the launch specifications for the Spot fleet
     *         request.
     */
    public void setLaunchSpecifications(java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        if (launchSpecifications == null) {
            this.launchSpecifications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification> launchSpecificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification>(launchSpecifications.size());
        launchSpecificationsCopy.addAll(launchSpecifications);
        this.launchSpecifications = launchSpecificationsCopy;
    }
    
    /**
     * Information about the launch specifications for the Spot fleet
     * request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLaunchSpecifications(java.util.Collection)} or
     * {@link #withLaunchSpecifications(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param launchSpecifications Information about the launch specifications for the Spot fleet
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withLaunchSpecifications(SpotFleetLaunchSpecification... launchSpecifications) {
        if (getLaunchSpecifications() == null) setLaunchSpecifications(new java.util.ArrayList<SpotFleetLaunchSpecification>(launchSpecifications.length));
        for (SpotFleetLaunchSpecification value : launchSpecifications) {
            getLaunchSpecifications().add(value);
        }
        return this;
    }
    
    /**
     * Information about the launch specifications for the Spot fleet
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param launchSpecifications Information about the launch specifications for the Spot fleet
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SpotFleetRequestConfigData withLaunchSpecifications(java.util.Collection<SpotFleetLaunchSpecification> launchSpecifications) {
        if (launchSpecifications == null) {
            this.launchSpecifications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification> launchSpecificationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SpotFleetLaunchSpecification>(launchSpecifications.size());
            launchSpecificationsCopy.addAll(launchSpecifications);
            this.launchSpecifications = launchSpecificationsCopy;
        }

        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @return Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     *
     * @return Indicates how to allocate the target capacity across the Spot pools
     *         specified by the Spot fleet request. The default is
     *         <code>lowestPrice</code>.
     *
     * @see AllocationStrategy
     */
    public String getAllocationStrategy() {
        return allocationStrategy;
    }
    
    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     *
     * @param allocationStrategy Indicates how to allocate the target capacity across the Spot pools
     *         specified by the Spot fleet request. The default is
     *         <code>lowestPrice</code>.
     *
     * @see AllocationStrategy
     */
    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }
    
    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     *
     * @param allocationStrategy Indicates how to allocate the target capacity across the Spot pools
     *         specified by the Spot fleet request. The default is
     *         <code>lowestPrice</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AllocationStrategy
     */
    public SpotFleetRequestConfigData withAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     *
     * @param allocationStrategy Indicates how to allocate the target capacity across the Spot pools
     *         specified by the Spot fleet request. The default is
     *         <code>lowestPrice</code>.
     *
     * @see AllocationStrategy
     */
    public void setAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }
    
    /**
     * Indicates how to allocate the target capacity across the Spot pools
     * specified by the Spot fleet request. The default is
     * <code>lowestPrice</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowestPrice, diversified
     *
     * @param allocationStrategy Indicates how to allocate the target capacity across the Spot pools
     *         specified by the Spot fleet request. The default is
     *         <code>lowestPrice</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AllocationStrategy
     */
    public SpotFleetRequestConfigData withAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
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
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getTargetCapacity() != null) sb.append("TargetCapacity: " + getTargetCapacity() + ",");
        if (getValidFrom() != null) sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null) sb.append("ValidUntil: " + getValidUntil() + ",");
        if (isTerminateInstancesWithExpiration() != null) sb.append("TerminateInstancesWithExpiration: " + isTerminateInstancesWithExpiration() + ",");
        if (getIamFleetRole() != null) sb.append("IamFleetRole: " + getIamFleetRole() + ",");
        if (getLaunchSpecifications() != null) sb.append("LaunchSpecifications: " + getLaunchSpecifications() + ",");
        if (getExcessCapacityTerminationPolicy() != null) sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy() + ",");
        if (getAllocationStrategy() != null) sb.append("AllocationStrategy: " + getAllocationStrategy() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isTerminateInstancesWithExpiration() == null) ? 0 : isTerminateInstancesWithExpiration().hashCode()); 
        hashCode = prime * hashCode + ((getIamFleetRole() == null) ? 0 : getIamFleetRole().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode()); 
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotFleetRequestConfigData == false) return false;
        SpotFleetRequestConfigData other = (SpotFleetRequestConfigData)obj;
        
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null) return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false) return false; 
        if (other.getValidFrom() == null ^ this.getValidFrom() == null) return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false) return false; 
        if (other.getValidUntil() == null ^ this.getValidUntil() == null) return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false) return false; 
        if (other.isTerminateInstancesWithExpiration() == null ^ this.isTerminateInstancesWithExpiration() == null) return false;
        if (other.isTerminateInstancesWithExpiration() != null && other.isTerminateInstancesWithExpiration().equals(this.isTerminateInstancesWithExpiration()) == false) return false; 
        if (other.getIamFleetRole() == null ^ this.getIamFleetRole() == null) return false;
        if (other.getIamFleetRole() != null && other.getIamFleetRole().equals(this.getIamFleetRole()) == false) return false; 
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null) return false;
        if (other.getLaunchSpecifications() != null && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false) return false; 
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null) return false;
        if (other.getExcessCapacityTerminationPolicy() != null && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false) return false; 
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null) return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false) return false; 
        return true;
    }
    
    @Override
    public SpotFleetRequestConfigData clone() {
        try {
            return (SpotFleetRequestConfigData) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    