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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergePullRequestByFastForwardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     */
    private String sourceCommitId;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestByFastForwardRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @return The name of the repository where the pull request was created.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestByFastForwardRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @param sourceCommitId
     *        The full commit ID of the original or updated commit in the pull request source branch. Pass this value if
     *        you want an exception thrown if the current commit ID of the tip of the source branch does not match this
     *        commit ID.
     */

    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @return The full commit ID of the original or updated commit in the pull request source branch. Pass this value
     *         if you want an exception thrown if the current commit ID of the tip of the source branch does not match
     *         this commit ID.
     */

    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * <p>
     * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you
     * want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
     * </p>
     * 
     * @param sourceCommitId
     *        The full commit ID of the original or updated commit in the pull request source branch. Pass this value if
     *        you want an exception thrown if the current commit ID of the tip of the source branch does not match this
     *        commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestByFastForwardRequest withSourceCommitId(String sourceCommitId) {
        setSourceCommitId(sourceCommitId);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergePullRequestByFastForwardRequest == false)
            return false;
        MergePullRequestByFastForwardRequest other = (MergePullRequestByFastForwardRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        return hashCode;
    }

    @Override
    public MergePullRequestByFastForwardRequest clone() {
        return (MergePullRequestByFastForwardRequest) super.clone();
    }

}
