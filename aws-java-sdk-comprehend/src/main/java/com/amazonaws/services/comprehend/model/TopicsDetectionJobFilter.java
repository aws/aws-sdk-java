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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for filtering topic detection jobs. For more information, see .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TopicsDetectionJobFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicsDetectionJobFilter implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String jobName;
    /**
     * <p>
     * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submitTimeBefore;
    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submitTimeAfter;

    /**
     * <p/>
     * 
     * @param jobName
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p/>
     * 
     * @param jobName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobFilter withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * </p>
     * 
     * @return Filters the list of topic detection jobs based on job status. Returns only jobs with the specified
     *         status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TopicsDetectionJobFilter withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of topic detection jobs based on job status. Returns only jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TopicsDetectionJobFilter withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submitTimeBefore
     *        Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *        submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public void setSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @return Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *         submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public java.util.Date getSubmitTimeBefore() {
        return this.submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submitTimeBefore
     *        Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *        submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobFilter withSubmitTimeBefore(java.util.Date submitTimeBefore) {
        setSubmitTimeBefore(submitTimeBefore);
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submitTimeAfter
     *        Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *        submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public void setSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @return Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *         submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public java.util.Date getSubmitTimeAfter() {
        return this.submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs submitted
     * after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submitTimeAfter
     *        Filters the list of jobs based on the time that the job was submitted for processing. Only returns jobs
     *        submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobFilter withSubmitTimeAfter(java.util.Date submitTimeAfter) {
        setSubmitTimeAfter(submitTimeAfter);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getSubmitTimeBefore() != null)
            sb.append("SubmitTimeBefore: ").append(getSubmitTimeBefore()).append(",");
        if (getSubmitTimeAfter() != null)
            sb.append("SubmitTimeAfter: ").append(getSubmitTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicsDetectionJobFilter == false)
            return false;
        TopicsDetectionJobFilter other = (TopicsDetectionJobFilter) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSubmitTimeBefore() == null ^ this.getSubmitTimeBefore() == null)
            return false;
        if (other.getSubmitTimeBefore() != null && other.getSubmitTimeBefore().equals(this.getSubmitTimeBefore()) == false)
            return false;
        if (other.getSubmitTimeAfter() == null ^ this.getSubmitTimeAfter() == null)
            return false;
        if (other.getSubmitTimeAfter() != null && other.getSubmitTimeAfter().equals(this.getSubmitTimeAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmitTimeBefore() == null) ? 0 : getSubmitTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getSubmitTimeAfter() == null) ? 0 : getSubmitTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public TopicsDetectionJobFilter clone() {
        try {
            return (TopicsDetectionJobFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.TopicsDetectionJobFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
