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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the summary of the code review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CodeReviewSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeReviewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the code review.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     */
    private String codeReviewArn;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The state of the code review.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;
    /**
     * <p>
     * The type of the code review.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The pull request ID for the code review.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The statistics from the code review.
     * </p>
     */
    private MetricsSummary metricsSummary;

    /**
     * <p>
     * The name of the code review.
     * </p>
     * 
     * @param name
     *        The name of the code review.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the code review.
     * </p>
     * 
     * @return The name of the code review.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the code review.
     * </p>
     * 
     * @param name
     *        The name of the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     */

    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *         <code>CodeReview</code> </a> object.
     */

    public String getCodeReviewArn() {
        return this.codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *        that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @return The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *         that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *         username for the account that owns the repository.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that
     * owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account
     *        that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @return The provider type of the repository association.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CodeReviewSummary withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CodeReviewSummary withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the code review.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the code review. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @see JobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the code review.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the code review. </p>
     *         <p>
     *         The valid code review states are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code>: The code review is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Pending</code>: The code review started and has not completed or failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: The code review failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>: The code review is being deleted.
     *         </p>
     *         </li>
     * @see JobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the code review.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the code review. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public CodeReviewSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the code review.
     * </p>
     * <p>
     * The valid code review states are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The code review is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code>: The code review started and has not completed or failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The code review failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: The code review is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the code review. </p>
     *        <p>
     *        The valid code review states are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The code review is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code>: The code review started and has not completed or failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: The code review failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: The code review is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public CodeReviewSummary withState(JobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time, in milliseconds since the epoch, when the code review was created.
     */

    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the code review was created.
     */

    public java.util.Date getCreatedTimeStamp() {
        return this.createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time, in milliseconds since the epoch, when the code review was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        setCreatedTimeStamp(createdTimeStamp);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, when the code review was last updated.
     */

    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the code review was last updated.
     */

    public java.util.Date getLastUpdatedTimeStamp() {
        return this.lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the code review was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, when the code review was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        setLastUpdatedTimeStamp(lastUpdatedTimeStamp);
        return this;
    }

    /**
     * <p>
     * The type of the code review.
     * </p>
     * 
     * @param type
     *        The type of the code review.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the code review.
     * </p>
     * 
     * @return The type of the code review.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the code review.
     * </p>
     * 
     * @param type
     *        The type of the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CodeReviewSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the code review.
     * </p>
     * 
     * @param type
     *        The type of the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public CodeReviewSummary withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The pull request ID for the code review.
     * </p>
     * 
     * @param pullRequestId
     *        The pull request ID for the code review.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The pull request ID for the code review.
     * </p>
     * 
     * @return The pull request ID for the code review.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The pull request ID for the code review.
     * </p>
     * 
     * @param pullRequestId
     *        The pull request ID for the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The statistics from the code review.
     * </p>
     * 
     * @param metricsSummary
     *        The statistics from the code review.
     */

    public void setMetricsSummary(MetricsSummary metricsSummary) {
        this.metricsSummary = metricsSummary;
    }

    /**
     * <p>
     * The statistics from the code review.
     * </p>
     * 
     * @return The statistics from the code review.
     */

    public MetricsSummary getMetricsSummary() {
        return this.metricsSummary;
    }

    /**
     * <p>
     * The statistics from the code review.
     * </p>
     * 
     * @param metricsSummary
     *        The statistics from the code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewSummary withMetricsSummary(MetricsSummary metricsSummary) {
        setMetricsSummary(metricsSummary);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: ").append(getCodeReviewArn()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: ").append(getCreatedTimeStamp()).append(",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: ").append(getLastUpdatedTimeStamp()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getMetricsSummary() != null)
            sb.append("MetricsSummary: ").append(getMetricsSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeReviewSummary == false)
            return false;
        CodeReviewSummary other = (CodeReviewSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getMetricsSummary() == null ^ this.getMetricsSummary() == null)
            return false;
        if (other.getMetricsSummary() != null && other.getMetricsSummary().equals(this.getMetricsSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getMetricsSummary() == null) ? 0 : getMetricsSummary().hashCode());
        return hashCode;
    }

    @Override
    public CodeReviewSummary clone() {
        try {
            return (CodeReviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.CodeReviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
