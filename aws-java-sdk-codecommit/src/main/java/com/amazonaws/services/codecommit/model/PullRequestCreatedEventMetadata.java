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
 * Metadata about the pull request that is used when comparing the pull request source with its destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestCreatedEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestCreatedEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The commit ID on the source branch used when the pull request was created.
     * </p>
     */
    private String sourceCommitId;
    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
     * </p>
     */
    private String destinationCommitId;
    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     */
    private String mergeBase;

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

    public PullRequestCreatedEventMetadata withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was created.
     * </p>
     * 
     * @param sourceCommitId
     *        The commit ID on the source branch used when the pull request was created.
     */

    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was created.
     * </p>
     * 
     * @return The commit ID on the source branch used when the pull request was created.
     */

    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * <p>
     * The commit ID on the source branch used when the pull request was created.
     * </p>
     * 
     * @param sourceCommitId
     *        The commit ID on the source branch used when the pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestCreatedEventMetadata withSourceCommitId(String sourceCommitId) {
        setSourceCommitId(sourceCommitId);
        return this;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
     * </p>
     * 
     * @param destinationCommitId
     *        The commit ID of the tip of the branch specified as the destination branch when the pull request was
     *        created.
     */

    public void setDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
     * </p>
     * 
     * @return The commit ID of the tip of the branch specified as the destination branch when the pull request was
     *         created.
     */

    public String getDestinationCommitId() {
        return this.destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
     * </p>
     * 
     * @param destinationCommitId
     *        The commit ID of the tip of the branch specified as the destination branch when the pull request was
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestCreatedEventMetadata withDestinationCommitId(String destinationCommitId) {
        setDestinationCommitId(destinationCommitId);
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

    public PullRequestCreatedEventMetadata withMergeBase(String mergeBase) {
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
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId()).append(",");
        if (getDestinationCommitId() != null)
            sb.append("DestinationCommitId: ").append(getDestinationCommitId()).append(",");
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

        if (obj instanceof PullRequestCreatedEventMetadata == false)
            return false;
        PullRequestCreatedEventMetadata other = (PullRequestCreatedEventMetadata) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
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
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestCreatedEventMetadata clone() {
        try {
            return (PullRequestCreatedEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestCreatedEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
