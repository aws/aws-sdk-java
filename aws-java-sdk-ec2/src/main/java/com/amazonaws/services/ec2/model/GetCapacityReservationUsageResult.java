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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCapacityReservationUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;
    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private Integer totalInstanceCount;
    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     */
    private Integer availableInstanceCount;
    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceUsage> instanceUsages;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
        return this;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Reservation reserves capacity.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The type of instance for which the Capacity Reservation reserves capacity.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The number of instances for which the Capacity Reservation reserves capacity.
     */

    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The number of instances for which the Capacity Reservation reserves capacity.
     */

    public Integer getTotalInstanceCount() {
        return this.totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The number of instances for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withTotalInstanceCount(Integer totalInstanceCount) {
        setTotalInstanceCount(totalInstanceCount);
        return this;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @param availableInstanceCount
     *        The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *        Reservation.
     */

    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @return The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *         Reservation.
     */

    public Integer getAvailableInstanceCount() {
        return this.availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @param availableInstanceCount
     *        The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *        Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withAvailableInstanceCount(Integer availableInstanceCount) {
        setAvailableInstanceCount(availableInstanceCount);
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no
     *        longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @see CapacityReservationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *         states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *         your request. The reserved capacity is no longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no
     *         longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *         still pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *         request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *         60 minutes.
     *         </p>
     *         </li>
     * @see CapacityReservationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no
     *        longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public GetCapacityReservationUsageResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no
     *        longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public GetCapacityReservationUsageResult withState(CapacityReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * 
     * @return Information about the Capacity Reservation usage.
     */

    public java.util.List<InstanceUsage> getInstanceUsages() {
        if (instanceUsages == null) {
            instanceUsages = new com.amazonaws.internal.SdkInternalList<InstanceUsage>();
        }
        return instanceUsages;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * 
     * @param instanceUsages
     *        Information about the Capacity Reservation usage.
     */

    public void setInstanceUsages(java.util.Collection<InstanceUsage> instanceUsages) {
        if (instanceUsages == null) {
            this.instanceUsages = null;
            return;
        }

        this.instanceUsages = new com.amazonaws.internal.SdkInternalList<InstanceUsage>(instanceUsages);
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceUsages(java.util.Collection)} or {@link #withInstanceUsages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceUsages
     *        Information about the Capacity Reservation usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withInstanceUsages(InstanceUsage... instanceUsages) {
        if (this.instanceUsages == null) {
            setInstanceUsages(new com.amazonaws.internal.SdkInternalList<InstanceUsage>(instanceUsages.length));
        }
        for (InstanceUsage ele : instanceUsages) {
            this.instanceUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation usage.
     * </p>
     * 
     * @param instanceUsages
     *        Information about the Capacity Reservation usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withInstanceUsages(java.util.Collection<InstanceUsage> instanceUsages) {
        setInstanceUsages(instanceUsages);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: ").append(getCapacityReservationId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getTotalInstanceCount() != null)
            sb.append("TotalInstanceCount: ").append(getTotalInstanceCount()).append(",");
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: ").append(getAvailableInstanceCount()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getInstanceUsages() != null)
            sb.append("InstanceUsages: ").append(getInstanceUsages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCapacityReservationUsageResult == false)
            return false;
        GetCapacityReservationUsageResult other = (GetCapacityReservationUsageResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getTotalInstanceCount() == null ^ this.getTotalInstanceCount() == null)
            return false;
        if (other.getTotalInstanceCount() != null && other.getTotalInstanceCount().equals(this.getTotalInstanceCount()) == false)
            return false;
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null)
            return false;
        if (other.getAvailableInstanceCount() != null && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getInstanceUsages() == null ^ this.getInstanceUsages() == null)
            return false;
        if (other.getInstanceUsages() != null && other.getInstanceUsages().equals(this.getInstanceUsages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getTotalInstanceCount() == null) ? 0 : getTotalInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getInstanceUsages() == null) ? 0 : getInstanceUsages().hashCode());
        return hashCode;
    }

    @Override
    public GetCapacityReservationUsageResult clone() {
        try {
            return (GetCapacityReservationUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
