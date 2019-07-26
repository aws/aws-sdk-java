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

    private String nextToken;

    private String capacityReservationId;

    private String instanceType;

    private Integer totalInstanceCount;

    private Integer availableInstanceCount;

    private String state;

    private com.amazonaws.internal.SdkInternalList<InstanceUsage> instanceUsages;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param capacityReservationId
     */

    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * @return
     */

    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * @param capacityReservationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
        return this;
    }

    /**
     * @param instanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * @return
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @param instanceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * @param totalInstanceCount
     */

    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * @return
     */

    public Integer getTotalInstanceCount() {
        return this.totalInstanceCount;
    }

    /**
     * @param totalInstanceCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withTotalInstanceCount(Integer totalInstanceCount) {
        setTotalInstanceCount(totalInstanceCount);
        return this;
    }

    /**
     * @param availableInstanceCount
     */

    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * @return
     */

    public Integer getAvailableInstanceCount() {
        return this.availableInstanceCount;
    }

    /**
     * @param availableInstanceCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityReservationUsageResult withAvailableInstanceCount(Integer availableInstanceCount) {
        setAvailableInstanceCount(availableInstanceCount);
        return this;
    }

    /**
     * @param state
     * @see CapacityReservationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see CapacityReservationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public GetCapacityReservationUsageResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public GetCapacityReservationUsageResult withState(CapacityReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<InstanceUsage> getInstanceUsages() {
        if (instanceUsages == null) {
            instanceUsages = new com.amazonaws.internal.SdkInternalList<InstanceUsage>();
        }
        return instanceUsages;
    }

    /**
     * @param instanceUsages
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceUsages(java.util.Collection)} or {@link #withInstanceUsages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceUsages
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
     * @param instanceUsages
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
