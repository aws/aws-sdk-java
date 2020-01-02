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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribeMergeConflicts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMergeConflictsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     */
    private ConflictMetadata conflictMetadata;
    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     */
    private java.util.List<MergeHunk> mergeHunks;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The commit ID of the destination commit specifier that was used in the merge evaluation.
     * </p>
     */
    private String destinationCommitId;
    /**
     * <p>
     * The commit ID of the source commit specifier that was used in the merge evaluation.
     * </p>
     */
    private String sourceCommitId;
    /**
     * <p>
     * The commit ID of the merge base.
     * </p>
     */
    private String baseCommitId;

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     * 
     * @param conflictMetadata
     *        Contains metadata about the conflicts found in the merge.
     */

    public void setConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
    }

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     * 
     * @return Contains metadata about the conflicts found in the merge.
     */

    public ConflictMetadata getConflictMetadata() {
        return this.conflictMetadata;
    }

    /**
     * <p>
     * Contains metadata about the conflicts found in the merge.
     * </p>
     * 
     * @param conflictMetadata
     *        Contains metadata about the conflicts found in the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMergeConflictsResult withConflictMetadata(ConflictMetadata conflictMetadata) {
        setConflictMetadata(conflictMetadata);
        return this;
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * 
     * @return A list of merge hunks of the differences between the files or lines.
     */

    public java.util.List<MergeHunk> getMergeHunks() {
        return mergeHunks;
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * 
     * @param mergeHunks
     *        A list of merge hunks of the differences between the files or lines.
     */

    public void setMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        if (mergeHunks == null) {
            this.mergeHunks = null;
            return;
        }

        this.mergeHunks = new java.util.ArrayList<MergeHunk>(mergeHunks);
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMergeHunks(java.util.Collection)} or {@link #withMergeHunks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mergeHunks
     *        A list of merge hunks of the differences between the files or lines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMergeConflictsResult withMergeHunks(MergeHunk... mergeHunks) {
        if (this.mergeHunks == null) {
            setMergeHunks(new java.util.ArrayList<MergeHunk>(mergeHunks.length));
        }
        for (MergeHunk ele : mergeHunks) {
            this.mergeHunks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of merge hunks of the differences between the files or lines.
     * </p>
     * 
     * @param mergeHunks
     *        A list of merge hunks of the differences between the files or lines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMergeConflictsResult withMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        setMergeHunks(mergeHunks);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMergeConflictsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public DescribeMergeConflictsResult withDestinationCommitId(String destinationCommitId) {
        setDestinationCommitId(destinationCommitId);
        return this;
    }

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

    public DescribeMergeConflictsResult withSourceCommitId(String sourceCommitId) {
        setSourceCommitId(sourceCommitId);
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

    public DescribeMergeConflictsResult withBaseCommitId(String baseCommitId) {
        setBaseCommitId(baseCommitId);
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
        if (getConflictMetadata() != null)
            sb.append("ConflictMetadata: ").append(getConflictMetadata()).append(",");
        if (getMergeHunks() != null)
            sb.append("MergeHunks: ").append(getMergeHunks()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getDestinationCommitId() != null)
            sb.append("DestinationCommitId: ").append(getDestinationCommitId()).append(",");
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId()).append(",");
        if (getBaseCommitId() != null)
            sb.append("BaseCommitId: ").append(getBaseCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMergeConflictsResult == false)
            return false;
        DescribeMergeConflictsResult other = (DescribeMergeConflictsResult) obj;
        if (other.getConflictMetadata() == null ^ this.getConflictMetadata() == null)
            return false;
        if (other.getConflictMetadata() != null && other.getConflictMetadata().equals(this.getConflictMetadata()) == false)
            return false;
        if (other.getMergeHunks() == null ^ this.getMergeHunks() == null)
            return false;
        if (other.getMergeHunks() != null && other.getMergeHunks().equals(this.getMergeHunks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDestinationCommitId() == null ^ this.getDestinationCommitId() == null)
            return false;
        if (other.getDestinationCommitId() != null && other.getDestinationCommitId().equals(this.getDestinationCommitId()) == false)
            return false;
        if (other.getSourceCommitId() == null ^ this.getSourceCommitId() == null)
            return false;
        if (other.getSourceCommitId() != null && other.getSourceCommitId().equals(this.getSourceCommitId()) == false)
            return false;
        if (other.getBaseCommitId() == null ^ this.getBaseCommitId() == null)
            return false;
        if (other.getBaseCommitId() != null && other.getBaseCommitId().equals(this.getBaseCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConflictMetadata() == null) ? 0 : getConflictMetadata().hashCode());
        hashCode = prime * hashCode + ((getMergeHunks() == null) ? 0 : getMergeHunks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMergeConflictsResult clone() {
        try {
            return (DescribeMergeConflictsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
