/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * Describe Snapshot Schedule Result
 */
public class DescribeSnapshotScheduleResult implements Serializable {

    private String volumeARN;

    private Integer startAt;

    private Integer recurrenceInHours;

    private String description;

    private String timezone;

    /**
     * Returns the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The value of the VolumeARN property for this object.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotScheduleResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * Returns the value of the StartAt property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return The value of the StartAt property for this object.
     */
    public Integer getStartAt() {
        return startAt;
    }
    
    /**
     * Sets the value of the StartAt property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The new value for the StartAt property for this object.
     */
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }
    
    /**
     * Sets the value of the StartAt property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param startAt The new value for the StartAt property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotScheduleResult withStartAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Returns the value of the RecurrenceInHours property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return The value of the RecurrenceInHours property for this object.
     */
    public Integer getRecurrenceInHours() {
        return recurrenceInHours;
    }
    
    /**
     * Sets the value of the RecurrenceInHours property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours The new value for the RecurrenceInHours property for this object.
     */
    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }
    
    /**
     * Sets the value of the RecurrenceInHours property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param recurrenceInHours The new value for the RecurrenceInHours property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotScheduleResult withRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotScheduleResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the Timezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return The value of the Timezone property for this object.
     */
    public String getTimezone() {
        return timezone;
    }
    
    /**
     * Sets the value of the Timezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone The new value for the Timezone property for this object.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    
    /**
     * Sets the value of the Timezone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone The new value for the Timezone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotScheduleResult withTimezone(String timezone) {
        this.timezone = timezone;
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
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getStartAt() != null) sb.append("StartAt: " + getStartAt() + ",");
        if (getRecurrenceInHours() != null) sb.append("RecurrenceInHours: " + getRecurrenceInHours() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTimezone() != null) sb.append("Timezone: " + getTimezone() );
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
    