/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMinuteUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Estimated number of minutes remaining for an account, specific to the month being requested.
     * </p>
     */
    private Integer estimatedMinutesRemaining;
    /**
     * <p>
     * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month
     * being requested.
     * </p>
     */
    private Boolean isReservedMinutesCustomer;
    /**
     * <p>
     * Total number of reserved minutes allocated, specific to the month being requested.
     * </p>
     */
    private Integer totalReservedMinuteAllocation;
    /**
     * <p>
     * Total scheduled minutes for an account, specific to the month being requested.
     * </p>
     */
    private Integer totalScheduledMinutes;
    /**
     * <p>
     * Upcoming minutes scheduled for an account, specific to the month being requested.
     * </p>
     */
    private Integer upcomingMinutesScheduled;

    /**
     * <p>
     * Estimated number of minutes remaining for an account, specific to the month being requested.
     * </p>
     * 
     * @param estimatedMinutesRemaining
     *        Estimated number of minutes remaining for an account, specific to the month being requested.
     */

    public void setEstimatedMinutesRemaining(Integer estimatedMinutesRemaining) {
        this.estimatedMinutesRemaining = estimatedMinutesRemaining;
    }

    /**
     * <p>
     * Estimated number of minutes remaining for an account, specific to the month being requested.
     * </p>
     * 
     * @return Estimated number of minutes remaining for an account, specific to the month being requested.
     */

    public Integer getEstimatedMinutesRemaining() {
        return this.estimatedMinutesRemaining;
    }

    /**
     * <p>
     * Estimated number of minutes remaining for an account, specific to the month being requested.
     * </p>
     * 
     * @param estimatedMinutesRemaining
     *        Estimated number of minutes remaining for an account, specific to the month being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageResult withEstimatedMinutesRemaining(Integer estimatedMinutesRemaining) {
        setEstimatedMinutesRemaining(estimatedMinutesRemaining);
        return this;
    }

    /**
     * <p>
     * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month
     * being requested.
     * </p>
     * 
     * @param isReservedMinutesCustomer
     *        Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the
     *        month being requested.
     */

    public void setIsReservedMinutesCustomer(Boolean isReservedMinutesCustomer) {
        this.isReservedMinutesCustomer = isReservedMinutesCustomer;
    }

    /**
     * <p>
     * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month
     * being requested.
     * </p>
     * 
     * @return Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the
     *         month being requested.
     */

    public Boolean getIsReservedMinutesCustomer() {
        return this.isReservedMinutesCustomer;
    }

    /**
     * <p>
     * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month
     * being requested.
     * </p>
     * 
     * @param isReservedMinutesCustomer
     *        Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the
     *        month being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageResult withIsReservedMinutesCustomer(Boolean isReservedMinutesCustomer) {
        setIsReservedMinutesCustomer(isReservedMinutesCustomer);
        return this;
    }

    /**
     * <p>
     * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month
     * being requested.
     * </p>
     * 
     * @return Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the
     *         month being requested.
     */

    public Boolean isReservedMinutesCustomer() {
        return this.isReservedMinutesCustomer;
    }

    /**
     * <p>
     * Total number of reserved minutes allocated, specific to the month being requested.
     * </p>
     * 
     * @param totalReservedMinuteAllocation
     *        Total number of reserved minutes allocated, specific to the month being requested.
     */

    public void setTotalReservedMinuteAllocation(Integer totalReservedMinuteAllocation) {
        this.totalReservedMinuteAllocation = totalReservedMinuteAllocation;
    }

    /**
     * <p>
     * Total number of reserved minutes allocated, specific to the month being requested.
     * </p>
     * 
     * @return Total number of reserved minutes allocated, specific to the month being requested.
     */

    public Integer getTotalReservedMinuteAllocation() {
        return this.totalReservedMinuteAllocation;
    }

    /**
     * <p>
     * Total number of reserved minutes allocated, specific to the month being requested.
     * </p>
     * 
     * @param totalReservedMinuteAllocation
     *        Total number of reserved minutes allocated, specific to the month being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageResult withTotalReservedMinuteAllocation(Integer totalReservedMinuteAllocation) {
        setTotalReservedMinuteAllocation(totalReservedMinuteAllocation);
        return this;
    }

    /**
     * <p>
     * Total scheduled minutes for an account, specific to the month being requested.
     * </p>
     * 
     * @param totalScheduledMinutes
     *        Total scheduled minutes for an account, specific to the month being requested.
     */

    public void setTotalScheduledMinutes(Integer totalScheduledMinutes) {
        this.totalScheduledMinutes = totalScheduledMinutes;
    }

    /**
     * <p>
     * Total scheduled minutes for an account, specific to the month being requested.
     * </p>
     * 
     * @return Total scheduled minutes for an account, specific to the month being requested.
     */

    public Integer getTotalScheduledMinutes() {
        return this.totalScheduledMinutes;
    }

    /**
     * <p>
     * Total scheduled minutes for an account, specific to the month being requested.
     * </p>
     * 
     * @param totalScheduledMinutes
     *        Total scheduled minutes for an account, specific to the month being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageResult withTotalScheduledMinutes(Integer totalScheduledMinutes) {
        setTotalScheduledMinutes(totalScheduledMinutes);
        return this;
    }

    /**
     * <p>
     * Upcoming minutes scheduled for an account, specific to the month being requested.
     * </p>
     * 
     * @param upcomingMinutesScheduled
     *        Upcoming minutes scheduled for an account, specific to the month being requested.
     */

    public void setUpcomingMinutesScheduled(Integer upcomingMinutesScheduled) {
        this.upcomingMinutesScheduled = upcomingMinutesScheduled;
    }

    /**
     * <p>
     * Upcoming minutes scheduled for an account, specific to the month being requested.
     * </p>
     * 
     * @return Upcoming minutes scheduled for an account, specific to the month being requested.
     */

    public Integer getUpcomingMinutesScheduled() {
        return this.upcomingMinutesScheduled;
    }

    /**
     * <p>
     * Upcoming minutes scheduled for an account, specific to the month being requested.
     * </p>
     * 
     * @param upcomingMinutesScheduled
     *        Upcoming minutes scheduled for an account, specific to the month being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMinuteUsageResult withUpcomingMinutesScheduled(Integer upcomingMinutesScheduled) {
        setUpcomingMinutesScheduled(upcomingMinutesScheduled);
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
        if (getEstimatedMinutesRemaining() != null)
            sb.append("EstimatedMinutesRemaining: ").append(getEstimatedMinutesRemaining()).append(",");
        if (getIsReservedMinutesCustomer() != null)
            sb.append("IsReservedMinutesCustomer: ").append(getIsReservedMinutesCustomer()).append(",");
        if (getTotalReservedMinuteAllocation() != null)
            sb.append("TotalReservedMinuteAllocation: ").append(getTotalReservedMinuteAllocation()).append(",");
        if (getTotalScheduledMinutes() != null)
            sb.append("TotalScheduledMinutes: ").append(getTotalScheduledMinutes()).append(",");
        if (getUpcomingMinutesScheduled() != null)
            sb.append("UpcomingMinutesScheduled: ").append(getUpcomingMinutesScheduled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMinuteUsageResult == false)
            return false;
        GetMinuteUsageResult other = (GetMinuteUsageResult) obj;
        if (other.getEstimatedMinutesRemaining() == null ^ this.getEstimatedMinutesRemaining() == null)
            return false;
        if (other.getEstimatedMinutesRemaining() != null && other.getEstimatedMinutesRemaining().equals(this.getEstimatedMinutesRemaining()) == false)
            return false;
        if (other.getIsReservedMinutesCustomer() == null ^ this.getIsReservedMinutesCustomer() == null)
            return false;
        if (other.getIsReservedMinutesCustomer() != null && other.getIsReservedMinutesCustomer().equals(this.getIsReservedMinutesCustomer()) == false)
            return false;
        if (other.getTotalReservedMinuteAllocation() == null ^ this.getTotalReservedMinuteAllocation() == null)
            return false;
        if (other.getTotalReservedMinuteAllocation() != null
                && other.getTotalReservedMinuteAllocation().equals(this.getTotalReservedMinuteAllocation()) == false)
            return false;
        if (other.getTotalScheduledMinutes() == null ^ this.getTotalScheduledMinutes() == null)
            return false;
        if (other.getTotalScheduledMinutes() != null && other.getTotalScheduledMinutes().equals(this.getTotalScheduledMinutes()) == false)
            return false;
        if (other.getUpcomingMinutesScheduled() == null ^ this.getUpcomingMinutesScheduled() == null)
            return false;
        if (other.getUpcomingMinutesScheduled() != null && other.getUpcomingMinutesScheduled().equals(this.getUpcomingMinutesScheduled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedMinutesRemaining() == null) ? 0 : getEstimatedMinutesRemaining().hashCode());
        hashCode = prime * hashCode + ((getIsReservedMinutesCustomer() == null) ? 0 : getIsReservedMinutesCustomer().hashCode());
        hashCode = prime * hashCode + ((getTotalReservedMinuteAllocation() == null) ? 0 : getTotalReservedMinuteAllocation().hashCode());
        hashCode = prime * hashCode + ((getTotalScheduledMinutes() == null) ? 0 : getTotalScheduledMinutes().hashCode());
        hashCode = prime * hashCode + ((getUpcomingMinutesScheduled() == null) ? 0 : getUpcomingMinutesScheduled().hashCode());
        return hashCode;
    }

    @Override
    public GetMinuteUsageResult clone() {
        try {
            return (GetMinuteUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
