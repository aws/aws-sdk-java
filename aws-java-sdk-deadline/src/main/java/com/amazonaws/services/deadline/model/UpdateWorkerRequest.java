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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The worker capabilities to update.
     * </p>
     */
    private WorkerCapabilities capabilities;
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
     * The host properties to update.
     * </p>
     */
    private HostPropertiesRequest hostProperties;
    /**
     * <p>
     * The worker status to update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The worker ID to update.
     * </p>
     */
    private String workerId;

    /**
     * <p>
     * The worker capabilities to update.
     * </p>
     * 
     * @param capabilities
     *        The worker capabilities to update.
     */

    public void setCapabilities(WorkerCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The worker capabilities to update.
     * </p>
     * 
     * @return The worker capabilities to update.
     */

    public WorkerCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The worker capabilities to update.
     * </p>
     * 
     * @param capabilities
     *        The worker capabilities to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerRequest withCapabilities(WorkerCapabilities capabilities) {
        setCapabilities(capabilities);
        return this;
    }

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

    public UpdateWorkerRequest withFarmId(String farmId) {
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

    public UpdateWorkerRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The host properties to update.
     * </p>
     * 
     * @param hostProperties
     *        The host properties to update.
     */

    public void setHostProperties(HostPropertiesRequest hostProperties) {
        this.hostProperties = hostProperties;
    }

    /**
     * <p>
     * The host properties to update.
     * </p>
     * 
     * @return The host properties to update.
     */

    public HostPropertiesRequest getHostProperties() {
        return this.hostProperties;
    }

    /**
     * <p>
     * The host properties to update.
     * </p>
     * 
     * @param hostProperties
     *        The host properties to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerRequest withHostProperties(HostPropertiesRequest hostProperties) {
        setHostProperties(hostProperties);
        return this;
    }

    /**
     * <p>
     * The worker status to update.
     * </p>
     * 
     * @param status
     *        The worker status to update.
     * @see UpdatedWorkerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The worker status to update.
     * </p>
     * 
     * @return The worker status to update.
     * @see UpdatedWorkerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The worker status to update.
     * </p>
     * 
     * @param status
     *        The worker status to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdatedWorkerStatus
     */

    public UpdateWorkerRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The worker status to update.
     * </p>
     * 
     * @param status
     *        The worker status to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdatedWorkerStatus
     */

    public UpdateWorkerRequest withStatus(UpdatedWorkerStatus status) {
        this.status = status.toString();
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

    public UpdateWorkerRequest withWorkerId(String workerId) {
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
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getHostProperties() != null)
            sb.append("HostProperties: ").append(getHostProperties()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof UpdateWorkerRequest == false)
            return false;
        UpdateWorkerRequest other = (UpdateWorkerRequest) obj;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkerRequest clone() {
        return (UpdateWorkerRequest) super.clone();
    }

}
