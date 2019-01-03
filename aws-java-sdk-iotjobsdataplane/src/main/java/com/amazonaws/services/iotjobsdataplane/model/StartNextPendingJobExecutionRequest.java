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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/StartNextPendingJobExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNextPendingJobExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing associated with the device.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     */
    private java.util.Map<String, String> statusDetails;
    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically set to
     * <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout which may have
     * been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     */
    private Long stepTimeoutInMinutes;

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

    public StartNextPendingJobExecutionRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @return A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *         statusDetails are unchanged.
     */

    public java.util.Map<String, String> getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *        statusDetails are unchanged.
     */

    public void setStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution. If not specified, the
     * statusDetails are unchanged.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution. If not specified, the
     *        statusDetails are unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNextPendingJobExecutionRequest withStatusDetails(java.util.Map<String, String> statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    public StartNextPendingJobExecutionRequest addStatusDetailsEntry(String key, String value) {
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

    public StartNextPendingJobExecutionRequest clearStatusDetailsEntries() {
        this.statusDetails = null;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically set to
     * <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout which may have
     * been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @param stepTimeoutInMinutes
     *        Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *        is not set to a terminal state before this timer expires, or before the timer is reset (by calling
     *        <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *        timeout value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically
     *        set to <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout
     *        which may have been specified when the job was created (<code>CreateJob</code> using field
     *        <code>timeoutConfig</code>).
     */

    public void setStepTimeoutInMinutes(Long stepTimeoutInMinutes) {
        this.stepTimeoutInMinutes = stepTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically set to
     * <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout which may have
     * been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @return Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *         is not set to a terminal state before this timer expires, or before the timer is reset (by calling
     *         <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *         timeout value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically
     *         set to <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout
     *         which may have been specified when the job was created (<code>CreateJob</code> using field
     *         <code>timeoutConfig</code>).
     */

    public Long getStepTimeoutInMinutes() {
        return this.stepTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not
     * set to a terminal state before this timer expires, or before the timer is reset (by calling
     * <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new timeout
     * value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically set to
     * <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout which may have
     * been specified when the job was created (<code>CreateJob</code> using field <code>timeoutConfig</code>).
     * </p>
     * 
     * @param stepTimeoutInMinutes
     *        Specifies the amount of time this device has to finish execution of this job. If the job execution status
     *        is not set to a terminal state before this timer expires, or before the timer is reset (by calling
     *        <code>UpdateJobExecution</code>, setting the status to <code>IN_PROGRESS</code> and specifying a new
     *        timeout value in field <code>stepTimeoutInMinutes</code>) the job execution status will be automatically
     *        set to <code>TIMED_OUT</code>. Note that setting this timeout has no effect on that job execution timeout
     *        which may have been specified when the job was created (<code>CreateJob</code> using field
     *        <code>timeoutConfig</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNextPendingJobExecutionRequest withStepTimeoutInMinutes(Long stepTimeoutInMinutes) {
        setStepTimeoutInMinutes(stepTimeoutInMinutes);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStepTimeoutInMinutes() != null)
            sb.append("StepTimeoutInMinutes: ").append(getStepTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNextPendingJobExecutionRequest == false)
            return false;
        StartNextPendingJobExecutionRequest other = (StartNextPendingJobExecutionRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getStepTimeoutInMinutes() == null ^ this.getStepTimeoutInMinutes() == null)
            return false;
        if (other.getStepTimeoutInMinutes() != null && other.getStepTimeoutInMinutes().equals(this.getStepTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStepTimeoutInMinutes() == null) ? 0 : getStepTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public StartNextPendingJobExecutionRequest clone() {
        return (StartNextPendingJobExecutionRequest) super.clone();
    }

}
