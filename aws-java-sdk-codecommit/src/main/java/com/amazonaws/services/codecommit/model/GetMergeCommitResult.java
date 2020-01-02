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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeCommit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMergeCommitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge evaluation.
     * </p>
     */
    private String sourceCommitId;
    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the merge evaluation.
     * </p>
     */
    private String destinationCommitId;
    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     */
    private String baseCommitId;
    /**
     * <p>
     * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the
     * fast-forward merge strategy was used, there is no merge commit.
     * </p>
     */
    private String mergedCommitId;

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @param sourceCommitId
     *        The commit ID of the source commit specifier that was used in the merge evaluation.
     */

    public void setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @return The commit ID of the source commit specifier that was used in the merge evaluation.
     */

    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @param sourceCommitId
     *        The commit ID of the source commit specifier that was used in the merge evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeCommitResult withSourceCommitId(String sourceCommitId) {
        setSourceCommitId(sourceCommitId);
        return this;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @param destinationCommitId
     *        The commit ID of the destination commit specifier that was used in the merge evaluation.
     */

    public void setDestinationCommitId(String destinationCommitId) {
        this.destinationCommitId = destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @return The commit ID of the destination commit specifier that was used in the merge evaluation.
     */

    public String getDestinationCommitId() {
        return this.destinationCommitId;
    }

    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the merge evaluation.
     * </p>
     * 
     * @param destinationCommitId
     *        The commit ID of the destination commit specifier that was used in the merge evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeCommitResult withDestinationCommitId(String destinationCommitId) {
        setDestinationCommitId(destinationCommitId);
        return this;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     * 
     * @param baseCommitId
     *        The commit ID of the merge base.
     */

    public void setBaseCommitId(String baseCommitId) {
        this.baseCommitId = baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     * 
     * @return The commit ID of the merge base.
     */

    public String getBaseCommitId() {
        return this.baseCommitId;
    }

    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     * 
     * @param baseCommitId
     *        The commit ID of the merge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeCommitResult withBaseCommitId(String baseCommitId) {
        setBaseCommitId(baseCommitId);
        return this;
    }

    /**
     * <p>
     * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the
     * fast-forward merge strategy was used, there is no merge commit.
     * </p>
     * 
     * @param mergedCommitId
     *        The commit ID for the merge commit created when the source branch was merged into the destination branch.
     *        If the fast-forward merge strategy was used, there is no merge commit.
     */

    public void setMergedCommitId(String mergedCommitId) {
        this.mergedCommitId = mergedCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the
     * fast-forward merge strategy was used, there is no merge commit.
     * </p>
     * 
     * @return The commit ID for the merge commit created when the source branch was merged into the destination branch.
     *         If the fast-forward merge strategy was used, there is no merge commit.
     */

    public String getMergedCommitId() {
        return this.mergedCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the
     * fast-forward merge strategy was used, there is no merge commit.
     * </p>
     * 
     * @param mergedCommitId
     *        The commit ID for the merge commit created when the source branch was merged into the destination branch.
     *        If the fast-forward merge strategy was used, there is no merge commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeCommitResult withMergedCommitId(String mergedCommitId) {
        setMergedCommitId(mergedCommitId);
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
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId()).append(",");
        if (getDestinationCommitId() != null)
            sb.append("DestinationCommitId: ").append(getDestinationCommitId()).append(",");
        if (getBaseCommitId() != null)
            sb.append("BaseCommitId: ").append(getBaseCommitId()).append(",");
        if (getMergedCommitId() != null)
            sb.append("MergedCommitId: ").append(getMergedCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeCommitResult == false)
            return false;
        GetMergeCommitResult other = (GetMergeCommitResult) obj;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
            return false;
        if (other.getBaseCommitId() == null ^ this.getBaseCommitId() == null)
            return false;
        if (other.getBaseCommitId() != null && other.getBaseCommitId().equals(this.getBaseCommitId()) == false)
            return false;
        if (other.getMergedCommitId() == null ^ this.getMergedCommitId() == null)
            return false;
        if (other.getMergedCommitId() != null && other.getMergedCommitId().equals(this.getMergedCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        hashCode = prime * hashCode + ((getMergedCommitId() == null) ? 0 : getMergedCommitId().hashCode());
        return hashCode;
    }

    @Override
    public GetMergeCommitResult clone() {
        try {
            return (GetMergeCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
