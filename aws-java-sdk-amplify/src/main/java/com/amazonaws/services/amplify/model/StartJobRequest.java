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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for Start job request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Type for the Job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * Reason for the Job.
     * </p>
     */
    private String jobReason;
    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     */
    private java.util.Date commitTime;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @param branchName
     *        Name for the branch, for the Job.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @return Name for the branch, for the Job.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @param branchName
     *        Name for the branch, for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @param jobId
     *        Unique Id for the Job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @return Unique Id for the Job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @param jobId
     *        Unique Id for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @return Type for the Job.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public StartJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public StartJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the Job.
     * </p>
     * 
     * @param jobReason
     *        Reason for the Job.
     */

    public void setJobReason(String jobReason) {
        this.jobReason = jobReason;
    }

    /**
     * <p>
     * Reason for the Job.
     * </p>
     * 
     * @return Reason for the Job.
     */

    public String getJobReason() {
        return this.jobReason;
    }

    /**
     * <p>
     * Reason for the Job.
     * </p>
     * 
     * @param jobReason
     *        Reason for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withJobReason(String jobReason) {
        setJobReason(jobReason);
        return this;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitId
     *        Commit Id from 3rd party repository provider for the Job.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @return Commit Id from 3rd party repository provider for the Job.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitId
     *        Commit Id from 3rd party repository provider for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitMessage
     *        Commit message from 3rd party repository provider for the Job.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @return Commit message from 3rd party repository provider for the Job.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitMessage
     *        Commit message from 3rd party repository provider for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRequest withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @param commitTime
     *        Commit date / time for the Job.
     */

    public void setCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @return Commit date / time for the Job.
     */

    public java.util.Date getCommitTime() {
        return this.commitTime;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @param commitTime
     *        Commit date / time for the Job.
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
