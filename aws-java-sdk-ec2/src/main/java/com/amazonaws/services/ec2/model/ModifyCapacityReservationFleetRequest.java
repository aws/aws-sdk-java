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
import com.amazonaws.services.ec2.model.transform.ModifyCapacityReservationFleetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCapacityReservationFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyCapacityReservationFleetRequest> {

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet to modify.
     * </p>
     */
    private String capacityReservationFleetId;
    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Integer totalTargetCapacity;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * <p>
     * You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the
     * Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the
     * <b>CancelCapacityReservationFleet</b> action.
     * </p>
     * <p>
     * You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * </p>
     */
    private Boolean removeEndDate;

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet to modify.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet to modify.
     */

    public void setCapacityReservationFleetId(String capacityReservationFleetId) {
        this.capacityReservationFleetId = capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet to modify.
     * </p>
     * 
     * @return The ID of the Capacity Reservation Fleet to modify.
     */

    public String getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet to modify.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationFleetRequest withCapacityReservationFleetId(String capacityReservationFleetId) {
        setCapacityReservationFleetId(capacityReservationFleetId);
        return this;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *        with the instance type weights that you assign to each instance type used by the Fleet determine the
     *        number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *        for your workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     */

    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *         with the instance type weights that you assign to each instance type used by the Fleet determine the
     *         number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *         for your workload. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *         target capacity</a> in the Amazon EC2 User Guide.
     */

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *        with the instance type weights that you assign to each instance type used by the Fleet determine the
     *        number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *        for your workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationFleetRequest withTotalTargetCapacity(Integer totalTargetCapacity) {
        setTotalTargetCapacity(totalTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * <p>
     * You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *        expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *        expire.</p>
     *        <p>
     *        The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *        specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *        expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     *        </p>
     *        <p>
     *        You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * <p>
     * You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *         expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *         expire.</p>
     *         <p>
     *         The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *         specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *         expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     *         </p>
     *         <p>
     *         You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * <p>
     * You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *        expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *        expire.</p>
     *        <p>
     *        The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *        specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *        expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     *        </p>
     *        <p>
     *        You can't specify <b>EndDate</b> and <b> RemoveEndDate</b> in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationFleetRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the
     * Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the
     * <b>CancelCapacityReservationFleet</b> action.
     * </p>
     * <p>
     * You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * </p>
     * 
     * @param removeEndDate
     *        Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date,
     *        the Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using
     *        the <b>CancelCapacityReservationFleet</b> action.</p>
     *        <p>
     *        You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     */

    public void setRemoveEndDate(Boolean removeEndDate) {
        this.removeEndDate = removeEndDate;
    }

    /**
     * <p>
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the
     * Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the
     * <b>CancelCapacityReservationFleet</b> action.
     * </p>
     * <p>
     * You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * </p>
     * 
     * @return Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date,
     *         the Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using
     *         the <b>CancelCapacityReservationFleet</b> action.</p>
     *         <p>
     *         You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     */

    public Boolean getRemoveEndDate() {
        return this.removeEndDate;
    }

    /**
     * <p>
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the
     * Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the
     * <b>CancelCapacityReservationFleet</b> action.
     * </p>
     * <p>
     * You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * </p>
     * 
     * @param removeEndDate
     *        Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date,
     *        the Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using
     *        the <b>CancelCapacityReservationFleet</b> action.</p>
     *        <p>
     *        You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCapacityReservationFleetRequest withRemoveEndDate(Boolean removeEndDate) {
        setRemoveEndDate(removeEndDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date, the
     * Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using the
     * <b>CancelCapacityReservationFleet</b> action.
     * </p>
     * <p>
     * You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     * </p>
     * 
     * @return Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the end date,
     *         the Capacity Reservation Fleet does not expire and it remains active until you explicitly cancel it using
     *         the <b>CancelCapacityReservationFleet</b> action.</p>
     *         <p>
     *         You can't specify <b>RemoveEndDate</b> and <b> EndDate</b> in the same request.
     */

    public Boolean isRemoveEndDate() {
        return this.removeEndDate;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyCapacityReservationFleetRequest> getDryRunRequest() {
        Request<ModifyCapacityReservationFleetRequest> request = new ModifyCapacityReservationFleetRequestMarshaller().marshall(this);
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
        if (getCapacityReservationFleetId() != null)
            sb.append("CapacityReservationFleetId: ").append(getCapacityReservationFleetId()).append(",");
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: ").append(getTotalTargetCapacity()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getRemoveEndDate() != null)
            sb.append("RemoveEndDate: ").append(getRemoveEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCapacityReservationFleetRequest == false)
            return false;
        ModifyCapacityReservationFleetRequest other = (ModifyCapacityReservationFleetRequest) obj;
        if (other.getCapacityReservationFleetId() == null ^ this.getCapacityReservationFleetId() == null)
            return false;
        if (other.getCapacityReservationFleetId() != null && other.getCapacityReservationFleetId().equals(this.getCapacityReservationFleetId()) == false)
            return false;
        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getRemoveEndDate() == null ^ this.getRemoveEndDate() == null)
            return false;
        if (other.getRemoveEndDate() != null && other.getRemoveEndDate().equals(this.getRemoveEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationFleetId() == null) ? 0 : getCapacityReservationFleetId().hashCode());
        hashCode = prime * hashCode + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getRemoveEndDate() == null) ? 0 : getRemoveEndDate().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCapacityReservationFleetRequest clone() {
        return (ModifyCapacityReservationFleetRequest) super.clone();
    }
}
