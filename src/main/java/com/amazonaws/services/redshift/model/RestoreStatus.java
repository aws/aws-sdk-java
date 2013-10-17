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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a snapshot.
 * </p>
 */
public class RestoreStatus implements Serializable {

    /**
     * The status of the restore action. Returns starting, restoring,
     * completed, or failed.
     */
    private String status;

    /**
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup.
     */
    private Double currentRestoreRateInMegaBytesPerSecond;

    /**
     * The size of the set of snapshot data used to restore the cluster.
     */
    private Long snapshotSizeInMegaBytes;

    /**
     * The number of megabytes that have been transferred from snapshot
     * storage.
     */
    private Long progressInMegaBytes;

    /**
     * The amount of time an in-progress restore has been running, or the
     * amount of time it took a completed restore to finish.
     */
    private Long elapsedTimeInSeconds;

    /**
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore.
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * The status of the restore action. Returns starting, restoring,
     * completed, or failed.
     *
     * @return The status of the restore action. Returns starting, restoring,
     *         completed, or failed.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the restore action. Returns starting, restoring,
     * completed, or failed.
     *
     * @param status The status of the restore action. Returns starting, restoring,
     *         completed, or failed.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the restore action. Returns starting, restoring,
     * completed, or failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the restore action. Returns starting, restoring,
     *         completed, or failed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup.
     *
     * @return The number of megabytes per second being transferred from the backup
     *         storage. Returns the average rate for a completed backup.
     */
    public Double getCurrentRestoreRateInMegaBytesPerSecond() {
        return currentRestoreRateInMegaBytesPerSecond;
    }
    
    /**
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup.
     *
     * @param currentRestoreRateInMegaBytesPerSecond The number of megabytes per second being transferred from the backup
     *         storage. Returns the average rate for a completed backup.
     */
    public void setCurrentRestoreRateInMegaBytesPerSecond(Double currentRestoreRateInMegaBytesPerSecond) {
        this.currentRestoreRateInMegaBytesPerSecond = currentRestoreRateInMegaBytesPerSecond;
    }
    
    /**
     * The number of megabytes per second being transferred from the backup
     * storage. Returns the average rate for a completed backup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentRestoreRateInMegaBytesPerSecond The number of megabytes per second being transferred from the backup
     *         storage. Returns the average rate for a completed backup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withCurrentRestoreRateInMegaBytesPerSecond(Double currentRestoreRateInMegaBytesPerSecond) {
        this.currentRestoreRateInMegaBytesPerSecond = currentRestoreRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * The size of the set of snapshot data used to restore the cluster.
     *
     * @return The size of the set of snapshot data used to restore the cluster.
     */
    public Long getSnapshotSizeInMegaBytes() {
        return snapshotSizeInMegaBytes;
    }
    
    /**
     * The size of the set of snapshot data used to restore the cluster.
     *
     * @param snapshotSizeInMegaBytes The size of the set of snapshot data used to restore the cluster.
     */
    public void setSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        this.snapshotSizeInMegaBytes = snapshotSizeInMegaBytes;
    }
    
    /**
     * The size of the set of snapshot data used to restore the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotSizeInMegaBytes The size of the set of snapshot data used to restore the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        this.snapshotSizeInMegaBytes = snapshotSizeInMegaBytes;
        return this;
    }

    /**
     * The number of megabytes that have been transferred from snapshot
     * storage.
     *
     * @return The number of megabytes that have been transferred from snapshot
     *         storage.
     */
    public Long getProgressInMegaBytes() {
        return progressInMegaBytes;
    }
    
    /**
     * The number of megabytes that have been transferred from snapshot
     * storage.
     *
     * @param progressInMegaBytes The number of megabytes that have been transferred from snapshot
     *         storage.
     */
    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }
    
    /**
     * The number of megabytes that have been transferred from snapshot
     * storage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progressInMegaBytes The number of megabytes that have been transferred from snapshot
     *         storage.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
        return this;
    }

    /**
     * The amount of time an in-progress restore has been running, or the
     * amount of time it took a completed restore to finish.
     *
     * @return The amount of time an in-progress restore has been running, or the
     *         amount of time it took a completed restore to finish.
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }
    
    /**
     * The amount of time an in-progress restore has been running, or the
     * amount of time it took a completed restore to finish.
     *
     * @param elapsedTimeInSeconds The amount of time an in-progress restore has been running, or the
     *         amount of time it took a completed restore to finish.
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }
    
    /**
     * The amount of time an in-progress restore has been running, or the
     * amount of time it took a completed restore to finish.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elapsedTimeInSeconds The amount of time an in-progress restore has been running, or the
     *         amount of time it took a completed restore to finish.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
        return this;
    }

    /**
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore.
     *
     * @return The estimate of the time remaining before the restore will complete.
     *         Returns 0 for a completed restore.
     */
    public Long getEstimatedTimeToCompletionInSeconds() {
        return estimatedTimeToCompletionInSeconds;
    }
    
    /**
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore.
     *
     * @param estimatedTimeToCompletionInSeconds The estimate of the time remaining before the restore will complete.
     *         Returns 0 for a completed restore.
     */
    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }
    
    /**
     * The estimate of the time remaining before the restore will complete.
     * Returns 0 for a completed restore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedTimeToCompletionInSeconds The estimate of the time remaining before the restore will complete.
     *         Returns 0 for a completed restore.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreStatus withEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCurrentRestoreRateInMegaBytesPerSecond() != null) sb.append("CurrentRestoreRateInMegaBytesPerSecond: " + getCurrentRestoreRateInMegaBytesPerSecond() + ",");
        if (getSnapshotSizeInMegaBytes() != null) sb.append("SnapshotSizeInMegaBytes: " + getSnapshotSizeInMegaBytes() + ",");
        if (getProgressInMegaBytes() != null) sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getElapsedTimeInSeconds() != null) sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds() + ",");
        if (getEstimatedTimeToCompletionInSeconds() != null) sb.append("EstimatedTimeToCompletionInSeconds: " + getEstimatedTimeToCompletionInSeconds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentRestoreRateInMegaBytesPerSecond() == null) ? 0 : getCurrentRestoreRateInMegaBytesPerSecond().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotSizeInMegaBytes() == null) ? 0 : getSnapshotSizeInMegaBytes().hashCode()); 
        hashCode = prime * hashCode + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode()); 
        hashCode = prime * hashCode + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode()); 
        hashCode = prime * hashCode + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0 : getEstimatedTimeToCompletionInSeconds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreStatus == false) return false;
        RestoreStatus other = (RestoreStatus)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() == null ^ this.getCurrentRestoreRateInMegaBytesPerSecond() == null) return false;
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() != null && other.getCurrentRestoreRateInMegaBytesPerSecond().equals(this.getCurrentRestoreRateInMegaBytesPerSecond()) == false) return false; 
        if (other.getSnapshotSizeInMegaBytes() == null ^ this.getSnapshotSizeInMegaBytes() == null) return false;
        if (other.getSnapshotSizeInMegaBytes() != null && other.getSnapshotSizeInMegaBytes().equals(this.getSnapshotSizeInMegaBytes()) == false) return false; 
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null) return false;
        if (other.getProgressInMegaBytes() != null && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false) return false; 
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null) return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false) return false; 
        if (other.getEstimatedTimeToCompletionInSeconds() == null ^ this.getEstimatedTimeToCompletionInSeconds() == null) return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null && other.getEstimatedTimeToCompletionInSeconds().equals(this.getEstimatedTimeToCompletionInSeconds()) == false) return false; 
        return true;
    }
    
}
    