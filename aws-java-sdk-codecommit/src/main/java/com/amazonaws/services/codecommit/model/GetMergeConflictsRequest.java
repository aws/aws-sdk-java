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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMergeConflictsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     */
    private String destinationCommitSpecifier;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     */
    private String sourceCommitSpecifier;
    /**
     * <p>
     * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
     * </p>
     */
    private String mergeOption;

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

    public GetMergeConflictsRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch
     *        name or a full commit ID.
     */

    public void setDestinationCommitSpecifier(String destinationCommitSpecifier) {
        this.destinationCommitSpecifier = destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a
     *         branch name or a full commit ID.
     */

    public String getDestinationCommitSpecifier() {
        return this.destinationCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @param destinationCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch
     *        name or a full commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsRequest withDestinationCommitSpecifier(String destinationCommitSpecifier) {
        setDestinationCommitSpecifier(destinationCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch
     *        name or a full commit ID.
     */

    public void setSourceCommitSpecifier(String sourceCommitSpecifier) {
        this.sourceCommitSpecifier = sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a
     *         branch name or a full commit ID.
     */

    public String getSourceCommitSpecifier() {
        return this.sourceCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name
     * or a full commit ID.
     * </p>
     * 
     * @param sourceCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch
     *        name or a full commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsRequest withSourceCommitSpecifier(String sourceCommitSpecifier) {
        setSourceCommitSpecifier(sourceCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code. The only valid value is
     *        FAST_FORWARD_MERGE.
     * @see MergeOptionTypeEnum
     */

    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
     * </p>
     * 
     * @return The merge option or strategy you want to use to merge the code. The only valid value is
     *         FAST_FORWARD_MERGE.
     * @see MergeOptionTypeEnum
     */

    public String getMergeOption() {
        return this.mergeOption;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code. The only valid value is
     *        FAST_FORWARD_MERGE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public GetMergeConflictsRequest withMergeOption(String mergeOption) {
        setMergeOption(mergeOption);
        return this;
    }

    /**
     * <p>
     * The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.
     * </p>
     * 
     * @param mergeOption
     *        The merge option or strategy you want to use to merge the code. The only valid value is
     *        FAST_FORWARD_MERGE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeOptionTypeEnum
     */

    public GetMergeConflictsRequest withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
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
        if (getDestinationCommitSpecifier() != null)
            sb.append("DestinationCommitSpecifier: ").append(getDestinationCommitSpecifier()).append(",");
        if (getSourceCommitSpecifier() != null)
            sb.append("SourceCommitSpecifier: ").append(getSourceCommitSpecifier()).append(",");
        if (getMergeOption() != null)
            sb.append("MergeOption: ").append(getMergeOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeConflictsRequest == false)
            return false;
        GetMergeConflictsRequest other = (GetMergeConflictsRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDestinationCommitSpecifier() == null ^ this.getDestinationCommitSpecifier() == null)
            return false;
        if (other.getDestinationCommitSpecifier() != null && other.getDestinationCommitSpecifier().equals(this.getDestinationCommitSpecifier()) == false)
            return false;
        if (other.getSourceCommitSpecifier() == null ^ this.getSourceCommitSpecifier() == null)
            return false;
        if (other.getSourceCommitSpecifier() != null && other.getSourceCommitSpecifier().equals(this.getSourceCommitSpecifier()) == false)
            return false;
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null && other.getMergeOption().equals(this.getMergeOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitSpecifier() == null) ? 0 : getDestinationCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitSpecifier() == null) ? 0 : getSourceCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
        return hashCode;
    }

    @Override
    public GetMergeConflictsRequest clone() {
        return (GetMergeConflictsRequest) super.clone();
    }

}
