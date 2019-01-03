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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a point which a job can resume processing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JobBookmarkEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobBookmarkEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the job in question.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Version of the job.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The run ID number.
     * </p>
     */
    private Integer run;
    /**
     * <p>
     * The attempt ID number.
     * </p>
     */
    private Integer attempt;
    /**
     * <p>
     * The bookmark itself.
     * </p>
     */
    private String jobBookmark;

    /**
     * <p>
     * Name of the job in question.
     * </p>
     * 
     * @param jobName
     *        Name of the job in question.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Name of the job in question.
     * </p>
     * 
     * @return Name of the job in question.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * Name of the job in question.
     * </p>
     * 
     * @param jobName
     *        Name of the job in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobBookmarkEntry withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Version of the job.
     * </p>
     * 
     * @param version
     *        Version of the job.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of the job.
     * </p>
     * 
     * @return Version of the job.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of the job.
     * </p>
     * 
     * @param version
     *        Version of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobBookmarkEntry withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     * 
     * @param run
     *        The run ID number.
     */

    public void setRun(Integer run) {
        this.run = run;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     * 
     * @return The run ID number.
     */

    public Integer getRun() {
        return this.run;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     * 
     * @param run
     *        The run ID number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobBookmarkEntry withRun(Integer run) {
        setRun(run);
        return this;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     * 
     * @param attempt
     *        The attempt ID number.
     */

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     * 
     * @return The attempt ID number.
     */

    public Integer getAttempt() {
        return this.attempt;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     * 
     * @param attempt
     *        The attempt ID number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobBookmarkEntry withAttempt(Integer attempt) {
        setAttempt(attempt);
        return this;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     * 
     * @param jobBookmark
     *        The bookmark itself.
     */

    public void setJobBookmark(String jobBookmark) {
        this.jobBookmark = jobBookmark;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     * 
     * @return The bookmark itself.
     */

    public String getJobBookmark() {
        return this.jobBookmark;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     * 
     * @param jobBookmark
     *        The bookmark itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobBookmarkEntry withJobBookmark(String jobBookmark) {
        setJobBookmark(jobBookmark);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getRun() != null)
            sb.append("Run: ").append(getRun()).append(",");
        if (getAttempt() != null)
            sb.append("Attempt: ").append(getAttempt()).append(",");
        if (getJobBookmark() != null)
            sb.append("JobBookmark: ").append(getJobBookmark());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobBookmarkEntry == false)
            return false;
        JobBookmarkEntry other = (JobBookmarkEntry) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRun() == null ^ this.getRun() == null)
            return false;
        if (other.getRun() != null && other.getRun().equals(this.getRun()) == false)
            return false;
        if (other.getAttempt() == null ^ this.getAttempt() == null)
            return false;
        if (other.getAttempt() != null && other.getAttempt().equals(this.getAttempt()) == false)
            return false;
        if (other.getJobBookmark() == null ^ this.getJobBookmark() == null)
            return false;
        if (other.getJobBookmark() != null && other.getJobBookmark().equals(this.getJobBookmark()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRun() == null) ? 0 : getRun().hashCode());
        hashCode = prime * hashCode + ((getAttempt() == null) ? 0 : getAttempt().hashCode());
        hashCode = prime * hashCode + ((getJobBookmark() == null) ? 0 : getJobBookmark().hashCode());
        return hashCode;
    }

    @Override
    public JobBookmarkEntry clone() {
        try {
            return (JobBookmarkEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JobBookmarkEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
