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
package com.amazonaws.services.iotjobsdataplane.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the thing associated with the device.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every
     * update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     */
    private java.util.Map<String, String> statusDetails;
    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by again calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>. Note that
     * setting or resetting this timeout has no effect on that job execution timeout which may have been specified when
     * the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     */
    private Long stepTimeoutInMinutes;
    /**
     * <p>
     * Optional. The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     */
    private Long expectedVersion;
    /**
     * <p>
     * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
     * </p>
     */
    private Boolean includeJobExecutionState;
    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     */
    private Boolean includeJobDocument;
    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the thing associated with the device.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the device.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the device.
     * </p>
     * 
     * @return The name of the thing associated with the device.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the device.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every
     * update.
     * </p>
     * 
     * @param status
     *        The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified
     *        on every update.
     * @see JobExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every
     * update.
     * </p>
     * 
     * @return The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified
     *         on every update.
     * @see JobExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every
     * update.
     * </p>
     * 
     * @param status
     *        The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified
     *        on every update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionStatus
     */

    public UpdateJobExecutionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every
     * update.
     * </p>
     * 
     * @param status
     *        The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified
     *        on every update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionStatus
     */

    public UpdateJobExecutionRequest withStatus(JobExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @return Optional. A collection of name/value pairs that describe the status of the job execution. If not
     *         specified, the statusDetails are unchanged.
     */

    public java.util.Map<String, String> getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @param statusDetails
     *        Optional. A collection of name/value pairs that describe the status of the job execution. If not
     *        specified, the statusDetails are unchanged.
     */

    public void setStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @param statusDetails
     *        Optional. A collection of name/value pairs that describe the status of the job execution. If not
     *        specified, the statusDetails are unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withStatusDetails(java.util.Map<String, String> statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    public UpdateJobExecutionRequest addStatusDetailsEntry(String key, String value) {
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

    public UpdateJobExecutionRequest clearStatusDetailsEntries() {
        this.statusDetails = null;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by again calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>. Note that
     * setting or resetting this timeout has no effect on that job execution timeout which may have been specified when
     * the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @param stepTimeoutInMinutes
     *        Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *        is not set to a terminal state before this timer expires, or before the timer is reset (by again calling
     *        <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *        timeout value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>.
     *        Note that setting or resetting this timeout has no effect on that job execution timeout which may have
     *        been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     */

    public void setStepTimeoutInMinutes(Long stepTimeoutInMinutes) {
        this.stepTimeoutInMinutes = stepTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by again calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>. Note that
     * setting or resetting this timeout has no effect on that job execution timeout which may have been specified when
     * the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @return Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *         is not set to a terminal state before this timer expires, or before the timer is reset (by again calling
     *         <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *         timeout value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>
     *         . Note that setting or resetting this timeout has no effect on that job execution timeout which may have
     *         been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     */

    public Long getStepTimeoutInMinutes() {
        return this.stepTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by again calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>. Note that
     * setting or resetting this timeout has no effect on that job execution timeout which may have been specified when
     * the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @param stepTimeoutInMinutes
     *        Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *        is not set to a terminal state before this timer expires, or before the timer is reset (by again calling
     *        <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *        timeout value in this field) the job execution status will be automatically set to <code>TIMED_OUT</code>.
     *        Note that setting or resetting this timeout has no effect on that job execution timeout which may have
     *        been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withStepTimeoutInMinutes(Long stepTimeoutInMinutes) {
        setStepTimeoutInMinutes(stepTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * Optional. The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @param expectedVersion
     *        Optional. The expected current version of the job execution. Each time you update the job execution, its
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
     * Optional. The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @return Optional. The expected current version of the job execution. Each time you update the job execution, its
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
     * Optional. The expected current version of the job execution. Each time you update the job execution, its version
     * is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a
     * VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned.
     * (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job
     * execution status data.)
     * </p>
     * 
     * @param expectedVersion
     *        Optional. The expected current version of the job execution. Each time you update the job execution, its
     *        version is incremented. If the version of the job execution stored in Jobs does not match, the update is
     *        rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status
     *        data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order
     *        to obtain the job execution status data.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
        return this;
    }

    /**
     * <p>
     * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
     * </p>
     * 
     * @param includeJobExecutionState
     *        Optional. When included and set to true, the response contains the JobExecutionState data. The default is
     *        false.
     */

    public void setIncludeJobExecutionState(Boolean includeJobExecutionState) {
        this.includeJobExecutionState = includeJobExecutionState;
    }

    /**
     * <p>
     * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
     * </p>
     * 
     * @return Optional. When included and set to true, the response contains the JobExecutionState data. The default is
     *         false.
     */

    public Boolean getIncludeJobExecutionState() {
        return this.includeJobExecutionState;
    }

    /**
     * <p>
     * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
     * </p>
     * 
     * @param includeJobExecutionState
     *        Optional. When included and set to true, the response contains the JobExecutionState data. The default is
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withIncludeJobExecutionState(Boolean includeJobExecutionState) {
        setIncludeJobExecutionState(includeJobExecutionState);
        return this;
    }

    /**
     * <p>
     * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
     * </p>
     * 
     * @return Optional. When included and set to true, the response contains the JobExecutionState data. The default is
     *         false.
     */

    public Boolean isIncludeJobExecutionState() {
        return this.includeJobExecutionState;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @param includeJobDocument
     *        Optional. When set to true, the response contains the job document. The default is false.
     */

    public void setIncludeJobDocument(Boolean includeJobDocument) {
        this.includeJobDocument = includeJobDocument;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @return Optional. When set to true, the response contains the job document. The default is false.
     */

    public Boolean getIncludeJobDocument() {
        return this.includeJobDocument;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @param includeJobDocument
     *        Optional. When set to true, the response contains the job document. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withIncludeJobDocument(Boolean includeJobDocument) {
        setIncludeJobDocument(includeJobDocument);
        return this;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @return Optional. When set to true, the response contains the job document. The default is false.
     */

    public Boolean isIncludeJobDocument() {
        return this.includeJobDocument;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device.
     * </p>
     * 
     * @param executionNumber
     *        Optional. A number that identifies a particular job execution on a particular device.
     */

    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device.
     * </p>
     * 
     * @return Optional. A number that identifies a particular job execution on a particular device.
     */

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device.
     * </p>
     * 
     * @param executionNumber
     *        Optional. A number that identifies a particular job execution on a particular device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobExecutionRequest withExecutionNumber(Long executionNumber) {
        setExecutionNumber(executionNumber);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStepTimeoutInMinutes() != null)
            sb.append("StepTimeoutInMinutes: ").append(getStepTimeoutInMinutes()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion()).append(",");
        if (getIncludeJobExecutionState() != null)
            sb.append("IncludeJobExecutionState: ").append(getIncludeJobExecutionState()).append(",");
        if (getIncludeJobDocument() != null)
            sb.append("IncludeJobDocument: ").append(getIncludeJobDocument()).append(",");
        if (getExecutionNumber() != null)
            sb.append("ExecutionNumber: ").append(getExecutionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobExecutionRequest == false)
            return false;
        UpdateJobExecutionRequest other = (UpdateJobExecutionRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getStepTimeoutInMinutes() == null ^ this.getStepTimeoutInMinutes() == null)
            return false;
        if (other.getStepTimeoutInMinutes() != null && other.getStepTimeoutInMinutes().equals(this.getStepTimeoutInMinutes()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        if (other.getIncludeJobExecutionState() == null ^ this.getIncludeJobExecutionState() == null)
            return false;
        if (other.getIncludeJobExecutionState() != null && other.getIncludeJobExecutionState().equals(this.getIncludeJobExecutionState()) == false)
            return false;
        if (other.getIncludeJobDocument() == null ^ this.getIncludeJobDocument() == null)
            return false;
        if (other.getIncludeJobDocument() != null && other.getIncludeJobDocument().equals(this.getIncludeJobDocument()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStepTimeoutInMinutes() == null) ? 0 : getStepTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode + ((getIncludeJobExecutionState() == null) ? 0 : getIncludeJobExecutionState().hashCode());
        hashCode = prime * hashCode + ((getIncludeJobDocument() == null) ? 0 : getIncludeJobDocument().hashCode());
        hashCode = prime * hashCode + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobExecutionRequest clone() {
        return (UpdateJobExecutionRequest) super.clone();
    }

}
