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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxVolumeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     */
    private String volumeName;
    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The ARN identifier of the volume.
     * </p>
     */
    private String volumeArn;
    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     */
    private KxNAS1Configuration nas1Configuration;
    /**
     * <p>
     * The status of volume creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The volume creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The volume creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The volume is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The volume is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATED – The volume is successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The volume is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The volume is successfully deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     */
    private String azMode;
    /**
     * <p>
     * A description of the volume.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private java.util.List<String> availabilityZoneIds;
    /**
     * <p>
     * The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @return A unique identifier for the volume.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * A unique identifier for the volume.
     * </p>
     * 
     * @param volumeName
     *        A unique identifier for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withVolumeName(String volumeName) {
        setVolumeName(volumeName);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @see KxVolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @return The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @see KxVolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public CreateKxVolumeResult withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public CreateKxVolumeResult withVolumeType(KxVolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the volume.
     * </p>
     * 
     * @param volumeArn
     *        The ARN identifier of the volume.
     */

    public void setVolumeArn(String volumeArn) {
        this.volumeArn = volumeArn;
    }

    /**
     * <p>
     * The ARN identifier of the volume.
     * </p>
     * 
     * @return The ARN identifier of the volume.
     */

    public String getVolumeArn() {
        return this.volumeArn;
    }

    /**
     * <p>
     * The ARN identifier of the volume.
     * </p>
     * 
     * @param volumeArn
     *        The ARN identifier of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withVolumeArn(String volumeArn) {
        setVolumeArn(volumeArn);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     */

    public void setNas1Configuration(KxNAS1Configuration nas1Configuration) {
        this.nas1Configuration = nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @return Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     */

    public KxNAS1Configuration getNas1Configuration() {
        return this.nas1Configuration;
    }

    /**
     * <p>
     * Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * </p>
     * 
     * @param nas1Configuration
     *        Specifies the configuration for the Network attached storage (NAS_1) file system volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withNas1Configuration(KxNAS1Configuration nas1Configuration) {
        setNas1Configuration(nas1Configuration);
        return this;
    }

    /**
     * <p>
     * The status of volume creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The volume creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The volume creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The volume is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The volume is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATED – The volume is successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The volume is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The volume is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of volume creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The volume creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The volume creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The volume is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The volume is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATED – The volume is successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The volume is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The volume is successfully deleted.
     *        </p>
     *        </li>
     * @see KxVolumeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of volume creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The volume creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The volume creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The volume is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The volume is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATED – The volume is successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The volume is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The volume is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of volume creation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING – The volume creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED – The volume creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE – The volume is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The volume is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATE_FAILED – The update action failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATED – The volume is successfully updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The volume is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED – The system failed to delete the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETED – The volume is successfully deleted.
     *         </p>
     *         </li>
     * @see KxVolumeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of volume creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The volume creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The volume creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The volume is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The volume is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATED – The volume is successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The volume is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The volume is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of volume creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The volume creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The volume creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The volume is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The volume is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATED – The volume is successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The volume is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The volume is successfully deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeStatus
     */

    public CreateKxVolumeResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of volume creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The volume creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The volume creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The volume is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The volume is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATE_FAILED – The update action failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATED – The volume is successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The volume is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The system failed to delete the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The volume is successfully deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of volume creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The volume creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The volume creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The volume is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The volume is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATE_FAILED – The update action failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATED – The volume is successfully updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The volume is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The system failed to delete the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The volume is successfully deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeStatus
     */

    public CreateKxVolumeResult withStatus(KxVolumeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @return The error message when a failed state occurs.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @return The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *         <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public String getAzMode() {
        return this.azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public CreateKxVolumeResult withAzMode(String azMode) {
        setAzMode(azMode);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public CreateKxVolumeResult withAzMode(KxAzMode azMode) {
        this.azMode = azMode.toString();
        return this;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @return A description of the volume.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public java.util.List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        if (availabilityZoneIds == null) {
            this.availabilityZoneIds = null;
            return;
        }

        this.availabilityZoneIds = new java.util.ArrayList<String>(availabilityZoneIds);
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZoneIds(java.util.Collection)} or {@link #withAvailabilityZoneIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withAvailabilityZoneIds(String... availabilityZoneIds) {
        if (this.availabilityZoneIds == null) {
            setAvailabilityZoneIds(new java.util.ArrayList<String>(availabilityZoneIds.length));
        }
        for (String ele : availabilityZoneIds) {
            this.availabilityZoneIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneIds
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withAvailabilityZoneIds(java.util.Collection<String> availabilityZoneIds) {
        setAvailabilityZoneIds(availabilityZoneIds);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds.
     * For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxVolumeResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeArn() != null)
            sb.append("VolumeArn: ").append(getVolumeArn()).append(",");
        if (getNas1Configuration() != null)
            sb.append("Nas1Configuration: ").append(getNas1Configuration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getAzMode() != null)
            sb.append("AzMode: ").append(getAzMode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAvailabilityZoneIds() != null)
            sb.append("AvailabilityZoneIds: ").append(getAvailabilityZoneIds()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKxVolumeResult == false)
            return false;
        CreateKxVolumeResult other = (CreateKxVolumeResult) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeArn() == null ^ this.getVolumeArn() == null)
            return false;
        if (other.getVolumeArn() != null && other.getVolumeArn().equals(this.getVolumeArn()) == false)
            return false;
        if (other.getNas1Configuration() == null ^ this.getNas1Configuration() == null)
            return false;
        if (other.getNas1Configuration() != null && other.getNas1Configuration().equals(this.getNas1Configuration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getAzMode() == null ^ this.getAzMode() == null)
            return false;
        if (other.getAzMode() != null && other.getAzMode().equals(this.getAzMode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAvailabilityZoneIds() == null ^ this.getAvailabilityZoneIds() == null)
            return false;
        if (other.getAvailabilityZoneIds() != null && other.getAvailabilityZoneIds().equals(this.getAvailabilityZoneIds()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeArn() == null) ? 0 : getVolumeArn().hashCode());
        hashCode = prime * hashCode + ((getNas1Configuration() == null) ? 0 : getNas1Configuration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getAzMode() == null) ? 0 : getAzMode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneIds() == null) ? 0 : getAvailabilityZoneIds().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxVolumeResult clone() {
        try {
            return (CreateKxVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
