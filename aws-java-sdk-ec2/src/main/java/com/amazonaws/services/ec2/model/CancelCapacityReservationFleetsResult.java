/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class CancelCapacityReservationFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityReservationFleetCancellationState> successfulFleetCancellations;
    /**
     * <p>
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedCapacityReservationFleetCancellationResult> failedFleetCancellations;

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     * </p>
     * 
     * @return Information about the Capacity Reservation Fleets that were successfully cancelled.
     */

    public java.util.List<CapacityReservationFleetCancellationState> getSuccessfulFleetCancellations() {
        if (successfulFleetCancellations == null) {
            successfulFleetCancellations = new com.amazonaws.internal.SdkInternalList<CapacityReservationFleetCancellationState>();
        }
        return successfulFleetCancellations;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     * </p>
     * 
     * @param successfulFleetCancellations
     *        Information about the Capacity Reservation Fleets that were successfully cancelled.
     */

    public void setSuccessfulFleetCancellations(java.util.Collection<CapacityReservationFleetCancellationState> successfulFleetCancellations) {
        if (successfulFleetCancellations == null) {
            this.successfulFleetCancellations = null;
            return;
        }

        this.successfulFleetCancellations = new com.amazonaws.internal.SdkInternalList<CapacityReservationFleetCancellationState>(successfulFleetCancellations);
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulFleetCancellations(java.util.Collection)} or
     * {@link #withSuccessfulFleetCancellations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulFleetCancellations
     *        Information about the Capacity Reservation Fleets that were successfully cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsResult withSuccessfulFleetCancellations(CapacityReservationFleetCancellationState... successfulFleetCancellations) {
        if (this.successfulFleetCancellations == null) {
            setSuccessfulFleetCancellations(new com.amazonaws.internal.SdkInternalList<CapacityReservationFleetCancellationState>(
                    successfulFleetCancellations.length));
        }
        for (CapacityReservationFleetCancellationState ele : successfulFleetCancellations) {
            this.successfulFleetCancellations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     * </p>
     * 
     * @param successfulFleetCancellations
     *        Information about the Capacity Reservation Fleets that were successfully cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsResult withSuccessfulFleetCancellations(
            java.util.Collection<CapacityReservationFleetCancellationState> successfulFleetCancellations) {
        setSuccessfulFleetCancellations(successfulFleetCancellations);
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     * </p>
     * 
     * @return Information about the Capacity Reservation Fleets that could not be cancelled.
     */

    public java.util.List<FailedCapacityReservationFleetCancellationResult> getFailedFleetCancellations() {
        if (failedFleetCancellations == null) {
            failedFleetCancellations = new com.amazonaws.internal.SdkInternalList<FailedCapacityReservationFleetCancellationResult>();
        }
        return failedFleetCancellations;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     * </p>
     * 
     * @param failedFleetCancellations
     *        Information about the Capacity Reservation Fleets that could not be cancelled.
     */

    public void setFailedFleetCancellations(java.util.Collection<FailedCapacityReservationFleetCancellationResult> failedFleetCancellations) {
        if (failedFleetCancellations == null) {
            this.failedFleetCancellations = null;
            return;
        }

        this.failedFleetCancellations = new com.amazonaws.internal.SdkInternalList<FailedCapacityReservationFleetCancellationResult>(failedFleetCancellations);
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedFleetCancellations(java.util.Collection)} or
     * {@link #withFailedFleetCancellations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedFleetCancellations
     *        Information about the Capacity Reservation Fleets that could not be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsResult withFailedFleetCancellations(FailedCapacityReservationFleetCancellationResult... failedFleetCancellations) {
        if (this.failedFleetCancellations == null) {
            setFailedFleetCancellations(new com.amazonaws.internal.SdkInternalList<FailedCapacityReservationFleetCancellationResult>(
                    failedFleetCancellations.length));
        }
        for (FailedCapacityReservationFleetCancellationResult ele : failedFleetCancellations) {
            this.failedFleetCancellations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     * </p>
     * 
     * @param failedFleetCancellations
     *        Information about the Capacity Reservation Fleets that could not be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsResult withFailedFleetCancellations(
            java.util.Collection<FailedCapacityReservationFleetCancellationResult> failedFleetCancellations) {
        setFailedFleetCancellations(failedFleetCancellations);
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
        if (getSuccessfulFleetCancellations() != null)
            sb.append("SuccessfulFleetCancellations: ").append(getSuccessfulFleetCancellations()).append(",");
        if (getFailedFleetCancellations() != null)
            sb.append("FailedFleetCancellations: ").append(getFailedFleetCancellations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelCapacityReservationFleetsResult == false)
            return false;
        CancelCapacityReservationFleetsResult other = (CancelCapacityReservationFleetsResult) obj;
        if (other.getSuccessfulFleetCancellations() == null ^ this.getSuccessfulFleetCancellations() == null)
            return false;
        if (other.getSuccessfulFleetCancellations() != null && other.getSuccessfulFleetCancellations().equals(this.getSuccessfulFleetCancellations()) == false)
            return false;
        if (other.getFailedFleetCancellations() == null ^ this.getFailedFleetCancellations() == null)
            return false;
        if (other.getFailedFleetCancellations() != null && other.getFailedFleetCancellations().equals(this.getFailedFleetCancellations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulFleetCancellations() == null) ? 0 : getSuccessfulFleetCancellations().hashCode());
        hashCode = prime * hashCode + ((getFailedFleetCancellations() == null) ? 0 : getFailedFleetCancellations().hashCode());
        return hashCode;
    }

    @Override
    public CancelCapacityReservationFleetsResult clone() {
        try {
            return (CancelCapacityReservationFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
