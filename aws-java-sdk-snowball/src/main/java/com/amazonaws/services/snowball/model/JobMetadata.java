/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a specific job including shipping information, job
 * status, and other important metadata. This information is returned as a part
 * of the response syntax of the <code>DescribeJob</code> action.
 * </p>
 */
public class JobMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a job. For example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * </p>
     */
    private String jobState;
    /**
     * <p>
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * </p>
     */
    private String description;
    /**
     * <p>
     * </p>
     */
    private String kmsKeyARN;
    /**
     * <p>
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * </p>
     */
    private ShippingDetails shippingDetails;
    /**
     * <p>
     * </p>
     */
    private String snowballCapacityPreference;
    /**
     * <p>
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * </p>
     */
    private DataTransfer dataTransferProgress;
    /**
     * <p>
     * </p>
     */
    private JobLogs jobLogInfo;

    /**
     * <p>
     * The automatically generated ID for a job. For example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job. For example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job. For example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The automatically generated ID for a job. For example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job. For example
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job. For example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobState
     * @see JobState
     */

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     * @see JobState
     */

    public String getJobState() {
        return this.jobState;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobState
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobState
     */

    public JobMetadata withJobState(String jobState) {
        setJobState(jobState);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobState
     * @see JobState
     */

    public void setJobState(JobState jobState) {
        this.jobState = jobState.toString();
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobState
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobState
     */

    public JobMetadata withJobState(JobState jobState) {
        setJobState(jobState);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobType
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */

    public JobMetadata withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobType
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */

    public JobMetadata withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param creationDate
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * </p>
     * 
     * @param creationDate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resources
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resources
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * </p>
     * 
     * @param description
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param kmsKeyARN
     */

    public void setKmsKeyARN(String kmsKeyARN) {
        this.kmsKeyARN = kmsKeyARN;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getKmsKeyARN() {
        return this.kmsKeyARN;
    }

    /**
     * <p>
     * </p>
     * 
     * @param kmsKeyARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withKmsKeyARN(String kmsKeyARN) {
        setKmsKeyARN(kmsKeyARN);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param roleARN
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * </p>
     * 
     * @param roleARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param addressId
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * </p>
     * 
     * @param addressId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param shippingDetails
     */

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public ShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * <p>
     * </p>
     * 
     * @param shippingDetails
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withShippingDetails(ShippingDetails shippingDetails) {
        setShippingDetails(shippingDetails);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param snowballCapacityPreference
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     * @see SnowballCapacity
     */

    public String getSnowballCapacityPreference() {
        return this.snowballCapacityPreference;
    }

    /**
     * <p>
     * </p>
     * 
     * @param snowballCapacityPreference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */

    public JobMetadata withSnowballCapacityPreference(
            String snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param snowballCapacityPreference
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(
            SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * </p>
     * 
     * @param snowballCapacityPreference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see SnowballCapacity
     */

    public JobMetadata withSnowballCapacityPreference(
            SnowballCapacity snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param notification
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * </p>
     * 
     * @param notification
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param dataTransferProgress
     */

    public void setDataTransferProgress(DataTransfer dataTransferProgress) {
        this.dataTransferProgress = dataTransferProgress;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public DataTransfer getDataTransferProgress() {
        return this.dataTransferProgress;
    }

    /**
     * <p>
     * </p>
     * 
     * @param dataTransferProgress
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withDataTransferProgress(
            DataTransfer dataTransferProgress) {
        setDataTransferProgress(dataTransferProgress);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobLogInfo
     */

    public void setJobLogInfo(JobLogs jobLogInfo) {
        this.jobLogInfo = jobLogInfo;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public JobLogs getJobLogInfo() {
        return this.jobLogInfo;
    }

    /**
     * <p>
     * </p>
     * 
     * @param jobLogInfo
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobMetadata withJobLogInfo(JobLogs jobLogInfo) {
        setJobLogInfo(jobLogInfo);
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobState() != null)
            sb.append("JobState: " + getJobState() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyARN() != null)
            sb.append("KmsKeyARN: " + getKmsKeyARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingDetails() != null)
            sb.append("ShippingDetails: " + getShippingDetails() + ",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: "
                    + getSnowballCapacityPreference() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getDataTransferProgress() != null)
            sb.append("DataTransferProgress: " + getDataTransferProgress()
                    + ",");
        if (getJobLogInfo() != null)
            sb.append("JobLogInfo: " + getJobLogInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobMetadata == false)
            return false;
        JobMetadata other = (JobMetadata) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobState() == null ^ this.getJobState() == null)
            return false;
        if (other.getJobState() != null
                && other.getJobState().equals(this.getJobState()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null
                && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyARN() == null ^ this.getKmsKeyARN() == null)
            return false;
        if (other.getKmsKeyARN() != null
                && other.getKmsKeyARN().equals(this.getKmsKeyARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingDetails() == null
                ^ this.getShippingDetails() == null)
            return false;
        if (other.getShippingDetails() != null
                && other.getShippingDetails().equals(this.getShippingDetails()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null
                ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null
                && other.getSnowballCapacityPreference().equals(
                        this.getSnowballCapacityPreference()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null
                && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getDataTransferProgress() == null
                ^ this.getDataTransferProgress() == null)
            return false;
        if (other.getDataTransferProgress() != null
                && other.getDataTransferProgress().equals(
                        this.getDataTransferProgress()) == false)
            return false;
        if (other.getJobLogInfo() == null ^ this.getJobLogInfo() == null)
            return false;
        if (other.getJobLogInfo() != null
                && other.getJobLogInfo().equals(this.getJobLogInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode
                + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode
                + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyARN() == null) ? 0 : getKmsKeyARN().hashCode());
        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime
                * hashCode
                + ((getShippingDetails() == null) ? 0 : getShippingDetails()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnowballCapacityPreference() == null) ? 0
                        : getSnowballCapacityPreference().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotification() == null) ? 0 : getNotification()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataTransferProgress() == null) ? 0
                        : getDataTransferProgress().hashCode());
        hashCode = prime * hashCode
                + ((getJobLogInfo() == null) ? 0 : getJobLogInfo().hashCode());
        return hashCode;
    }

    @Override
    public JobMetadata clone() {
        try {
            return (JobMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
