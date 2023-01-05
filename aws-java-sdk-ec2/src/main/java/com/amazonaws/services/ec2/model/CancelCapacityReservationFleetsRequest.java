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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CancelCapacityReservationFleetsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelCapacityReservationFleetsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CancelCapacityReservationFleetsRequest> {

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to cancel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityReservationFleetIds;

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to cancel.
     * </p>
     * 
     * @return The IDs of the Capacity Reservation Fleets to cancel.
     */

    public java.util.List<String> getCapacityReservationFleetIds() {
        if (capacityReservationFleetIds == null) {
            capacityReservationFleetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityReservationFleetIds;
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to cancel.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to cancel.
     */

    public void setCapacityReservationFleetIds(java.util.Collection<String> capacityReservationFleetIds) {
        if (capacityReservationFleetIds == null) {
            this.capacityReservationFleetIds = null;
            return;
        }

        this.capacityReservationFleetIds = new com.amazonaws.internal.SdkInternalList<String>(capacityReservationFleetIds);
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to cancel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityReservationFleetIds(java.util.Collection)} or
     * {@link #withCapacityReservationFleetIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsRequest withCapacityReservationFleetIds(String... capacityReservationFleetIds) {
        if (this.capacityReservationFleetIds == null) {
            setCapacityReservationFleetIds(new com.amazonaws.internal.SdkInternalList<String>(capacityReservationFleetIds.length));
        }
        for (String ele : capacityReservationFleetIds) {
            this.capacityReservationFleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Capacity Reservation Fleets to cancel.
     * </p>
     * 
     * @param capacityReservationFleetIds
     *        The IDs of the Capacity Reservation Fleets to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCapacityReservationFleetsRequest withCapacityReservationFleetIds(java.util.Collection<String> capacityReservationFleetIds) {
        setCapacityReservationFleetIds(capacityReservationFleetIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelCapacityReservationFleetsRequest> getDryRunRequest() {
        Request<CancelCapacityReservationFleetsRequest> request = new CancelCapacityReservationFleetsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getCapacityReservationFleetIds() != null)
            sb.append("CapacityReservationFleetIds: ").append(getCapacityReservationFleetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelCapacityReservationFleetsRequest == false)
            return false;
        CancelCapacityReservationFleetsRequest other = (CancelCapacityReservationFleetsRequest) obj;
        if (other.getCapacityReservationFleetIds() == null ^ this.getCapacityReservationFleetIds() == null)
            return false;
        if (other.getCapacityReservationFleetIds() != null && other.getCapacityReservationFleetIds().equals(this.getCapacityReservationFleetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationFleetIds() == null) ? 0 : getCapacityReservationFleetIds().hashCode());
        return hashCode;
    }

    @Override
    public CancelCapacityReservationFleetsRequest clone() {
        return (CancelCapacityReservationFleetsRequest) super.clone();
    }
}
