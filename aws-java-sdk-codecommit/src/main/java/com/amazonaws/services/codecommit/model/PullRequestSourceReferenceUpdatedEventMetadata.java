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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an update to the source branch of a pull request.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestSourceReferenceUpdatedEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestSourceReferenceUpdatedEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was updated.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request
     * was updated.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     */
    private String mergeBase;

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was updated.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * 
     * @return The name of the repository where the pull request was updated.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was updated.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestSourceReferenceUpdatedEventMetadata withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was updated.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was updated.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was updated.
     * </p>
     * 
     * @return The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *         pull request was updated.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was updated.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestSourceReferenceUpdatedEventMetadata withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request
     * was updated.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull
     *        request was updated.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request
     * was updated.
     * </p>
     * 
     * @return The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull
     *         request was updated.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request
     * was updated.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull
     *        request was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestSourceReferenceUpdatedEventMetadata withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     * 
     * @param mergeBase
     *        The commit ID of the most recent commit that the source branch and the destination branch have in common.
     */

    public void setMergeBase(String mergeBase) {
        this.mergeBase = mergeBase;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     * 
     * @return The commit ID of the most recent commit that the source branch and the destination branch have in common.
     */

    public String getMergeBase() {
        return this.mergeBase;
    }

    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     * 
     * @param mergeBase
     *        The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestSourceReferenceUpdatedEventMetadata withMergeBase(String mergeBase) {
        setMergeBase(mergeBase);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBeforeCommitId() != null)
            sb.append("BeforeCommitId: ").append(getBeforeCommitId()).append(",");
        if (getAfterCommitId() != null)
            sb.append("AfterCommitId: ").append(getAfterCommitId()).append(",");
        if (getMergeBase() != null)
            sb.append("MergeBase: ").append(getMergeBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestSourceReferenceUpdatedEventMetadata == false)
            return false;
        PullRequestSourceReferenceUpdatedEventMetadata other = (PullRequestSourceReferenceUpdatedEventMetadata) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
            return false;
        if (other.getMergeBase() == null ^ this.getMergeBase() == null)
            return false;
        if (other.getMergeBase() != null && other.getMergeBase().equals(this.getMergeBase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestSourceReferenceUpdatedEventMetadata clone() {
        try {
            return (PullRequestSourceReferenceUpdatedEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestSourceReferenceUpdatedEventMetadataMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
