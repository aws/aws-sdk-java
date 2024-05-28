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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceImportTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceImportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the import task for which information is retrieved.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the import task.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the destination that's assigned to the wireless devices in the import task.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The Sidewalk-related information about an import task.
     * </p>
     */
    private SidewalkGetStartImportInfo sidewalk;
    /**
     * <p>
     * The time at which the import task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The import task status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the provided status information, such as a validation error that causes the import task to fail.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The number of devices in the import task that are waiting for the control log to start processing.
     * </p>
     */
    private Long initializedImportedDeviceCount;
    /**
     * <p>
     * The number of devices in the import task that are waiting in the import task queue to be onboarded.
     * </p>
     */
    private Long pendingImportedDeviceCount;
    /**
     * <p>
     * The number of devices in the import task that have been onboarded to the import task.
     * </p>
     */
    private Long onboardedImportedDeviceCount;
    /**
     * <p>
     * The number of devices in the import task that failed to onboard to the import task.
     * </p>
     */
    private Long failedImportedDeviceCount;

    /**
     * <p>
     * The identifier of the import task for which information is retrieved.
     * </p>
     * 
     * @param id
     *        The identifier of the import task for which information is retrieved.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the import task for which information is retrieved.
     * </p>
     * 
     * @return The identifier of the import task for which information is retrieved.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the import task for which information is retrieved.
     * </p>
     * 
     * @param id
     *        The identifier of the import task for which information is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the import task.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the import task.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the import task.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the import task.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the import task.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the destination that's assigned to the wireless devices in the import task.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination that's assigned to the wireless devices in the import task.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination that's assigned to the wireless devices in the import task.
     * </p>
     * 
     * @return The name of the destination that's assigned to the wireless devices in the import task.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination that's assigned to the wireless devices in the import task.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination that's assigned to the wireless devices in the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The Sidewalk-related information about an import task.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related information about an import task.
     */

    public void setSidewalk(SidewalkGetStartImportInfo sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related information about an import task.
     * </p>
     * 
     * @return The Sidewalk-related information about an import task.
     */

    public SidewalkGetStartImportInfo getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related information about an import task.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related information about an import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withSidewalk(SidewalkGetStartImportInfo sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * <p>
     * The time at which the import task was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the import task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the import task was created.
     * </p>
     * 
     * @return The time at which the import task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the import task was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the import task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The import task status.
     * </p>
     * 
     * @param status
     *        The import task status.
     * @see ImportTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The import task status.
     * </p>
     * 
     * @return The import task status.
     * @see ImportTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The import task status.
     * </p>
     * 
     * @param status
     *        The import task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportTaskStatus
     */

    public GetWirelessDeviceImportTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The import task status.
     * </p>
     * 
     * @param status
     *        The import task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportTaskStatus
     */

    public GetWirelessDeviceImportTaskResult withStatus(ImportTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the provided status information, such as a validation error that causes the import task to fail.
     * </p>
     * 
     * @param statusReason
     *        The reason for the provided status information, such as a validation error that causes the import task to
     *        fail.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the provided status information, such as a validation error that causes the import task to fail.
     * </p>
     * 
     * @return The reason for the provided status information, such as a validation error that causes the import task to
     *         fail.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the provided status information, such as a validation error that causes the import task to fail.
     * </p>
     * 
     * @param statusReason
     *        The reason for the provided status information, such as a validation error that causes the import task to
     *        fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting for the control log to start processing.
     * </p>
     * 
     * @param initializedImportedDeviceCount
     *        The number of devices in the import task that are waiting for the control log to start processing.
     */

    public void setInitializedImportedDeviceCount(Long initializedImportedDeviceCount) {
        this.initializedImportedDeviceCount = initializedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting for the control log to start processing.
     * </p>
     * 
     * @return The number of devices in the import task that are waiting for the control log to start processing.
     */

    public Long getInitializedImportedDeviceCount() {
        return this.initializedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting for the control log to start processing.
     * </p>
     * 
     * @param initializedImportedDeviceCount
     *        The number of devices in the import task that are waiting for the control log to start processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withInitializedImportedDeviceCount(Long initializedImportedDeviceCount) {
        setInitializedImportedDeviceCount(initializedImportedDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting in the import task queue to be onboarded.
     * </p>
     * 
     * @param pendingImportedDeviceCount
     *        The number of devices in the import task that are waiting in the import task queue to be onboarded.
     */

    public void setPendingImportedDeviceCount(Long pendingImportedDeviceCount) {
        this.pendingImportedDeviceCount = pendingImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting in the import task queue to be onboarded.
     * </p>
     * 
     * @return The number of devices in the import task that are waiting in the import task queue to be onboarded.
     */

    public Long getPendingImportedDeviceCount() {
        return this.pendingImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that are waiting in the import task queue to be onboarded.
     * </p>
     * 
     * @param pendingImportedDeviceCount
     *        The number of devices in the import task that are waiting in the import task queue to be onboarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withPendingImportedDeviceCount(Long pendingImportedDeviceCount) {
        setPendingImportedDeviceCount(pendingImportedDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices in the import task that have been onboarded to the import task.
     * </p>
     * 
     * @param onboardedImportedDeviceCount
     *        The number of devices in the import task that have been onboarded to the import task.
     */

    public void setOnboardedImportedDeviceCount(Long onboardedImportedDeviceCount) {
        this.onboardedImportedDeviceCount = onboardedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that have been onboarded to the import task.
     * </p>
     * 
     * @return The number of devices in the import task that have been onboarded to the import task.
     */

    public Long getOnboardedImportedDeviceCount() {
        return this.onboardedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that have been onboarded to the import task.
     * </p>
     * 
     * @param onboardedImportedDeviceCount
     *        The number of devices in the import task that have been onboarded to the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withOnboardedImportedDeviceCount(Long onboardedImportedDeviceCount) {
        setOnboardedImportedDeviceCount(onboardedImportedDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices in the import task that failed to onboard to the import task.
     * </p>
     * 
     * @param failedImportedDeviceCount
     *        The number of devices in the import task that failed to onboard to the import task.
     */

    public void setFailedImportedDeviceCount(Long failedImportedDeviceCount) {
        this.failedImportedDeviceCount = failedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that failed to onboard to the import task.
     * </p>
     * 
     * @return The number of devices in the import task that failed to onboard to the import task.
     */

    public Long getFailedImportedDeviceCount() {
        return this.failedImportedDeviceCount;
    }

    /**
     * <p>
     * The number of devices in the import task that failed to onboard to the import task.
     * </p>
     * 
     * @param failedImportedDeviceCount
     *        The number of devices in the import task that failed to onboard to the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceImportTaskResult withFailedImportedDeviceCount(Long failedImportedDeviceCount) {
        setFailedImportedDeviceCount(failedImportedDeviceCount);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getInitializedImportedDeviceCount() != null)
            sb.append("InitializedImportedDeviceCount: ").append(getInitializedImportedDeviceCount()).append(",");
        if (getPendingImportedDeviceCount() != null)
            sb.append("PendingImportedDeviceCount: ").append(getPendingImportedDeviceCount()).append(",");
        if (getOnboardedImportedDeviceCount() != null)
            sb.append("OnboardedImportedDeviceCount: ").append(getOnboardedImportedDeviceCount()).append(",");
        if (getFailedImportedDeviceCount() != null)
            sb.append("FailedImportedDeviceCount: ").append(getFailedImportedDeviceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessDeviceImportTaskResult == false)
            return false;
        GetWirelessDeviceImportTaskResult other = (GetWirelessDeviceImportTaskResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getInitializedImportedDeviceCount() == null ^ this.getInitializedImportedDeviceCount() == null)
            return false;
        if (other.getInitializedImportedDeviceCount() != null
                && other.getInitializedImportedDeviceCount().equals(this.getInitializedImportedDeviceCount()) == false)
            return false;
        if (other.getPendingImportedDeviceCount() == null ^ this.getPendingImportedDeviceCount() == null)
            return false;
        if (other.getPendingImportedDeviceCount() != null && other.getPendingImportedDeviceCount().equals(this.getPendingImportedDeviceCount()) == false)
            return false;
        if (other.getOnboardedImportedDeviceCount() == null ^ this.getOnboardedImportedDeviceCount() == null)
            return false;
        if (other.getOnboardedImportedDeviceCount() != null && other.getOnboardedImportedDeviceCount().equals(this.getOnboardedImportedDeviceCount()) == false)
            return false;
        if (other.getFailedImportedDeviceCount() == null ^ this.getFailedImportedDeviceCount() == null)
            return false;
        if (other.getFailedImportedDeviceCount() != null && other.getFailedImportedDeviceCount().equals(this.getFailedImportedDeviceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getInitializedImportedDeviceCount() == null) ? 0 : getInitializedImportedDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getPendingImportedDeviceCount() == null) ? 0 : getPendingImportedDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getOnboardedImportedDeviceCount() == null) ? 0 : getOnboardedImportedDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getFailedImportedDeviceCount() == null) ? 0 : getFailedImportedDeviceCount().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessDeviceImportTaskResult clone() {
        try {
            return (GetWirelessDeviceImportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
