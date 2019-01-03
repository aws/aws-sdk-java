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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full SHA of the commit that contains this file change.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains this file change.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The full SHA of the commit that contains this file change.
     * </p>
     * 
     * @param commitId
     *        The full SHA of the commit that contains this file change.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full SHA of the commit that contains this file change.
     * </p>
     * 
     * @return The full SHA of the commit that contains this file change.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full SHA of the commit that contains this file change.
     * </p>
     * 
     * @param commitId
     *        The full SHA of the commit that contains this file change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @param blobId
     *        The ID of the blob, which is its SHA-1 pointer.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @return The ID of the blob, which is its SHA-1 pointer.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @param blobId
     *        The ID of the blob, which is its SHA-1 pointer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileResult withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains this file change.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains this file change.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains this file change.
     * </p>
     * 
     * @return The full SHA-1 pointer of the tree information for the commit that contains this file change.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that contains this file change.
     * </p>
     * 
     * @param treeId
     *        The full SHA-1 pointer of the tree information for the commit that contains this file change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileResult withTreeId(String treeId) {
        setTreeId(treeId);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileResult == false)
            return false;
        PutFileResult other = (PutFileResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        return hashCode;
    }

    @Override
    public PutFileResult clone() {
        try {
            return (PutFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
