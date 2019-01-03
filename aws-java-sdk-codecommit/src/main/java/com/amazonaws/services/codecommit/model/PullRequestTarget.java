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
 * Returns information about a pull request target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository that contains the pull request source and destination branches.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     */
    private String sourceReference;
    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     */
    private String destinationReference;
    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or
     * will be merged.
     * </p>
     */
    private String destinationCommit;
    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is
     * updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
     * </p>
     */
    private String sourceCommit;
    /**
     * <p>
     * The commit ID of the most recent commit that the source branch and the destination branch have in common.
     * </p>
     */
    private String mergeBase;
    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the merge has been made.
     * </p>
     */
    private MergeMetadata mergeMetadata;

    /**
     * <p>
     * The name of the repository that contains the pull request source and destination branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request source and destination branches.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request source and destination branches.
     * </p>
     * 
     * @return The name of the repository that contains the pull request source and destination branches.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request source and destination branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request source and destination branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @param sourceReference
     *        The branch of the repository that contains the changes for the pull request. Also known as the source
     *        branch.
     */

    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @return The branch of the repository that contains the changes for the pull request. Also known as the source
     *         branch.
     */

    public String getSourceReference() {
        return this.sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @param sourceReference
     *        The branch of the repository that contains the changes for the pull request. Also known as the source
     *        branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withSourceReference(String sourceReference) {
        setSourceReference(sourceReference);
        return this;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @param destinationReference
     *        The branch of the repository where the pull request changes will be merged into. Also known as the
     *        destination branch.
     */

    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @return The branch of the repository where the pull request changes will be merged into. Also known as the
     *         destination branch.
     */

    public String getDestinationReference() {
        return this.destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @param destinationReference
     *        The branch of the repository where the pull request changes will be merged into. Also known as the
     *        destination branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withDestinationReference(String destinationReference) {
        setDestinationReference(destinationReference);
        return this;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or
     * will be merged.
     * </p>
     * 
     * @param destinationCommit
     *        The full commit ID that is the tip of the destination branch. This is the commit where the pull request
     *        was or will be merged.
     */

    public void setDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or
     * will be merged.
     * </p>
     * 
     * @return The full commit ID that is the tip of the destination branch. This is the commit where the pull request
     *         was or will be merged.
     */

    public String getDestinationCommit() {
        return this.destinationCommit;
    }

    /**
     * <p>
     * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or
     * will be merged.
     * </p>
     * 
     * @param destinationCommit
     *        The full commit ID that is the tip of the destination branch. This is the commit where the pull request
     *        was or will be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withDestinationCommit(String destinationCommit) {
        setDestinationCommit(destinationCommit);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is
     * updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
     * </p>
     * 
     * @param sourceCommit
     *        The full commit ID of the tip of the source branch used to create the pull request. If the pull request
     *        branch is updated by a push while the pull request is open, the commit ID will change to reflect the new
     *        tip of the branch.
     */

    public void setSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is
     * updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
     * </p>
     * 
     * @return The full commit ID of the tip of the source branch used to create the pull request. If the pull request
     *         branch is updated by a push while the pull request is open, the commit ID will change to reflect the new
     *         tip of the branch.
     */

    public String getSourceCommit() {
        return this.sourceCommit;
    }

    /**
     * <p>
     * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is
     * updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.
     * </p>
     * 
     * @param sourceCommit
     *        The full commit ID of the tip of the source branch used to create the pull request. If the pull request
     *        branch is updated by a push while the pull request is open, the commit ID will change to reflect the new
     *        tip of the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withSourceCommit(String sourceCommit) {
        setSourceCommit(sourceCommit);
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

    public PullRequestTarget withMergeBase(String mergeBase) {
        setMergeBase(mergeBase);
        return this;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the merge has been made.
     * </p>
     * 
     * @param mergeMetadata
     *        Returns metadata about the state of the merge, including whether the merge has been made.
     */

    public void setMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the merge has been made.
     * </p>
     * 
     * @return Returns metadata about the state of the merge, including whether the merge has been made.
     */

    public MergeMetadata getMergeMetadata() {
        return this.mergeMetadata;
    }

    /**
     * <p>
     * Returns metadata about the state of the merge, including whether the merge has been made.
     * </p>
     * 
     * @param mergeMetadata
     *        Returns metadata about the state of the merge, including whether the merge has been made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestTarget withMergeMetadata(MergeMetadata mergeMetadata) {
        setMergeMetadata(mergeMetadata);
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
        if (getSourceReference() != null)
            sb.append("SourceReference: ").append(getSourceReference()).append(",");
        if (getDestinationReference() != null)
            sb.append("DestinationReference: ").append(getDestinationReference()).append(",");
        if (getDestinationCommit() != null)
            sb.append("DestinationCommit: ").append(getDestinationCommit()).append(",");
        if (getSourceCommit() != null)
            sb.append("SourceCommit: ").append(getSourceCommit()).append(",");
        if (getMergeBase() != null)
            sb.append("MergeBase: ").append(getMergeBase()).append(",");
        if (getMergeMetadata() != null)
            sb.append("MergeMetadata: ").append(getMergeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestTarget == false)
            return false;
        PullRequestTarget other = (PullRequestTarget) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceReference() == null ^ this.getSourceReference() == null)
            return false;
        if (other.getSourceReference() != null && other.getSourceReference().equals(this.getSourceReference()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        if (other.getDestinationCommit() == null ^ this.getDestinationCommit() == null)
            return false;
        if (other.getDestinationCommit() != null && other.getDestinationCommit().equals(this.getDestinationCommit()) == false)
            return false;
        if (other.getSourceCommit() == null ^ this.getSourceCommit() == null)
            return false;
        if (other.getSourceCommit() != null && other.getSourceCommit().equals(this.getSourceCommit()) == false)
            return false;
        if (other.getMergeBase() == null ^ this.getMergeBase() == null)
            return false;
        if (other.getMergeBase() != null && other.getMergeBase().equals(this.getMergeBase()) == false)
            return false;
        if (other.getMergeMetadata() == null ^ this.getMergeMetadata() == null)
            return false;
        if (other.getMergeMetadata() != null && other.getMergeMetadata().equals(this.getMergeMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceReference() == null) ? 0 : getSourceReference().hashCode());
        hashCode = prime * hashCode + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommit() == null) ? 0 : getDestinationCommit().hashCode());
        hashCode = prime * hashCode + ((getSourceCommit() == null) ? 0 : getSourceCommit().hashCode());
        hashCode = prime * hashCode + ((getMergeBase() == null) ? 0 : getMergeBase().hashCode());
        hashCode = prime * hashCode + ((getMergeMetadata() == null) ? 0 : getMergeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestTarget clone() {
        try {
            return (PullRequestTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
