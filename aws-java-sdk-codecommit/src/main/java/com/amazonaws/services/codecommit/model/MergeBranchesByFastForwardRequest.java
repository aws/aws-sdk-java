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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByFastForward"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeBranchesByFastForwardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String sourceCommitSpecifier;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     */
    private String destinationCommitSpecifier;
    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     */
    private String targetBranch;

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to merge two branches.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @return The name of the repository where you want to merge two branches.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to merge two branches.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to merge two branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByFastForwardRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getSourceCommitSpecifier() {
        return this.sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByFastForwardRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        setSourceCommitSpecifier(sourceCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     */

    public void setDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a
     *         branch name or a full commit ID).
     */

    public String getDestinationCommitSpecifier() {
        return this.destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name
     * or a full commit ID).
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch
     *        name or a full commit ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByFastForwardRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        setDestinationCommitSpecifier(destinationCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @param targetBranch
     *        The branch where the merge is applied.
     */

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @return The branch where the merge is applied.
     */

    public String getTargetBranch() {
        return this.targetBranch;
    }

    /**
     * <p>
     * The branch where the merge is applied.
     * </p>
     * 
     * @param targetBranch
     *        The branch where the merge is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByFastForwardRequest withTargetBranch(String targetBranch) {
        setTargetBranch(targetBranch);
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
        if (getSourceCommitSpecifier() != null)
            sb.append("SourceCommitSpecifier: ").append(getSourceCommitSpecifier()).append(",");
        if (getDestinationCommitSpecifier() != null)
            sb.append("DestinationCommitSpecifier: ").append(getDestinationCommitSpecifier()).append(",");
        if (getTargetBranch() != null)
            sb.append("TargetBranch: ").append(getTargetBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeBranchesByFastForwardRequest == false)
            return false;
        MergeBranchesByFastForwardRequest other = (MergeBranchesByFastForwardRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null && other.getDestinationCommitSpecifier().equals(this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getTargetBranch() == null ^ this.getTargetBranch() == null)
            return false;
        if (other.getTargetBranch() != null && other.getTargetBranch().equals(this.getTargetBranch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getTargetBranch() == null) ? 0 : getTargetBranch().hashCode());
        return hashCode;
    }

    @Override
    public MergeBranchesByFastForwardRequest clone() {
        return (MergeBranchesByFastForwardRequest) super.clone();
    }

}
