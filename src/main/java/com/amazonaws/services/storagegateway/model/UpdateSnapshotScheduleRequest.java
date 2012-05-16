/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#updateSnapshotSchedule(UpdateSnapshotScheduleRequest) UpdateSnapshotSchedule operation}.
 * <p>
 * This operation updates a snapshot schedule configured for a gateway volume.
 * </p>
 * <p>
 * The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You can use this API to change the
 * shapshot schedule configured for the volume.
 * </p>
 * <p>
 * In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule information, including when you want
 * the snapshot to begin on a day and the frequency (in hours) of snapshots.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#updateSnapshotSchedule(UpdateSnapshotScheduleRequest)
 */
public class UpdateSnapshotScheduleRequest extends AmazonWebServiceRequest {

    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The hour of the day at which the snapshot schedule begins. <p>Length:
     * 2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     * the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer startAt;

    /**
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer recurrenceInHours;

    /**
     * Optional description of the snapshot that overwrites the existing
     * description. <p>Length: up to 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String description;

    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSnapshotScheduleRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The hour of the day at which the snapshot schedule begins. <p>Length:
     * 2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     * the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return The hour of the day at which the snapshot schedule begins. <p>Length:
     *         2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     *         the hour of day.
     */
    public Integer getStartAt() {
        return startAt;
    }
    
    /**
     * The hour of the day at which the snapshot schedule begins. <p>Length:
     * 2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     * the hour of day.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The hour of the day at which the snapshot schedule begins. <p>Length:
     *         2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     *         the hour of day.
     */
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }
    
    /**
     * The hour of the day at which the snapshot schedule begins. <p>Length:
     * 2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     * the hour of day.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The hour of the day at which the snapshot schedule begins. <p>Length:
     *         2 <p><i>Valid Values</i>: An integer between 0 and 23, representing
     *         the hour of day.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSnapshotScheduleRequest withStartAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }
    
    
    /**
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return Frequency of snapshots. Specify the number of hours between snapshots.
     *         <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     */
    public Integer getRecurrenceInHours() {
        return recurrenceInHours;
    }
    
    /**
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours Frequency of snapshots. Specify the number of hours between snapshots.
     *         <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     */
    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }
    
    /**
     * Frequency of snapshots. Specify the number of hours between snapshots.
     * <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours Frequency of snapshots. Specify the number of hours between snapshots.
     *         <p><i>Valid Values</i>: <code>1</code>, <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>12</code>, <code>24</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSnapshotScheduleRequest withRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
        return this;
    }
    
    
    /**
     * Optional description of the snapshot that overwrites the existing
     * description. <p>Length: up to 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return Optional description of the snapshot that overwrites the existing
     *         description. <p>Length: up to 255 characters.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Optional description of the snapshot that overwrites the existing
     * description. <p>Length: up to 255 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description Optional description of the snapshot that overwrites the existing
     *         description. <p>Length: up to 255 characters.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Optional description of the snapshot that overwrites the existing
     * description. <p>Length: up to 255 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description Optional description of the snapshot that overwrites the existing
     *         description. <p>Length: up to 255 characters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateSnapshotScheduleRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (volumeARN != null) sb.append("VolumeARN: " + volumeARN + ", ");
        if (startAt != null) sb.append("StartAt: " + startAt + ", ");
        if (recurrenceInHours != null) sb.append("RecurrenceInHours: " + recurrenceInHours + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof UpdateSnapshotScheduleRequest == false) return false;
        UpdateSnapshotScheduleRequest other = (UpdateSnapshotScheduleRequest)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getStartAt() == null ^ this.getStartAt() == null) return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false) return false; 
        if (other.getRecurrenceInHours() == null ^ this.getRecurrenceInHours() == null) return false;
        if (other.getRecurrenceInHours() != null && other.getRecurrenceInHours().equals(this.getRecurrenceInHours()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    