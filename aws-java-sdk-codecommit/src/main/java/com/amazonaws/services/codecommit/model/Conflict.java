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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about conflicts in a merge operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Conflict" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Conflict implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     */
    private ConflictMetadata conflictMetadata;
    /**
     * <p>
     * A list of hunks that contain the differences between files or lines causing the conflict.
     * </p>
     */
    private java.util.List<MergeHunk> mergeHunks;

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     * 
     * @param conflictMetadata
     *        Metadata about a conflict in a merge operation.
     */

    public void setConflictMetadata(ConflictMetadata conflictMetadata) {
        this.conflictMetadata = conflictMetadata;
    }

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     * 
     * @return Metadata about a conflict in a merge operation.
     */

    public ConflictMetadata getConflictMetadata() {
        return this.conflictMetadata;
    }

    /**
     * <p>
     * Metadata about a conflict in a merge operation.
     * </p>
     * 
     * @param conflictMetadata
     *        Metadata about a conflict in a merge operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conflict withConflictMetadata(ConflictMetadata conflictMetadata) {
        setConflictMetadata(conflictMetadata);
        return this;
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines causing the conflict.
     * </p>
     * 
     * @return A list of hunks that contain the differences between files or lines causing the conflict.
     */

    public java.util.List<MergeHunk> getMergeHunks() {
        return mergeHunks;
    }

    /**
     * <p>
     * A list of hunks that contain the differences between files or lines causing the conflict.
     * </p>
     * 
     * @param mergeHunks
     *        A list of hunks that contain the differences between files or lines causing the conflict.
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
     * A list of hunks that contain the differences between files or lines causing the conflict.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMergeHunks(java.util.Collection)} or {@link #withMergeHunks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mergeHunks
     *        A list of hunks that contain the differences between files or lines causing the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conflict withMergeHunks(MergeHunk... mergeHunks) {
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
     * A list of hunks that contain the differences between files or lines causing the conflict.
     * </p>
     * 
     * @param mergeHunks
     *        A list of hunks that contain the differences between files or lines causing the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conflict withMergeHunks(java.util.Collection<MergeHunk> mergeHunks) {
        setMergeHunks(mergeHunks);
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
            sb.append("MergeHunks: ").append(getMergeHunks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Conflict == false)
            return false;
        Conflict other = (Conflict) obj;
        if (other.getConflictMetadata() == null ^ this.getConflictMetadata() == null)
            return false;
        if (other.getConflictMetadata() != null && other.getConflictMetadata().equals(this.getConflictMetadata()) == false)
            return false;
        if (other.getMergeHunks() == null ^ this.getMergeHunks() == null)
            return false;
        if (other.getMergeHunks() != null && other.getMergeHunks().equals(this.getMergeHunks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConflictMetadata() == null) ? 0 : getConflictMetadata().hashCode());
        hashCode = prime * hashCode + ((getMergeHunks() == null) ? 0 : getMergeHunks().hashCode());
        return hashCode;
    }

    @Override
    public Conflict clone() {
        try {
            return (Conflict) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ConflictMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
