/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for filtering a list of translation jobs. For more information, see
 * <a>ListTextTranslationJobs</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TextTranslationJobFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextTranslationJobFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submittedBeforeTime;
    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submittedAfterTime;

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * 
     * @param jobName
     *        Filters the list of jobs by name.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * 
     * @return Filters the list of jobs by name.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * Filters the list of jobs by name.
     * </p>
     * 
     * @param jobName
     *        Filters the list of jobs by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobFilter withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of jobs based by job status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * 
     * @return Filters the list of jobs based by job status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of jobs based by job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TextTranslationJobFilter withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based by job status.
     * </p>
     * 
     * @param jobStatus
     *        Filters the list of jobs based by job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TextTranslationJobFilter withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submittedBeforeTime
     *        Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *        jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public void setSubmittedBeforeTime(java.util.Date submittedBeforeTime) {
        this.submittedBeforeTime = submittedBeforeTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @return Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *         jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public java.util.Date getSubmittedBeforeTime() {
        return this.submittedBeforeTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submittedBeforeTime
     *        Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *        jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobFilter withSubmittedBeforeTime(java.util.Date submittedBeforeTime) {
        setSubmittedBeforeTime(submittedBeforeTime);
        return this;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submittedAfterTime
     *        Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *        jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public void setSubmittedAfterTime(java.util.Date submittedAfterTime) {
        this.submittedAfterTime = submittedAfterTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @return Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *         jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public java.util.Date getSubmittedAfterTime() {
        return this.submittedAfterTime;
    }

    /**
     * <p>
     * Filters the list of jobs based on the time that the job was submitted for processing and returns only the jobs
     * submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submittedAfterTime
     *        Filters the list of jobs based on the time that the job was submitted for processing and returns only the
     *        jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobFilter withSubmittedAfterTime(java.util.Date submittedAfterTime) {
        setSubmittedAfterTime(submittedAfterTime);
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
        if (getSubmittedBeforeTime() != null)
            sb.append("SubmittedBeforeTime: ").append(getSubmittedBeforeTime()).append(",");
        if (getSubmittedAfterTime() != null)
            sb.append("SubmittedAfterTime: ").append(getSubmittedAfterTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextTranslationJobFilter == false)
            return false;
        TextTranslationJobFilter other = (TextTranslationJobFilter) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSubmittedBeforeTime() == null ^ this.getSubmittedBeforeTime() == null)
            return false;
        if (other.getSubmittedBeforeTime() != null && other.getSubmittedBeforeTime().equals(this.getSubmittedBeforeTime()) == false)
            return false;
        if (other.getSubmittedAfterTime() == null ^ this.getSubmittedAfterTime() == null)
            return false;
        if (other.getSubmittedAfterTime() != null && other.getSubmittedAfterTime().equals(this.getSubmittedAfterTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmittedBeforeTime() == null) ? 0 : getSubmittedBeforeTime().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAfterTime() == null) ? 0 : getSubmittedAfterTime().hashCode());
        return hashCode;
    }

    @Override
    public TextTranslationJobFilter clone() {
        try {
            return (TextTranslationJobFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TextTranslationJobFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
