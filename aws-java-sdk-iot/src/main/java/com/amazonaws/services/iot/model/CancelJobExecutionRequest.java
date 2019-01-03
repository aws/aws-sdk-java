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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     * otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     * <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution
     * status. Use caution and ensure that the device is able to recover to a valid state.
     * </p>
     */
    private Boolean force;
    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     */
    private Long expectedVersion;
    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged. You can specify at most 10 name/value pairs.
     * </p>
     */
    private java.util.Map<String, String> statusDetails;

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * 
     * @param jobId
     *        The ID of the job to be canceled.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * 
     * @return The ID of the job to be canceled.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * 
     * @param jobId
     *        The ID of the job to be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * 
     * @param thingName
     *        The name of the thing whose execution of the job will be canceled.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * 
     * @return The name of the thing whose execution of the job will be canceled.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * 
     * @param thingName
     *        The name of the thing whose execution of the job will be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     * otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     * <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution
     * status. Use caution and ensure that the device is able to recover to a valid state.
     * </p>
     * 
     * @param force
     *        (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     *        otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     *        execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     *        <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.</p>
     *        <p>
     *        Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job
     *        execution status. Use caution and ensure that the device is able to recover to a valid state.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     * otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     * <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution
     * status. Use caution and ensure that the device is able to recover to a valid state.
     * </p>
     * 
     * @return (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or
     *         QUEUED, otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to
     *         cancel a job execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>,
     *         then an <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>
     *         .</p>
     *         <p>
     *         Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job
     *         execution status. Use caution and ensure that the device is able to recover to a valid state.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     * otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     * <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution
     * status. Use caution and ensure that the device is able to recover to a valid state.
     * </p>
     * 
     * @param force
     *        (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     *        otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     *        execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     *        <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.</p>
     *        <p>
     *        Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job
     *        execution status. Use caution and ensure that the device is able to recover to a valid state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or QUEUED,
     * otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>, then an
     * <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job execution
     * status. Use caution and ensure that the device is able to recover to a valid state.
     * </p>
     * 
     * @return (Optional) If <code>true</code> the job execution will be canceled if it has status IN_PROGRESS or
     *         QUEUED, otherwise the job execution will be canceled only if it has status QUEUED. If you attempt to
     *         cancel a job execution that is IN_PROGRESS, and you do not set <code>force</code> to <code>true</code>,
     *         then an <code>InvalidStateTransitionException</code> will be thrown. The default is <code>false</code>
     *         .</p>
     *         <p>
     *         Canceling a job execution which is "IN_PROGRESS", will cause the device to be unable to update the job
     *         execution status. Use caution and ensure that the device is able to recover to a valid state.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @param expectedVersion
     *        (Optional) The expected current version of the job execution. Each time you update the job execution, its
     *        version is incremented. If the version of the job execution stored in Jobs does not match, the update is
     *        rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status
     *        data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order
     *        to obtain the job execution status data.)
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @return (Optional) The expected current version of the job execution. Each time you update the job execution, its
     *         version is incremented. If the version of the job execution stored in Jobs does not match, the update is
     *         rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution
     *         status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in
     *         order to obtain the job execution status data.)
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @param expectedVersion
     *        (Optional) The expected current version of the job execution. Each time you update the job execution, its
     *        version is incremented. If the version of the job execution stored in Jobs does not match, the update is
     *        rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status
     *        data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order
     *        to obtain the job execution status data.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged. You can specify at most 10 name/value pairs.
     * </p>
     * 
     * @return A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *         statusDetails are unchanged. You can specify at most 10 name/value pairs.
     */

    public java.util.Map<String, String> getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged. You can specify at most 10 name/value pairs.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *        statusDetails are unchanged. You can specify at most 10 name/value pairs.
     */

    public void setStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged. You can specify at most 10 name/value pairs.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *        statusDetails are unchanged. You can specify at most 10 name/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest withStatusDetails(java.util.Map<String, String> statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    public CancelJobExecutionRequest addStatusDetailsEntry(String key, String value) {
        if (null == this.statusDetails) {
            this.statusDetails = new java.util.HashMap<String, String>();
        }
        if (this.statusDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statusDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StatusDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobExecutionRequest clearStatusDetailsEntries() {
        this.statusDetails = null;
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobExecutionRequest == false)
            return false;
        CancelJobExecutionRequest other = (CancelJobExecutionRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobExecutionRequest clone() {
        return (CancelJobExecutionRequest) super.clone();
    }

}
