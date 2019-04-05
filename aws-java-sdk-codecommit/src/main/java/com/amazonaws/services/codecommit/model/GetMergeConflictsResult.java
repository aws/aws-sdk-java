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
     * A Boolean value that indicates whether the code is mergable by the specified merge option.
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
     * A Boolean value that indicates whether the code is mergable by the specified merge option.
     * </p>
     * 
     * @param mergeable
     *        A Boolean value that indicates whether the code is mergable by the specified merge option.
     */

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergable by the specified merge option.
     * </p>
     * 
     * @return A Boolean value that indicates whether the code is mergable by the specified merge option.
     */

    public Boolean getMergeable() {
        return this.mergeable;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergable by the specified merge option.
     * </p>
     * 
     * @param mergeable
     *        A Boolean value that indicates whether the code is mergable by the specified merge option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMergeConflictsResult withMergeable(Boolean mergeable) {
        setMergeable(mergeable);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the code is mergable by the specified merge option.
     * </p>
     * 
     * @return A Boolean value that indicates whether the code is mergable by the specified merge option.
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMergeable() == null) ? 0 : getMergeable().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommitId() == null) ? 0 : getDestinationCommitId().hashCode());
        hashCode = prime * hashCode + ((getSourceCommitId() == null) ? 0 : getSourceCommitId().hashCode());
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
