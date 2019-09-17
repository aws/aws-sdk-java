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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMergeConflictsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * </p>
     */
    private Boolean mergeable;
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
     * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list
     * will always be empty.
     * </p>
     */
    private java.util.List<ConflictMetadata> conflictMetadataList;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * </p>
     * 
     * @param mergeable
     *        A Boolean value that indicates whether the code is mergeable by the specified merge option.
     */

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * </p>
     * 
     * @return A Boolean value that indicates whether the code is mergeable by the specified merge option.
     */

    public Boolean getMergeable() {
        return this.mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * </p>
     * 
     * @param mergeable
     *        A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsResult withMergeable(Boolean mergeable) {
        setMergeable(mergeable);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergeable by the specified merge option.
     * </p>
     * 
     * @return A Boolean value that indicates whether the code is mergeable by the specified merge option.
     */

    public Boolean isMergeable() {
        return this.mergeable;
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

    public GetMergeConflictsResult withDestinationCommitId(String destinationCommitId) {
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

    public GetMergeConflictsResult withSourceCommitId(String sourceCommitId) {
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

    public GetMergeConflictsResult withBaseCommitId(String baseCommitId) {
        setBaseCommitId(baseCommitId);
        return this;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list
     * will always be empty.
     * </p>
     * 
     * @return A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this
     *         list will always be empty.
     */

    public java.util.List<ConflictMetadata> getConflictMetadataList() {
        return conflictMetadataList;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list
     * will always be empty.
     * </p>
     * 
     * @param conflictMetadataList
     *        A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this
     *        list will always be empty.
     */

    public void setConflictMetadataList(java.util.Collection<ConflictMetadata> conflictMetadataList) {
        if (conflictMetadataList == null) {
            this.conflictMetadataList = null;
            return;
        }

        this.conflictMetadataList = new java.util.ArrayList<ConflictMetadata>(conflictMetadataList);
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list
     * will always be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConflictMetadataList(java.util.Collection)} or {@link #withConflictMetadataList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conflictMetadataList
     *        A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this
     *        list will always be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsResult withConflictMetadataList(ConflictMetadata... conflictMetadataList) {
        if (this.conflictMetadataList == null) {
            setConflictMetadataList(new java.util.ArrayList<ConflictMetadata>(conflictMetadataList.length));
        }
        for (ConflictMetadata ele : conflictMetadataList) {
            this.conflictMetadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list
     * will always be empty.
     * </p>
     * 
     * @param conflictMetadataList
     *        A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this
     *        list will always be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsResult withConflictMetadataList(java.util.Collection<ConflictMetadata> conflictMetadataList) {
        setConflictMetadataList(conflictMetadataList);
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

    public GetMergeConflictsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMergeable() != null)
            sb.append("Mergeable: ").append(getMergeable()).append(",");
        if (getDestinationCommitId() != null)
            sb.append("DestinationCommitId: ").append(getDestinationCommitId()).append(",");
        if (getSourceCommitId() != null)
            sb.append("SourceCommitId: ").append(getSourceCommitId()).append(",");
        if (getBaseCommitId() != null)
            sb.append("BaseCommitId: ").append(getBaseCommitId()).append(",");
        if (getConflictMetadataList() != null)
            sb.append("ConflictMetadataList: ").append(getConflictMetadataList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMergeConflictsResult == false)
            return false;
        GetMergeConflictsResult other = (GetMergeConflictsResult) obj;
        if (other.getMergeable() == null ^ this.getMergeable() == null)
            return false;
        if (other.getMergeable() != null && other.getMergeable().equals(this.getMergeable()) == false)
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
        if (other.getConflictMetadataList() == null ^ this.getConflictMetadataList() == null)
            return false;
        if (other.getConflictMetadataList() != null && other.getConflictMetadataList().equals(this.getConflictMetadataList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMergeable() == null) ? 0 : getMergeable().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
        hashCode = prime * hashCode + ((getBaseCommitId() == null) ? 0 : getBaseCommitId().hashCode());
        hashCode = prime * hashCode + ((getConflictMetadataList() == null) ? 0 : getConflictMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetMergeConflictsResult clone() {
        try {
            return (GetMergeConflictsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
