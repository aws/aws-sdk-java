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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of a cluster restore action. Returns null if the cluster was not created by restoring a
 * snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed, or failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a
     * completed backup.
     * </p>
     */
    private Double currentRestoreRateInMegaBytesPerSecond;
    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster.
     * </p>
     */
    private Long snapshotSizeInMegaBytes;
    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * </p>
     */
    private Long progressInMegaBytes;
    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to
     * finish.
     * </p>
     */
    private Long elapsedTimeInSeconds;
    /**
     * <p>
     * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed, or failed.
     * </p>
     * 
     * @param status
     *        The status of the restore action. Returns starting, restoring, completed, or failed.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed, or failed.
     * </p>
     * 
     * @return The status of the restore action. Returns starting, restoring, completed, or failed.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the restore action. Returns starting, restoring, completed, or failed.
     * </p>
     * 
     * @param status
     *        The status of the restore action. Returns starting, restoring, completed, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a
     * completed backup.
     * </p>
     * 
     * @param currentRestoreRateInMegaBytesPerSecond
     *        The number of megabytes per second being transferred from the backup storage. Returns the average rate for
     *        a completed backup.
     */

    public void setCurrentRestoreRateInMegaBytesPerSecond(Double currentRestoreRateInMegaBytesPerSecond) {
        this.currentRestoreRateInMegaBytesPerSecond = currentRestoreRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a
     * completed backup.
     * </p>
     * 
     * @return The number of megabytes per second being transferred from the backup storage. Returns the average rate
     *         for a completed backup.
     */

    public Double getCurrentRestoreRateInMegaBytesPerSecond() {
        return this.currentRestoreRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a
     * completed backup.
     * </p>
     * 
     * @param currentRestoreRateInMegaBytesPerSecond
     *        The number of megabytes per second being transferred from the backup storage. Returns the average rate for
     *        a completed backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withCurrentRestoreRateInMegaBytesPerSecond(Double currentRestoreRateInMegaBytesPerSecond) {
        setCurrentRestoreRateInMegaBytesPerSecond(currentRestoreRateInMegaBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster.
     * </p>
     * 
     * @param snapshotSizeInMegaBytes
     *        The size of the set of snapshot data used to restore the cluster.
     */

    public void setSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        this.snapshotSizeInMegaBytes = snapshotSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster.
     * </p>
     * 
     * @return The size of the set of snapshot data used to restore the cluster.
     */

    public Long getSnapshotSizeInMegaBytes() {
        return this.snapshotSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the set of snapshot data used to restore the cluster.
     * </p>
     * 
     * @param snapshotSizeInMegaBytes
     *        The size of the set of snapshot data used to restore the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withSnapshotSizeInMegaBytes(Long snapshotSizeInMegaBytes) {
        setSnapshotSizeInMegaBytes(snapshotSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * </p>
     * 
     * @param progressInMegaBytes
     *        The number of megabytes that have been transferred from snapshot storage.
     */

    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * </p>
     * 
     * @return The number of megabytes that have been transferred from snapshot storage.
     */

    public Long getProgressInMegaBytes() {
        return this.progressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred from snapshot storage.
     * </p>
     * 
     * @param progressInMegaBytes
     *        The number of megabytes that have been transferred from snapshot storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        setProgressInMegaBytes(progressInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to
     * finish.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time an in-progress restore has been running, or the amount of time it took a completed
     *        restore to finish.
     */

    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to
     * finish.
     * </p>
     * 
     * @return The amount of time an in-progress restore has been running, or the amount of time it took a completed
     *         restore to finish.
     */

    public Long getElapsedTimeInSeconds() {
        return this.elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to
     * finish.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time an in-progress restore has been running, or the amount of time it took a completed
     *        restore to finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        setElapsedTimeInSeconds(elapsedTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     */

    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     * </p>
     * 
     * @return The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     */

    public Long getEstimatedTimeToCompletionInSeconds() {
        return this.estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreStatus withEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        setEstimatedTimeToCompletionInSeconds(estimatedTimeToCompletionInSeconds);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCurrentRestoreRateInMegaBytesPerSecond() != null)
            sb.append("CurrentRestoreRateInMegaBytesPerSecond: ").append(getCurrentRestoreRateInMegaBytesPerSecond()).append(",");
        if (getSnapshotSizeInMegaBytes() != null)
            sb.append("SnapshotSizeInMegaBytes: ").append(getSnapshotSizeInMegaBytes()).append(",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: ").append(getProgressInMegaBytes()).append(",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: ").append(getElapsedTimeInSeconds()).append(",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: ").append(getEstimatedTimeToCompletionInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreStatus == false)
            return false;
        RestoreStatus other = (RestoreStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() == null ^ this.getCurrentRestoreRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentRestoreRateInMegaBytesPerSecond() != null
                && other.getCurrentRestoreRateInMegaBytesPerSecond().equals(this.getCurrentRestoreRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getSnapshotSizeInMegaBytes() == null ^ this.getSnapshotSizeInMegaBytes() == null)
            return false;
        if (other.getSnapshotSizeInMegaBytes() != null && other.getSnapshotSizeInMegaBytes().equals(this.getSnapshotSizeInMegaBytes()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        return true;
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
    public RestoreStatus clone() {
        try {
            return (RestoreStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
