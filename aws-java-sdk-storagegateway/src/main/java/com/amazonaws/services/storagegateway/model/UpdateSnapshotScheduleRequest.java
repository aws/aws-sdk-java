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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>UpdateSnapshotScheduleInput$Description</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateSnapshotScheduleInput$StartAt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateSnapshotScheduleInput$VolumeARN</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSnapshotSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     */
    private Integer startAt;
    /**
     * <p>
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * </p>
     */
    private Integer recurrenceInHours;
    /**
     * <p>
     * Optional description of the snapshot that overwrites the existing description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *        gateway volumes.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *         gateway volumes.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of gateway
     * volumes.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a> operation to return a list of
     *        gateway volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotScheduleRequest withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param startAt
     *        The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the
     *        hour (0 to 23). The hour of the day is in the time zone of the gateway.
     */

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @return The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is
     *         the hour (0 to 23). The hour of the day is in the time zone of the gateway.
     */

    public Integer getStartAt() {
        return this.startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param startAt
     *        The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the
     *        hour (0 to 23). The hour of the day is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotScheduleRequest withStartAt(Integer startAt) {
        setStartAt(startAt);
        return this;
    }

    /**
     * <p>
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * </p>
     * 
     * @param recurrenceInHours
     *        Frequency of snapshots. Specify the number of hours between snapshots.
     */

    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }

    /**
     * <p>
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * </p>
     * 
     * @return Frequency of snapshots. Specify the number of hours between snapshots.
     */

    public Integer getRecurrenceInHours() {
        return this.recurrenceInHours;
    }

    /**
     * <p>
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * </p>
     * 
     * @param recurrenceInHours
     *        Frequency of snapshots. Specify the number of hours between snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotScheduleRequest withRecurrenceInHours(Integer recurrenceInHours) {
        setRecurrenceInHours(recurrenceInHours);
        return this;
    }

    /**
     * <p>
     * Optional description of the snapshot that overwrites the existing description.
     * </p>
     * 
     * @param description
     *        Optional description of the snapshot that overwrites the existing description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Optional description of the snapshot that overwrites the existing description.
     * </p>
     * 
     * @return Optional description of the snapshot that overwrites the existing description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Optional description of the snapshot that overwrites the existing description.
     * </p>
     * 
     * @param description
     *        Optional description of the snapshot that overwrites the existing description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotScheduleRequest withDescription(String description) {
        setDescription(description);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getStartAt() != null)
            sb.append("StartAt: ").append(getStartAt()).append(",");
        if (getRecurrenceInHours() != null)
            sb.append("RecurrenceInHours: ").append(getRecurrenceInHours()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSnapshotScheduleRequest == false)
            return false;
        UpdateSnapshotScheduleRequest other = (UpdateSnapshotScheduleRequest) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getStartAt() == null ^ this.getStartAt() == null)
            return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false)
            return false;
        if (other.getRecurrenceInHours() == null ^ this.getRecurrenceInHours() == null)
            return false;
        if (other.getRecurrenceInHours() != null && other.getRecurrenceInHours().equals(this.getRecurrenceInHours()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        hashCode = prime * hashCode + ((getRecurrenceInHours() == null) ? 0 : getRecurrenceInHours().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSnapshotScheduleRequest clone() {
        return (UpdateSnapshotScheduleRequest) super.clone();
    }

}
