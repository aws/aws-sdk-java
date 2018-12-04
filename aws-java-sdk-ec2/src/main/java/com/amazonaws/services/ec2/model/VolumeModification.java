/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the modification status of an EBS volume.
 * </p>
 * <p>
 * If the volume has never been modified, some element values will be null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeModification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeModification implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the volume being modified.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     */
    private String modificationState;
    /**
     * <p>
     * Generic status message on modification progress or failure.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Target size of the volume being modified.
     * </p>
     */
    private Integer targetSize;
    /**
     * <p>
     * Target IOPS rate of the volume being modified.
     * </p>
     */
    private Integer targetIops;
    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     */
    private String targetVolumeType;
    /**
     * <p>
     * Original size of the volume being modified.
     * </p>
     */
    private Integer originalSize;
    /**
     * <p>
     * Original IOPS rate of the volume being modified.
     * </p>
     */
    private Integer originalIops;
    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     */
    private String originalVolumeType;
    /**
     * <p>
     * Modification progress from 0 to 100%.
     * </p>
     */
    private Long progress;
    /**
     * <p>
     * Modification start time
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Modification completion or failure time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * ID of the volume being modified.
     * </p>
     * 
     * @param volumeId
     *        ID of the volume being modified.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * ID of the volume being modified.
     * </p>
     * 
     * @return ID of the volume being modified.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * ID of the volume being modified.
     * </p>
     * 
     * @param volumeId
     *        ID of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     * 
     * @param modificationState
     *        Current state of modification. Modification state is null for unmodified volumes.
     * @see VolumeModificationState
     */

    public void setModificationState(String modificationState) {
        this.modificationState = modificationState;
    }

    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     * 
     * @return Current state of modification. Modification state is null for unmodified volumes.
     * @see VolumeModificationState
     */

    public String getModificationState() {
        return this.modificationState;
    }

    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     * 
     * @param modificationState
     *        Current state of modification. Modification state is null for unmodified volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeModificationState
     */

    public VolumeModification withModificationState(String modificationState) {
        setModificationState(modificationState);
        return this;
    }

    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     * 
     * @param modificationState
     *        Current state of modification. Modification state is null for unmodified volumes.
     * @see VolumeModificationState
     */

    public void setModificationState(VolumeModificationState modificationState) {
        withModificationState(modificationState);
    }

    /**
     * <p>
     * Current state of modification. Modification state is null for unmodified volumes.
     * </p>
     * 
     * @param modificationState
     *        Current state of modification. Modification state is null for unmodified volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeModificationState
     */

    public VolumeModification withModificationState(VolumeModificationState modificationState) {
        this.modificationState = modificationState.toString();
        return this;
    }

    /**
     * <p>
     * Generic status message on modification progress or failure.
     * </p>
     * 
     * @param statusMessage
     *        Generic status message on modification progress or failure.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Generic status message on modification progress or failure.
     * </p>
     * 
     * @return Generic status message on modification progress or failure.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Generic status message on modification progress or failure.
     * </p>
     * 
     * @param statusMessage
     *        Generic status message on modification progress or failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Target size of the volume being modified.
     * </p>
     * 
     * @param targetSize
     *        Target size of the volume being modified.
     */

    public void setTargetSize(Integer targetSize) {
        this.targetSize = targetSize;
    }

    /**
     * <p>
     * Target size of the volume being modified.
     * </p>
     * 
     * @return Target size of the volume being modified.
     */

    public Integer getTargetSize() {
        return this.targetSize;
    }

    /**
     * <p>
     * Target size of the volume being modified.
     * </p>
     * 
     * @param targetSize
     *        Target size of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withTargetSize(Integer targetSize) {
        setTargetSize(targetSize);
        return this;
    }

    /**
     * <p>
     * Target IOPS rate of the volume being modified.
     * </p>
     * 
     * @param targetIops
     *        Target IOPS rate of the volume being modified.
     */

    public void setTargetIops(Integer targetIops) {
        this.targetIops = targetIops;
    }

    /**
     * <p>
     * Target IOPS rate of the volume being modified.
     * </p>
     * 
     * @return Target IOPS rate of the volume being modified.
     */

    public Integer getTargetIops() {
        return this.targetIops;
    }

    /**
     * <p>
     * Target IOPS rate of the volume being modified.
     * </p>
     * 
     * @param targetIops
     *        Target IOPS rate of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withTargetIops(Integer targetIops) {
        setTargetIops(targetIops);
        return this;
    }

    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     * 
     * @param targetVolumeType
     *        Target EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public void setTargetVolumeType(String targetVolumeType) {
        this.targetVolumeType = targetVolumeType;
    }

    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     * 
     * @return Target EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public String getTargetVolumeType() {
        return this.targetVolumeType;
    }

    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     * 
     * @param targetVolumeType
     *        Target EBS volume type of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public VolumeModification withTargetVolumeType(String targetVolumeType) {
        setTargetVolumeType(targetVolumeType);
        return this;
    }

    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     * 
     * @param targetVolumeType
     *        Target EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public void setTargetVolumeType(VolumeType targetVolumeType) {
        withTargetVolumeType(targetVolumeType);
    }

    /**
     * <p>
     * Target EBS volume type of the volume being modified.
     * </p>
     * 
     * @param targetVolumeType
     *        Target EBS volume type of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public VolumeModification withTargetVolumeType(VolumeType targetVolumeType) {
        this.targetVolumeType = targetVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * Original size of the volume being modified.
     * </p>
     * 
     * @param originalSize
     *        Original size of the volume being modified.
     */

    public void setOriginalSize(Integer originalSize) {
        this.originalSize = originalSize;
    }

    /**
     * <p>
     * Original size of the volume being modified.
     * </p>
     * 
     * @return Original size of the volume being modified.
     */

    public Integer getOriginalSize() {
        return this.originalSize;
    }

    /**
     * <p>
     * Original size of the volume being modified.
     * </p>
     * 
     * @param originalSize
     *        Original size of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withOriginalSize(Integer originalSize) {
        setOriginalSize(originalSize);
        return this;
    }

    /**
     * <p>
     * Original IOPS rate of the volume being modified.
     * </p>
     * 
     * @param originalIops
     *        Original IOPS rate of the volume being modified.
     */

    public void setOriginalIops(Integer originalIops) {
        this.originalIops = originalIops;
    }

    /**
     * <p>
     * Original IOPS rate of the volume being modified.
     * </p>
     * 
     * @return Original IOPS rate of the volume being modified.
     */

    public Integer getOriginalIops() {
        return this.originalIops;
    }

    /**
     * <p>
     * Original IOPS rate of the volume being modified.
     * </p>
     * 
     * @param originalIops
     *        Original IOPS rate of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withOriginalIops(Integer originalIops) {
        setOriginalIops(originalIops);
        return this;
    }

    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     * 
     * @param originalVolumeType
     *        Original EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public void setOriginalVolumeType(String originalVolumeType) {
        this.originalVolumeType = originalVolumeType;
    }

    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     * 
     * @return Original EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public String getOriginalVolumeType() {
        return this.originalVolumeType;
    }

    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     * 
     * @param originalVolumeType
     *        Original EBS volume type of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public VolumeModification withOriginalVolumeType(String originalVolumeType) {
        setOriginalVolumeType(originalVolumeType);
        return this;
    }

    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     * 
     * @param originalVolumeType
     *        Original EBS volume type of the volume being modified.
     * @see VolumeType
     */

    public void setOriginalVolumeType(VolumeType originalVolumeType) {
        withOriginalVolumeType(originalVolumeType);
    }

    /**
     * <p>
     * Original EBS volume type of the volume being modified.
     * </p>
     * 
     * @param originalVolumeType
     *        Original EBS volume type of the volume being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public VolumeModification withOriginalVolumeType(VolumeType originalVolumeType) {
        this.originalVolumeType = originalVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * Modification progress from 0 to 100%.
     * </p>
     * 
     * @param progress
     *        Modification progress from 0 to 100%.
     */

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * Modification progress from 0 to 100%.
     * </p>
     * 
     * @return Modification progress from 0 to 100%.
     */

    public Long getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * Modification progress from 0 to 100%.
     * </p>
     * 
     * @param progress
     *        Modification progress from 0 to 100%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withProgress(Long progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * Modification start time
     * </p>
     * 
     * @param startTime
     *        Modification start time
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Modification start time
     * </p>
     * 
     * @return Modification start time
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Modification start time
     * </p>
     * 
     * @param startTime
     *        Modification start time
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Modification completion or failure time.
     * </p>
     * 
     * @param endTime
     *        Modification completion or failure time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Modification completion or failure time.
     * </p>
     * 
     * @return Modification completion or failure time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Modification completion or failure time.
     * </p>
     * 
     * @param endTime
     *        Modification completion or failure time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeModification withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getModificationState() != null)
            sb.append("ModificationState: ").append(getModificationState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTargetSize() != null)
            sb.append("TargetSize: ").append(getTargetSize()).append(",");
        if (getTargetIops() != null)
            sb.append("TargetIops: ").append(getTargetIops()).append(",");
        if (getTargetVolumeType() != null)
            sb.append("TargetVolumeType: ").append(getTargetVolumeType()).append(",");
        if (getOriginalSize() != null)
            sb.append("OriginalSize: ").append(getOriginalSize()).append(",");
        if (getOriginalIops() != null)
            sb.append("OriginalIops: ").append(getOriginalIops()).append(",");
        if (getOriginalVolumeType() != null)
            sb.append("OriginalVolumeType: ").append(getOriginalVolumeType()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeModification == false)
            return false;
        VolumeModification other = (VolumeModification) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getModificationState() == null ^ this.getModificationState() == null)
            return false;
        if (other.getModificationState() != null && other.getModificationState().equals(this.getModificationState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTargetSize() == null ^ this.getTargetSize() == null)
            return false;
        if (other.getTargetSize() != null && other.getTargetSize().equals(this.getTargetSize()) == false)
            return false;
        if (other.getTargetIops() == null ^ this.getTargetIops() == null)
            return false;
        if (other.getTargetIops() != null && other.getTargetIops().equals(this.getTargetIops()) == false)
            return false;
        if (other.getTargetVolumeType() == null ^ this.getTargetVolumeType() == null)
            return false;
        if (other.getTargetVolumeType() != null && other.getTargetVolumeType().equals(this.getTargetVolumeType()) == false)
            return false;
        if (other.getOriginalSize() == null ^ this.getOriginalSize() == null)
            return false;
        if (other.getOriginalSize() != null && other.getOriginalSize().equals(this.getOriginalSize()) == false)
            return false;
        if (other.getOriginalIops() == null ^ this.getOriginalIops() == null)
            return false;
        if (other.getOriginalIops() != null && other.getOriginalIops().equals(this.getOriginalIops()) == false)
            return false;
        if (other.getOriginalVolumeType() == null ^ this.getOriginalVolumeType() == null)
            return false;
        if (other.getOriginalVolumeType() != null && other.getOriginalVolumeType().equals(this.getOriginalVolumeType()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getModificationState() == null) ? 0 : getModificationState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTargetSize() == null) ? 0 : getTargetSize().hashCode());
        hashCode = prime * hashCode + ((getTargetIops() == null) ? 0 : getTargetIops().hashCode());
        hashCode = prime * hashCode + ((getTargetVolumeType() == null) ? 0 : getTargetVolumeType().hashCode());
        hashCode = prime * hashCode + ((getOriginalSize() == null) ? 0 : getOriginalSize().hashCode());
        hashCode = prime * hashCode + ((getOriginalIops() == null) ? 0 : getOriginalIops().hashCode());
        hashCode = prime * hashCode + ((getOriginalVolumeType() == null) ? 0 : getOriginalVolumeType().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public VolumeModification clone() {
        try {
            return (VolumeModification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
