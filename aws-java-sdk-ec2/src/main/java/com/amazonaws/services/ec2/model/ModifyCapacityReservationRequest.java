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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyCapacityReservationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCapacityReservationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyCapacityReservationRequest> {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;
    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String endDateType;

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

    public ModifyCapacityReservationRequest withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
        return this;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @return The number of instances for which to reserve capacity.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.</p>
     *        <p>
     *        The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     *        5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     *        5/31/2019.
     *        </p>
     *        <p>
     *        You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *        <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *         reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *         state changes to <code>expired</code> when it reaches its end date and time.</p>
     *         <p>
     *         The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     *         5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     *         5/31/2019.
     *         </p>
     *         <p>
     *         You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *         <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.</p>
     *        <p>
     *        The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     *        5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     *        5/31/2019.
     *        </p>
     *        <p>
     *        You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *        <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     *        </p>
     *        </li>
     * @see EndDateType
     */

    public void setEndDateType(String endDateType) {
        this.endDateType = endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *         following end types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *         provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *         must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     *         </p>
     *         </li>
     * @see EndDateType
     */

    public String getEndDateType() {
        return this.endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public ModifyCapacityReservationRequest withEndDateType(String endDateType) {
        setEndDateType(endDateType);
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public ModifyCapacityReservationRequest withEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyCapacityReservationRequest> getDryRunRequest() {
        Request<ModifyCapacityReservationRequest> request = new ModifyCapacityReservationRequestMarshaller().marshall(this);
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: ").append(getCapacityReservationId()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getEndDateType() != null)
            sb.append("EndDateType: ").append(getEndDateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCapacityReservationRequest == false)
            return false;
        ModifyCapacityReservationRequest other = (ModifyCapacityReservationRequest) obj;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getEndDateType() == null ^ this.getEndDateType() == null)
            return false;
        if (other.getEndDateType() != null && other.getEndDateType().equals(this.getEndDateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCapacityReservationRequest clone() {
        return (ModifyCapacityReservationRequest) super.clone();
    }
}
