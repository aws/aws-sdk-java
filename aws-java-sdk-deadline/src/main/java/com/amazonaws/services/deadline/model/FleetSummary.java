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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/FleetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Auto Scaling status of a fleet.
     * </p>
     */
    private String autoScalingStatus;
    /**
     * <p>
     * The configuration details for the fleet.
     * </p>
     */
    private FleetConfiguration configuration;
    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The display name of the fleet summary to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The maximum number of workers specified in the fleet.
     * </p>
     */
    private Integer maxWorkerCount;
    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     */
    private Integer minWorkerCount;
    /**
     * <p>
     * The status of the fleet.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target number of workers in a fleet.
     * </p>
     */
    private Integer targetWorkerCount;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The number of workers in the fleet summary.
     * </p>
     */
    private Integer workerCount;

    /**
     * <p>
     * The Auto Scaling status of a fleet.
     * </p>
     * 
     * @param autoScalingStatus
     *        The Auto Scaling status of a fleet.
     * @see AutoScalingStatus
     */

    public void setAutoScalingStatus(String autoScalingStatus) {
        this.autoScalingStatus = autoScalingStatus;
    }

    /**
     * <p>
     * The Auto Scaling status of a fleet.
     * </p>
     * 
     * @return The Auto Scaling status of a fleet.
     * @see AutoScalingStatus
     */

    public String getAutoScalingStatus() {
        return this.autoScalingStatus;
    }

    /**
     * <p>
     * The Auto Scaling status of a fleet.
     * </p>
     * 
     * @param autoScalingStatus
     *        The Auto Scaling status of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingStatus
     */

    public FleetSummary withAutoScalingStatus(String autoScalingStatus) {
        setAutoScalingStatus(autoScalingStatus);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling status of a fleet.
     * </p>
     * 
     * @param autoScalingStatus
     *        The Auto Scaling status of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingStatus
     */

    public FleetSummary withAutoScalingStatus(AutoScalingStatus autoScalingStatus) {
        this.autoScalingStatus = autoScalingStatus.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details for the fleet.
     * </p>
     * 
     * @param configuration
     *        The configuration details for the fleet.
     */

    public void setConfiguration(FleetConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration details for the fleet.
     * </p>
     * 
     * @return The configuration details for the fleet.
     */

    public FleetConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration details for the fleet.
     * </p>
     * 
     * @param configuration
     *        The configuration details for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withConfiguration(FleetConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The display name of the fleet summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet summary to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the fleet summary to update.
     * </p>
     * 
     * @return The display name of the fleet summary to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the fleet summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet summary to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @return The farm ID.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID.
     * </p>
     * 
     * @param farmId
     *        The farm ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @return The fleet ID.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The maximum number of workers specified in the fleet.
     * </p>
     * 
     * @param maxWorkerCount
     *        The maximum number of workers specified in the fleet.
     */

    public void setMaxWorkerCount(Integer maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    /**
     * <p>
     * The maximum number of workers specified in the fleet.
     * </p>
     * 
     * @return The maximum number of workers specified in the fleet.
     */

    public Integer getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * <p>
     * The maximum number of workers specified in the fleet.
     * </p>
     * 
     * @param maxWorkerCount
     *        The maximum number of workers specified in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withMaxWorkerCount(Integer maxWorkerCount) {
        setMaxWorkerCount(maxWorkerCount);
        return this;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @param minWorkerCount
     *        The minimum number of workers in the fleet.
     */

    public void setMinWorkerCount(Integer minWorkerCount) {
        this.minWorkerCount = minWorkerCount;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @return The minimum number of workers in the fleet.
     */

    public Integer getMinWorkerCount() {
        return this.minWorkerCount;
    }

    /**
     * <p>
     * The minimum number of workers in the fleet.
     * </p>
     * 
     * @param minWorkerCount
     *        The minimum number of workers in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withMinWorkerCount(Integer minWorkerCount) {
        setMinWorkerCount(minWorkerCount);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @see FleetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @return The status of the fleet.
     * @see FleetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetSummary withStatus(FleetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target number of workers in a fleet.
     * </p>
     * 
     * @param targetWorkerCount
     *        The target number of workers in a fleet.
     */

    public void setTargetWorkerCount(Integer targetWorkerCount) {
        this.targetWorkerCount = targetWorkerCount;
    }

    /**
     * <p>
     * The target number of workers in a fleet.
     * </p>
     * 
     * @return The target number of workers in a fleet.
     */

    public Integer getTargetWorkerCount() {
        return this.targetWorkerCount;
    }

    /**
     * <p>
     * The target number of workers in a fleet.
     * </p>
     * 
     * @param targetWorkerCount
     *        The target number of workers in a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withTargetWorkerCount(Integer targetWorkerCount) {
        setTargetWorkerCount(targetWorkerCount);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The number of workers in the fleet summary.
     * </p>
     * 
     * @param workerCount
     *        The number of workers in the fleet summary.
     */

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    /**
     * <p>
     * The number of workers in the fleet summary.
     * </p>
     * 
     * @return The number of workers in the fleet summary.
     */

    public Integer getWorkerCount() {
        return this.workerCount;
    }

    /**
     * <p>
     * The number of workers in the fleet summary.
     * </p>
     * 
     * @param workerCount
     *        The number of workers in the fleet summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withWorkerCount(Integer workerCount) {
        setWorkerCount(workerCount);
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
        if (getAutoScalingStatus() != null)
            sb.append("AutoScalingStatus: ").append(getAutoScalingStatus()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getMaxWorkerCount() != null)
            sb.append("MaxWorkerCount: ").append(getMaxWorkerCount()).append(",");
        if (getMinWorkerCount() != null)
            sb.append("MinWorkerCount: ").append(getMinWorkerCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetWorkerCount() != null)
            sb.append("TargetWorkerCount: ").append(getTargetWorkerCount()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getWorkerCount() != null)
            sb.append("WorkerCount: ").append(getWorkerCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSummary == false)
            return false;
        FleetSummary other = (FleetSummary) obj;
        if (other.getAutoScalingStatus() == null ^ this.getAutoScalingStatus() == null)
            return false;
        if (other.getAutoScalingStatus() != null && other.getAutoScalingStatus().equals(this.getAutoScalingStatus()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getMaxWorkerCount() == null ^ this.getMaxWorkerCount() == null)
            return false;
        if (other.getMaxWorkerCount() != null && other.getMaxWorkerCount().equals(this.getMaxWorkerCount()) == false)
            return false;
        if (other.getMinWorkerCount() == null ^ this.getMinWorkerCount() == null)
            return false;
        if (other.getMinWorkerCount() != null && other.getMinWorkerCount().equals(this.getMinWorkerCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetWorkerCount() == null ^ this.getTargetWorkerCount() == null)
            return false;
        if (other.getTargetWorkerCount() != null && other.getTargetWorkerCount().equals(this.getTargetWorkerCount()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getWorkerCount() == null ^ this.getWorkerCount() == null)
            return false;
        if (other.getWorkerCount() != null && other.getWorkerCount().equals(this.getWorkerCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingStatus() == null) ? 0 : getAutoScalingStatus().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getMaxWorkerCount() == null) ? 0 : getMaxWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getMinWorkerCount() == null) ? 0 : getMinWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetWorkerCount() == null) ? 0 : getTargetWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getWorkerCount() == null) ? 0 : getWorkerCount().hashCode());
        return hashCode;
    }

    @Override
    public FleetSummary clone() {
        try {
            return (FleetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.FleetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
