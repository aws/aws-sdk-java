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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> DescribeSnapshotScheduleOutput$Description </li>
 * <li> DescribeSnapshotScheduleOutput$RecurrenceInHours </li>
 * <li> DescribeSnapshotScheduleOutput$StartAt </li>
 * <li> DescribeSnapshotScheduleOutput$Timezone </li>
 * <li> DescribeSnapshotScheduleOutput$VolumeARN </li>
 * 
 * </ul>
 */
public class DescribeSnapshotScheduleResult {

    /**
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The hour of the day at which the snapshot schedule begins, from 0 to
     * 23.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer startAt;

    /**
     * The number of hours between snapshots. <p><i>Valid Values</i>:
     * <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     * <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer recurrenceInHours;

    /**
     * The snapshot description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String description;

    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     */
    private String timezone;

    /**
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the volume that was specified in the
     *         request.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume that was specified in the
     *         request.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume that was specified in the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume that was specified in the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotScheduleResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The hour of the day at which the snapshot schedule begins, from 0 to
     * 23.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return The hour of the day at which the snapshot schedule begins, from 0 to
     *         23.
     */
    public Integer getStartAt() {
        return startAt;
    }
    
    /**
     * The hour of the day at which the snapshot schedule begins, from 0 to
     * 23.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The hour of the day at which the snapshot schedule begins, from 0 to
     *         23.
     */
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }
    
    /**
     * The hour of the day at which the snapshot schedule begins, from 0 to
     * 23.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The hour of the day at which the snapshot schedule begins, from 0 to
     *         23.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotScheduleResult withStartAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }
    
    
    /**
     * The number of hours between snapshots. <p><i>Valid Values</i>:
     * <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     * <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return The number of hours between snapshots. <p><i>Valid Values</i>:
     *         <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     *         <code>12</code>, <code>24</code>.
     */
    public Integer getRecurrenceInHours() {
        return recurrenceInHours;
    }
    
    /**
     * The number of hours between snapshots. <p><i>Valid Values</i>:
     * <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     * <code>12</code>, <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours The number of hours between snapshots. <p><i>Valid Values</i>:
     *         <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     *         <code>12</code>, <code>24</code>.
     */
    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }
    
    /**
     * The number of hours between snapshots. <p><i>Valid Values</i>:
     * <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     * <code>12</code>, <code>24</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours The number of hours between snapshots. <p><i>Valid Values</i>:
     *         <code>1</code>, <code>2</code>, <code>4</code>, <code>8</code>,
     *         <code>12</code>, <code>24</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotScheduleResult withRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
        return this;
    }
    
    
    /**
     * The snapshot description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The snapshot description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The snapshot description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description The snapshot description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The snapshot description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description The snapshot description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotScheduleResult withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @return One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         of the gateway.
     *
     * @see GatewayTimezone
     */
    public String getTimezone() {
        return timezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         of the gateway.
     *
     * @see GatewayTimezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeSnapshotScheduleResult withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         of the gateway.
     *
     * @see GatewayTimezone
     */
    public void setTimezone(GatewayTimezone timezone) {
        this.timezone = timezone.toString();
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param timezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeSnapshotScheduleResult withTimezone(GatewayTimezone timezone) {
        this.timezone = timezone.toString();
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
        if (timezone != null) sb.append("Timezone: " + timezone + ", ");
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
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeSnapshotScheduleResult == false) return false;
        DescribeSnapshotScheduleResult other = (DescribeSnapshotScheduleResult)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getStartAt() == null ^ this.getStartAt() == null) return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false) return false; 
        if (other.getRecurrenceInHours() == null ^ this.getRecurrenceInHours() == null) return false;
        if (other.getRecurrenceInHours() != null && other.getRecurrenceInHours().equals(this.getRecurrenceInHours()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTimezone() == null ^ this.getTimezone() == null) return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false) return false; 
        return true;
    }
    
}
    