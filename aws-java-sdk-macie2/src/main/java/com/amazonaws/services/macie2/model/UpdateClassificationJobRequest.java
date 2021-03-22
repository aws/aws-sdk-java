/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClassificationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The new status for the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status is
     * IDLE, PAUSED, RUNNING, or USER_PAUSED.
     * </p>
     * <p>
     * If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop all
     * processing tasks for the job. You can't resume or restart a job after you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     * </p>
     * <p>
     * If you paused the job while it was actively running and you specify this value less than 30 days after you paused
     * the job, Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes
     * the job according to the schedule and other settings for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE, PAUSED,
     * or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause
     * all processing tasks for the job.
     * </p>
     * <p>
     * If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the job. If
     * you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the job run expires
     * and Macie cancels the run. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @return The unique identifier for the classification job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClassificationJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The new status for the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status is
     * IDLE, PAUSED, RUNNING, or USER_PAUSED.
     * </p>
     * <p>
     * If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop all
     * processing tasks for the job. You can't resume or restart a job after you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     * </p>
     * <p>
     * If you paused the job while it was actively running and you specify this value less than 30 days after you paused
     * the job, Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes
     * the job according to the schedule and other settings for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE, PAUSED,
     * or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause
     * all processing tasks for the job.
     * </p>
     * <p>
     * If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the job. If
     * you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the job run expires
     * and Macie cancels the run. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The new status for the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status
     *        is IDLE, PAUSED, RUNNING, or USER_PAUSED.
     *        </p>
     *        <p>
     *        If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop
     *        all processing tasks for the job. You can't resume or restart a job after you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     *        </p>
     *        <p>
     *        If you paused the job while it was actively running and you specify this value less than 30 days after you
     *        paused the job, Macie immediately resumes processing from the point where you paused the job. Otherwise,
     *        Macie resumes the job according to the schedule and other settings for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE,
     *        PAUSED, or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately
     *        begins to pause all processing tasks for the job.
     *        </p>
     *        <p>
     *        If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the
     *        job. If you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the
     *        job run expires and Macie cancels the run. To check the expiration date, refer to the
     *        UserPausedDetails.jobExpiresAt property.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The new status for the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status is
     * IDLE, PAUSED, RUNNING, or USER_PAUSED.
     * </p>
     * <p>
     * If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop all
     * processing tasks for the job. You can't resume or restart a job after you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     * </p>
     * <p>
     * If you paused the job while it was actively running and you specify this value less than 30 days after you paused
     * the job, Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes
     * the job according to the schedule and other settings for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE, PAUSED,
     * or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause
     * all processing tasks for the job.
     * </p>
     * <p>
     * If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the job. If
     * you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the job run expires
     * and Macie cancels the run. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new status for the job. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current
     *         status is IDLE, PAUSED, RUNNING, or USER_PAUSED.
     *         </p>
     *         <p>
     *         If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to
     *         stop all processing tasks for the job. You can't resume or restart a job after you cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     *         </p>
     *         <p>
     *         If you paused the job while it was actively running and you specify this value less than 30 days after
     *         you paused the job, Macie immediately resumes processing from the point where you paused the job.
     *         Otherwise, Macie resumes the job according to the schedule and other settings for the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE,
     *         PAUSED, or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately
     *         begins to pause all processing tasks for the job.
     *         </p>
     *         <p>
     *         If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the
     *         job. If you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the
     *         job run expires and Macie cancels the run. To check the expiration date, refer to the
     *         UserPausedDetails.jobExpiresAt property.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The new status for the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status is
     * IDLE, PAUSED, RUNNING, or USER_PAUSED.
     * </p>
     * <p>
     * If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop all
     * processing tasks for the job. You can't resume or restart a job after you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     * </p>
     * <p>
     * If you paused the job while it was actively running and you specify this value less than 30 days after you paused
     * the job, Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes
     * the job according to the schedule and other settings for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE, PAUSED,
     * or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause
     * all processing tasks for the job.
     * </p>
     * <p>
     * If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the job. If
     * you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the job run expires
     * and Macie cancels the run. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The new status for the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status
     *        is IDLE, PAUSED, RUNNING, or USER_PAUSED.
     *        </p>
     *        <p>
     *        If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop
     *        all processing tasks for the job. You can't resume or restart a job after you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     *        </p>
     *        <p>
     *        If you paused the job while it was actively running and you specify this value less than 30 days after you
     *        paused the job, Macie immediately resumes processing from the point where you paused the job. Otherwise,
     *        Macie resumes the job according to the schedule and other settings for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE,
     *        PAUSED, or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately
     *        begins to pause all processing tasks for the job.
     *        </p>
     *        <p>
     *        If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the
     *        job. If you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the
     *        job run expires and Macie cancels the run. To check the expiration date, refer to the
     *        UserPausedDetails.jobExpiresAt property.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateClassificationJobRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The new status for the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status is
     * IDLE, PAUSED, RUNNING, or USER_PAUSED.
     * </p>
     * <p>
     * If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop all
     * processing tasks for the job. You can't resume or restart a job after you cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     * </p>
     * <p>
     * If you paused the job while it was actively running and you specify this value less than 30 days after you paused
     * the job, Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes
     * the job according to the schedule and other settings for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE, PAUSED,
     * or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause
     * all processing tasks for the job.
     * </p>
     * <p>
     * If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the job. If
     * you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the job run expires
     * and Macie cancels the run. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The new status for the job. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - Stops the job permanently and cancels it. This value is valid only if the job's current status
     *        is IDLE, PAUSED, RUNNING, or USER_PAUSED.
     *        </p>
     *        <p>
     *        If you specify this value and the job's current status is RUNNING, Amazon Macie immediately begins to stop
     *        all processing tasks for the job. You can't resume or restart a job after you cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED.
     *        </p>
     *        <p>
     *        If you paused the job while it was actively running and you specify this value less than 30 days after you
     *        paused the job, Macie immediately resumes processing from the point where you paused the job. Otherwise,
     *        Macie resumes the job according to the schedule and other settings for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - Pauses the job temporarily. This value is valid only if the job's current status is IDLE,
     *        PAUSED, or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately
     *        begins to pause all processing tasks for the job.
     *        </p>
     *        <p>
     *        If you pause a one-time job and you don't resume it within 30 days, the job expires and Macie cancels the
     *        job. If you pause a recurring job when its status is RUNNING and you don't resume it within 30 days, the
     *        job run expires and Macie cancels the run. To check the expiration date, refer to the
     *        UserPausedDetails.jobExpiresAt property.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateClassificationJobRequest withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClassificationJobRequest == false)
            return false;
        UpdateClassificationJobRequest other = (UpdateClassificationJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClassificationJobRequest clone() {
        return (UpdateClassificationJobRequest) super.clone();
    }

}
