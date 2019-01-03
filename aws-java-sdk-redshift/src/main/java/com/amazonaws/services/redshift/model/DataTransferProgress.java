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
 * Describes the status of a cluster while it is in the process of resizing with an incremental resize.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DataTransferProgress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataTransferProgress implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress the status is
     * <code>transferringdata</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     */
    private Double currentRateInMegaBytesPerSecond;
    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     */
    private Long totalDataInMegaBytes;
    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     */
    private Long dataTransferredInMegaBytes;
    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the transfer.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;
    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data transfer.
     * </p>
     */
    private Long elapsedTimeInSeconds;

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress the status is
     * <code>transferringdata</code>.
     * </p>
     * 
     * @param status
     *        Describes the status of the cluster. While the transfer is in progress the status is
     *        <code>transferringdata</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress the status is
     * <code>transferringdata</code>.
     * </p>
     * 
     * @return Describes the status of the cluster. While the transfer is in progress the status is
     *         <code>transferringdata</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress the status is
     * <code>transferringdata</code>.
     * </p>
     * 
     * @param status
     *        Describes the status of the cluster. While the transfer is in progress the status is
     *        <code>transferringdata</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     * 
     * @param currentRateInMegaBytesPerSecond
     *        Describes the data transfer rate in MB's per second.
     */

    public void setCurrentRateInMegaBytesPerSecond(Double currentRateInMegaBytesPerSecond) {
        this.currentRateInMegaBytesPerSecond = currentRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     * 
     * @return Describes the data transfer rate in MB's per second.
     */

    public Double getCurrentRateInMegaBytesPerSecond() {
        return this.currentRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     * 
     * @param currentRateInMegaBytesPerSecond
     *        Describes the data transfer rate in MB's per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withCurrentRateInMegaBytesPerSecond(Double currentRateInMegaBytesPerSecond) {
        setCurrentRateInMegaBytesPerSecond(currentRateInMegaBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     * 
     * @param totalDataInMegaBytes
     *        Describes the total amount of data to be transfered in megabytes.
     */

    public void setTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     * 
     * @return Describes the total amount of data to be transfered in megabytes.
     */

    public Long getTotalDataInMegaBytes() {
        return this.totalDataInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     * 
     * @param totalDataInMegaBytes
     *        Describes the total amount of data to be transfered in megabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        setTotalDataInMegaBytes(totalDataInMegaBytes);
        return this;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     * 
     * @param dataTransferredInMegaBytes
     *        Describes the total amount of data that has been transfered in MB's.
     */

    public void setDataTransferredInMegaBytes(Long dataTransferredInMegaBytes) {
        this.dataTransferredInMegaBytes = dataTransferredInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     * 
     * @return Describes the total amount of data that has been transfered in MB's.
     */

    public Long getDataTransferredInMegaBytes() {
        return this.dataTransferredInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     * 
     * @param dataTransferredInMegaBytes
     *        Describes the total amount of data that has been transfered in MB's.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withDataTransferredInMegaBytes(Long dataTransferredInMegaBytes) {
        setDataTransferredInMegaBytes(dataTransferredInMegaBytes);
        return this;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the transfer.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        Describes the estimated number of seconds remaining to complete the transfer.
     */

    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the transfer.
     * </p>
     * 
     * @return Describes the estimated number of seconds remaining to complete the transfer.
     */

    public Long getEstimatedTimeToCompletionInSeconds() {
        return this.estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the transfer.
     * </p>
     * 
     * @param estimatedTimeToCompletionInSeconds
     *        Describes the estimated number of seconds remaining to complete the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        setEstimatedTimeToCompletionInSeconds(estimatedTimeToCompletionInSeconds);
        return this;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data transfer.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        Describes the number of seconds that have elapsed during the data transfer.
     */

    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data transfer.
     * </p>
     * 
     * @return Describes the number of seconds that have elapsed during the data transfer.
     */

    public Long getElapsedTimeInSeconds() {
        return this.elapsedTimeInSeconds;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data transfer.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        Describes the number of seconds that have elapsed during the data transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransferProgress withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        setElapsedTimeInSeconds(elapsedTimeInSeconds);
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
        if (getCurrentRateInMegaBytesPerSecond() != null)
            sb.append("CurrentRateInMegaBytesPerSecond: ").append(getCurrentRateInMegaBytesPerSecond()).append(",");
        if (getTotalDataInMegaBytes() != null)
            sb.append("TotalDataInMegaBytes: ").append(getTotalDataInMegaBytes()).append(",");
        if (getDataTransferredInMegaBytes() != null)
            sb.append("DataTransferredInMegaBytes: ").append(getDataTransferredInMegaBytes()).append(",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: ").append(getEstimatedTimeToCompletionInSeconds()).append(",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: ").append(getElapsedTimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataTransferProgress == false)
            return false;
        DataTransferProgress other = (DataTransferProgress) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCurrentRateInMegaBytesPerSecond() == null ^ this.getCurrentRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentRateInMegaBytesPerSecond() != null
                && other.getCurrentRateInMegaBytesPerSecond().equals(this.getCurrentRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null)
            return false;
        if (other.getTotalDataInMegaBytes() != null && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false)
            return false;
        if (other.getDataTransferredInMegaBytes() == null ^ this.getDataTransferredInMegaBytes() == null)
            return false;
        if (other.getDataTransferredInMegaBytes() != null && other.getDataTransferredInMegaBytes().equals(this.getDataTransferredInMegaBytes()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentRateInMegaBytesPerSecond() == null) ? 0 : getCurrentRateInMegaBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTotalDataInMegaBytes() == null) ? 0 : getTotalDataInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getDataTransferredInMegaBytes() == null) ? 0 : getDataTransferredInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0 : getEstimatedTimeToCompletionInSeconds().hashCode());
        hashCode = prime * hashCode + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public DataTransferProgress clone() {
        try {
            return (DataTransferProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
