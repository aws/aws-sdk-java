/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkerScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID to update.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID to update.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The session actions associated with the worker schedule to update.
     * </p>
     */
    private java.util.Map<String, UpdatedSessionActionInfo> updatedSessionActions;
    /**
     * <p>
     * The worker ID to update.
     * </p>
     */
    private String workerId;

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @return The farm ID to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to update.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @return The fleet ID to update.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID to update.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to update.
     * </p>
     * 
     * @return The session actions associated with the worker schedule to update.
     */

    public java.util.Map<String, UpdatedSessionActionInfo> getUpdatedSessionActions() {
        return updatedSessionActions;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to update.
     * </p>
     * 
     * @param updatedSessionActions
     *        The session actions associated with the worker schedule to update.
     */

    public void setUpdatedSessionActions(java.util.Map<String, UpdatedSessionActionInfo> updatedSessionActions) {
        this.updatedSessionActions = updatedSessionActions;
    }

    /**
     * <p>
     * The session actions associated with the worker schedule to update.
     * </p>
     * 
     * @param updatedSessionActions
     *        The session actions associated with the worker schedule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest withUpdatedSessionActions(java.util.Map<String, UpdatedSessionActionInfo> updatedSessionActions) {
        setUpdatedSessionActions(updatedSessionActions);
        return this;
    }

    /**
     * Add a single UpdatedSessionActions entry
     *
     * @see UpdateWorkerScheduleRequest#withUpdatedSessionActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest addUpdatedSessionActionsEntry(String key, UpdatedSessionActionInfo value) {
        if (null == this.updatedSessionActions) {
            this.updatedSessionActions = new java.util.HashMap<String, UpdatedSessionActionInfo>();
        }
        if (this.updatedSessionActions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.updatedSessionActions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UpdatedSessionActions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest clearUpdatedSessionActionsEntries() {
        this.updatedSessionActions = null;
        return this;
    }

    /**
     * <p>
     * The worker ID to update.
     * </p>
     * 
     * @param workerId
     *        The worker ID to update.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The worker ID to update.
     * </p>
     * 
     * @return The worker ID to update.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The worker ID to update.
     * </p>
     * 
     * @param workerId
     *        The worker ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerScheduleRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getUpdatedSessionActions() != null)
            sb.append("UpdatedSessionActions: ").append(getUpdatedSessionActions()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkerScheduleRequest == false)
            return false;
        UpdateWorkerScheduleRequest other = (UpdateWorkerScheduleRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getUpdatedSessionActions() == null ^ this.getUpdatedSessionActions() == null)
            return false;
        if (other.getUpdatedSessionActions() != null && other.getUpdatedSessionActions().equals(this.getUpdatedSessionActions()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedSessionActions() == null) ? 0 : getUpdatedSessionActions().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkerScheduleRequest clone() {
        return (UpdateWorkerScheduleRequest) super.clone();
    }

}
