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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request structure for the start job request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The branch name for the job.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of <code>jobType</code> is <code>RETRY</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change from
     * the specified branch. This value is available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the <code>jobId</code>
     * is also required.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     */
    private String jobReason;
    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     */
    private java.util.Date commitTime;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @return The unique ID for an Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * 
     * @param branchName
     *        The branch name for the job.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * 
     * @return The branch name for the job.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * 
     * @param branchName
     *        The branch name for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * 
     * @param jobId
     *        The unique ID for an existing job. This is required if the value of <code>jobType</code> is
     *        <code>RETRY</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * 
     * @return The unique ID for an existing job. This is required if the value of <code>jobType</code> is
     *         <code>RETRY</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * 
     * @param jobId
     *        The unique ID for an existing job. This is required if the value of <code>jobType</code> is
     *        <code>RETRY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change from
     * the specified branch. This value is available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the <code>jobId</code>
     * is also required.
     * </p>
     * 
     * @param jobType
     *        Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change
     *        from the specified branch. This value is available only for apps that are connected to a repository. The
     *        job type <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the
     *        <code>jobId</code> is also required.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change from
     * the specified branch. This value is available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the <code>jobId</code>
     * is also required.
     * </p>
     * 
     * @return Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change
     *         from the specified branch. This value is available only for apps that are connected to a repository. The
     *         job type <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the
     *         <code>jobId</code> is also required.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change from
     * the specified branch. This value is available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the <code>jobId</code>
     * is also required.
     * </p>
     * 
     * @param jobType
     *        Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change
     *        from the specified branch. This value is available only for apps that are connected to a repository. The
     *        job type <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the
     *        <code>jobId</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public StartJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change from
     * the specified branch. This value is available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the <code>jobId</code>
     * is also required.
     * </p>
     * 
     * @param jobType
     *        Describes the type for the job. The job type <code>RELEASE</code> starts a new job with the latest change
     *        from the specified branch. This value is available only for apps that are connected to a repository. The
     *        job type <code>RETRY</code> retries an existing job. If the job type value is <code>RETRY</code>, the
     *        <code>jobId</code> is also required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public StartJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * 
     * @param jobReason
     *        A descriptive reason for starting this job.
     */

    public void setJobReason(String jobReason) {
        this.jobReason = jobReason;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * 
     * @return A descriptive reason for starting this job.
     */

    public String getJobReason() {
        return this.jobReason;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * 
     * @param jobReason
     *        A descriptive reason for starting this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withJobReason(String jobReason) {
        setJobReason(jobReason);
        return this;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * 
     * @param commitId
     *        The commit ID from a third-party repository provider for the job.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * 
     * @return The commit ID from a third-party repository provider for the job.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * 
     * @param commitId
     *        The commit ID from a third-party repository provider for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * 
     * @param commitMessage
     *        The commit message from a third-party repository provider for the job.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * 
     * @return The commit message from a third-party repository provider for the job.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * 
     * @param commitMessage
     *        The commit message from a third-party repository provider for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     * 
     * @param commitTime
     *        The commit date and time for the job.
     */

    public void setCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     * 
     * @return The commit date and time for the job.
     */

    public java.util.Date getCommitTime() {
        return this.commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     * 
     * @param commitTime
     *        The commit date and time for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withCommitTime(java.util.Date commitTime) {
        setCommitTime(commitTime);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getJobReason() != null)
            sb.append("JobReason: ").append(getJobReason()).append(",");
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getCommitTime() != null)
            sb.append("CommitTime: ").append(getCommitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRequest == false)
            return false;
        StartJobRequest other = (StartJobRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getJobReason() == null ^ this.getJobReason() == null)
            return false;
        if (other.getJobReason() != null && other.getJobReason().equals(this.getJobReason()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getCommitTime() == null ^ this.getCommitTime() == null)
            return false;
        if (other.getCommitTime() != null && other.getCommitTime().equals(this.getCommitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getJobReason() == null) ? 0 : getJobReason().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getCommitTime() == null) ? 0 : getCommitTime().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRequest clone() {
        return (StartJobRequest) super.clone();
    }

}
