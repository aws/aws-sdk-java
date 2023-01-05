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

/**
 * <p>
 * Describes a Capacity Reservation Fleet that could not be cancelled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FailedCapacityReservationFleetCancellationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedCapacityReservationFleetCancellationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that could not be cancelled.
     * </p>
     */
    private String capacityReservationFleetId;
    /**
     * <p>
     * Information about the Capacity Reservation Fleet cancellation error.
     * </p>
     */
    private CancelCapacityReservationFleetError cancelCapacityReservationFleetError;

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that could not be cancelled.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet that could not be cancelled.
     */

    public void setCapacityReservationFleetId(String capacityReservationFleetId) {
        this.capacityReservationFleetId = capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that could not be cancelled.
     * </p>
     * 
     * @return The ID of the Capacity Reservation Fleet that could not be cancelled.
     */

    public String getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that could not be cancelled.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet that could not be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCapacityReservationFleetCancellationResult withCapacityReservationFleetId(String capacityReservationFleetId) {
        setCapacityReservationFleetId(capacityReservationFleetId);
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleet cancellation error.
     * </p>
     * 
     * @param cancelCapacityReservationFleetError
     *        Information about the Capacity Reservation Fleet cancellation error.
     */

    public void setCancelCapacityReservationFleetError(CancelCapacityReservationFleetError cancelCapacityReservationFleetError) {
        this.cancelCapacityReservationFleetError = cancelCapacityReservationFleetError;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleet cancellation error.
     * </p>
     * 
     * @return Information about the Capacity Reservation Fleet cancellation error.
     */

    public CancelCapacityReservationFleetError getCancelCapacityReservationFleetError() {
        return this.cancelCapacityReservationFleetError;
    }

    /**
     * <p>
     * Information about the Capacity Reservation Fleet cancellation error.
     * </p>
     * 
     * @param cancelCapacityReservationFleetError
     *        Information about the Capacity Reservation Fleet cancellation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCapacityReservationFleetCancellationResult withCancelCapacityReservationFleetError(
            CancelCapacityReservationFleetError cancelCapacityReservationFleetError) {
        setCancelCapacityReservationFleetError(cancelCapacityReservationFleetError);
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
        if (getCapacityReservationFleetId() != null)
            sb.append("CapacityReservationFleetId: ").append(getCapacityReservationFleetId()).append(",");
        if (getCancelCapacityReservationFleetError() != null)
            sb.append("CancelCapacityReservationFleetError: ").append(getCancelCapacityReservationFleetError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCapacityReservationFleetCancellationResult == false)
            return false;
        FailedCapacityReservationFleetCancellationResult other = (FailedCapacityReservationFleetCancellationResult) obj;
        if (other.getCapacityReservationFleetId() == null ^ this.getCapacityReservationFleetId() == null)
            return false;
        if (other.getCapacityReservationFleetId() != null && other.getCapacityReservationFleetId().equals(this.getCapacityReservationFleetId()) == false)
            return false;
        if (other.getCancelCapacityReservationFleetError() == null ^ this.getCancelCapacityReservationFleetError() == null)
            return false;
        if (other.getCancelCapacityReservationFleetError() != null
                && other.getCancelCapacityReservationFleetError().equals(this.getCancelCapacityReservationFleetError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationFleetId() == null) ? 0 : getCapacityReservationFleetId().hashCode());
        hashCode = prime * hashCode + ((getCancelCapacityReservationFleetError() == null) ? 0 : getCancelCapacityReservationFleetError().hashCode());
        return hashCode;
    }

    @Override
    public FailedCapacityReservationFleetCancellationResult clone() {
        try {
            return (FailedCapacityReservationFleetCancellationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
