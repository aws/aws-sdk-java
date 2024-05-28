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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeDiscoveryJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDiscoveryJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the on-premises storage system you're running the discovery job on.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * The ARN of the discovery job.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * The number of minutes that the discovery job runs.
     * </p>
     */
    private Integer collectionDurationMinutes;
    /**
     * <p>
     * Indicates the status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the discovery job started.
     * </p>
     */
    private java.util.Date jobStartTime;
    /**
     * <p>
     * The time when the discovery job ended.
     * </p>
     */
    private java.util.Date jobEndTime;

    /**
     * <p>
     * The ARN of the on-premises storage system you're running the discovery job on.
     * </p>
     * 
     * @param storageSystemArn
     *        The ARN of the on-premises storage system you're running the discovery job on.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * The ARN of the on-premises storage system you're running the discovery job on.
     * </p>
     * 
     * @return The ARN of the on-premises storage system you're running the discovery job on.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * The ARN of the on-premises storage system you're running the discovery job on.
     * </p>
     * 
     * @param storageSystemArn
     *        The ARN of the on-premises storage system you're running the discovery job on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobResult withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the discovery job.
     * </p>
     * 
     * @param discoveryJobArn
     *        The ARN of the discovery job.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * The ARN of the discovery job.
     * </p>
     * 
     * @return The ARN of the discovery job.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * The ARN of the discovery job.
     * </p>
     * 
     * @param discoveryJobArn
     *        The ARN of the discovery job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobResult withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * The number of minutes that the discovery job runs.
     * </p>
     * 
     * @param collectionDurationMinutes
     *        The number of minutes that the discovery job runs.
     */

    public void setCollectionDurationMinutes(Integer collectionDurationMinutes) {
        this.collectionDurationMinutes = collectionDurationMinutes;
    }

    /**
     * <p>
     * The number of minutes that the discovery job runs.
     * </p>
     * 
     * @return The number of minutes that the discovery job runs.
     */

    public Integer getCollectionDurationMinutes() {
        return this.collectionDurationMinutes;
    }

    /**
     * <p>
     * The number of minutes that the discovery job runs.
     * </p>
     * 
     * @param collectionDurationMinutes
     *        The number of minutes that the discovery job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobResult withCollectionDurationMinutes(Integer collectionDurationMinutes) {
        setCollectionDurationMinutes(collectionDurationMinutes);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        Indicates the status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @see DiscoveryJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @return Indicates the status of a discovery job. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *         >Discovery job statuses</a>.
     * @see DiscoveryJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        Indicates the status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryJobStatus
     */

    public DescribeDiscoveryJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        Indicates the status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryJobStatus
     */

    public DescribeDiscoveryJobResult withStatus(DiscoveryJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the discovery job started.
     * </p>
     * 
     * @param jobStartTime
     *        The time when the discovery job started.
     */

    public void setJobStartTime(java.util.Date jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    /**
     * <p>
     * The time when the discovery job started.
     * </p>
     * 
     * @return The time when the discovery job started.
     */

    public java.util.Date getJobStartTime() {
        return this.jobStartTime;
    }

    /**
     * <p>
     * The time when the discovery job started.
     * </p>
     * 
     * @param jobStartTime
     *        The time when the discovery job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobResult withJobStartTime(java.util.Date jobStartTime) {
        setJobStartTime(jobStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the discovery job ended.
     * </p>
     * 
     * @param jobEndTime
     *        The time when the discovery job ended.
     */

    public void setJobEndTime(java.util.Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    /**
     * <p>
     * The time when the discovery job ended.
     * </p>
     * 
     * @return The time when the discovery job ended.
     */

    public java.util.Date getJobEndTime() {
        return this.jobEndTime;
    }

    /**
     * <p>
     * The time when the discovery job ended.
     * </p>
     * 
     * @param jobEndTime
     *        The time when the discovery job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobResult withJobEndTime(java.util.Date jobEndTime) {
        setJobEndTime(jobEndTime);
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
        if (getStorageSystemArn() != null)
            sb.append("StorageSystemArn: ").append(getStorageSystemArn()).append(",");
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn()).append(",");
        if (getCollectionDurationMinutes() != null)
            sb.append("CollectionDurationMinutes: ").append(getCollectionDurationMinutes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobStartTime() != null)
            sb.append("JobStartTime: ").append(getJobStartTime()).append(",");
        if (getJobEndTime() != null)
            sb.append("JobEndTime: ").append(getJobEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDiscoveryJobResult == false)
            return false;
        DescribeDiscoveryJobResult other = (DescribeDiscoveryJobResult) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
            return false;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getCollectionDurationMinutes() == null ^ this.getCollectionDurationMinutes() == null)
            return false;
        if (other.getCollectionDurationMinutes() != null && other.getCollectionDurationMinutes().equals(this.getCollectionDurationMinutes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobStartTime() == null ^ this.getJobStartTime() == null)
            return false;
        if (other.getJobStartTime() != null && other.getJobStartTime().equals(this.getJobStartTime()) == false)
            return false;
        if (other.getJobEndTime() == null ^ this.getJobEndTime() == null)
            return false;
        if (other.getJobEndTime() != null && other.getJobEndTime().equals(this.getJobEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionDurationMinutes() == null) ? 0 : getCollectionDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJobStartTime() == null) ? 0 : getJobStartTime().hashCode());
        hashCode = prime * hashCode + ((getJobEndTime() == null) ? 0 : getJobEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDiscoveryJobResult clone() {
        try {
            return (DescribeDiscoveryJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
